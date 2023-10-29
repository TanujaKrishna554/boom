package sunbasedata.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sunbasedata.dto.Data_dto;






public class DataDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(Data_dto d1) {
		entityTransaction.begin();
		entityManager.persist(d1);
		entityTransaction.commit();

}
	public List<Data_dto> getCustList() {
		Query q = entityManager.createQuery("select data from Data_dto data");
		

		List<Data_dto> b = q.getResultList();
		return b;
	
		
	}
	public String deleteCustomer(int uuid) {
		Data_dto e2 = entityManager.find(Data_dto.class, uuid);
		if (e2 != null) {
			entityTransaction.begin();
			entityManager.remove(e2);
			entityTransaction.commit();
			return "200,data deleted successfully";
		} else {
			return "400,uuid not found";
		}
	}
	public String updateCustomer(Data_dto e3) {
		if(e3!=null) {
	
		entityTransaction.begin();
entityManager.merge(e3);
		entityTransaction.commit();
		return "200,data successfully updated";
		}
		 else  {
			return"500,uuid not found";
		}
	
		
	}
	public Data_dto getCust(int uuid) {
		
			
	Data_dto e = entityManager.find(Data_dto.class, uuid);
			return e;
		
	}
	
	}



		
	
		
		
	


