package de.cronn.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * Configuration for the MongoDB database.
 * 
 * @author Leandro Baltazar, cronn GmbH
 */
@Configuration
@EnableMongoRepositories
public class MongoConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "mydatabase";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient("127.0.0.1", 27017);
	}

	@Override
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongo(), getDatabaseName());
	}
}
