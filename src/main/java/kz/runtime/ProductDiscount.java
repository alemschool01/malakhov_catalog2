package kz.runtime;

import jakarta.persistence.*;

@Entity
@Table(name = "prpduct_discount")
public class ProductDiscount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long product_id;
    private Long discount_id;
    @ManyToOne
    private ProductDiscount productDiscounts;
    @ManyToOne
    private Product products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(Long discount_id) {
        this.discount_id = discount_id;
    }

    public ProductDiscount getProductDiscounts() {
        return productDiscounts;
    }

    public void setProductDiscounts(ProductDiscount productDiscounts) {
        this.productDiscounts = productDiscounts;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }
}
