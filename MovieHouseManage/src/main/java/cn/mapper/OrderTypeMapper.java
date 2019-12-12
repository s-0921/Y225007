package cn.mapper;

import cn.entity.OrderType;

public interface OrderTypeMapper {
    int deleteByPrimaryKey(Integer otId);

    int insert(OrderType record);

    int insertSelective(OrderType record);

    OrderType selectByPrimaryKey(Integer otId);

    int updateByPrimaryKeySelective(OrderType record);

    int updateByPrimaryKey(OrderType record);
}