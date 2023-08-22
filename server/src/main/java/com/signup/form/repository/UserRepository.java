package com.signup.form.repository;

import com.signup.form.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User,String> {
}
