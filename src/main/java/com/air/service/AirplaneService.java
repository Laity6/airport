package com.air.service;

import com.air.pojo.Airplane;

import java.util.List;


public interface AirplaneService {
	List<Airplane> show(int takeid, int landid);
}
