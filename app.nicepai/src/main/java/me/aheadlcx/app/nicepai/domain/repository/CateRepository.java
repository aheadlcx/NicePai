package me.aheadlcx.app.nicepai.domain.repository;

import java.util.List;

import me.aheadlcx.app.nicepai.model.service.response.cate.CateBean;
import rx.Observable;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午5:36
 */
public interface CateRepository extends BaseRepository {

    public Observable<List<CateBean>> getCates(String cateId, String page);
    String pagePer = "5";
}
