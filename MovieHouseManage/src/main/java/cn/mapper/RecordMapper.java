package cn.mapper;

import cn.entity.Record;

public interface RecordMapper {
    public int deleteByPrimaryKey(Integer rId);

    public int insert(Record record);

    public int insertSelective(Record record);

    public Record selectByPrimaryKey(Integer rId);

    public int updateByPrimaryKeySelective(Record record);

    public int updateByPrimaryKey(Record record);
}