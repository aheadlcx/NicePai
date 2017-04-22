package me.aheadlcx.nicepai.model.service.response.catelist;

import java.io.Serializable;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/3/2 下午6:17
 */
public class CateBaseInfo implements Serializable{
    private String categoryName;
    private int categoryId;

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }
}
