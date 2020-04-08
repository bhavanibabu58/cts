package cts.tm.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cts.tm.entity.Tourist;
import cts.tm.pojo.TouristPojo;
import cts.tm.repository.TouristRepository;


@Service("touristService")
@Transactional
public class TouristServiceImpl implements TouristService {

	@Autowired
	private TouristRepository touristRepository;

	@Override
	public TouristPojo save(TouristPojo touristPojo) {
		System.out.println("Service..." + touristPojo.getCname());
		
//basic details_1
		Tourist tourist = new Tourist();
		tourist.setCname(touristPojo.getCname());
		tourist.setLname(touristPojo.getLname());
		tourist.setAge(touristPojo.getAge());
		tourist.setGender(touristPojo.getGender());
//basic details_2
		tourist.setAdd1(touristPojo.getAdd1());
		tourist.setAdd2(touristPojo.getAdd2());
		tourist.setAdd3(touristPojo.getAdd3());
//basic details_3		
		tourist.setPcontact(touristPojo.getPcontact());
		tourist.setScontact(touristPojo.getScontact());
		tourist.setEmail(touristPojo.getEmail());
//basicdetails_4
		tourist.setIdno(touristPojo.getIdno());
		
//food and accommodation
		tourist.setLocation(touristPojo.getLocation());
		tourist.setHotelname(touristPojo.getHotelname());
		tourist.setRoomno(touristPojo.getRoomno());
		tourist.setRoomtype(touristPojo.getRoomtype());
		tourist.setPreffered_food(touristPojo.getPreffered_food());
		tourist.setArrdate(touristPojo.getArrdate());
		tourist.setDepdate(touristPojo.getDepdate());

//health
		tourist.setEmergencyContact(touristPojo.getEmergencyContact());
		tourist.setBloodgroup(touristPojo.getBloodgroup());
//destination
		tourist.setDestination(touristPojo.getDestination());
		
		
		
		
		touristRepository.save(tourist);

		touristPojo.setId(tourist.getId());

		return touristPojo;
	}

	@Override
	public List<TouristPojo> list() {

		List<TouristPojo> touristPojoList = new ArrayList<TouristPojo>();

		List<Tourist> touristList = touristRepository.findAll();

		for (Tourist tourist : touristList) {
			TouristPojo touristPojo = new TouristPojo();
			touristPojo.setCname(tourist.getCname());
			touristPojo.setId(tourist.getId());
			touristPojo.setAge(tourist.getAge());
			touristPojo.setGender(tourist.getGender());
	//basic details_2
			touristPojo.setAdd1(tourist.getAdd1());
			touristPojo.setAdd2(tourist.getAdd2());
			touristPojo.setAdd3(tourist.getAdd3());
	//basic details_3		
			touristPojo.setPcontact(tourist.getPcontact());
			touristPojo.setScontact(tourist.getScontact());
			touristPojo.setEmail(tourist.getEmail());
	//basicdetails_4
			touristPojo.setIdno(tourist.getIdno());
			
	//food and accommodation
			touristPojo.setLocation(tourist.getLocation());
			touristPojo.setHotelname(tourist.getHotelname());
			touristPojo.setRoomno(tourist.getRoomno());
			touristPojo.setRoomtype(tourist.getRoomtype());
			touristPojo.setPreffered_food(tourist.getPreffered_food());
			touristPojo.setArrdate(tourist.getArrdate());
			touristPojo.setDepdate(tourist.getDepdate());

	//health
			touristPojo.setEmergencyContact(tourist.getEmergencyContact());
			touristPojo.setBloodgroup(tourist.getBloodgroup());
	//destination
			touristPojo.setDestination(tourist.getDestination());
			touristPojoList.add(touristPojo);
			System.out.println(tourist.getCname());
		}

		return touristPojoList;

	}

	@Override
	public TouristPojo get(int touristId) {

		Tourist tourist = touristRepository.getOne(touristId);

		TouristPojo touristPojo = new TouristPojo();
		touristPojo.setId(tourist.getId());
		touristPojo.setCname(tourist.getCname());
		touristPojo.setLname(tourist.getLname());
		touristPojo.setAge(tourist.getAge());
		touristPojo.setGender(tourist.getGender());
//basic details_2
		touristPojo.setAdd1(tourist.getAdd1());
		touristPojo.setAdd2(tourist.getAdd2());
		touristPojo.setAdd3(tourist.getAdd3());
//basic details_3		
		touristPojo.setPcontact(tourist.getPcontact());
		touristPojo.setScontact(tourist.getScontact());
		touristPojo.setEmail(tourist.getEmail());
//basicdetails_4
		touristPojo.setIdno(tourist.getIdno());
		
//food and accommodation
		touristPojo.setLocation(tourist.getLocation());
		touristPojo.setHotelname(tourist.getHotelname());
		touristPojo.setRoomno(tourist.getRoomno());
		touristPojo.setRoomtype(tourist.getRoomtype());
		touristPojo.setPreffered_food(tourist.getPreffered_food());
		touristPojo.setArrdate(tourist.getArrdate());
		touristPojo.setDepdate(tourist.getDepdate());

//health
		touristPojo.setEmergencyContact(tourist.getEmergencyContact());
		touristPojo.setBloodgroup(tourist.getBloodgroup());
		return touristPojo;
	}

	@Override
	public void update(TouristPojo touristPojo) {
		
		Tourist tourist = new Tourist();
		
		//basic details_1
				tourist.setId(touristPojo.getId());
				tourist.setCname(touristPojo.getCname());
				tourist.setLname(touristPojo.getLname());
				tourist.setAge(touristPojo.getAge());
				tourist.setGender(touristPojo.getGender());
		//basic details_2
				tourist.setAdd1(touristPojo.getAdd1());
				tourist.setAdd2(touristPojo.getAdd2());
				tourist.setAdd3(touristPojo.getAdd3());
		//basic details_3		
				tourist.setPcontact(touristPojo.getPcontact());
				tourist.setScontact(touristPojo.getScontact());
				tourist.setEmail(touristPojo.getEmail());
		//basicdetails_4
				tourist.setIdno(touristPojo.getIdno());
				
		//food and accommodation
				tourist.setLocation(touristPojo.getLocation());
				tourist.setHotelname(touristPojo.getHotelname());
				tourist.setRoomno(touristPojo.getRoomno());
				tourist.setRoomtype(touristPojo.getRoomtype());
				tourist.setPreffered_food(touristPojo.getPreffered_food());
				tourist.setArrdate(touristPojo.getArrdate());
				tourist.setDepdate(touristPojo.getDepdate());

		//health
				tourist.setEmergencyContact(touristPojo.getEmergencyContact());
				tourist.setBloodgroup(touristPojo.getBloodgroup());
	
		touristRepository.save(tourist);
		
	}
	
	
	@Override
	public TouristPojo search(int id)
	{

		
		

		Tourist touristList =  touristRepository.findById(id).orElse(new Tourist());

		
			TouristPojo touristPojo = new TouristPojo();
			touristPojo.setCname(touristList.getCname());
			touristPojo.setId(touristList.getId());
			touristPojo.setAge(touristList.getAge());
			touristPojo.setGender(touristList.getGender());
	//basic details_2
			touristPojo.setAdd1(touristList.getAdd1());
			touristPojo.setAdd2(touristList.getAdd2());
			touristPojo.setAdd3(touristList.getAdd3());
	//basic details_3		
			touristPojo.setPcontact(touristList.getPcontact());
			touristPojo.setScontact(touristList.getScontact());
			touristPojo.setEmail(touristList.getEmail());
	//basicdetails_4
			touristPojo.setIdno(touristList.getIdno());
			
	//food and accommodation
			touristPojo.setLocation(touristList.getLocation());
			touristPojo.setHotelname(touristList.getHotelname());
			touristPojo.setRoomno(touristList.getRoomno());
			touristPojo.setRoomtype(touristList.getRoomtype());
			touristPojo.setPreffered_food(touristList.getPreffered_food());
			touristPojo.setArrdate(touristList.getArrdate());
			touristPojo.setDepdate(touristList.getDepdate());

	//health
			touristPojo.setEmergencyContact(touristList.getEmergencyContact());
			touristPojo.setBloodgroup(touristList.getBloodgroup());
	//destination
			touristPojo.setDestination(touristList.getDestination());
			
			System.out.println(touristList.getCname());
		

		

		 return touristPojo;
	}
	
	
	

	@Override
	public void deleteTourist(int touristId) {
		touristRepository.deleteById(touristId);
		
	}

	@Override
	public List<TouristPojo> findByCompName(String cname) {
		List<TouristPojo> touristPojoList = new ArrayList<TouristPojo>();

		List<Tourist> touristList = touristRepository.findByCnameLike(cname);

		
		for (Tourist tourist : touristList) {
			TouristPojo touristPojo = new TouristPojo();
			touristPojo.setCname(tourist.getCname());
			touristPojo.setId(tourist.getId());
			
		
			
			touristPojo.setAge(tourist.getAge());
			touristPojo.setGender(tourist.getGender());
	//basic details_2
			touristPojo.setAdd1(tourist.getAdd1());
			touristPojo.setAdd2(tourist.getAdd2());
			touristPojo.setAdd3(tourist.getAdd3());
	//basic details_3		
			touristPojo.setPcontact(tourist.getPcontact());
			touristPojo.setScontact(tourist.getScontact());
			touristPojo.setEmail(tourist.getEmail());
	//basicdetails_4
			touristPojo.setIdno(tourist.getIdno());
			
	//food and accommodation
			touristPojo.setLocation(tourist.getLocation());
			touristPojo.setHotelname(tourist.getHotelname());
			touristPojo.setRoomno(tourist.getRoomno());
			touristPojo.setRoomtype(tourist.getRoomtype());
			touristPojo.setPreffered_food(tourist.getPreffered_food());
			touristPojo.setArrdate(tourist.getArrdate());
			touristPojo.setDepdate(tourist.getDepdate());

	//health
			touristPojo.setEmergencyContact(tourist.getEmergencyContact());
			touristPojo.setBloodgroup(tourist.getBloodgroup());
	//destination
			touristPojo.setDestination(tourist.getDestination());
			
			touristPojoList.add(touristPojo);
			System.out.println(tourist.getCname());
		}

		return touristPojoList;

	}

}
