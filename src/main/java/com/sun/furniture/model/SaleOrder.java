package com.sun.furniture.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <b><code>SaleOrder</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/6/2 14:57
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
@ApiModel(value = "销售订单")
public class SaleOrder implements Serializable {

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "订单号")
    private String saleNumber;

    @ApiModelProperty(value = "销售日期")
    private String saleDate;

    @ApiModelProperty(value = "订单状态")
    private String orderState;

    @ApiModelProperty(value = "客户名称")
    private String customerName;

    @ApiModelProperty(value = "发货地址")
    private String address;

    @ApiModelProperty(value = "总金额")
    private String totalMoney;

    @ApiModelProperty(value = "备注")
    private String remark;

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
     * Return the SaleNumber
     *
     * @return property value of saleNumber
     * @since gempile-model 0.1.0
     */
    public String getSaleNumber() {
        return saleNumber;
    }

    /**
     * Set the SaleNumber
     *
     * @param saleNumber value to be assigned to property saleNumber
     * @since gempile-model 0.1.0
     */
    public void setSaleNumber(String saleNumber) {
        this.saleNumber = saleNumber;
    }

    /**
     * Return the SaleDate
     *
     * @return property value of saleDate
     * @since gempile-model 0.1.0
     */
    public String getSaleDate() {
        return saleDate;
    }

    /**
     * Set the SaleDate
     *
     * @param saleDate value to be assigned to property saleDate
     * @since gempile-model 0.1.0
     */
    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    /**
     * Return the OrderState
     *
     * @return property value of orderState
     * @since gempile-model 0.1.0
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * Set the OrderState
     *
     * @param orderState value to be assigned to property orderState
     * @since gempile-model 0.1.0
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState;
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
     * Return the TotalMoney
     *
     * @return property value of totalMoney
     * @since gempile-model 0.1.0
     */
    public String getTotalMoney() {
        return totalMoney;
    }

    /**
     * Set the TotalMoney
     *
     * @param totalMoney value to be assigned to property totalMoney
     * @since gempile-model 0.1.0
     */
    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * Return the Remark
     *
     * @return property value of remark
     * @since gempile-model 0.1.0
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Set the Remark
     *
     * @param remark value to be assigned to property remark
     * @since gempile-model 0.1.0
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "SaleOrder{" +
                "id=" + id +
                ", saleNumber='" + saleNumber + '\'' +
                ", saleDate='" + saleDate + '\'' +
                ", orderState='" + orderState + '\'' +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", totalMoney='" + totalMoney + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
