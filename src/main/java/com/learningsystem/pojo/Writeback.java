package com.learningsystem.pojo;

/**
*@Author : YangGuang
*@Description:问题回复实体类
*@Date:Created in 12:18 2018/1/7
*
**/
public class Writeback {
    private Integer wbId;

    private Integer rdqId;

    private String wbContent;

    private String wbUploadfile;

    private String stuStudentid;

    private Integer wbCcontenNum;

    private String wbTime;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    //加载Student
    private Student student;

    public String getWbTime() {
        return wbTime;
    }

    public void setWbTime(String wbTime) {
        this.wbTime = wbTime;
    }

    public Integer getWbCcontenNum() {
        return wbCcontenNum;
    }

    public void setWbCcontenNum(Integer wbCcontenNum) {
        this.wbCcontenNum = wbCcontenNum;
    }

    public Integer getWbId() {
        return wbId;
    }

    public void setWbId(Integer wbId) {
        this.wbId = wbId;
    }

    public Integer getRdqId() {
        return rdqId;
    }

    public void setRdqId(Integer rdqId) {
        this.rdqId = rdqId;
    }

    public String getWbContent() {
        return wbContent;
    }

    public void setWbContent(String wbContent) {
        this.wbContent = wbContent == null ? null : wbContent.trim();
    }

    public String getWbUploadfile() {
        return wbUploadfile;
    }

    public void setWbUploadfile(String wbUploadfile) {
        this.wbUploadfile = wbUploadfile == null ? null : wbUploadfile.trim();
    }

    public String getStuStudentid() {
        return stuStudentid;
    }

    public void setStuStudentid(String stuStudentid) {
        this.stuStudentid = stuStudentid == null ? null : stuStudentid.trim();
    }

    @Override
    public String toString() {
        return "Writeback{" +
                "wbId=" + wbId +
                ", rdqId=" + rdqId +
                ", wbContent='" + wbContent + '\'' +
                ", wbUploadfile='" + wbUploadfile + '\'' +
                ", stuStudentid='" + stuStudentid + '\'' +
                ", wbCcontenNum=" + wbCcontenNum +
                ", wbTime='" + wbTime + '\'' +
                ", student=" + student +
                '}';
    }
}