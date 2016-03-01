package me.aheadlcx.nicepai.cate;

import java.util.List;

import me.aheadlcx.nicepai.model.service.response.CateResponse;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/2/29 下午8:24
 */
public interface CateService {
//    @GET("m/cate2_channel?cateid={cateid}&page={page}")
    @FormUrlEncoded
    @GET("m/cate2_channel")
    Observable<List<CateResponse.CateBean>> getCateLists(@Query("cateid") String cateid, @Query
            ("page") String page, @Query("per") String per);
}
