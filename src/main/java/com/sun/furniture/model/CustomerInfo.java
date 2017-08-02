package com.sun.furniture.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <b><code>CustomerInfo</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/6/2 13:59
 *
 * @author 38600
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
@ApiModel(value = "客户信息")
public class CustomerInfo implements Serializable {

    @ApiModelProperty(value = "客户编码")
    private Integer id;

    @ApiModelProperty(value = "客户名称")
    private String customerName;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "联系方式")
    private String phoneNumber;

    @ApiModelProperty(value = "财务账号")
    private String financialNumber;

    @ApiModelProperty(value = "合同开始日期")
    private String beginDate;

    @ApiModelProperty(value = "合同结束日期")
    private String endDate;

    /**
     * Return the Id
     *
     * @return property value of id
     * @since gempile-model 0.1.0
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the Id
     *
     * @param id value to be assigned to property id
     * @since gempile-model 0.1.0
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Return the CustomerName
     *
     * @return property value of customerName
     * @since gempile-model 0.1.0
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Set the CustomerName
     *
     * @param customerName value to be assigned to property customerName
     * @since gempile-model 0.1.0
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Return the Address
     *
     * @return property value of address
     * @since gempile-model 0.1.0
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the Address
     *
     * @param address value to be assigned to property address
     * @since gempile-model 0.1.0
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Return the PhoneNumber
     *
     * @return property value of phoneNumber
     * @since gempile-model 0.1.0
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the PhoneNumber
     *
     * @param phoneNumber value to be assigned to property phoneNumber
     * @since gempile-model 0.1.0
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Return the FinancialNumner
     *
     * @return property value of financialNumber
     * @since gempile-model 0.1.0
     */
    public String getFinancialNumber() {
        return financialNumber;
    }

    /**
     * Set the FinancialNumner
     *
     * @param financialNumber value to be assigned to property financialNumber
     * @since gempile-model 0.1.0
     */
    public void setFinancialNumber(String financialNumber) {
        this.financialNumber = financialNumber;
    }

    /**
     * Return the BeginDate
     *
     * @return property value of beginDate
     * @since gempile-model 0.1.0
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * Set the BeginDate
     *
     * @param beginDate value to be assigned to property beginDate
     * @since gempile-model 0.1.0
     */
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * Return the EndDate
     *
     * @return property value of endDate
     * @since gempile-model 0.1.0
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Set the EndDate
     *
     * @param endDate value to be assigned to property endDate
     * @since gempile-model 0.1.0
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", financialNumber='" + financialNumber + '\'' +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
