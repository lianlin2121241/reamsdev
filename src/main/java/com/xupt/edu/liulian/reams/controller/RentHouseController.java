package com.xupt.edu.liulian.reams.controller;

import com.alibaba.fastjson.JSONObject;
import com.xupt.edu.liulian.reams.dto.Rent;
import com.xupt.edu.liulian.reams.dto.RentHouseTest;
import com.xupt.edu.liulian.reams.mapper.RentHouseMapper;
import com.xupt.edu.liulian.reams.pojo.RentHouse;
import com.xupt.edu.liulian.reams.pojo.RentHouseExample;
import com.xupt.edu.liulian.reams.service.RentHouseService;
import com.xupt.edu.liulian.reams.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class RentHouseController{
    @Autowired
    RentHouseService rentHouseService;
    @RequestMapping(value = "rentHouseList",method = RequestMethod.GET)
    @ResponseBody
    public List<RentHouse> list() throws Exception{
        List<RentHouse> rentHouse = rentHouseService.list();
        return rentHouse;
    }

    @RequestMapping(value = "rentHouseById",method = RequestMethod.POST)
    @ResponseBody
    public Rent selectByKey(Integer rent_id){
        Rent rent = rentHouseService.selectByID(rent_id);
        return rent;
    }

    @RequestMapping(value = "rentHouseByName",method = RequestMethod.POST)
    @ResponseBody
    public Rent list(@RequestParam("name")String name){
        Rent rent = rentHouseService.listByName(name);
        return rent;
    }

    @RequestMapping(value = "rentHouseSortByConTime",method = RequestMethod.GET)
    @ResponseBody
    public Rent sortByTime(){
        Rent rentHouseTest = rentHouseService.sortByTime();
        return rentHouseTest;
    }

    @RequestMapping(value = "rentHouseSortByPrice",method = RequestMethod.GET)
    @ResponseBody
    public Rent sortByPrice(){
        Rent rentHouseTest = rentHouseService.sortByPrice();
        return rentHouseTest;
    }



}
