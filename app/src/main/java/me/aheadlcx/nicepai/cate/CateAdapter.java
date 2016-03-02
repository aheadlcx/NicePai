package me.aheadlcx.nicepai.cate;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

import me.aheadlcx.nicepai.R;
import me.aheadlcx.nicepai.databinding.ItemCateBinding;
import me.aheadlcx.nicepai.model.service.response.cate.CateBean;
import me.aheadlcx.nicepai.model.service.response.cate.ChannelEntity;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/3/1 下午5:43
 */
public class CateAdapter extends RecyclerView.Adapter<CateAdapter.CateHolder> {

    private List<CateBean> lists;

    private OnItemClickCallBack mCallBack;

    public void setCallBack(OnItemClickCallBack callBack) {
        mCallBack = callBack;
    }

    public CateAdapter(List<CateBean> lists) {
        this.lists = lists;
    }

    public void setLists(List<CateBean> lists) {
        this.lists = lists;
    }

    @Override
    public CateHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cate, null);
        CateHolder holder = new CateHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CateHolder holder, final int position) {
        holder.bind(lists.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCallBack != null) {
                    mCallBack.onItemClick(lists.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        if (lists == null) {
            return 0;
        }
        return lists.size();
    }

    public static class CateHolder extends RecyclerView.ViewHolder{
        private ItemCateBinding mBinding;
        private ImageView imgCateItem;
        public CateHolder(View itemView) {
            super(itemView);
            mBinding = ItemCateBinding.bind(itemView);
            imgCateItem = mBinding.imgCateItem;
        }

        public void bind(CateBean bean){
            if (null != mBinding && bean != null) {
                mBinding.setCate(bean);
                ChannelEntity.PicEntity pic = bean.getChannel().getPic();
                Glide.with(itemView.getContext()).load(pic.getBase() + pic.getM()).into
                        (imgCateItem);
            }
        }
    }

    public interface OnItemClickCallBack{
        void onItemClick(CateBean cateBean);
    }
}
