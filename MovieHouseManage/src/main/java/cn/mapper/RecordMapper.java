package cn.mapper;

import cn.entity.Record;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}