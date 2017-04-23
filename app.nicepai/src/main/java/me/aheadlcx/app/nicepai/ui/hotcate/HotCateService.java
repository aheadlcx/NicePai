package me.aheadlcx.app.nicepai.ui.hotcate;

import me.aheadlcx.app.nicepai.model.service.response.CateResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/3/3 下午3:28
 */
public interface HotCateService {
    @GET("m/v5_hot_channel.json")
    Observable<Response<CateResponse>> getCateLists(@Query("cateid") String cateid, @Query
            ("page") String page, @Query("per") String per );
}
