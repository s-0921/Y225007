package cn.entity;

public class Cinema {
    private Integer cId;

    private String cName;

    private String cAddress;

    private String cPhone;

    private Integer aId;

    private String cIntro;

    private String cImgUrl;

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