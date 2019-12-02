package com.dfbz_wzy.sys.entity;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/12/2 19:38
 * @description 部门实体类描述
 */
public class Dept {

    /**
     *  用户id,自增长+1
     */
    private Integer id;

    /**
     *  部门名称
     */
    private String name;

    /**
     *  创建时间
     */
    private String createTime;

    /**
     *  创建人
     */
    private Integer createBy;

    /**
     *  部门删除标记1是0否，默认0否
     */
    private Integer delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}
