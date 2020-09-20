package com.giapnt.shopping.cart.model;

import java.util.Date;

public class Products {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.product_available
     *
     * @mbg.generated
     */
    private Integer productAvailable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.unit_price
     *
     * @mbg.generated
     */
    private Double unitPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.quantity_per_unit
     *
     * @mbg.generated
     */
    private Integer quantityPerUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.sizes
     *
     * @mbg.generated
     */
    private Integer sizes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.color
     *
     * @mbg.generated
     */
    private String color;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.unit_weight
     *
     * @mbg.generated
     */
    private Double unitWeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.unit_in_stock
     *
     * @mbg.generated
     */
    private Long unitInStock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.unit_on_order
     *
     * @mbg.generated
     */
    private Integer unitOnOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.discount_available
     *
     * @mbg.generated
     */
    private Integer discountAvailable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.discount
     *
     * @mbg.generated
     */
    private Double discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.ranking
     *
     * @mbg.generated
     */
    private String ranking;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.note
     *
     * @mbg.generated
     */
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.is_active
     *
     * @mbg.generated
     */
    private Boolean isActive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.created_by
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.updated_by
     *
     * @mbg.generated
     */
    private String updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.created_timestamp
     *
     * @mbg.generated
     */
    private Date createdTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.updated_timestamp
     *
     * @mbg.generated
     */
    private Date updatedTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.supplier_id
     *
     * @mbg.generated
     */
    private String supplierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.category_id
     *
     * @mbg.generated
     */
    private String categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core_data.products.picture
     *
     * @mbg.generated
     */
    private byte[] picture;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.id
     *
     * @return the value of core_data.products.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.id
     *
     * @param id the value for core_data.products.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.code
     *
     * @return the value of core_data.products.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.code
     *
     * @param code the value for core_data.products.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.name
     *
     * @return the value of core_data.products.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.name
     *
     * @param name the value for core_data.products.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.product_available
     *
     * @return the value of core_data.products.product_available
     *
     * @mbg.generated
     */
    public Integer getProductAvailable() {
        return productAvailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.product_available
     *
     * @param productAvailable the value for core_data.products.product_available
     *
     * @mbg.generated
     */
    public void setProductAvailable(Integer productAvailable) {
        this.productAvailable = productAvailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.unit_price
     *
     * @return the value of core_data.products.unit_price
     *
     * @mbg.generated
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.unit_price
     *
     * @param unitPrice the value for core_data.products.unit_price
     *
     * @mbg.generated
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.quantity_per_unit
     *
     * @return the value of core_data.products.quantity_per_unit
     *
     * @mbg.generated
     */
    public Integer getQuantityPerUnit() {
        return quantityPerUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.quantity_per_unit
     *
     * @param quantityPerUnit the value for core_data.products.quantity_per_unit
     *
     * @mbg.generated
     */
    public void setQuantityPerUnit(Integer quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.sizes
     *
     * @return the value of core_data.products.sizes
     *
     * @mbg.generated
     */
    public Integer getSizes() {
        return sizes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.sizes
     *
     * @param sizes the value for core_data.products.sizes
     *
     * @mbg.generated
     */
    public void setSizes(Integer sizes) {
        this.sizes = sizes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.color
     *
     * @return the value of core_data.products.color
     *
     * @mbg.generated
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.color
     *
     * @param color the value for core_data.products.color
     *
     * @mbg.generated
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.unit_weight
     *
     * @return the value of core_data.products.unit_weight
     *
     * @mbg.generated
     */
    public Double getUnitWeight() {
        return unitWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.unit_weight
     *
     * @param unitWeight the value for core_data.products.unit_weight
     *
     * @mbg.generated
     */
    public void setUnitWeight(Double unitWeight) {
        this.unitWeight = unitWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.unit_in_stock
     *
     * @return the value of core_data.products.unit_in_stock
     *
     * @mbg.generated
     */
    public Long getUnitInStock() {
        return unitInStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.unit_in_stock
     *
     * @param unitInStock the value for core_data.products.unit_in_stock
     *
     * @mbg.generated
     */
    public void setUnitInStock(Long unitInStock) {
        this.unitInStock = unitInStock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.unit_on_order
     *
     * @return the value of core_data.products.unit_on_order
     *
     * @mbg.generated
     */
    public Integer getUnitOnOrder() {
        return unitOnOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.unit_on_order
     *
     * @param unitOnOrder the value for core_data.products.unit_on_order
     *
     * @mbg.generated
     */
    public void setUnitOnOrder(Integer unitOnOrder) {
        this.unitOnOrder = unitOnOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.discount_available
     *
     * @return the value of core_data.products.discount_available
     *
     * @mbg.generated
     */
    public Integer getDiscountAvailable() {
        return discountAvailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.discount_available
     *
     * @param discountAvailable the value for core_data.products.discount_available
     *
     * @mbg.generated
     */
    public void setDiscountAvailable(Integer discountAvailable) {
        this.discountAvailable = discountAvailable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.discount
     *
     * @return the value of core_data.products.discount
     *
     * @mbg.generated
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.discount
     *
     * @param discount the value for core_data.products.discount
     *
     * @mbg.generated
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.ranking
     *
     * @return the value of core_data.products.ranking
     *
     * @mbg.generated
     */
    public String getRanking() {
        return ranking;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.ranking
     *
     * @param ranking the value for core_data.products.ranking
     *
     * @mbg.generated
     */
    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.note
     *
     * @return the value of core_data.products.note
     *
     * @mbg.generated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.note
     *
     * @param note the value for core_data.products.note
     *
     * @mbg.generated
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.is_active
     *
     * @return the value of core_data.products.is_active
     *
     * @mbg.generated
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.is_active
     *
     * @param isActive the value for core_data.products.is_active
     *
     * @mbg.generated
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.created_by
     *
     * @return the value of core_data.products.created_by
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.created_by
     *
     * @param createdBy the value for core_data.products.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.updated_by
     *
     * @return the value of core_data.products.updated_by
     *
     * @mbg.generated
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.updated_by
     *
     * @param updatedBy the value for core_data.products.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.created_timestamp
     *
     * @return the value of core_data.products.created_timestamp
     *
     * @mbg.generated
     */
    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.created_timestamp
     *
     * @param createdTimestamp the value for core_data.products.created_timestamp
     *
     * @mbg.generated
     */
    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.updated_timestamp
     *
     * @return the value of core_data.products.updated_timestamp
     *
     * @mbg.generated
     */
    public Date getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.updated_timestamp
     *
     * @param updatedTimestamp the value for core_data.products.updated_timestamp
     *
     * @mbg.generated
     */
    public void setUpdatedTimestamp(Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.supplier_id
     *
     * @return the value of core_data.products.supplier_id
     *
     * @mbg.generated
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.supplier_id
     *
     * @param supplierId the value for core_data.products.supplier_id
     *
     * @mbg.generated
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.category_id
     *
     * @return the value of core_data.products.category_id
     *
     * @mbg.generated
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.category_id
     *
     * @param categoryId the value for core_data.products.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core_data.products.picture
     *
     * @return the value of core_data.products.picture
     *
     * @mbg.generated
     */
    public byte[] getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core_data.products.picture
     *
     * @param picture the value for core_data.products.picture
     *
     * @mbg.generated
     */
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}