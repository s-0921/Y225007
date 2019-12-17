package cn.entity;

/**
 * 演员所参演电影Bean
 */
public class ActorFilm {
    private Integer id;//编号

    private String aId;//演员编号

    private String fId;//电影编号

    public ActorFilm(Integer id, String aId, String fId) {
        this.id = id;
        this.aId = aId;
        this.fId = fId;
    }

    public ActorFilm() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId == null ? null : aId.trim();
    }

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId == null ? null : fId.trim();
    }
}