package com.exam.qy111.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-09
 */
public class Elecinfo extends Model<Elecinfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "elecid", type = IdType.AUTO)
    private Integer elecid;
    private String months;
    private Double elecsum;
    private Double elecmoney;
    private Integer roomid;
    private String elecstate;


    public Integer getElecid() {
        return elecid;
    }

    public void setElecid(Integer elecid) {
        this.elecid = elecid;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public Double getElecsum() {
        return elecsum;
    }

    public void setElecsum(Double elecsum) {
        this.elecsum = elecsum;
    }

    public Double getElecmoney() {
        return elecmoney;
    }

    public void setElecmoney(Double elecmoney) {
        this.elecmoney = elecmoney;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getElecstate() {
        return elecstate;
    }

    public void setElecstate(String elecstate) {
        this.elecstate = elecstate;
    }

    @Override
    protected Serializable pkVal() {
        return this.elecid;
    }

    @Override
    public String toString() {
        return "Elecinfo{" +
        "elecid=" + elecid +
        ", months=" + months +
        ", elecsum=" + elecsum +
        ", elecmoney=" + elecmoney +
        ", roomid=" + roomid +
        ", elecstate=" + elecstate +
        "}";
    }
}
