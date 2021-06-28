package com.example.examead.api;

import com.example.examead.entity.Product;
import com.example.examead.entity.Sale;
import com.example.examead.repository.ProductRepository;
import com.example.examead.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SaleRepository saleRepository;
    @GetMapping
    public String generateData() {
        if (saleRepository.findAll().size() == 0) {
            List<Sale> saleList = new ArrayList<>();
            Product product1 = new Product();
            product1.setPrice(30000L);
            product1.setDescription("Rain Boots");
            product1.setProdName("Boots");
            product1.setDateOfManf(1624542086000L);

            Product product2 = new Product();
            product2.setPrice(99999999L);
            product2.setDescription("AK47");
            product2.setProdName("Gun");
            product2.setDateOfManf(1624714886000L);

            Sale sale1 = new Sale();
            sale1.setSalesmanId(1L);
            sale1.setSalesmanName("trinhhh12");
            sale1.setDOS(1622887686000L);
            sale1.setProduct(product1);

            Sale sale2 = new Sale();
            sale2.setSalesmanId(2L);
            sale2.setSalesmanName("trinhhhfsd");
            sale2.setDOS(1624369286000L);
            sale2.setProduct(product1);

            Sale sale3 = new Sale();
            sale3.setSalesmanId(3L);
            sale3.setSalesmanName("trinhhhwew");
            sale3.setDOS(1623505286000L);
            sale3.setProduct(product1);

            Sale sale4 = new Sale();
            sale4.setSalesmanId(4L);
            sale4.setSalesmanName("trinhhhdsa");
            sale4.setDOS(1623678086000L);
            sale4.setProduct(product2);

            Sale sale5 = new Sale();
            sale5.setSalesmanId(5L);
            sale5.setSalesmanName("trinhhh");
            sale5.setDOS(1624369286000L);
            sale5.setProduct(product2);
            saleList.add(sale1);
            saleList.add(sale2);
            saleList.add(sale3);
            saleList.add(sale4);
            saleList.add(sale5);
            saleRepository.saveAll(saleList);
            return "thanh cong";
        }
        return null;
    }
}
