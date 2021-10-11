package com.projetoday.webservice.repositories;

import com.projetoday.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
