package com.mobi.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobi.model.Rent;
import com.mobi.model.Room;

@Repository
public class BookDAOImpl implements BookDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Room getroom(int id) {
		Room room = (Room)sessionFactory.getCurrentSession().get(Room.class, id);
		return room;
	}

	@Override
	public void bookroom(Rent room) {
		sessionFactory.getCurrentSession().saveOrUpdate(room);
		
	}

	@Override
	public void update(Room roomDetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(roomDetails);
		
	}

}
