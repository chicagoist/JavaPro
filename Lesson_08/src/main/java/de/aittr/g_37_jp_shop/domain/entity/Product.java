package de.aittr.g_37_jp_shop.domain.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private Long id;
    private String title;
    private BigDecimal price;
    private boolean isActive;

    public Product(Long id, String title, BigDecimal price, boolean isActive) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return isActive == product.isActive && Objects.equals(id, product.id) && Objects.equals(title, product.title) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, isActive);
    }

    @Override
    public String toString() {
        return String.format("Product: ID - %d, title - %s, price - %.2f, " +
                "active - %s", id, title, price, isActive ? "yes" : "no");
    }
}
