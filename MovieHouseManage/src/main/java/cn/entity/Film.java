package cn.entity;

import java.util.Date;

public class Film {
    private Integer fId;

    private String fName;

    private String fType;

    private String fCountry;

    private Date fTime;

    private Integer fDuration;

    private String fPritureUrl;

    private String fIntro;

    private String fLanguage;

    private Double fOffice;

    private Double fScore;

    private Double fExpectationValue;

    public Film(Integer fId, String fName, String fType, String fCountry, Date fTime, Integer fDuration, String fPritureUrl, String fIntro, String fLanguage, Double fOffice, Double fScore, Double fExpectationValue) {
        this.fId = fId;
        this.fName = fName;
        this.fType = fType;
        this.fCountry = fCountry;
        this.fTime = fTime;
        this.fDuration = fDuration;
        this.fPritureUrl = fPritureUrl;
        this.fIntro = fIntro;
        this.fLanguage = fLanguage;
        this.fOffice = fOffice;
        this.fScore = fScore;
        this.fExpectationValue = fExpectationValue;
    }

    public Film() {
        super();
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType == null ? null : fType.trim();
    }

    public String getfCountry() {
        return fCountry;
    }

    public void setfCountry(String fCountry) {
        this.fCountry = fCountry == null ? null : fCountry.trim();
    }

    public Date getfTime() {
        return fTime;
    }

    public void setfTime(Date fTime) {
        this.fTime = fTime;
    }

    public Integer getfDuration() {
        return fDuration;
    }

    public void setfDuration(Integer fDuration) {
        this.fDuration = fDuration;
    }

    public String getfPritureUrl() {
        return fPritureUrl;
    }

    public void setfPritureUrl(String fPritureUrl) {
        this.fPritureUrl = fPritureUrl == null ? null : fPritureUrl.trim();
    }

    public String getfIntro() {
        return fIntro;
    }

    public void setfIntro(String fIntro) {
        this.fIntro = fIntro == null ? null : fIntro.trim();
    }

    public String getfLanguage() {
        return fLanguage;
    }

    public void setfLanguage(String fLanguage) {
        this.fLanguage = fLanguage == null ? null : fLanguage.trim();
    }

    public Double getfOffice() {
        return fOffice;
    }

    public void setfOffice(Double fOffice) {
        this.fOffice = fOffice;
    }

    public Double getfScore() {
        return fScore;
    }

    public void setfScore(Double fScore) {
        this.fScore = fScore;
    }

    public Double getfExpectationValue() {
        return fExpectationValue;
    }

    public void setfExpectationValue(Double fExpectationValue) {
        this.fExpectationValue = fExpectationValue;
    }
}