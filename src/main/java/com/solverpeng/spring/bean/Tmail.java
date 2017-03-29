package com.solverpeng.spring.bean;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/29 0029
 *      desc  :
 * </pre>
 */
public class Tmail {
    /**
     * id主键
     */
    private java.lang.String id;

    /**
     * 标题
     */
    private java.lang.String title;

    /**
     * 内容
     */
    private java.lang.String content;

    /**
     * 备注
     */
    private java.lang.String remark;

    /**
     * 是否重要：1表示是；2表示否
     */
    private java.lang.Integer isImportant;

    /**
     * 发送人id
     */
    private java.lang.String senderId;

    /**
     * 是否定时发布：1表示是；2表示否
     */
    private java.lang.Integer isTiming;

    /**
     * 预计发送时间
     */
    private java.util.Date estSendTime;

    /**
     * 创建人
     */
    private java.lang.String creator;

    /**
     * 创建时间
     */
    private java.util.Date createTime;

    /**
     * 最后修改人
     */
    private java.lang.String lastModifior;

    /**
     * 最后修改时间
     */
    private java.util.Date lastModifyTime;

    /**
     * 删除标记：0表示正常；1表示删除
     */
    private java.lang.Integer deleted;
    //columns END

    public Tmail() {
    }

    public Tmail(
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

    public void setTitle(java.lang.String value) {
        this.title = value;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public void setContent(java.lang.String value) {
        this.content = value;
    }

    public java.lang.String getContent() {
        return this.content;
    }

    public void setRemark(java.lang.String value) {
        this.remark = value;
    }

    public java.lang.String getRemark() {
        return this.remark;
    }

    public void setIsImportant(java.lang.Integer value) {
        this.isImportant = value;
    }

    public java.lang.Integer getIsImportant() {
        return this.isImportant;
    }

    public void setSenderId(java.lang.String value) {
        this.senderId = value;
    }

    public java.lang.String getSenderId() {
        return this.senderId;
    }

    public void setIsTiming(java.lang.Integer value) {
        this.isTiming = value;
    }

    public java.lang.Integer getIsTiming() {
        return this.isTiming;
    }

    public void setEstSendTime(java.util.Date value) {
        this.estSendTime = value;
    }

    public java.util.Date getEstSendTime() {
        return this.estSendTime;
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
        return "Tmail{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", remark='" + remark + '\'' +
                ", isImportant=" + isImportant +
                ", senderId='" + senderId + '\'' +
                ", isTiming=" + isTiming +
                ", estSendTime=" + estSendTime +
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
        if (!(o instanceof Tmail)) return false;

        Tmail tmail = (Tmail) o;

        if (getId() != null ? !getId().equals(tmail.getId()) : tmail.getId() != null) return false;
        if (getTitle() != null ? !getTitle().equals(tmail.getTitle()) : tmail.getTitle() != null) return false;
        if (getContent() != null ? !getContent().equals(tmail.getContent()) : tmail.getContent() != null) return false;
        if (getRemark() != null ? !getRemark().equals(tmail.getRemark()) : tmail.getRemark() != null) return false;
        if (getIsImportant() != null ? !getIsImportant().equals(tmail.getIsImportant()) : tmail.getIsImportant() != null)
            return false;
        if (getSenderId() != null ? !getSenderId().equals(tmail.getSenderId()) : tmail.getSenderId() != null)
            return false;
        if (getIsTiming() != null ? !getIsTiming().equals(tmail.getIsTiming()) : tmail.getIsTiming() != null)
            return false;
        if (getEstSendTime() != null ? !getEstSendTime().equals(tmail.getEstSendTime()) : tmail.getEstSendTime() != null)
            return false;
        if (getCreator() != null ? !getCreator().equals(tmail.getCreator()) : tmail.getCreator() != null) return false;
        if (getCreateTime() != null ? !getCreateTime().equals(tmail.getCreateTime()) : tmail.getCreateTime() != null)
            return false;
        if (getLastModifior() != null ? !getLastModifior().equals(tmail.getLastModifior()) : tmail.getLastModifior() != null)
            return false;
        if (getLastModifyTime() != null ? !getLastModifyTime().equals(tmail.getLastModifyTime()) : tmail.getLastModifyTime() != null)
            return false;
        return getDeleted() != null ? getDeleted().equals(tmail.getDeleted()) : tmail.getDeleted() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        result = 31 * result + (getRemark() != null ? getRemark().hashCode() : 0);
        result = 31 * result + (getIsImportant() != null ? getIsImportant().hashCode() : 0);
        result = 31 * result + (getSenderId() != null ? getSenderId().hashCode() : 0);
        result = 31 * result + (getIsTiming() != null ? getIsTiming().hashCode() : 0);
        result = 31 * result + (getEstSendTime() != null ? getEstSendTime().hashCode() : 0);
        result = 31 * result + (getCreator() != null ? getCreator().hashCode() : 0);
        result = 31 * result + (getCreateTime() != null ? getCreateTime().hashCode() : 0);
        result = 31 * result + (getLastModifior() != null ? getLastModifior().hashCode() : 0);
        result = 31 * result + (getLastModifyTime() != null ? getLastModifyTime().hashCode() : 0);
        result = 31 * result + (getDeleted() != null ? getDeleted().hashCode() : 0);
        return result;
    }
}