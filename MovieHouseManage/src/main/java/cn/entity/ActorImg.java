package cn.entity;

/**
 * 演员图片
 */
public class ActorImg {
    private Integer id;//编号

    private String aImgUrl;//图片路径

    private Integer aId;//演员编号

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