package cn.entity;

public class Address {
    private Integer aId;

    private String aName;

    private Integer priId;

    public Address(Integer aId, String aName, Integer priId) {
        this.aId = aId;
        this.aName = aName;
        this.priId = priId;
    }

    public Address() {
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

    public Integer getPriId() {
        return priId;
    }

    public void setPriId(Integer priId) {
        this.priId = priId;
    }
}