package cn.mapper;

import cn.entity.Room;

public interface RoomMapper {
    public int deleteByPrimaryKey(Integer roomId);

    public int insert(Room record);

    public int insertSelective(Room record);

    public Room selectByPrimaryKey(Integer roomId);

    public int updateByPrimaryKeySelective(Room record);

    public int updateByPrimaryKey(Room record);
}