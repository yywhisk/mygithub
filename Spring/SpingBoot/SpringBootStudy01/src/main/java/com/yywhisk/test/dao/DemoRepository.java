package com.yywhisk.test.dao;

import com.yywhisk.test.bean.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2016/10/17.
 */
public interface DemoRepository extends CrudRepository<Demo, Long> {
}

