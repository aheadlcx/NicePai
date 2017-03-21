package me.aheadlcx.nicepai.ui.cate;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.flexbox.AlignSelf;
import com.google.android.flexbox.FlexboxLayoutManager;

import java.util.List;

import me.aheadlcx.nicepai.R;
import me.aheadlcx.nicepai.model.service.response.cate.CateBean;

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
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cate, null);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_cate, null);
        CateHolder holder = new CateHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CateHolder holder, final int position) {
        holder.bind(lists.get(position));
        holder.imgCateItem.setOnClickListener(new View.OnClickListener() {
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

    public static class CateHolder extends RecyclerView.ViewHolder {
        private ImageView imgCateItem;
        private View itemCate;
        TextView txtCateItem;

        public CateHolder(View itemView) {
            super(itemView);
            imgCateItem = (ImageView) itemView.findViewById(R.id.imgCateItem);
            itemCate = itemView.findViewById(R.id.itemCate);
            txtCateItem = (TextView) itemView.findViewById(R.id.txtCateItem);
        }

        public void bind(CateBean bean) {
            if (bean != null) {
                ViewGroup.LayoutParams lp = imgCateItem.getLayoutParams();
                if (lp instanceof FlexboxLayoutManager.LayoutParams) {
                    FlexboxLayoutManager.LayoutParams flexboxLp = (FlexboxLayoutManager.LayoutParams)
                            imgCateItem.getLayoutParams();
                    flexboxLp.setFlexGrow(1.0f);
                    flexboxLp.setAlignSelf(AlignSelf.FLEX_END);
                }
//                ChannelEntity.PicEntity pic = bean.getChannel().getPic();
                if (null != bean.getChannel() && null != bean.getChannel().getExt() && null != txtCateItem) {
                    txtCateItem.setText(bean.getChannel().getExt().getT());
                    txtCateItem.setVisibility(View.VISIBLE);
                } else {
                    if (txtCateItem != null) {
                        txtCateItem.setVisibility(View.GONE);
                    }
                }
                Context context = imgCateItem.getContext();
                imgCateItem.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),
                        R.drawable.icon_test, null));
                if (null != bean.getChannel() && null != bean.getChannel().getPic()) {
//                    Glide.with(itemView.getContext()).load(bean.getChannel().getPic().getBase() + bean.getChannel().getPic()
//                            .getM()).into(imgCateItem);
                }
            }
        }
    }

    public interface OnItemClickCallBack {
        void onItemClick(CateBean cateBean);
    }
}
