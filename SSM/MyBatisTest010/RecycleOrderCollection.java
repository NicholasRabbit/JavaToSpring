/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.recycle.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 订单回收物品类型表Entity
 * @author sxh
 * @version 2022-03-11
 */
@Table(name="recycle_order_collection", alias="a", columns={
		@Column(name="id", attrName="id", label="关系表ID", isPK=true),
		@Column(name="order_id", attrName="orderId", label="订单ID"),
		@Column(name="collection_id", attrName="collectionId", label="回收品类型ID"),
		@Column(name="price", attrName="price", label="此订单中这类物品价钱", isQuery=false),
		@Column(name="weight", attrName="weight", label="重量", isQuery=false),
		@Column(name="del_flag", attrName="delFlag", label="删除标记，1，删除，0，正常", isQuery=false),
	}, orderBy="a.id DESC"
)
public class RecycleOrderCollection extends DataEntity<RecycleOrderCollection> {
	
	private static final long serialVersionUID = 1L;
	private String orderId;		// 订单ID
	private String collectionId;		// 回收品类型ID
	private Double price;		// 此订单中这类物品价钱
	private Double weight;		// 该物品重量
	private String delFlag;		// 删除标记，1，删除，0，正常
	
	public RecycleOrderCollection() {
		this(null);
	}

	public RecycleOrderCollection(String id){
		super(id);
	}
	
	@Length(min=0, max=32, message="订单ID长度不能超过 32 个字符")
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	@Length(min=0, max=32, message="回收品类型ID长度不能超过 32 个字符")
	public String getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	@Length(min=0, max=1, message="删除标记，1，删除，0，正常长度不能超过 1 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}