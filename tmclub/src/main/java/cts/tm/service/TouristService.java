package cts.tm.service;

import java.util.List;

import cts.tm.pojo.TouristPojo;


public interface TouristService {

	TouristPojo save(TouristPojo touristPojo);
	 List<TouristPojo> list();
	 TouristPojo get(int touristId);
	 void update(TouristPojo touristPojo);
	void deleteTourist(int touristId);
	TouristPojo search(int id);
	List<TouristPojo> findByCompName(String cname);

}
