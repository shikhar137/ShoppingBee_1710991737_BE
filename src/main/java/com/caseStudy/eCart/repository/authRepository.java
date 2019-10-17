package com.caseStudy.eCart.repository;

import com.caseStudy.eCart.models.Authorization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface authRepository extends JpaRepository <Authorization,Long> {
 Authorization findByUserid(int userid);

Optional<Authorization> findByUsername( String username );

}
