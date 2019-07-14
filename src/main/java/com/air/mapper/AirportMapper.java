package com.air.mapper;

import java.util.List;

import com.air.pojo.Airport;
import org.apache.ibatis.annotations.Select;


public interface AirportMapper {
	@Select("select * from airport where id in (select distinct takeid from airplane)")
	List<Airport> selTakePort();
	@Select("select * from airport where id in (select distinct landid from airplane)")
	List<Airport> selLandPort();
}
