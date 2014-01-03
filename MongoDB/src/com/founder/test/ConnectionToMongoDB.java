package com.founder.test;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

public class ConnectionToMongoDB {
	public static void main(String[] args) throws Exception {
		Mongo mongo = MongoDBUtil.connect("localhost", 27017);
		DB db = mongo.getDB("prefs");
		DBCollection collection = db.getCollection("location");
		DBCursor cur = collection.find();
		while(cur.hasNext()){
			System.out.println(cur.next());
		}
	}
}
