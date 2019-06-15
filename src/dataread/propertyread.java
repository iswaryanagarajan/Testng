package dataread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyread {

	public static void main(String[] args) throws IOException {
		Properties Obj= new Properties();
		FileInputStream Objfile= new FileInputStream(System.getProperty("user.dir")+"\\src\\testData\\data.properties");
		Obj.load(Objfile);
		System.out.println(Obj.getProperty("URL"));
		
	}

}
