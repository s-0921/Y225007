package cn.entity;

/**
 * 电影院Bean
 */
public class Cinema {
    private Integer cId;//编号

    private String cName;//名称

    private String cAddress;//所在地详细地址

    private String cPhone;//联系方式

    private Integer aId;//地域编号

    private String cIntro;//简介

    private String cImgUrl;//宣传图

    public Cinema(Integer cId, String cName, String cAddress, String cPhone, Integer aId, String cIntro, String cImgUrl) {
        this.cId = cId;
        this.cName = cName;
        this.cAddress = cAddress;
        this.cPhone = cPhone;
        this.aId = aId;
        this.cIntro = cIntro;
        this.cImgUrl = cImgUrl;
    }

    public Cinema() {
        super();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress == null ? null : cAddress.trim();
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone == null ? null : cPhone.trim();
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getcIntro() {
        return cIntro;
    }

    public void setcIntro(String cIntro) {
        this.cIntro = cIntro == null ? null : cIntro.trim();
    }

    public String getcImgUrl() {
        return cImgUrl;
    }

    public void setcImgUrl(String cImgUrl) {
        this.cImgUrl = cImgUrl == null ? null : cImgUrl.trim();
    }
}