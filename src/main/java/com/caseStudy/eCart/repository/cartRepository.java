package com.caseStudy.eCart.repository;

import com.caseStudy.eCart.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cartRepository extends JpaRepository<Cart,Integer> {
}
