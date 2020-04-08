package br.com.ecommerce.fhvgts.repository;

import br.com.ecommerce.fhvgts.model.UserGroup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
@Repository
*/

public interface IUserGroupRepository extends MongoRepository<UserGroup, String> {
    /*
    @Query(value = "{'user.name': ?0}", fields = "{'users' : 0}")
    UserGroup findUserGroupByUserName(String empName);
    */

    public UserGroup findBygroupName(String groupName);
}