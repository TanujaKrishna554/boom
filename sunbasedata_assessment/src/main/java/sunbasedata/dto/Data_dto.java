package sunbasedata.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Data_dto {
	
	
@Id	
private int uuid;
		private String First_name;
		private String Last_name;
		
		private String Address;
		private String City;
		private String State;
		private String Email;
		private String street;
		
		private long Phone;
		
		
		
		
		public int getUuid() {
			return uuid;
		}
		public void setUuid(int uuid) {
			this.uuid = uuid;
		}
		public String getFirst_name() {
			return First_name;
		}
		public void setFirst_name(String first_name) {
			First_name = first_name;
		}
		public String getLast_name() {
			return Last_name;
		}
		public void setLast_name(String last_name) {
			Last_name = last_name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public long getPhone() {
			return Phone;
		}
		public void setPhone(long phone) {
			Phone = phone;
		}
		
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		@Override
		public String toString() {
			return "DataDto [uuid=" + uuid + ", First_name=" + First_name + ", Last_name=" + Last_name + ", Address="
					+ Address + ", City=" + City + ", State=" + State + ", Email=" + Email + ", street=" + street
					+ ", Phone=" + Phone + "]";
		}
	
		}
		
		
		
		
		

		
		
		
		

	



