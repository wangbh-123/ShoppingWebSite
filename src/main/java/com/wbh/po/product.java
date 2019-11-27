package com.wbh.po;

/**
 * @author wbh
 * @create 2019-11-21-14:36
 */

/**
 * 这是实体类
 */
public class product {
    private int product_id;
    private String product_name;
    private int product_sum;
    private double product_price;
    private status status_id;

    @Override
    public String toString() {
        return "product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_sum=" + product_sum +
                ", product_price=" + product_price +
                ", status_id=" + status_id +
                '}';
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_sum() {
        return product_sum;
    }

    public void setProduct_sum(int product_sum) {
        this.product_sum = product_sum;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public status getStatus_id() {
        return status_id;
    }

    public void setStatus_id(status status_id) {
        this.status_id = status_id;
    }

    public product(int product_id, String product_name, int product_sum, double product_price, status status_id) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_sum = product_sum;
        this.product_price = product_price;
        this.status_id = status_id;
    }

    public product() {
    }
}
