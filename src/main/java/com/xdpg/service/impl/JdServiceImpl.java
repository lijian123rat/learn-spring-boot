package com.xdpg.service.impl;

import com.xdpg.mapper.JdMapper;
import com.xdpg.pojo.Jd;
import com.xdpg.service.JdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JdServiceImpl implements JdService {
    @Autowired
    JdMapper jdMapper;

    @Override
    public List<Jd> getJdList() {
        return jdMapper.getJdList();
    }

    @Override
    public Jd getJdById(int id) {
        return jdMapper.getJdById(id);
    }

    @Override
    public int saveJd(Jd jd) {
        return jdMapper.saveJd(jd);
    }

    @Override
    public int updateJd(Jd id) {
        return jdMapper.updateJd(id);
    }

    @Override
    public int delJd(int id) {
        return jdMapper.delJd(id);
    }
}
