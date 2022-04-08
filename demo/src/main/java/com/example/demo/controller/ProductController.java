/*
package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.Repository.ProductRepo;
import com.example.demo.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {
    /*
    @GetMapping(value="simple")
    public String getString(){
        return "Got you!";
    }
    //Simple request Eg: http://localhost:8080/good
    @GetMapping(value="good")
    public String GoodJob(){
        return "GGS!";
    }
    //Get user id. Eg: http://localhost:8080/user?id=007
    @GetMapping(value="user")
    public String GetUser(@RequestParam(name="id") String userID){
        //access to database and query by using UserID
        return userID;
    }
    //get pathvariable Eg: http://localhost:8080/product/007
    @GetMapping(value="product/{id}")
    public String GetProduct(@PathVariable() String id){

        return id;
    }
    */
/*
    //use for post json data, like quantity, price, name, these info will match to the product Class. The variable name should be the same
    @Autowired
    private ProductRepo productRepo;

    @PostMapping(value="product")
    public int newProduct(@RequestBody Product prod){
        //create a new product using 'prod' in the database
        
       
        return productRepo.save(prod).getProductID();
    }

    @GetMapping(value="product")
    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    @GetMapping(value="product/{productid}")
    public Product getProduct(@PathVariable int productid){
        //Optional is used when you dont know whether the product is exist or not
        Optional<Product> prod= productRepo.findById(productid);
        return prod.isPresent()?prod.get():null; // is present to check whether have it or not. IF have it, return prod , if not, return null
    }

}
*/