package me.aheadlcx.app.health.api;

import me.aheadlcx.app.health.model.HealthNewsDetailResponse;
import me.aheadlcx.app.health.model.HealthNewsListResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Description:
 * Creator: aheadlcx
 * Date:2016/11/27 下午6:54
 */
public interface HealthNewsListService {

//    @GET("api/lore/list")
    @GET("api/info/list")
    Observable<HealthNewsListResponse> getHealthNewsList(@Query("page") String page, @Query
            ("rows") String rows);

    @GET("api/info/list")
    Call<HealthNewsListResponse> getHealthNewsListSync();

//    @GET("api/lore/show")
    @GET("api/info/show")
    Observable<HealthNewsDetailResponse> getHealthNewsDetail(@Query("id") long id);

    @GET("api/lore/list")
    Observable<HealthNewsListResponse> getHealthLoreList(@Query("page") String page, @Query
            ("rows") String rows);

    @GET("api/lore/show")
    Observable<HealthNewsDetailResponse> getHealthLoreDetail(@Query("id") long id);
}
