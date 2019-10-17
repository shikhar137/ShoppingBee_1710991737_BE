package com.caseStudy.eCart.repository;

import com.caseStudy.eCart.models.Authorization;
import com.caseStudy.eCart.models.Cart;
import com.caseStudy.eCart.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public interface cartRepository extends JpaRepository<Cart,Integer> {
  Optional<Cart> findByUserAndItems( Authorization auth , Products products );

  List<Cart> findByUserAndItems_Active( Authorization auth ,int i);

  List<Cart> findAllByUser( Authorization auth );
}
