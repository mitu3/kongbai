/*
 * Copyright 2016 bianxianmao.com All right reserved. This software is the confidential and proprietary information of
 * bianxianmao.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it
 * only in accordance with the terms of the license agreement you entered into with bianxianmao.com.
 */
package com.bianxianmao.duobaomanage.action.index;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.math.BigInteger;
import java.security.MessageDigest;



@Controller
@RequestMapping("/")
public class Index {


    public static String getMD5(String str) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @RequestMapping("/login.json")
    @ResponseBody
    public ResultModel<String> login(HttpServletRequest request, HttpServletResponse response) {
        String s = "222222";
        ResultModel<String> ss = new ResultModel<String>();
        ss.setReturnValue(s);
        return ss;
    }
    @RequestMapping("/login1")
    @ResponseBody
    public ResultModel<String> login1(HttpServletRequest request, HttpServletResponse response) {

        String string = request.getParameter("test");
        String md5 = getMD5(string);
        ResultModel<String> ss = new ResultModel<String>();
        ss.setReturnValue(md5);
        return ss;
    }



}
