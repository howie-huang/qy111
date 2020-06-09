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
public class Room extends Model<Room> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "roomid", type = IdType.AUTO)
    private Integer roomid;
    private String name;


    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Serializable pkVal() {
        return this.roomid;
    }

    @Override
    public String toString() {
        return "Room{" +
        "roomid=" + roomid +
        ", name=" + name +
        "}";
    }
}
