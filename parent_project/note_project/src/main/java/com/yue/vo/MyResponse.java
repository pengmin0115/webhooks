package com.yue.vo;

import java.io.Serializable;

/**
 * @author pengmin
 * @date 2021/1/31 15:18
 */

public class MyResponse implements Serializable {

    private boolean flag;
    private String message;
    private Object data;

    public MyResponse() {
    }

    public MyResponse(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public MyResponse(boolean flag, String message, Object data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static MyResponse success(String message){
        return new MyResponse(true,message);
    }

    public static MyResponse success(){
        return new MyResponse(true,"success");
    }

    public static MyResponse success(Object data){
        return new MyResponse(true,"success",data);
    }
}
