package com.wbh.po;

/**
 * @author wbh
 * @create 2019-11-21-15:07
 */
public class status {
    private int status_id;
    private String status_name;

    @Override
    public String toString() {
        return "status{" +
                "status_id=" + status_id +
                ", status_name='" + status_name + '\'' +
                '}';
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    public status(int status_id, String status_name) {
        this.status_id = status_id;
        this.status_name = status_name;
    }

    public status() {
    }
}
