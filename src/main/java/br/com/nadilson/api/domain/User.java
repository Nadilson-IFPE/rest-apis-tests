package br.com.nadilson.api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users") // Fix for error: org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "drop table if exists user cascade " via JDBC [Syntax error in SQL statement "drop table if exists [*]user cascade "; expected "identifier";]
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;

}
