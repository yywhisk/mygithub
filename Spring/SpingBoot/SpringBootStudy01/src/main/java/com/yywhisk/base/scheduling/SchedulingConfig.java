package com.yywhisk.base.scheduling;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by cloudyao on 2016/10/20.
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
    @Scheduled(cron = "0/20 * * * * ?")
    public void Scheduler() {
        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
    }
}
