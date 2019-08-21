package es.json.deserialization;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import es.json.model.User;


/**
 *
 * @author Usuario
 *
 */
public class ReadJSON {
	
	/**
	 * Constructor
	 */
	public ReadJSON() {
		
		String jsonFile = readFile();
		Gson gson = new Gson();
		
		User[] users = gson.fromJson(jsonFile, User[].class);
		
		for (User user : users) {
			System.out.println(user);
		}
		
	}

	private String readFile() {
		
		File file = new File("json/user.json");
		String content = "";
		try {
			content = FileUtils.readFileToString(file, "iso-8859-1");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return content;
	}

}
