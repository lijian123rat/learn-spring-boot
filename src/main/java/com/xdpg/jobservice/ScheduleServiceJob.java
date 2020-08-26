package com.xdpg.jobservice;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceJob{

    //cron表达式
    //秒 分 时 日 月 周几
    @Scheduled(cron = "0/10 * * * * *")
    public void hello(){
//        System.out.println("Hello,你已被执行了！");
    }
}
