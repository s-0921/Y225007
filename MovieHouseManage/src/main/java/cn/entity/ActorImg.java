package cn.entity;

public class ActorImg {
    private Integer id;

    private String aImgUrl;

    private Integer aId;

    public ActorImg(Integer id, String aImgUrl, Integer aId) {
        this.id = id;
        this.aImgUrl = aImgUrl;
        this.aId = aId;
    }

    public ActorImg() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getaImgUrl() {
        return aImgUrl;
    }

    public void setaImgUrl(String aImgUrl) {
        this.aImgUrl = aImgUrl == null ? null : aImgUrl.trim();
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }
}