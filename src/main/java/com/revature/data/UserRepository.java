package com.revature.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    // .save(), .findAll(), .update(), .deleteById() are already created

    Optional<User> findUserByUsernameAndPassword(String username, String password);

    Optional<User> findByUsername(String username);

    // returns all the users ordered by last name
//    List<User> findByOrderByLastName();

    // custom query
//    @Query("From User WHERE email LIKE %:pattern") // the : is a placeholder for the argument
//    List<User> findByEmailContains(String pattern); // johnsmi -> returns johnsmith@gmail.com
}
