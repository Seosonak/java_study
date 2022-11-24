package test.ch11.System;

import java.util.Properties;

public class GetPropertyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userhome = System.getProperty("user.home");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userhome);
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object objkey: keys) {
			String key = (String) objkey;
			System.out.println(key);
		}
	}

}
