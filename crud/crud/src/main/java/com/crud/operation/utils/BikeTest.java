package com.crud.operation.utils;

import com.crud.operation.dao.BikeDAO;
import com.crud.operation.dto.BikeDTO;

public class BikeTest {
	public static void main(String[] args) {
		
		/*
		 * BikeDTO dto = new BikeDTO(); dto.setName("herohonda");
		 * dto.setModel("passionpro"); dto.setPrice(70000L); dto.setMileage(55L);
		 * dto.setLights("halogen"); dto.setGears(4L); BikeDAO bikeDAO = new BikeDAO();
		 * bikeDAO.saveBike(dto);
		 * 
		 */
		
		
		  BikeDAO bikeDAO = new BikeDAO();
		  BikeDTO dto1 = bikeDAO.getBikeById(11L);
		  BikeDTO dto2 = bikeDAO.getBikeById(11L);
		  
		  System.out.println(dto1);
		  System.out.println(dto2);
		  
		 // bikeDAO.updateBikePrice(11L,71000L);
		  //BikeDTO dto2 = bikeDAO.getBikeById(11L);
		  //System.out.println(dto2);
		 
		
	//	BikeDAO dao = new BikeDAO();
		//dao.deleteBikeById(11L);
	}
}
