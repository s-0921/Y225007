package cn.service.impl;

import cn.entity.Actor;
import cn.mapper.ActorMapper;
import cn.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorMapper actorMapper;

    @Override
    public int removeByPrimaryKey(Integer aId) {
        return actorMapper.deleteByPrimaryKey(aId);
    }

    @Override
    public int add(Actor record) {
        return actorMapper.insert(record);
    }

    @Override
    public int addSelective(Actor record) {
        return actorMapper.insertSelective(record);
    }

    @Override
    public Actor queryByPrimaryKey(Integer aId) {
        return actorMapper.selectByPrimaryKey(aId);
    }

    @Override
    public int changeByPrimaryKeySelective(Actor record) {
        return actorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int changeByPrimaryKey(Actor record) {
        return actorMapper.updateByPrimaryKey(record);
    }
}
