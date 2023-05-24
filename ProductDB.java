package com.gnaneswar.demoweb;






import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product,Integer>{
     Product findByName(String name);

     List<Product> findAllByPlace(String place);


     List<Product> findAllByWarranty(int warranty);


}

