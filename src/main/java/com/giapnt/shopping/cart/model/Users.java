package com.giapnt.shopping.cart.model;

import lombok.Data;

import java.util.Date;

@Data
public class Users {
	/**
	 * This field corresponds to the database column core_data.users.id
	 */
	private String id;

	/**
	 * This field corresponds to the database column core_data.users.code
	 */
	private String code;

	/**
	 * This field corresponds to the database column core_data.users.first_name
	 */
	private String firstName;

	/**
	 * This field corresponds to the database column core_data.users.last_name
	 */
	private String lastName;

	/**
	 * This field corresponds to the database column core_data.users.address
	 */
	private String address;

	/**
	 * This field corresponds to the database column core_data.users.city
	 */
	private String city;

	/**
	 * This field corresponds to the database column core_data.users.country
	 */
	private String country;

	/**
	 * This field corresponds to the database column core_data.users.phone
	 */
	private String phone;

	/**
	 * This field corresponds to the database column core_data.users.email
	 */
	private String email;

	/**
	 * This field corresponds to the database column core_data.users.username
	 */
	private String username;

	/**
	 * This field corresponds to the database column core_data.users.password
	 */
	private String password;

	/**
	 * This field corresponds to the database column core_data.users.credit_card
	 */
	private String creditCard;

	/**
	 * This field corresponds to the database column
	 * core_data.users.credit_card_type_id
	 */
	private Integer creditCardTypeId;

	/**
	 * This field corresponds to the database column core_data.users.card_exp_mo
	 */
	private String cardExpMo;

	/**
	 * This field corresponds to the database column core_data.users.card_exp_yr
	 */
	private String cardExpYr;

	/**
	 * This field corresponds to the database column core_data.users.billing_address
	 */
	private String billingAddress;

	/**
	 * This field corresponds to the database column core_data.users.billing_city
	 */
	private String billingCity;

	/**
	 * This field corresponds to the database column core_data.users.billing_country
	 */
	private String billingCountry;

	/**
	 * This field corresponds to the database column core_data.users.ship_address
	 */
	private String shipAddress;

	/**
	 * This field corresponds to the database column core_data.users.ship_city
	 */
	private String shipCity;

	/**
	 * This field corresponds to the database column core_data.users.ship_country
	 */
	private String shipCountry;

	/**
	 * This field corresponds to the database column core_data.users.date_entered
	 */
	private Date dateEntered;

	/**
	 * This field corresponds to the database column core_data.users.is_active
	 */
	private Integer isActive;

	/**
	 * This field corresponds to the database column
	 * core_data.users.login_failed_count
	 */
	private Integer loginFailedCount;

	/**
	 * This field corresponds to the database column
	 * core_data.users.is_account_non_expired
	 */
	private Boolean isAccountNonExpired;

	/**
	 * This field corresponds to the database column
	 * core_data.users.is_account_non_locked
	 */
	private Boolean isAccountNonLocked;

	/**
	 * This field corresponds to the database column
	 * core_data.users.is_credentials_non_expired
	 */
	private Boolean isCredentialsNonExpired;

	/**
	 * This field corresponds to the database column core_data.users.is_enabled
	 */
	private Boolean isEnabled;

	/**
	 * This field corresponds to the database column core_data.users.created_by
	 */
	private String createdBy;

	/**
	 * This field corresponds to the database column core_data.users.updated_by
	 */
	private String updatedBy;

	/**
	 * This field corresponds to the database column
	 * core_data.users.created_timestamp
	 */
	private Date createdTimestamp;

	/**
	 * This field corresponds to the database column
	 * core_data.users.updated_timestamp
	 */
	private Date updatedTimestamp;

}