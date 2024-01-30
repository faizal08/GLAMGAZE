package org.glamgaze.library.repository;

import org.glamgaze.library.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>
{
   Admin findByEmail(String Email);
}
