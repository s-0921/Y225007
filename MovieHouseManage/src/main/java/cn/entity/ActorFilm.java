package cn.entity;

/**
 * 实体类：演职人员和电影  的关联
 * */
public class ActorFilm {
    private Integer id;

    private Integer aId;//演职人员id

    private Integer fId;//电影id

    public ActorFilm(Integer id, Integer aId, Integer fId) {
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

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId == null ? null : aId;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId == null ? null : fId;
    }
}