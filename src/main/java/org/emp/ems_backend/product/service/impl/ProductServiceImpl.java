package org.emp.ems_backend.product.service.impl;

import lombok.AllArgsConstructor;
import org.emp.ems_backend.product.dto.ProductDto;
import org.emp.ems_backend.product.entity.Product;
import org.emp.ems_backend.product.exception.ResourceNotFoundException;
import org.emp.ems_backend.product.mapper.ProductMapper;
import org.emp.ems_backend.product.repository.ProductRepository;
import org.emp.ems_backend.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


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

    @Override
    public ProductDto getProductById(Long productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Product not found with ID: " + productId));

        return ProductMapper.mapToProductDto(product);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map((product) -> ProductMapper.mapToProductDto(product)).collect(Collectors.toList());
    }

    @Override
    public ProductDto updateProduct(Long productId, ProductDto updateProduct) {
        Product product = productRepository.findById(productId).orElseThrow(
                () -> new ResourceNotFoundException("Product does not exist for given id: " + productId)
        );
        product.setProductName(updateProduct.getProductName());
        product.setProductCategory(updateProduct.getProductCategory());
        product.setProductPrice(updateProduct.getProductPrice());
        product.setProductDescription(updateProduct.getProductDescription());
        product.setProjectId(updateProduct.getProjectId());

        Product updatedProductObj = productRepository.save(product);

        return ProductMapper.mapToProductDto(updatedProductObj);
    }

    @Override
    public void deleteProduct(Long productId) {
        Product product = productRepository.findById(productId).orElseThrow(
                () -> new ResourceNotFoundException("Product does not exist for given id: " + productId)
        );

        productRepository.deleteById(productId);
    }
}
