package com.yywhisk.base.Servlet;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by cloudyao on 2016/10/20.
 */
@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",
 initParams={
        @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
 }
)
public class DruidStatFilter extends WebStatFilter{
}
