package com.jason.JobFinder.repository;

import com.jason.JobFinder.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
