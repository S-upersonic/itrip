package com.itrip.dao.hotel;

import com.itrip.beans.pojo.Hotel;

import java.util.List;

/**
 * 旅店的数据访问接口
 */
public interface HotelMapper {
    List<Hotel> getHotels();
}
