package br.com.ecommerce.fhvgts.repository;

import br.com.ecommerce.fhvgts.model.Action;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActionRepository extends MongoRepository<Action, String> { }