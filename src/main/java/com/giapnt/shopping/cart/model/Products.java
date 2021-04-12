package com.giapnt.shopping.cart.model;

import lombok.Data;

import java.util.Date;

@Data
public class Products {
	/**
	 * This field corresponds to the database column core_data.products.id
	 */
	private String id;

	/**
	 * This field corresponds to the database column core_data.products.code
	 */
	private String code;

	/**
	 * This field corresponds to the database column core_data.products.name
	 */
	private String name;

	/**
	 * This field corresponds to the database column
	 * core_data.products.product_available
	 */
	private Integer productAvailable;

	/**
	 * This field corresponds to the database column core_data.products.unit_price
	 */
	private Double unitPrice;

	/**
	 * This field corresponds to the database column
	 * core_data.products.quantity_per_unit
	 */
	private Integer quantityPerUnit;

	/**
	 * This field corresponds to the database column core_data.products.sizes
	 */
	private Integer sizes;

	/**
	 * This field corresponds to the database column core_data.products.color
	 */
	private String color;

	/**
	 * This field corresponds to the database column core_data.products.unit_weight
	 */
	private Double unitWeight;

	/**
	 * This field corresponds to the database column
	 * core_data.products.unit_in_stock
	 */
	private Long unitInStock;

	/**
	 * This field corresponds to the database column
	 * core_data.products.unit_on_order
	 */
	private Integer unitOnOrder;

	/**
	 * This field corresponds to the database column
	 * core_data.products.discount_available
	 */
	private Integer discountAvailable;

	/**
	 * This field corresponds to the database column core_data.products.discount
	 */
	private Double discount;

	/**
	 * This field corresponds to the database column core_data.products.ranking
	 */
	private String ranking;

	/**
	 * This field corresponds to the database column core_data.products.note
	 */
	private String note;

	/**
	 * This field corresponds to the database column core_data.products.is_active
	 */
	private Boolean isActive;

	/**
	 * This field corresponds to the database column core_data.products.created_by
	 */
	private String createdBy;

	/**
	 * This field corresponds to the database column core_data.products.updated_by
	 */
	private String updatedBy;

	/**
	 * This field corresponds to the database column
	 * core_data.products.created_timestamp
	 */
	private Date createdTimestamp;

	/**
	 * This field corresponds to the database column
	 * core_data.products.updated_timestamp
	 */
	private Date updatedTimestamp;

	/**
	 * This field corresponds to the database column core_data.products.supplier_id
	 */
	private String supplierId;

	/**
	 * This field corresponds to the database column core_data.products.category_id
	 */
	private String categoryId;

	/**
	 * This field corresponds to the database column core_data.products.picture
	 */
	private byte[] picture;
}