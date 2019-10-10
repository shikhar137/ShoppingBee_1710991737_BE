package com.caseStudy.eCart.repository;

import com.caseStudy.eCart.models.Authorization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface authRepository extends JpaRepository <Authorization,Long> {

}
