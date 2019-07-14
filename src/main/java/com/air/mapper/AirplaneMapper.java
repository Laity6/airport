package com.air.mapper;

import java.util.List;

import com.air.pojo.Airplane;
import org.apache.ibatis.annotations.Param;


public interface AirplaneMapper {
	List<Airplane> selByTakeidLandid(@Param("takeid") int takeid, @Param("landid") int landid);
}
