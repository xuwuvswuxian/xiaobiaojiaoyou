package com.dfbz_wzy.sys.entity;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/12/2 11:30
 * @description 用户实体类描述
 */
public class User {
    /**
     *  部门名称，取别名用的
     */
    private String deptName;

    /**
     *  用户id,自增长+1
     */
    private Integer id;

    /**
     *  部门ID
     */
    private Integer deptId;

    /**
     *  账号
     */
    private String account;

    /**
     *  密码
     */
    private String password;

    /**
     *  真实姓名
     */
    private String name;

    /**
     *  年龄
     */
    private Integer age;

    /**
     *  性别：1男，0女
     */
    private Integer sex;

    /**
     *  电子邮箱
     */
    private String email;

    /**
     *  出生日期
     */
    private String birthDate;

    /**
     *  创建时间
     */
    private String createTime;

    /**
     *  创建人
     */
    private String createBy;

    /**
     *  用户删除标记1是0否，默认0否
     */
    private Integer delFlag;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "deptName='" + deptName + '\'' +
                ", id=" + id +
                ", deptId=" + deptId +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createBy='" + createBy + '\'' +
                ", delFlag=" + delFlag +
                '}';
    }
}
