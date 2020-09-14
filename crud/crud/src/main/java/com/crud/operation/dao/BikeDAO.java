package com.crud.operation.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.crud.operation.dto.BikeDTO;
import com.oehm4.basics.dto.AccountDTO;
import com.oehm4.basics.utils.SessionFactoryUtil;

public class BikeDAO {
	
	public void saveBike(BikeDTO bikeDTO)
	{
		Session session = BikeSessionFactory.createSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(bikeDTO);
		transaction.commit();	
	}
	
	public BikeDTO getBikeDetailsById(Long id) {
			Session session = BikeSessionFactory.createSessionFactory().openSession();
			String hql="from BikeDTO where id=:rid";
			Query query = session.createQuery(hql);
			query.setParameter("rid", id );
			BikeDTO uniqueResult = (BikeDTO) query.uniqueResult();
			return uniqueResult;
		}
	public BikeDTO getBikeById(Long id)
	{
		Session session = BikeSessionFactory.createSessionFactory().openSession();
		BikeDTO dto = session.get(BikeDTO.class, id);
		return dto;	
	}
	
	public void updateBikePrice(Long id,Long price)
	{
		BikeDTO dto = getBikeById(id);
		if(dto != null) {
			Session session = BikeSessionFactory.createSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			dto.setPrice(price);
			session.update(dto);
			transaction.commit();
		}
	}
	
	
	public void deleteBikeById(Long id)
	{
		BikeDTO dto = getBikeById(id);
		if(dto != null) {
			Session session = BikeSessionFactory.createSessionFactory().openSession();
			Transaction transaction = session.beginTransaction();
			dto.setId(id);
			session.delete(dto);
			transaction.commit();
		}
	}
	
	
	public List<BikeDTO> getAllBikeDetails()
	{
		Session session = BikeSessionFactory.createSessionFactory().openSession();
		String hql="from BikeDTO";
		Query query = session.createQuery(hql);
		query.setCacheable(true);
		List<BikeDTO> list = query.list();
		return list;
	}
	
}
