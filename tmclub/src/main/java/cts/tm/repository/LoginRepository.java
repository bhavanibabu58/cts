package cts.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import cts.tm.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {

}
