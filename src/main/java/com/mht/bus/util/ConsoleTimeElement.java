package com.mht.bus.util;

import cn.dreampie.ValidateKit;
import com.jfinal.plugin.activerecord.Record;

public class ConsoleTimeElement implements Comparable<ConsoleTimeElement>{
    //时间点
    private String time;
    //学生选座
    private Integer studentChoose;
    //教师选座
    private Integer teacherChoose;
    //临时人员选座
    private Integer tempChoose;
    //管理员锁定
    private Integer managerLock;

    public ConsoleTimeElement() {
    }

    public ConsoleTimeElement(Record record) {
        if(record==null){
            throw new NullPointerException("参数不能为null！");
        }
        this.time=record.getStr("time");
        this.studentChoose=record.getInt("studentChoose");
        this.teacherChoose=record.getInt("teacherChoose");
        this.tempChoose=record.getInt("tempChoose");
        this.managerLock=record.getInt("managerLock");
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getStudentChoose() {
        return studentChoose;
    }

    public void setStudentChoose(Integer studentChoose) {
        this.studentChoose = studentChoose;
    }

    public Integer getTeacherChoose() {
        return teacherChoose;
    }

    public void setTeacherChoose(Integer teacherChoose) {
        this.teacherChoose = teacherChoose;
    }

    public Integer getTempChoose() {
        return tempChoose;
    }

    public void setTempChoose(Integer tempChoose) {
        this.tempChoose = tempChoose;
    }

    public Integer getManagerLock() {
        return managerLock;
    }

    public void setManagerLock(Integer managerLock) {
        this.managerLock = managerLock;
    }

    public void addConsole(Record record){
        if(record==null){
            throw new NullPointerException("参数不能为null！");
        }
        this.studentChoose+=record.getInt("studentChoose");
        this.teacherChoose+=record.getInt("teacherChoose");
        this.tempChoose+=record.getInt("tempChoose");
        this.managerLock+=record.getInt("managerLock");
    }

    @Override
    public String toString() {
        return "ConsoleTimeElement{" +
                "time='" + time + '\'' +
                ", studentChoose=" + studentChoose +
                ", teacherChoose=" + teacherChoose +
                ", tempChoose=" + tempChoose +
                ", managerLock=" + managerLock +
                '}';
    }

    @Override
    public int compareTo(ConsoleTimeElement o) {
        return this.time.compareTo(o.time);
    }
}
