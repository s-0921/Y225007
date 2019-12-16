package cn.entity;

import java.util.Date;

/**
 * 演员Bean
 */
public class Actor {
    private Integer aId;//主键编号

    private String aName;//演员名

    private String aSex;//演员性别

    private String aAddress;//演员籍贯

    private Date aBirthday;//演员生日

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