package com.solverpeng.spring.bean;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/29 0029
 *      desc  :
 * </pre>
 */
public class TsysUser {
    /**
     * id
     */
    private java.lang.String id;

    /**
     * userName
     */
    private java.lang.String userName;

    /**
     * realName
     */
    private java.lang.String realName;

    /**
     * password
     */
    private java.lang.String password;

    /**
     * mobile
     */
    private java.lang.String mobile;

    /**
     * status
     */
    private java.lang.Integer status;

    /**
     * lastLoginIp
     */
    private java.lang.String lastLoginIp;

    /**
     * lastLoginTime
     */
    private java.util.Date lastLoginTime;

    /**
     * remark
     */
    private java.lang.String remark;

    /**
     * campusId
     */
    private java.lang.String campusId;

    /**
     * creator
     */
    private java.lang.String creator;

    /**
     * createTime
     */
    private java.util.Date createTime;

    /**
     * lastModifior
     */
    private java.lang.String lastModifior;

    /**
     * lastModifyTime
     */
    private java.util.Date lastModifyTime;

    /**
     * deleted
     */
    private java.lang.Integer deleted;
    //columns END

    public TsysUser() {
    }

    public TsysUser(
            java.lang.String id
    ) {
        this.id = id;
    }

    public void setId(java.lang.String value) {
        this.id = value;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public void setUserName(java.lang.String value) {
        this.userName = value;
    }

    public java.lang.String getUserName() {
        return this.userName;
    }

    public void setRealName(java.lang.String value) {
        this.realName = value;
    }

    public java.lang.String getRealName() {
        return this.realName;
    }

    public void setPassword(java.lang.String value) {
        this.password = value;
    }

    public java.lang.String getPassword() {
        return this.password;
    }

    public void setMobile(java.lang.String value) {
        this.mobile = value;
    }

    public java.lang.String getMobile() {
        return this.mobile;
    }

    public void setStatus(java.lang.Integer value) {
        this.status = value;
    }

    public java.lang.Integer getStatus() {
        return this.status;
    }

    public void setLastLoginIp(java.lang.String value) {
        this.lastLoginIp = value;
    }

    public java.lang.String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setLastLoginTime(java.util.Date value) {
        this.lastLoginTime = value;
    }

    public java.util.Date getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setRemark(java.lang.String value) {
        this.remark = value;
    }

    public java.lang.String getRemark() {
        return this.remark;
    }

    public void setCampusId(java.lang.String value) {
        this.campusId = value;
    }

    public java.lang.String getCampusId() {
        return this.campusId;
    }

    public void setCreator(java.lang.String value) {
        this.creator = value;
    }

    public java.lang.String getCreator() {
        return this.creator;
    }

    public void setCreateTime(java.util.Date value) {
        this.createTime = value;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setLastModifior(java.lang.String value) {
        this.lastModifior = value;
    }

    public java.lang.String getLastModifior() {
        return this.lastModifior;
    }

    public void setLastModifyTime(java.util.Date value) {
        this.lastModifyTime = value;
    }

    public java.util.Date getLastModifyTime() {
        return this.lastModifyTime;
    }

    public void setDeleted(java.lang.Integer value) {
        this.deleted = value;
    }

    public java.lang.Integer getDeleted() {
        return this.deleted;
    }

    @Override
    public String toString() {
        return "TsysUser{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", status=" + status +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", remark='" + remark + '\'' +
                ", campusId='" + campusId + '\'' +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", lastModifior='" + lastModifior + '\'' +
                ", lastModifyTime=" + lastModifyTime +
                ", deleted=" + deleted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TsysUser)) return false;

        TsysUser tsysUser = (TsysUser) o;

        if (id != null ? !id.equals(tsysUser.id) : tsysUser.id != null) return false;
        if (userName != null ? !userName.equals(tsysUser.userName) : tsysUser.userName != null) return false;
        if (realName != null ? !realName.equals(tsysUser.realName) : tsysUser.realName != null) return false;
        if (password != null ? !password.equals(tsysUser.password) : tsysUser.password != null) return false;
        if (mobile != null ? !mobile.equals(tsysUser.mobile) : tsysUser.mobile != null) return false;
        if (status != null ? !status.equals(tsysUser.status) : tsysUser.status != null) return false;
        if (lastLoginIp != null ? !lastLoginIp.equals(tsysUser.lastLoginIp) : tsysUser.lastLoginIp != null)
            return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(tsysUser.lastLoginTime) : tsysUser.lastLoginTime != null)
            return false;
        if (remark != null ? !remark.equals(tsysUser.remark) : tsysUser.remark != null) return false;
        if (campusId != null ? !campusId.equals(tsysUser.campusId) : tsysUser.campusId != null) return false;
        if (creator != null ? !creator.equals(tsysUser.creator) : tsysUser.creator != null) return false;
        if (createTime != null ? !createTime.equals(tsysUser.createTime) : tsysUser.createTime != null) return false;
        if (lastModifior != null ? !lastModifior.equals(tsysUser.lastModifior) : tsysUser.lastModifior != null)
            return false;
        if (lastModifyTime != null ? !lastModifyTime.equals(tsysUser.lastModifyTime) : tsysUser.lastModifyTime != null)
            return false;
        return deleted != null ? deleted.equals(tsysUser.deleted) : tsysUser.deleted == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lastLoginIp != null ? lastLoginIp.hashCode() : 0);
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (campusId != null ? campusId.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (lastModifior != null ? lastModifior.hashCode() : 0);
        result = 31 * result + (lastModifyTime != null ? lastModifyTime.hashCode() : 0);
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        return result;
    }
}