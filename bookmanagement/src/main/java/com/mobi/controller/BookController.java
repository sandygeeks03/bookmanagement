package com.mobi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mobi.model.Rent;
import com.mobi.model.Room;
import com.mobi.model.User;
import com.mobi.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String login(
			@RequestParam String uname,
			@RequestParam String pswd) {
		
		List<User> users = bookService.getAll();
		
		for(int i=0; i<= users.size();i++) {
			
			System.out.println(users.get(i).getUsername());
			System.out.println(users.get(i).getPassword());
			
		}
		
		return "true";
		
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/view")
	public ModelAndView test1() {
		ModelAndView mav = new ModelAndView("bookings");
		return mav;
	}
	
	@RequestMapping(value = "/book")
	public ModelAndView test2() {
		int id=1;
		ModelAndView mav = new ModelAndView("book");
		mav.addObject("room", bookService.getroom(id));
		return mav;
	}
	
	@RequestMapping(value = "/booking", method = RequestMethod.POST)
	@ResponseBody
	public String booking(@RequestParam String rname,
			@RequestParam String rooms) {
		int roomid=1;
		int userid=1;
		String result = "";
		
		Room roomDetails =bookService.getroom(roomid);
		int avail = roomDetails.getRooms();
		int reque = Integer.valueOf(rooms);
		if(avail != 0) {
			int remain = avail -reque;
	
			Rent rent = new Rent();
			rent.setUserid(userid);
			rent.setRoomid(roomid);
			rent.setRooms(Integer.valueOf(rooms));
			bookService.bookroom(rent);
			
			roomDetails.setRooms(remain);
			
			bookService.update(roomDetails);
			
			result = "true";
			
		}else {
			
			result = "false";
		}
		
		return result;
		
	}
	
}
