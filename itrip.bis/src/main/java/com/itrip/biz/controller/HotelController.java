package com.itrip.biz.controller;

import com.alibaba.fastjson.JSON;
import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.hotel.HotelService;
import com.itrip.common.DtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @RequestMapping(value="/hotel/queryhotels",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Object queryHotels(){
        List<Hotel> hotels = hotelService.getHotels();
        return JSON.toJSONString(DtoUtil.returnSuccess("查询旅店成功",hotels));
    }
}
