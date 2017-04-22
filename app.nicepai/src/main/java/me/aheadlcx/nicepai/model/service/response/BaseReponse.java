package me.aheadlcx.nicepai.model.service.response;

import com.google.gson.Gson;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/2/29 下午8:58
 */
public class BaseReponse {

    public int status;
    public String msg;
    public int per;
    public int page;
    public int total;
    public String name;
    public String lastid;

    public boolean isSuccess(){
        if (status == 200){
            return true;
        }
        return false;
    }

    public String getResponseMsg(){
        return msg;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }
}
