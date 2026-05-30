package com.facebook.springjpa.DAO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Table(name="userDB")
@Entity
@Getter
@Setter
public class User {
    @Id
    private Long id;
    private String name;
    private String email;

}
