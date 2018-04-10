/*
 * Copyright 2016 bianxianmao.com All right reserved. This software is the confidential and proprietary information of bianxianmao.com
 * ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with bianxianmao.com.
 */
package com.bianxianmao.duobaomanage.action.index;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 类ResultModel.java的实现描述:接口返回类型,用来返回json数据
 * 
 * @author leon 2016年8月11日 下午12:49:38
 */
public class ResultModel<T> implements Serializable {

    private static final long serialVersionUID = 9041530013023432967L;
    /**
     * 返回结果是否成功，true成功，false失败
     */
    private boolean           isSuccessed      = true;
    /**
     * 返回结果对象
     */
    private T                 returnValue;
    /**
     * 返回结果失败时的错误代码，isSuccessed=false时返回
     */
    private String            errorCode;
    /**
     * 返回结果失败时的错误描述，isSuccessed=false时根据需要返回
     */
    private String            errorDesc;
    /**
     * 返回结果失败时的详细异常信息，isSuccessed=false时根据需要返回
     */
    private String            exceptionDesc;

    public static <E extends Serializable> ResultModel<E> newInstance() {
        return new ResultModel<E>();
    }

    public boolean isSuccessed() {
        return isSuccessed;
    }

    public void setSuccessed(boolean isSuccessed) {
        this.isSuccessed = isSuccessed;
    }

    public String getExceptionDesc() {
        return exceptionDesc;
    }

    public void setExceptionDesc(String exceptionDesc) {
        this.exceptionDesc = exceptionDesc;
    }

    public T getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(T returnValue) {
        this.returnValue = returnValue;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
