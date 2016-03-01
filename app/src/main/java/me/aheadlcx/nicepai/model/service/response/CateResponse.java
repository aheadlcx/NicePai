package me.aheadlcx.nicepai.model.service.response;

import java.util.List;

import me.aheadlcx.nicepai.model.BaseModel;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/2/29 下午8:54
 */
public class CateResponse  {


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

    public static class CateBean extends BaseModel {
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

        public static class ChannelEntity {
            private String scid;
            private int type;
            private int liveStatus;
            /**
             * vcnt : 31555
             * vcntNice : 3.1万
             * ccnt : 11
             * scnt : 0
             * dcnt : 0
             * lcnt : 0
             * hcnt : 0
             */

            private StatEntity stat;
            /**
             * base : http://wsqncdn.miaopai.com/stream/4-kX~GqvWbDVTz9lo8zwcA__
             * m : _m.jpg
             * s : _s.jpg
             */

            private PicEntity pic;
            /**
             * base : http://gslb.miaopai.com/stream/4-kX~GqvWbDVTz9lo8zwcA__.mp4?vend=miaopai&
             * ios : mp4miaopai
             * and : mp4
             * vend : miaopai
             * ver : miaopai
             */

            private StreamEntity stream;
            /**
             * length : 16
             * lengthNice : 00:16
             * location :
             * finishTime : 1456810924934
             * finishTimeNice : 30分钟前
             * t : 给大家看看我在干嘛
             * ft : 给大家看看我在干嘛
             * status : 30
             * w : 480
             * h : 480
             * owner : {"suid":"KjAdebz09J0JmSgk","loginName":"paike_oxdmj3ginm","nick":"司雯嘉","icon":"http://tp2.sinaimg.cn/1273259633/180/5681390681/0","oldIcon":"http://tp2.sinaimg.cn/1273259633/180/5681390681/0","v":true,"org_v":0,"top_num":0,"info":"","status":0,"gold":0,"talent_v":0,"talent_name":"无"}
             */

            private ExtEntity ext;
            /**
             * length : 16
             * guid : 2016-03-01-13-40-08-738785.330031.mp4
             * isPub : 2
             * createTime : 1456810898019
             * createTimeNice : 30分钟前
             * vend : miaopai
             */

            private Ext2Entity ext2;
            private List<String> topicinfo;

            public void setScid(String scid) {
                this.scid = scid;
            }

            public void setType(int type) {
                this.type = type;
            }

            public void setLiveStatus(int liveStatus) {
                this.liveStatus = liveStatus;
            }

            public void setStat(StatEntity stat) {
                this.stat = stat;
            }

            public void setPic(PicEntity pic) {
                this.pic = pic;
            }

            public void setStream(StreamEntity stream) {
                this.stream = stream;
            }

            public void setExt(ExtEntity ext) {
                this.ext = ext;
            }

            public void setExt2(Ext2Entity ext2) {
                this.ext2 = ext2;
            }

            public void setTopicinfo(List<String> topicinfo) {
                this.topicinfo = topicinfo;
            }

            public String getScid() {
                return scid;
            }

            public int getType() {
                return type;
            }

            public int getLiveStatus() {
                return liveStatus;
            }

            public StatEntity getStat() {
                return stat;
            }

            public PicEntity getPic() {
                return pic;
            }

            public StreamEntity getStream() {
                return stream;
            }

            public ExtEntity getExt() {
                return ext;
            }

            public Ext2Entity getExt2() {
                return ext2;
            }

            public List<String> getTopicinfo() {
                return topicinfo;
            }

            public static class StatEntity {
                private int vcnt;
                private String vcntNice;
                private int ccnt;
                private int scnt;
                private int dcnt;
                private int lcnt;
                private int hcnt;

                public void setVcnt(int vcnt) {
                    this.vcnt = vcnt;
                }

                public void setVcntNice(String vcntNice) {
                    this.vcntNice = vcntNice;
                }

                public void setCcnt(int ccnt) {
                    this.ccnt = ccnt;
                }

                public void setScnt(int scnt) {
                    this.scnt = scnt;
                }

                public void setDcnt(int dcnt) {
                    this.dcnt = dcnt;
                }

                public void setLcnt(int lcnt) {
                    this.lcnt = lcnt;
                }

                public void setHcnt(int hcnt) {
                    this.hcnt = hcnt;
                }

                public int getVcnt() {
                    return vcnt;
                }

                public String getVcntNice() {
                    return vcntNice;
                }

                public int getCcnt() {
                    return ccnt;
                }

                public int getScnt() {
                    return scnt;
                }

                public int getDcnt() {
                    return dcnt;
                }

                public int getLcnt() {
                    return lcnt;
                }

                public int getHcnt() {
                    return hcnt;
                }
            }

            public static class PicEntity {
                private String base;
                private String m;
                private String s;

                public void setBase(String base) {
                    this.base = base;
                }

                public void setM(String m) {
                    this.m = m;
                }

                public void setS(String s) {
                    this.s = s;
                }

                public String getBase() {
                    return base;
                }

                public String getM() {
                    return m;
                }

                public String getS() {
                    return s;
                }
            }

            public static class StreamEntity {
                private String base;
                private String ios;
                private String and;
                private String vend;
                private String ver;

                public void setBase(String base) {
                    this.base = base;
                }

                public void setIos(String ios) {
                    this.ios = ios;
                }

                public void setAnd(String and) {
                    this.and = and;
                }

                public void setVend(String vend) {
                    this.vend = vend;
                }

                public void setVer(String ver) {
                    this.ver = ver;
                }

                public String getBase() {
                    return base;
                }

                public String getIos() {
                    return ios;
                }

                public String getAnd() {
                    return and;
                }

                public String getVend() {
                    return vend;
                }

                public String getVer() {
                    return ver;
                }
            }

            public static class ExtEntity {
                private int length;
                private String lengthNice;
                private String location;
                private long finishTime;
                private String finishTimeNice;
                private String t;
                private String ft;
                private int status;
                private int w;
                private int h;
                /**
                 * suid : KjAdebz09J0JmSgk
                 * loginName : paike_oxdmj3ginm
                 * nick : 司雯嘉
                 * icon : http://tp2.sinaimg.cn/1273259633/180/5681390681/0
                 * oldIcon : http://tp2.sinaimg.cn/1273259633/180/5681390681/0
                 * v : true
                 * org_v : 0
                 * top_num : 0
                 * info :
                 * status : 0
                 * gold : 0
                 * talent_v : 0
                 * talent_name : 无
                 */

                private OwnerEntity owner;

                public void setLength(int length) {
                    this.length = length;
                }

                public void setLengthNice(String lengthNice) {
                    this.lengthNice = lengthNice;
                }

                public void setLocation(String location) {
                    this.location = location;
                }

                public void setFinishTime(long finishTime) {
                    this.finishTime = finishTime;
                }

                public void setFinishTimeNice(String finishTimeNice) {
                    this.finishTimeNice = finishTimeNice;
                }

                public void setT(String t) {
                    this.t = t;
                }

                public void setFt(String ft) {
                    this.ft = ft;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public void setW(int w) {
                    this.w = w;
                }

                public void setH(int h) {
                    this.h = h;
                }

                public void setOwner(OwnerEntity owner) {
                    this.owner = owner;
                }

                public int getLength() {
                    return length;
                }

                public String getLengthNice() {
                    return lengthNice;
                }

                public String getLocation() {
                    return location;
                }

                public long getFinishTime() {
                    return finishTime;
                }

                public String getFinishTimeNice() {
                    return finishTimeNice;
                }

                public String getT() {
                    return t;
                }

                public String getFt() {
                    return ft;
                }

                public int getStatus() {
                    return status;
                }

                public int getW() {
                    return w;
                }

                public int getH() {
                    return h;
                }

                public OwnerEntity getOwner() {
                    return owner;
                }

                public static class OwnerEntity {
                    private String suid;
                    private String loginName;
                    private String nick;
                    private String icon;
                    private String oldIcon;
                    private boolean v;
                    private int org_v;
                    private int top_num;
                    private String info;
                    private int status;
                    private int gold;
                    private int talent_v;
                    private String talent_name;

                    public void setSuid(String suid) {
                        this.suid = suid;
                    }

                    public void setLoginName(String loginName) {
                        this.loginName = loginName;
                    }

                    public void setNick(String nick) {
                        this.nick = nick;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public void setOldIcon(String oldIcon) {
                        this.oldIcon = oldIcon;
                    }

                    public void setV(boolean v) {
                        this.v = v;
                    }

                    public void setOrg_v(int org_v) {
                        this.org_v = org_v;
                    }

                    public void setTop_num(int top_num) {
                        this.top_num = top_num;
                    }

                    public void setInfo(String info) {
                        this.info = info;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public void setGold(int gold) {
                        this.gold = gold;
                    }

                    public void setTalent_v(int talent_v) {
                        this.talent_v = talent_v;
                    }

                    public void setTalent_name(String talent_name) {
                        this.talent_name = talent_name;
                    }

                    public String getSuid() {
                        return suid;
                    }

                    public String getLoginName() {
                        return loginName;
                    }

                    public String getNick() {
                        return nick;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public String getOldIcon() {
                        return oldIcon;
                    }

                    public boolean isV() {
                        return v;
                    }

                    public int getOrg_v() {
                        return org_v;
                    }

                    public int getTop_num() {
                        return top_num;
                    }

                    public String getInfo() {
                        return info;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public int getGold() {
                        return gold;
                    }

                    public int getTalent_v() {
                        return talent_v;
                    }

                    public String getTalent_name() {
                        return talent_name;
                    }
                }
            }

            public static class Ext2Entity {
                private int length;
                private String guid;
                private int isPub;
                private long createTime;
                private String createTimeNice;
                private String vend;

                public void setLength(int length) {
                    this.length = length;
                }

                public void setGuid(String guid) {
                    this.guid = guid;
                }

                public void setIsPub(int isPub) {
                    this.isPub = isPub;
                }

                public void setCreateTime(long createTime) {
                    this.createTime = createTime;
                }

                public void setCreateTimeNice(String createTimeNice) {
                    this.createTimeNice = createTimeNice;
                }

                public void setVend(String vend) {
                    this.vend = vend;
                }

                public int getLength() {
                    return length;
                }

                public String getGuid() {
                    return guid;
                }

                public int getIsPub() {
                    return isPub;
                }

                public long getCreateTime() {
                    return createTime;
                }

                public String getCreateTimeNice() {
                    return createTimeNice;
                }

                public String getVend() {
                    return vend;
                }
            }
        }
    }
}
