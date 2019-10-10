//package com.caseStudy.eCart.controller;
//
//import com.caseStudy.eCart.models.Cart;
//import com.caseStudy.eCart.repository.cartRepository;
//import com.caseStudy.eCart.service.cartService;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.security.Principal;
//import java.util.List;
//
//public class cartController {
//    private cartRepository d ;
//    private cartService f ;
//    @RequestMapping( value = "/removeproduct/recieve/{productid}", method = RequestMethod.GET)
//    @ResponseBody
//
//    public Cart removeproduct(@PathVariable int productid , Principal principal )
//    {
//        return f.addtocart(currentUserService.getuserid(principal),productid);
//    }
//    @RequestMapping( value = "/addtocart/recieve/{productid}", method = RequestMethod.GET)
//    @ResponseBody
//    public String addproduct(@PathVariable int productid , Principal principal )
//    {
//        return f.addtocart(currentUserService.getuserid(principal),productid);
//    }
//    @RequestMapping( value = "/showcart/recieve", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Cart> showproduct(Principal principal)
//    {
//        return f.showcart(currentUserService.getuserid(principal));
//    }
//    @RequestMapping( value = "/removefromcart/recieve/{productid}", method = RequestMethod.GET)
//    @ResponseBody
//    public String remove(@PathVariable int productid , Principal principal )
//    {
//        return f.removefromcart(currentUserService.getuserid(principal),productid);
//    }

//}
