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


    /**
     * status : 200
     * msg : OK
     * result : [{"type":"channel","channel":{"scid":"4-kX~GqvWbDVTz9lo8zwcA__","type":16,"liveStatus":0,"stat":{"vcnt":31555,"vcntNice":"3.1万","ccnt":11,"scnt":0,"dcnt":0,"lcnt":0,"hcnt":0},"pic":{"base":"http://wsqncdn.miaopai.com/stream/4-kX~GqvWbDVTz9lo8zwcA__","m":"_m.jpg","s":"_s.jpg"},"stream":{"base":"http://gslb.miaopai.com/stream/4-kX~GqvWbDVTz9lo8zwcA__.mp4?vend=miaopai&","ios":"mp4miaopai","and":"mp4","vend":"miaopai","ver":"miaopai"},"ext":{"length":16,"lengthNice":"00:16","location":"","finishTime":1456810924934,"finishTimeNice":"30分钟前","t":"给大家看看我在干嘛","ft":"给大家看看我在干嘛","status":30,"w":480,"h":480,"owner":{"suid":"KjAdebz09J0JmSgk","loginName":"paike_oxdmj3ginm","nick":"司雯嘉","icon":"http://tp2.sinaimg.cn/1273259633/180/5681390681/0","oldIcon":"http://tp2.sinaimg.cn/1273259633/180/5681390681/0","v":true,"org_v":0,"top_num":0,"info":"","status":0,"gold":0,"talent_v":0,"talent_name":"无"}},"ext2":{"length":16,"guid":"2016-03-01-13-40-08-738785.330031.mp4","isPub":2,"createTime":1456810898019,"createTimeNice":"30分钟前","vend":"miaopai"},"topicinfo":["司人频道"]}}]
     * per : 1
     * page : 1
     * total : 12022
     * name : 美女
     * lastid :
     * banner : []
     */

    private int status;
    private String msg;
    private int per;
    private int page;
    private int total;
    private String name;
    private String lastid;
    /**
     * type : channel
     * channel : {"scid":"4-kX~GqvWbDVTz9lo8zwcA__","type":16,"liveStatus":0,"stat":{"vcnt":31555,"vcntNice":"3.1万","ccnt":11,"scnt":0,"dcnt":0,"lcnt":0,"hcnt":0},"pic":{"base":"http://wsqncdn.miaopai.com/stream/4-kX~GqvWbDVTz9lo8zwcA__","m":"_m.jpg","s":"_s.jpg"},"stream":{"base":"http://gslb.miaopai.com/stream/4-kX~GqvWbDVTz9lo8zwcA__.mp4?vend=miaopai&","ios":"mp4miaopai","and":"mp4","vend":"miaopai","ver":"miaopai"},"ext":{"length":16,"lengthNice":"00:16","location":"","finishTime":1456810924934,"finishTimeNice":"30分钟前","t":"给大家看看我在干嘛","ft":"给大家看看我在干嘛","status":30,"w":480,"h":480,"owner":{"suid":"KjAdebz09J0JmSgk","loginName":"paike_oxdmj3ginm","nick":"司雯嘉","icon":"http://tp2.sinaimg.cn/1273259633/180/5681390681/0","oldIcon":"http://tp2.sinaimg.cn/1273259633/180/5681390681/0","v":true,"org_v":0,"top_num":0,"info":"","status":0,"gold":0,"talent_v":0,"talent_name":"无"}},"ext2":{"length":16,"guid":"2016-03-01-13-40-08-738785.330031.mp4","isPub":2,"createTime":1456810898019,"createTimeNice":"30分钟前","vend":"miaopai"},"topicinfo":["司人频道"]}
     */

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
