package com.xdpg.mapper;

import com.xdpg.pojo.Jd;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper : 表示本类是一个 MyBatis 的 Mapper
@Mapper
@Repository
public interface JdMapper {
    //获取所有信息
    List<Jd> getJdList();

    Jd getJdById(int id);

    int saveJd(Jd jd);

    int updateJd(Jd id);

    int delJd(int id);

}
