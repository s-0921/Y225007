package cn.mapper;

import cn.entity.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}