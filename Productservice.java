package com.gnaneswar.demoweb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;


@Component
public class ProductService {
    @Autowired
    ProductDB db;

    public void addProduct(Product p) {
        db.save(p);
    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProduct(String name) {
        return db.findByName(name);
    }

    public List<Product> getPlace(String place) {
        return db.findAllByPlace(place);

    }

    public List<Product> CheckWarranty(int warranty) {
        List<Product> prods = new ArrayList<>();
        List<Product> products = db.findAll();
        for (Product p : products) {
            if (p.getWarranty() >= warranty) {
                prods.add(p);
            }
        }
        return prods;


    }


}
