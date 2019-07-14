package com.air.service.impl;

import java.util.List;

import com.air.mapper.AirportMapper;
import com.air.pojo.Airport;
import com.air.service.AirportService;
import com.air.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class AirportServiceImpl implements AirportService {

	@Override
	public List<Airport> showTakePort() {
		SqlSession session = MyBatisUtil.getSession();
		AirportMapper airportMapper = session.getMapper(AirportMapper.class);
		return airportMapper.selTakePort();
	}

	@Override
	public List<Airport> showLandPort() {
		SqlSession session = MyBatisUtil.getSession();
		AirportMapper airportMapper = session.getMapper(AirportMapper.class);
		return airportMapper.selLandPort();
	}

}
