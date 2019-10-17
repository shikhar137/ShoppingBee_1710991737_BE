package com.caseStudy.eCart.repository;

import com.caseStudy.eCart.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productsRepository extends JpaRepository<Products, Integer >
{
    List<Products> findByCategory(String category);
    List<Products> findById( int id);
    List<Products> findAllByProductPriceBetween( int p_price1, int p_price2);

    Products findByProductid(int productid);
}
