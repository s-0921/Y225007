package cn.entity;

public class OrderType {
    private Integer otId;

    private String typename;

    public OrderType(Integer otId, String typename) {
        this.otId = otId;
        this.typename = typename;
    }

    public OrderType() {
        super();
    }

    public Integer getOtId() {
        return otId;
    }

    public void setOtId(Integer otId) {
        this.otId = otId;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}