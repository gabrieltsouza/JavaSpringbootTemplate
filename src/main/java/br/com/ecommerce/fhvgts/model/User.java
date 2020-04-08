package br.com.ecommerce.fhvgts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {
    @Id
    private String id;

    @Indexed(name = "userName")
    @Setter
    private String name;
    @Setter
    private String fullName;

    @Indexed(unique = true)
    @Setter
    private String fiscalDocument;

}