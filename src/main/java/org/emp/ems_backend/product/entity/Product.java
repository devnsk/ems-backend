package org.emp.ems_backend.product.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "prod_name")
    private String productName;

    @Column(name = "prod_category")
    private String productCategory;

    @Column(name = "prod_price")
    private Double productPrice;

    @Column(name = "prod_description")
    private String productDescription;

    @Column(name = "project_id", nullable = false, unique = true)
    private Long projectId;
}
