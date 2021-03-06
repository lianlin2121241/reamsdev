package com.xupt.edu.liulian.reams.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SaleOrder {
    private Integer id;

    private String name;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date sale_time;

    private String area_type;

    private String area;

    private String sale_type;

    private String price;

    private String phone;

    private Integer greenhouse_id;

    private Integer newhouse_id;

    private String user_phone;

    private Integer renthouse_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd")
    public Date getSale_time() {
        return sale_time;
    }

    public void setSale_time(Date sale_time) {
        this.sale_time = sale_time;
    }

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type == null ? null : area_type.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getSale_type() {
        return sale_type;
    }

    public void setSale_type(String sale_type) {
        this.sale_type = sale_type == null ? null : sale_type.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getGreenhouse_id() {
        return greenhouse_id;
    }

    public void setGreenhouse_id(Integer greenhouse_id) {
        this.greenhouse_id = greenhouse_id;
    }

    public Integer getNewhouse_id() {
        return newhouse_id;
    }

    public void setNewhouse_id(Integer newhouse_id) {
        this.newhouse_id = newhouse_id;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone == null ? null : user_phone.trim();
    }

    public Integer getRenthouse_id() {
        return renthouse_id;
    }

    public void setRenthouse_id(Integer renthouse_id) {
        this.renthouse_id = renthouse_id;
    }
}