package com.mobi.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobi.dao.BookDAO;
import com.mobi.dao.UserDao;
import com.mobi.model.Rent;
import com.mobi.model.Room;
import com.mobi.model.User;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDAO bookDAO;
	
	@Autowired
	private UserDao userDAO;
	

	@Override
	@Transactional
	public Room getroom(int id) {
		return bookDAO.getroom(id);
	}

	@Override
	@Transactional
	public void bookroom(Rent rent) {
	 bookDAO.bookroom(rent);
	}

	@Override
	@Transactional
	public void update(Room roomDetails) {
		bookDAO.update(roomDetails);
		
	}

	@Override
	@Transactional
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return (List<User>) userDAO.findAll();
	}
	
	
}
