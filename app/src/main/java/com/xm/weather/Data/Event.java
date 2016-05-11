package com.xm.weather.Data;

/**
 * Created by Administrator on 2016/3/24.
 */
public abstract class Event {

    private Code Status;

    public Code getStatus() {
        return Status;
    }

    public void setStatus(Code status) {
        Status = status;
    }

    public static enum Code {
        Error, Completed, DoAction;
    }
}
