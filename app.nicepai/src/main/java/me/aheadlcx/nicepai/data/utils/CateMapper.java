package me.aheadlcx.nicepai.data.utils;

import android.support.annotation.Nullable;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

import me.aheadlcx.nicepai.model.service.response.CateResponse;
import me.aheadlcx.nicepai.model.service.response.cate.CateBean;
import retrofit2.Response;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/24 上午11:43
 */
public class CateMapper {

    @Nullable
    public static List<CateBean> getCateBeen(Response<CateResponse> cateResponseResponse) {
        CateResponse body = cateResponseResponse.body();
        if (body == null) {
            return null;
        }
        List<CateBean> result = body.getResult();
        if (result == null) {
            return null;
        }
        List<CateBean> mp4Result = new ArrayList<CateBean>();
        int size = result.size();
        for (int i = 0; i < size; i++) {
            CateBean cateBean = result.get(i);
            if (cateBean.getChannel() != null && cateBean.getChannel().getStream
                    () != null && !TextUtils.isEmpty(cateBean.getChannel()
                    .getStream().getAnd()) && cateBean.getChannel().getStream()
                    .getAnd().equals("mp4")) {
                mp4Result.add(cateBean);
            }
        }
        return mp4Result;
    }
}
