package com.springframe.transaction.trans01.dao;

public interface BookDaoInterface {
	public abstract Integer bookPrice(Integer bid,Integer pid);
	public abstract void updateStock(Integer bid);
	public abstract void updateBalance(Integer price,Integer pid);
}
