package me.aheadlcx.nicepai.ui.cate;

import me.aheadlcx.nicepai.model.service.response.CateResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/2/29 下午8:24
 */
public interface CateService {
    @GET("m/cate2_channel")
    Observable<Response<CateResponse>> getCateLists(@Query("cateid") String cateid, @Query
            ("page") String page, @Query("per") String per );

}
