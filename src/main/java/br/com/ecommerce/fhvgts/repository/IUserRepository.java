package br.com.ecommerce.fhvgts.repository;

import br.com.ecommerce.fhvgts.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
/*
import org.springframework.stereotype.Repository;
*/
import java.util.List;

/*
@Repository
*/
public interface IUserRepository extends MongoRepository<User, String> {
    public User findByName(String Name);
}
