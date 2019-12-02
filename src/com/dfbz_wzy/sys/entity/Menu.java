package com.dfbz_wzy.sys.entity;

import java.io.Serializable;

/**
 * @author admin
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/11/29 12:04
 * @description 菜单实体类
 */
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    /***
     * 主键ID，自动增长+1
     */
    private Integer id;

    /***
     * 上级菜单的ID，若是1一级目录则是-1
     */
    private Integer pId;

    /***
     * 菜单类型，1是一级，2是二级以此类推
     */
    private String type;

    /***
     * 菜单名字
     */
    private String name;

    /***
     * 菜单跳转路径
     */
    private String menuUrl;

    /***
     * 菜单排序
     */
    private Integer orderBy;

    /***
     * 菜单创建时间
     */
    private String createTime;

    /***
     * 菜单创建人
     */
    private Integer createBy;

    /***
     * 菜单删除标记1是0否，默认0否
     */
    private String delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
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

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", pId=" + pId +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", orderBy=" + orderBy +
                ", createTime='" + createTime + '\'' +
                ", createBy=" + createBy +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
