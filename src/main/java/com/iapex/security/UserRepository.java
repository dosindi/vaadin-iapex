package com.iapex.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by iapex on 2017. 5. 11..
 */
@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String name);

}
