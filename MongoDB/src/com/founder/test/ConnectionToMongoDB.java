package com.founder.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

public class ConnectionToMongoDB {
	public static void main(String[] args) throws Exception {
		Mongo mongo = MongoDBUtil.connect("localhost", 27017);
		List<String>  list= mongo.getDatabaseNames();
		for(String s: list){
			DB db = mongo.getDB(s);
			Set<String> collections = db.getCollectionNames();
			System.out.println(Arrays.toString(collections.toArray()));
		}
	}
}
