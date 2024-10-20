package com.guru149.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name="users")
public class User extends BaseModel{
    private String name;
    private String phone;
    private String email;
    private String password;
}
