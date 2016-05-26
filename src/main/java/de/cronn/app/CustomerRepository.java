package de.cronn.app;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository for {@link Customer}.
 * 
 * @author Leandro Baltazar, cronn GmbH
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
