package kz.runtime;

import jakarta.persistence.*;

@Entity
@Table(name = "category_discount")
public class CategoryDiscount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long category_id;
    private Long discount_id;
    @ManyToOne
    private CategoryDiscount categoryDiscounts;
    @ManyToOne
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public Long getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(Long discount_id) {
        this.discount_id = discount_id;
    }

    public CategoryDiscount getCategoryDiscounts() {
        return categoryDiscounts;
    }

    public void setCategoryDiscounts(CategoryDiscount categoryDiscounts) {
        this.categoryDiscounts = categoryDiscounts;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}