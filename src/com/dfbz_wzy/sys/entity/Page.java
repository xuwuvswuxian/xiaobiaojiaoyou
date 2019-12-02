package com.dfbz_wzy.sys.entity;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/12/2 18:11
 * @description 页面实体类描述
 */
public class Page {

    /**
     * 每页显示的数量
     */
    private Integer pageSize = 3;

    /**
     * 当前页
     */
    private Integer pageCurrent;

    /**
     * 总记录数
     */
    private Integer count;

    /**
     * 总页数
     */
    private Integer pageCount;


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPageCount() {
        return (int)Math.ceil((double)this.count / this.pageSize);
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(Integer pageCurrent) {
        this.pageCurrent = pageCurrent;
    }
}
