package com.mobi.service;

import java.util.List;

import com.mobi.model.Rent;
import com.mobi.model.Room;
import com.mobi.model.User;

public interface BookService {
	Room getroom(int id);
	void bookroom(Rent rent);
	void update(Room roomDetails);
	List<User> getAll();
}
