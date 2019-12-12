package cn.entity;

import java.util.Date;

public class Record {
    private Integer rId;

    private String fId;

    private String cId;

    private String roomId;

    private Date starttime;

    private Date endtime;

    private Integer totalNum;

    private Integer selNum;

    private Double rPrice;

    public Record(Integer rId, String fId, String cId, String roomId, Date starttime, Date endtime, Integer totalNum, Integer selNum, Double rPrice) {
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

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId == null ? null : fId.trim();
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
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