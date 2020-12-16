package br.com.softcube.baseproject.services;

import br.com.softcube.baseproject.domains.EProduct;
import br.com.softcube.baseproject.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public List<EProduct> getAllProducts() {
        return productRepository.findAll();
    }
}