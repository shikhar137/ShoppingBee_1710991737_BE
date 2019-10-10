package com.caseStudy.eCart.controller;

import com.caseStudy.eCart.models.Products;
import com.caseStudy.eCart.repository.productsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/product")
public class productsController {
    @Autowired
    productsRepository p;

    @GetMapping("/productdetails")
    public List<Products> getAllNotes()
    {
        return p.findAll(); // to fetch from the database
    }
    @PostMapping("/productdetails1")
    public Products createNode(@Valid @RequestBody Products p1) // requestbody is used to request the data from the front end
    {
        return p.save(p1);
    }
    @GetMapping("/products/category/{category}")
    public List<Products> getnodebyCategory (@PathVariable ( value="category")String category)
    {
        return p.findByCategory(category);
    }
    @GetMapping("products1/id/{id}")
    public List<Products> getNode1(@PathVariable( value = "id" ) int id)
    {
        return p.findById(id);
    }
    @GetMapping("/getbyprice/{price1}/{price2}")
    public List<Products> getProductByPrice(@PathVariable( value = "price1") int p_price1 , @PathVariable( value = "price2") int p_price2)
    {
        return p.findAllByProductPriceBetween(p_price1,p_price2);
    }

}
