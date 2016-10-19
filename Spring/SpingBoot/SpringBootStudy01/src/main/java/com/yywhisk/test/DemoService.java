package com.yywhisk.test;

import com.yywhisk.test.bean.Demo;
import com.yywhisk.test.dao.DemoDao;
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
    @Resource
    private DemoDao demoDao;

    @Transactional
    public void save(Demo demo) {
        demoRepository.save(demo);
    }

    public Demo getById(long id) {
        //demoRepository.findOne(id);
        // 在demoRepository可以直接使用findOne进行获取.
        return demoDao.getById(id);
    }
}
