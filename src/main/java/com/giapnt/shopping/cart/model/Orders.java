package com.giapnt.shopping.cart.model;

import lombok.Data;

import java.util.Date;

@Data
public class Orders {
	/**
	 * This field corresponds to the database column core_data.orders.id
	 */
	private String id;

	/**
	 * This field corresponds to the database column core_data.orders.order_subject
	 */
	private String orderSubject;

	/**
	 * This field corresponds to the database column core_data.orders.order_date
	 */
	private Date orderDate;

	/**
	 * This field corresponds to the database column core_data.orders.ship_date
	 */
	private Date shipDate;

	/**
	 * This field corresponds to the database column core_data.orders.required_date
	 */
	private Date requiredDate;

	/**
	 * This field corresponds to the database column core_data.orders.freight
	 */
	private Integer freight;

	/**
	 * This field corresponds to the database column core_data.orders.sales_tax
	 */
	private Double salesTax;

	/**
	 * This field corresponds to the database column
	 * core_data.orders.transaction_status
	 */
	private String transactionStatus;

	/**
	 * This field corresponds to the database column core_data.orders.error_message
	 */
	private String errorMessage;

	/**
	 * This field corresponds to the database column core_data.orders.fulfilled
	 */
	private Integer fulfilled;

	/**
	 * This field corresponds to the database column core_data.orders.is_paid
	 */
	private Integer isPaid;

	/**
	 * This field corresponds to the database column core_data.orders.payment_date
	 */
	private Date paymentDate;

	/**
	 * This field corresponds to the database column core_data.orders.is_active
	 */
	private Boolean isActive;

	/**
	 * This field corresponds to the database column core_data.orders.created_by
	 */
	private String createdBy;

	/**
	 * This field corresponds to the database column core_data.orders.updated_by
	 */
	private String updatedBy;

	/**
	 * This field corresponds to the database column
	 * core_data.orders.created_timestamp
	 */
	private Date createdTimestamp;

	/**
	 * This field corresponds to the database column
	 * core_data.orders.updated_timestamp
	 */
	private Date updatedTimestamp;

	/**
	 * This field corresponds to the database column core_data.orders.shipper_id
	 */
	private String shipperId;

	/**
	 * This field corresponds to the database column core_data.orders.payment_id
	 */
	private String paymentId;

	/**
	 * This field corresponds to the database column core_data.orders.user_id
	 */
	private String userId;
}