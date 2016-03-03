package me.aheadlcx.nicepai.model.service.response.catelist;

import java.util.List;

import me.aheadlcx.nicepai.model.BaseModel;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/3/2 下午6:16
 */
public class CateListResponse extends BaseModel {

    /**
     * status : 200
     * msg : OK
     * result : [{"categoryName":"热门","categoryId":1},{"categoryName":"明星","categoryId":124},{"categoryName":"搞笑","categoryId":128},{"categoryName":"女神","categoryId":132},{"categoryName":"现场","categoryId":136},{"categoryName":"韩娱","categoryId":106},{"categoryName":"时尚","categoryId":156},{"categoryName":"萌宠","categoryId":140},{"categoryName":"宝宝","categoryId":144},{"categoryName":"小咖秀","categoryId":110},{"categoryName":"创意","categoryId":160},{"categoryName":"音乐","categoryId":172},{"categoryName":"美食","categoryId":28},{"categoryName":"旅行","categoryId":168}]
     */

    private int status;
    private String msg;
    /**
     * categoryName : 热门
     * categoryId : 1
     */

    private List<CateBaseInfo> result;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setResult(List<CateBaseInfo> result) {
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public List<CateBaseInfo> getResult() {
        return result;
    }

}
