package com.gnaneswar.demoweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();

    }
    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable String name){
        return service.getProduct(name);
    }
@PostMapping("/product")
    public void addProduct(@RequestBody Product p){service.addProduct(p);
    }
    @GetMapping("/products/{place}")
    public List<Product> getProductPlace(@PathVariable String place){
        return service.getPlace(place);

    }
    @GetMapping("/products//{wr}")
    public List<Product> checkWarranty(@PathVariable int wr){
        return service.CheckWarranty(wr);
}
 

}
