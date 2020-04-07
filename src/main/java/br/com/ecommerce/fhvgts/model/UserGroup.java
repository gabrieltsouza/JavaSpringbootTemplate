package br.com.ecommerce.fhvgts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("userGroup")
@NoArgsConstructor
@AllArgsConstructor
public class UserGroup {
    @Id
    private String id;

    @Indexed(name = "groupName")
    @Getter
    @Setter
    private String groupName;

    @DBRef
    private List<User> users;
}