package com.laylib.sdr.model;

import java.util.HashMap;

/**
 * Api Result
 *
 * @author Lay
 * @date 2019/01/02
 */
public class Result {
    private int code;

    private Object data;

    private String msg;

    public Result()
    {
        this(0, null, "");
    }

    public Result(Object data)
    {
        this(0, data, "");
    }

    public Result(int code, String msg)
    {
        this(code, null, msg);
    }

    public Result(int code, Object data, String msg)
    {
        this.code = code;
        this.data = data != null ? data : new HashMap<String, String>();
        this.msg = msg != null ? msg : "";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
