package com.mybatis.crud.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import com.mybatis.crud.bean.Emp;

//三种查询方式
public interface EmpSelectMapper {
	
	//一，根据id查询单个员工信息
	public abstract Emp getEmpById(Integer id);
	
	//二，查询员工数量
	public abstract Integer getEmpCount();
	
	/*三，1，以Map集合获取单个员工的信息,
	 * 注意：错误写法不要把Map<Integer,Emp> getEmpMap(Integer id)中的形参Integer id当作Map的key,因为MyBatis底层把单个Emp对象的属性"id","name"等当作了key,属性值是value,而不是整个Emp emp对象
	 * 正确：Map<String,String>
	 */
	public abstract Map<Object,Object> getEmpMap(Integer id);
	
	/*三，2，获取全部员工封装进Map集合
	 * */
	@MapKey(value="id")   //加@MapKey注解value="id"后，MyBatis就把把员工的id作为 key键，因为这里是把整个员工对象当作value,必须有一个key
	public abstract Map<Integer,Emp> getAllEmps();
}
