package cn.mapper;

import cn.entity.Order;

public interface OrderMapper {
    public int deleteByPrimaryKey(Integer oId);

    public int insert(Order record);

    public int insertSelective(Order record);

    public Order selectByPrimaryKey(Integer oId);

    public int updateByPrimaryKeySelective(Order record);

    public int updateByPrimaryKey(Order record);
}