/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.recycle.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.recycle.entity.RecycleOrderCollection;

import java.util.List;

/**
 * 订单回收物品类型表DAO接口
 * @author sxh
 * @version 2022-03-11
 */
@MyBatisDao
public interface RecycleOrderCollectionDao extends CrudDao<RecycleOrderCollection> {

    //批量添加单个订单的多个废品类型数据
    public abstract int insertAllCollections(List<RecycleOrderCollection> recycleOrderCollectionList);
}