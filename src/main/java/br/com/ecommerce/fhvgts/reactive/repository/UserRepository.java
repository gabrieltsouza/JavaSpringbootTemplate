package br.com.ecommerce.fhvgts.reactive.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import br.com.ecommerce.fhvgts.model.User;


public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
