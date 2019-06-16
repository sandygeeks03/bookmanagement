package com.mobi.dao;

import com.mobi.model.Rent;
import com.mobi.model.Room;

public interface BookDAO {
	
	Room getroom(int id);
	void bookroom(Rent rent);
	void update(Room roomDetails);
}
