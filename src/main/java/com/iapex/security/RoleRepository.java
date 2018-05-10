package com.iapex.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by iapex on 2017. 5. 11..
 */
@Transactional(readOnly = true)
public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findByUserId(Long userId);
}
