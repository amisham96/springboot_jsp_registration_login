package com.myapp.springbootloginregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.springbootloginregistration.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
}
