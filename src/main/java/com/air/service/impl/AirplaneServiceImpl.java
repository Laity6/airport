package com.air.service.impl;

import java.util.List;

import com.air.mapper.AirplaneMapper;
import com.air.pojo.Airplane;
import com.air.service.AirplaneService;
import com.air.util.MyBatisUtil;

public class AirplaneServiceImpl implements AirplaneService {

	@Override
	public List<Airplane> show(int takeid, int landid) {
		AirplaneMapper airplaneMapper=MyBatisUtil.getSession().getMapper(AirplaneMapper.class);
		return airplaneMapper.selByTakeidLandid(takeid,landid);
	}

}
