package com.Redis_2_springboot.redis_2.Repositary;

import com.Redis_2_springboot.redis_2.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
