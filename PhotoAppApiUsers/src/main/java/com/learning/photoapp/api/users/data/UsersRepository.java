package com.learning.photoapp.api.users.data;

import org.springframework.data.repository.CrudRepository;

/* This interface specifies methods for querying DB / Repository 
to retrieve records using different fields */
public interface UsersRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);
	UserEntity findByUserId(String userId);
}
