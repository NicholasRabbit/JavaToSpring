package com.springframe.transaction.trans03_xml.dao;

public interface BookDaoInterface {
	public abstract Integer bookPrice(Integer bid,Integer pid);
	public abstract void updateStock(Integer bid);
	public abstract void updateBalance(Integer price,Integer pid);
}
