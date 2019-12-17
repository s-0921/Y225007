package cn.entity;

/**
 * 电影图片Bean
 */
public class FilmImg {
    private String id;//编号

    private String fImgUrl;//电影宣传图片

    private Integer fId;//电影编号

    public FilmImg(String id, String fImgUrl, Integer fId) {
        this.id = id;
        this.fImgUrl = fImgUrl;
        this.fId = fId;
    }

    public FilmImg() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getfImgUrl() {
        return fImgUrl;
    }

    public void setfImgUrl(String fImgUrl) {
        this.fImgUrl = fImgUrl == null ? null : fImgUrl.trim();
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }
}