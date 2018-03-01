package com.anyikang.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

import com.alibaba.fastjson.JSONObject;
import com.anyikang.base.BaseResponse;
import com.baomidou.mybatisplus.plugins.Page;

/**
 * 
 * @author wangwei
 * @date 2017年6月29日
 */
public class WebUtil  {
    public  static  HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();


//    public  static  <T> Page<T> getPage(int defaultSie) {
//        String _size = request.getParameter("size");
//        String _index = request.getParameter("current");
//        int size = StringUtils.isNotBlank(_size)?Integer.parseInt(_size):defaultSie;
//        int current = StringUtils.isNotBlank(_index)?Integer.parseInt(_index):1;
//        return new Page<>(current, size);
//    }

    
    public  static void  responseWrit(BaseResponse responseBase){
        ServletWebRequest servletWebRequest= new ServletWebRequest(request);
        HttpServletResponse response=servletWebRequest.getResponse();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.append(JSONObject.toJSON(responseBase).toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
    
    public  static void  responseWrit(HttpServletResponse response, BaseResponse responseBase){
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.append(JSONObject.toJSON(responseBase).toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

}
