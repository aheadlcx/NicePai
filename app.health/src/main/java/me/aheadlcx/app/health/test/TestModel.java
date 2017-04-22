package me.aheadlcx.app.health.test;

import java.io.Serializable;
import java.util.List;

import io.realm.RealmList;
import me.aheadlcx.app.health.model.HealthNewsItem;

/**
 * Description:
 * author: aheadlcx
 * Date:2016/12/6 下午8:05
 */

public class TestModel implements Serializable {

    public String name;
    public List mList;
    public RealmList<HealthNewsItem> mItems;
}
