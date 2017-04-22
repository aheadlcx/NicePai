package me.aheadlcx.nicepai.ui.catelist;

import me.aheadlcx.nicepai.model.service.response.catelist.CateListResponse;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/3/2 下午6:22
 */
public interface CateListService {

    @GET("m/index_cate.json")
    Observable<CateListResponse> getCateList();
}
