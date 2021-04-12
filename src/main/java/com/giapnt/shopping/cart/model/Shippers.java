package com.giapnt.shopping.cart.model;

import lombok.Data;

import java.util.Date;

@Data
public class Shippers {
    /**
     * This field corresponds to the database column core_data.shippers.id
     */
    private String id;

    /**
     * This field corresponds to the database column core_data.shippers.code
     */
    private String code;

    /**
     * This field corresponds to the database column core_data.shippers.name
     */
    private String name;

    /**
     * This field corresponds to the database column core_data.shippers.phone
     */
    private String phone;

    /**
     * This field corresponds to the database column core_data.shippers.description
     */
    private String description;

    /**
     * This field corresponds to the database column core_data.shippers.created_by
     */
    private String createdBy;

    /**
     * This field corresponds to the database column core_data.shippers.updated_by
     */
    private String updatedBy;

    /**
     * This field corresponds to the database column core_data.shippers.created_timestamp
     */
    private Date createdTimestamp;

    /**
     * This field corresponds to the database column core_data.shippers.updated_timestamp
     */
    private Date updatedTimestamp;

    /**
     * This field corresponds to the database column core_data.shippers.is_active
     */
    private Boolean isActive;

}