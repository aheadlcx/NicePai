package me.aheadlcx.app.nicepai.model.service.response.cate;


/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/3/1 下午5:54
 */
//public class CateBean extends BaseObservable {
public class CateBean  {
    private String type;

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
