package com.yywhisk.base.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by Administrator on 2016/10/16.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
        @ExceptionHandler(value = Exception.class)
        public void defaultErrorHandler(HttpServletRequest req, Exception e) {
            e.printStackTrace();
            System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");

        }
}
