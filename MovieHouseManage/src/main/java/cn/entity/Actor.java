package cn.entity;

import java.util.Date;

public class Actor {
    private Integer aId;

    private String aName;

    private String aSex;

    private String aAddress;

    private Date aBirthday;

    public Actor(Integer aId, String aName, String aSex, String aAddress, Date aBirthday) {
        this.aId = aId;
        this.aName = aName;
        this.aSex = aSex;
        this.aAddress = aAddress;
        this.aBirthday = aBirthday;
    }

    public Actor() {
        super();
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaSex() {
        return aSex;
    }

    public void setaSex(String aSex) {
        this.aSex = aSex == null ? null : aSex.trim();
    }

    public String getaAddress() {
        return aAddress;
    }

    public void setaAddress(String aAddress) {
        this.aAddress = aAddress == null ? null : aAddress.trim();
    }

    public Date getaBirthday() {
        return aBirthday;
    }

    public void setaBirthday(Date aBirthday) {
        this.aBirthday = aBirthday;
    }
}