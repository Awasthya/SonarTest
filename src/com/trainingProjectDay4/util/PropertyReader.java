package com.trainingProjectDay4.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try{
			FileReader fr = new FileReader("config//log4j.properties");
			Properties p = new Properties();
			
			p.load(fr);
			System.out.print(p.getProperty("log4j.rootLogger"));
		}catch(FileNotFoundException err){
			
			System.out.print("Error " + err);
		}
	}

}
