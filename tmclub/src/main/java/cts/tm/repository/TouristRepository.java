package cts.tm.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cts.tm.entity.Tourist;



@Repository
public interface TouristRepository extends JpaRepository<Tourist,Integer> {
	
@Query("SELECT c FROM Tourist c WHERE c.cname LIKE %:cname%")
	

	List<Tourist> findByCnameLike(@Param("cname") String cname);
	
}

