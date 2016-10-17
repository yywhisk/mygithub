package com.yywhisk.test;

import com.yywhisk.test.bean.Demo;
import com.yywhisk.test.dao.DemoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/10/17.
 */
@Service
public class DemoService {
    @Resource
    private DemoRepository demoRepository;
    @Transactional
    public void save(Demo demo){ demoRepository.save(demo); }

}
