package cn.mapper;

import cn.entity.Address;

public interface AddressMapper {
    public int deleteByPrimaryKey(Integer aId);

    public int insert(Address record);

    public int insertSelective(Address record);

    public Address selectByPrimaryKey(Integer aId);

    public int updateByPrimaryKeySelective(Address record);

    public int updateByPrimaryKey(Address record);
}