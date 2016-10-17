package com.yywhisk.test.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2016/10/16.
 */
@Entity
@Table(name = "Demo")
public class Demo {
    @Id
    @GeneratedValue
    private long id;//主键.
    private String name;//测试名称.
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
