package cts.tm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Tourism_Management")
public class Tourist {
	
	@Override
	public String toString() {
		return "Tourist [id=" + id + ", add1=" + add1 + ", add2=" + add2 + ", add3=" + add3 + ", cname=" + cname
				+ ", lname=" + lname + ", age=" + age + ", gender=" + gender + ", pcontact=" + pcontact + ", scontact="
				+ scontact + ", email=" + email + ", idno=" + idno + ", location=" + location + ", hotelname="
				+ hotelname + ", roomno=" + roomno + ", roomtype=" + roomtype + ", preffered_food=" + preffered_food
				+ ", arrdate=" + arrdate + ", depdate=" + depdate + ", emergencyContact=" + emergencyContact
				+ ", bloodgroup=" + bloodgroup + ", Destination=" + Destination + "]";
	}

	@Id
	@GeneratedValue
	private int id;
	
	//Basic details_1
	private String add1;
	private String add2;
	private String add3;
	
	@Column(name="Tourist_Name")
	private String cname;
	private String lname;	
	private int age;
	private String gender;
	
	//Basic details_2
	

		
	
		//Basic details_3
		
		private long pcontact;
		private long scontact;
		private String email;
		
		//basic deatils_4
		private String idno;
		
		//Food and accommodation

		private String location;
		private String hotelname;
		private String roomno;
		private String roomtype;
		private String preffered_food;
		private String arrdate;
		private String depdate;
		
		//healthdata
		private long emergencyContact;
		private String bloodgroup;
		
		
		//Destination
		private String Destination;
		


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	
	
	
	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getAdd3() {
		return add3;
	}

	public void setAdd3(String add3) {
		this.add3 = add3;
	}

	
	
	
	public long getPcontact() {
		return pcontact;
	}

	public void setPcontact(long pcontact) {
		this.pcontact = pcontact;
	}

	public long getScontact() {
		return scontact;
	}

	public void setScontact(long scontact) {
		this.scontact = scontact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public String getIdno() {
		return idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}
	
	
	

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public String getRoomno() {
		return roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public String getPreffered_food() {
		return preffered_food;
	}

	public void setPreffered_food(String preffered_food) {
		this.preffered_food = preffered_food;
	}

	
	
	public String getArrdate() {
		return arrdate;
	}

	public void setArrdate(String arrdate) {
		this.arrdate = arrdate;
	}

	public String getDepdate() {
		return depdate;
	}

	public void setDepdate(String depdate) {
		this.depdate = depdate;
	}


	




	public long getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(long emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	
	
    
	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	
	
	
	
	
	
	
	
}
