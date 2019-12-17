package cn.entity;

import java.util.Date;

public class Record {
    private Integer rId;

    private Integer fId;

    private Integer cId;

    private Integer roomId;

    private Date starttime;

    private Date endtime;

    private Integer totalNum;

    private Integer selNum;

    private Double rPrice;

    public Record(Integer rId, Integer fId, Integer cId, Integer roomId, Date starttime, Date endtime, Integer totalNum, Integer selNum, Double rPrice) {
        this.rId = rId;
        this.fId = fId;
        this.cId = cId;
        this.roomId = roomId;
        this.starttime = starttime;
        this.endtime = endtime;
        this.totalNum = totalNum;
        this.selNum = selNum;
        this.rPrice = rPrice;
    }

    public Record() {
        super();
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) { this.fId = fId == null ? null : fId; }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId == null ? null : cId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId == null ? null : roomId;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getSelNum() {
        return selNum;
    }

    public void setSelNum(Integer selNum) {
        this.selNum = selNum;
    }

    public Double getrPrice() {
        return rPrice;
    }

    public void setrPrice(Double rPrice) {
        this.rPrice = rPrice;
    }
}