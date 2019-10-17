package com.caseStudy.eCart.repository;

import com.caseStudy.eCart.models.Authorization;
import com.caseStudy.eCart.models.Orderhistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface orderHistoryRepository extends JpaRepository<Orderhistory, Long> {
    List<Orderhistory> findAllByAuth(Authorization auth);
}
