package cn.entity;

import java.util.Date;

public class User {
    private Integer uIdu;

    private String uName;

    private String uPwd;

    private String uSex;

    private Date brithday;

    private String animation;

    private String uPhone;

    public User(Integer uIdu, String uName, String uPwd, String uSex, Date brithday, String animation, String uPhone) {
        this.uIdu = uIdu;
        this.uName = uName;
        this.uPwd = uPwd;
        this.uSex = uSex;
        this.brithday = brithday;
        this.animation = animation;
        this.uPhone = uPhone;
    }

    public User() {
        super();
    }

    public Integer getuIdu() {
        return uIdu;
    }

    public void setuIdu(Integer uIdu) {
        this.uIdu = uIdu;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getAnimation() {
        return animation;
    }

    public void setAnimation(String animation) {
        this.animation = animation == null ? null : animation.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }
}