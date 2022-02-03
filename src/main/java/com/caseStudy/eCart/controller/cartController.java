package com.caseStudy.eCart.controller;

import com.caseStudy.eCart.models.Cart;
import com.caseStudy.eCart.models.Orderhistory;
import com.caseStudy.eCart.repository.cartRepository;
import com.caseStudy.eCart.service.cartService;
import com.caseStudy.eCart.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/cart")
public class cartController {
    private cartRepository d ;

    @Autowired
    cartService f ;
    @Autowired
    private userservice u;
    @RequestMapping( value = "/removeproduct/recieve/{productid}", method = RequestMethod.GET)
    @ResponseBody


    public Optional<Cart> removeproduct(@PathVariable int productid , Principal principal )
    {
        return f.removeproduct(u.getUserId(principal),productid);
    }
    @RequestMapping( value = "/addtocart/recieve/{productid}", method = RequestMethod.GET)
    @ResponseBody
    public Cart addproduct(@PathVariable int productid , Principal principal )
    {
        return f.addProduct(u.getUserId(principal),productid);
    }
    @RequestMapping( value = "/showcart/recieve", method = RequestMethod.GET)
    @ResponseBody
    public List<Cart> showproduct(Principal principal)
    {
        return f.showCart(u.getUserId(principal));
    }
    @RequestMapping( value = "/removefromcart/recieve/{productid}", method = RequestMethod.GET)
    @ResponseBody
    public String remove(@PathVariable int productid , Principal principal )
    {
        return f.clearCart(u.getUserId(principal), principal);
    }
    @RequestMapping( value = "/deleteproduct/recieve/{productid}" , method = RequestMethod.GET)
    @ResponseBody
    public Optional<Cart> deleteproduct(@PathVariable int productid , Principal principal)
    {
        return f.deleteproduct(u.getUserId(principal), productid );
    }
    @RequestMapping(value = "/checkout/recieve", method = RequestMethod.GET)
    @ResponseBody
    public double checkout(Principal principal) {
        return f.checkout(u.getUserId(principal),principal);
    }
    @RequestMapping( value = "/orderhistory/recieve" , method=RequestMethod.GET)
    @ResponseBody
    public List<Orderhistory> history (Principal principal)
    {
        return f.showorderhistory( u.getUserId(principal), principal);

    }
}
