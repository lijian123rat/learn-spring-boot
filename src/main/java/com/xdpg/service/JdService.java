package com.xdpg.service;

import com.xdpg.pojo.Jd;

import java.util.List;

public interface JdService {

    List<Jd> getJdList();

    Jd getJdById(int id);

    int saveJd(Jd jd);

    int updateJd(Jd id);

    int delJd(int id);

}
