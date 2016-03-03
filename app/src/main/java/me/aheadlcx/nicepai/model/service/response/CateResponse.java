package me.aheadlcx.nicepai.model.service.response;

import java.util.List;

import me.aheadlcx.nicepai.model.BaseModel;
import me.aheadlcx.nicepai.model.service.response.cate.CateBean;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/2/29 下午8:54
 */
public class CateResponse  extends BaseModel{



    private int status;
    private String msg;
    private int per;
    private int page;
    private int total;
    private String name;
    private String lastid;

    private List<CateBean> result;
    private List<?> banner;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastid(String lastid) {
        this.lastid = lastid;
    }

    public void setResult(List<CateBean> result) {
        this.result = result;
    }

    public void setBanner(List<?> banner) {
        this.banner = banner;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public int getPer() {
        return per;
    }

    public int getPage() {
        return page;
    }

    public int getTotal() {
        return total;
    }

    public String getName() {
        return name;
    }

    public String getLastid() {
        return lastid;
    }

    public List<CateBean> getResult() {
        return result;
    }

    public List<?> getBanner() {
        return banner;
    }

}
