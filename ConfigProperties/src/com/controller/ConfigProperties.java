package com.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

	public static void main(String[] args) {


		/*
		 * Author: Lucas Marlaire lmarlaire@gmail.com
		 * 
		 */
		System.out.println("This is a sample test of the usate of a properties file!");
		
		// Instance properties file config.properties to user and password
		Properties prop = new Properties();
		try {
		    prop.load(new FileInputStream("resources\\config.properties"));
		} 
		catch (IOException ex) {
		    ex.printStackTrace();
		}

	
		String user = prop.getProperty("user");
		String pass = prop.getProperty("pass");

		System.out.println("This is the user from the config.properties files : " + user);
		System.out.println("This is the password from the config.properties files : " + pass);
	}

}
