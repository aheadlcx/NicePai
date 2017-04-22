package me.aheadlcx.app.health.ui.health.detail;

import me.aheadlcx.app.health.model.HealthNewsDetailResponse;

/**
 * Description:
 * Creator: aheadlcx
 * Date:2016/11/29 下午8:36
 */

public interface HealthNewsDetailContract {
    interface UI{
        void setData(HealthNewsDetailResponse response);
    }

    interface Present{
        void setUi(UI ui);
        void loadData(long id, int healthType);
        void setHealthType( int healthType);
    }
}
