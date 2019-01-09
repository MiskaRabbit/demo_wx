package com.xujin.demo_wx.dao;

import com.xujin.demo_wx.entity.Area;

import java.util.List;

public interface AreaDao {
    //查出所有area
    List<Area> queryArea();

    //根据id查询area
    Area queryAreaById(int areaId);

    //插入一条area信息
    int insertArea(Area area);

    //删除area
    int deleteArea(Area area);
}
