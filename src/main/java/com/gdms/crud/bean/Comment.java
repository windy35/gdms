package com.gdms.crud.bean;

public class Comment {
    private Integer commentid;

    private Integer lyhdtitleinfoid;

    private String commenttime;

    private String reviewerid;

    private Integer agreenum;

    private Integer disagreenum;

    private String reviewersf;

    private Integer readstatus;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getLyhdtitleinfoid() {
        return lyhdtitleinfoid;
    }

    public void setLyhdtitleinfoid(Integer lyhdtitleinfoid) {
        this.lyhdtitleinfoid = lyhdtitleinfoid;
    }

    public String getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(String commenttime) {
        this.commenttime = commenttime == null ? null : commenttime.trim();
    }

    public String getReviewerid() {
        return reviewerid;
    }

    public void setReviewerid(String reviewerid) {
        this.reviewerid = reviewerid == null ? null : reviewerid.trim();
    }

    public Integer getAgreenum() {
        return agreenum;
    }

    public void setAgreenum(Integer agreenum) {
        this.agreenum = agreenum;
    }

    public Integer getDisagreenum() {
        return disagreenum;
    }

    public void setDisagreenum(Integer disagreenum) {
        this.disagreenum = disagreenum;
    }

    public String getReviewersf() {
        return reviewersf;
    }

    public void setReviewersf(String reviewersf) {
        this.reviewersf = reviewersf == null ? null : reviewersf.trim();
    }

    public Integer getReadstatus() {
        return readstatus;
    }

    public void setReadstatus(Integer readstatus) {
        this.readstatus = readstatus;
    }
}