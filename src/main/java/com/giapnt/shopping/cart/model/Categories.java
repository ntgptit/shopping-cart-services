package com.giapnt.shopping.cart.model;

import lombok.Data;

import java.util.Date;

@Data
public class Categories {
	/**
	 * This field corresponds to the database column core_data.categories.id
	 */
	private String id;

	/**
	 * This field corresponds to the database column core_data.categories.code
	 */
	private String code;

	/**
	 * This field corresponds to the database column core_data.categories.name
	 */
	private String name;

	/**
	 * This field corresponds to the database column core_data.categories.note
	 */
	private String note;

	/**
	 * This field corresponds to the database column core_data.categories.is_active
	 */
	private Boolean isActive;

	/**
	 * This field corresponds to the database column core_data.categories.created_by
	 */
	private String createdBy;

	/**
	 * This field corresponds to the database column core_data.categories.updated_by
	 */
	private String updatedBy;

	/**
	 * This field corresponds to the database column
	 * core_data.categories.created_timestamp
	 */
	private Date createdTimestamp;

	/**
	 * This field corresponds to the database column
	 * core_data.categories.updated_timestamp
	 */
	private Date updatedTimestamp;

	/**
	 * This field corresponds to the database column core_data.categories.picture
	 */
	private byte[] picture;

}