package es.json.serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import es.json.model.User;

/**
 * An example of serialization of a series of objects of the User class to a JSON
 * @author WANCHOPI
 */
public class WriteJSON {
	
	/*
	 * Constructor
	 */
	public WriteJSON() {
		
		List<User> users = new ArrayList<User>();
		
		users = loadUsers();
		
		String json = new Gson().toJson(users);
		saveJSON(json);
		
	}

	private void saveJSON(String json) {
		
		File file = new File("json/user.json");

		try {
			FileUtils.touch(file);
			FileUtils.writeStringToFile(file, json, "iso-8859-1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private List<User> loadUsers() {

		List<User> users = new ArrayList<User>();
		
		List<String> languagesUser1 = new ArrayList<String>();
		languagesUser1.add("Java");
		languagesUser1.add("Python");
		User user1 = new User(1, "Óscar", "1111", languagesUser1);
		
		List<String> languagesUser2 = new ArrayList<String>();
		languagesUser2.add("Javascript");
		languagesUser2.add("Python");
		languagesUser2.add("PHP");
		User user2 = new User(2, "Álvaro", "2222", languagesUser2);
		
		List<String> languagesUser3 = new ArrayList<String>();
		languagesUser3.add("Javascript");
		languagesUser3.add("Python");
		languagesUser3.add("PHP");
		languagesUser3.add("Ruby");
		User user3 = new User(3, "Sonia", "3333", languagesUser3);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		return users;
	}

}




















