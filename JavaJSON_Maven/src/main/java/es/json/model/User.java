package es.json.model;

import java.util.List;

/**
 * 
 * @author Usuario
 *
 */
public class User {
	
	private int id;
	private String name;
	private String password;
	private List<String> languages;
	
	/**
	 * Empty constructor
	 */
	public User() {
		
	}
	
	/**
	 * Overloaded constructor
	 * @param id
	 * @param name
	 * @param password
	 */
	public User(int id, String name, String password, List<String> languages) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.languages = languages;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the languages
	 */
	public List<String> getLanguages() {
		return languages;
	}

	/**
	 * @param languages the languages to set
	 */
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", languages=" + languages + "]";
	}
	
	

}
