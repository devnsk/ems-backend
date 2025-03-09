package org.emp.ems_backend.product.service.impl;

import lombok.AllArgsConstructor;
import org.emp.ems_backend.product.dto.ProductDto;
import org.emp.ems_backend.product.entity.Product;
import org.emp.ems_backend.product.mapper.ProductMapper;
import org.emp.ems_backend.product.repository.ProductRepository;
import org.emp.ems_backend.product.service.ProductService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = ProductMapper.mapToProduct(productDto);
        Product savedProduct = productRepository.save(product);
        return ProductMapper.mapToProductDto(savedProduct);
    }
}
