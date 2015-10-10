package org.cdac.repositories;

import org.cdac.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin.
 * User: Admin
 * Date: 10/10/2015
 * Time: 1:11 AM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
