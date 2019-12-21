package cn.entity;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer oId;

    private Integer uId;

    private Integer rId;

    private Integer seatNum;

    private String seatInfo;

    private Double money;

    private Integer status;

    private Date addTime;

    private String oPhone;

    private String ordernum;

    private List<Ticket> tickets;

    public Order(Integer oId, Integer uId, Integer rId, Integer seatNum, String seatInfo, Double money, Integer status, Date addTime, String oPhone, String ordernum) {
        this.oId = oId;
        this.uId = uId;
        this.rId = rId;
        this.seatNum = seatNum;
        this.seatInfo = seatInfo;
        this.money = money;
        this.status = status;
        this.addTime = addTime;
        this.oPhone = oPhone;
        this.ordernum = ordernum;
    }

    public Order(Integer uId, Integer rId, Integer seatNum, String seatInfo, Double money, Integer status, Date addTime, String oPhone, String ordernum, List<Ticket> tickets) {
        this.uId = uId;
        this.rId = rId;
        this.seatNum = seatNum;
        this.seatInfo = seatInfo;
        this.money = money;
        this.status = status;
        this.addTime = addTime;
        this.oPhone = oPhone;
        this.ordernum = ordernum;
        this.tickets = tickets;
    }

    public Order(Integer oId, Integer uId, Integer rId, Integer seatNum, String seatInfo, Double money, Integer status, Date addTime, String oPhone, String ordernum, List<Ticket> tickets) {
        this.oId = oId;
        this.uId = uId;
        this.rId = rId;
        this.seatNum = seatNum;
        this.seatInfo = seatInfo;
        this.money = money;
        this.status = status;
        this.addTime = addTime;
        this.oPhone = oPhone;
        this.ordernum = ordernum;
        this.tickets = tickets;
    }

    public Order() {

    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public String getSeatInfo() {
        return seatInfo;
    }

    public void setSeatInfo(String seatInfo) {
        this.seatInfo = seatInfo == null ? null : seatInfo.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getoPhone() {
        return oPhone;
    }

    public void setoPhone(String oPhone) {
        this.oPhone = oPhone;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}