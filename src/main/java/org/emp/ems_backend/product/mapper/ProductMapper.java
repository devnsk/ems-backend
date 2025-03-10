package org.emp.ems_backend.product.mapper;

import org.emp.ems_backend.product.dto.ProductDto;
import org.emp.ems_backend.product.entity.Product;

public class ProductMapper {
    public static ProductDto mapToProductDto(Product product) {
        return new ProductDto(
                product.getId(),
                product.getProductName(),
                product.getProductCategory(),
                product.getProductPrice(),
                product.getProductDescription(),
                product.getProjectId()
        );
    }

    public static Product mapToProduct(ProductDto productDto){
        return new Product(
                productDto.getId(),
                productDto.getProductName(),
                productDto.getProductCategory(),
                productDto.getProductPrice(),
                productDto.getProductDescription(),
                productDto.getProjectId()
        );
    }
}
