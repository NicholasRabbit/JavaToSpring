package com.javaframe.factory_bean;

import org.springframework.beans.factory.FactoryBean;

public class Factory implements FactoryBean<Car> {   //注意这里也有泛型 ，写了泛型后下面的getObject()方法返回值也要相应修改

	
	public Factory() {  
	
	}

	@Override
	public Car getObject() throws Exception {
		Car car=new Car();
		car.setBrand("Toyota");
		car.setMake("Crown");
		car.setLitre(new Double(2.5));  
		return car;
	}

	@Override
	public Class getObjectType() {    //这里Class<T>有泛型，所以报警
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
	
}
