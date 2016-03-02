package me.aheadlcx.nicepai.model.service.response.cate;

import android.databinding.BaseObservable;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/3/1 下午5:54
 */
public class CateBean extends BaseObservable {
    private String type;
    /**
     * scid : 4-kX~GqvWbDVTz9lo8zwcA__
     * type : 16
     * liveStatus : 0
     * stat : {"vcnt":31555,"vcntNice":"3.1万","ccnt":11,"scnt":0,"dcnt":0,"lcnt":0,"hcnt":0}
     * pic : {"base":"http://wsqncdn.miaopai.com/stream/4-kX~GqvWbDVTz9lo8zwcA__","m":"_m.jpg","s":"_s.jpg"}
     * stream : {"base":"http://gslb.miaopai.com/stream/4-kX~GqvWbDVTz9lo8zwcA__.mp4?vend=miaopai&","ios":"mp4miaopai","and":"mp4","vend":"miaopai","ver":"miaopai"}
     * ext : {"length":16,"lengthNice":"00:16","location":"","finishTime":1456810924934,"finishTimeNice":"30分钟前","t":"给大家看看我在干嘛","ft":"给大家看看我在干嘛","status":30,"w":480,"h":480,"owner":{"suid":"KjAdebz09J0JmSgk","loginName":"paike_oxdmj3ginm","nick":"司雯嘉","icon":"http://tp2.sinaimg.cn/1273259633/180/5681390681/0","oldIcon":"http://tp2.sinaimg.cn/1273259633/180/5681390681/0","v":true,"org_v":0,"top_num":0,"info":"","status":0,"gold":0,"talent_v":0,"talent_name":"无"}}
     * ext2 : {"length":16,"guid":"2016-03-01-13-40-08-738785.330031.mp4","isPub":2,"createTime":1456810898019,"createTimeNice":"30分钟前","vend":"miaopai"}
     * topicinfo : ["司人频道"]
     */

    private ChannelEntity channel;

    public void setType(String type) {
        this.type = type;
    }

    public void setChannel(ChannelEntity channel) {
        this.channel = channel;
    }

    public String getType() {
        return type;
    }

    public ChannelEntity getChannel() {
        return channel;
    }

//    public boolean isDescriptionEmpty(){
//        if (getChannel() != null && getChannel().getExt() != null && !TextUtils.isEmpty
//                (getChannel().getExt().getT())){
//            return false;
//        }
//        return true;
//    }


}
