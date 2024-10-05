package com.example.compositekey.repositories;

import java.util.Optional;

import com.example.compositekey.entity.User;
import com.example.compositekey.entity.UserPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UserPK> {
 @Query("SELECT u FROM User u WHERE u.userId = :userId AND u.userType = :userType AND u.isActive = true")
 Optional<User> findUser(int userId, String userType);
}
