package me.aheadlcx.nicepai.model;

import com.google.gson.Gson;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/3/1 下午2:27
 */
public class BaseModel {

    @Override
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }
}
