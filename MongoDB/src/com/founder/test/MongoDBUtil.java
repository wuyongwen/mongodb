package com.founder.test;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.Mongo;

public class MongoDBUtil {
	
	static Mongo m = null;
	DB db;
	public static Mongo connect(String server,int port) throws Exception{
		if(m == null){
			try {
				m = new Mongo(server,port);
			} catch (UnknownHostException e) {
				e.printStackTrace();
				throw new Exception(); 
			}
		}
		return m;
	}
}
