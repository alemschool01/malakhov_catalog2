package kz.runtime;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer percent;
    @OneToMany(mappedBy = "discount")
    private List<CategoryDiscount> categoryDiscounts;

    @OneToMany(mappedBy = "discount")
    private List<ProductDiscount> productDiscounts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public List<CategoryDiscount> getCategoryDiscounts() {
        return categoryDiscounts;
    }

    public void setCategoryDiscounts(List<CategoryDiscount> categoryDiscounts) {
        this.categoryDiscounts = categoryDiscounts;
    }

    public List<ProductDiscount> getProductDiscounts() {
        return productDiscounts;
    }

    public void setProductDiscounts(List<ProductDiscount> productDiscounts) {
        this.productDiscounts = productDiscounts;
    }
}
