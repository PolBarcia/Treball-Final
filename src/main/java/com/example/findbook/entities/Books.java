package com.example.findbook.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "sn")
    private String sn;

    @Column(name = "name")
    @NotBlank(message = "Please Enter the Product Name")
    private String name;

    @Column(name = "description")
    @JsonIgnore
    @NotBlank(message = "Please Enter the Product Description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "unit_price")
    @Min(value = 1, message = "Unit Price atleast one (1)")
    private double unitPrice;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "is_active")
    private boolean active;

    @Column(name = "category_id")
    @JsonIgnore
    private int categoryId;

    @Transient
    private MultipartFile file;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", sn='" + sn +
                ", name='" + name +
                ", description='" + description +
                ", imageUrl='" + imageUrl +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", active=" + active +
                ", categoryId=" + categoryId +
                '}';
    }
}
