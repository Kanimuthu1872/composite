package com.example.compositekey.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@IdClass( UserPK.class )
@Table(name = "users")
@Data
public class User {
 @Id
 private int userId;
 @Id
 private String userType;

 private String firstName;
 private String lastName;
 private String email;
 private boolean isActive;
}