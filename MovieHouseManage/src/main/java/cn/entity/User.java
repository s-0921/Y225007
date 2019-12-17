package cn.entity;

import java.util.Date;

/**
 * 用户Bean
 */
public class User {
    private Integer uIdu;//编号

    private String uName;//昵称

    private String uPwd;//密码

    private String uSex;//性别

    private Date birthday;//生日

    private String animation;//生活状态

    private String uPhone;//联系方式

    public User(Integer uIdu, String uName, String uPwd, String uSex, Date birthday, String animation, String uPhone) {
        this.uIdu = uIdu;
        this.uName = uName;
        this.uPwd = uPwd;
        this.uSex = uSex;
        this.birthday = birthday;
        this.animation = animation;
        this.uPhone = uPhone;
    }

    public User(String uPwd, String uPhone) {
        this.uPwd = uPwd;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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