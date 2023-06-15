方法被本类内部调用，加了@Transactional注解也不起作用

```java
public class ProductPlanOutputMainServiceImpl ...{
    @Override
	public R saveOrUpdatePlanBatch(ProductPlanOutputMain productPlanOutputMain) {	
		//调用加本类中事务注解的方法，即使报错也不回滚
        return saveOrUpdateDailyPlan(productPlanOutputMain);
	}
    //加事务注解
    @Transactional(rollbackFor = Exception.class)
	public R saveOrUpdateDailyPlan(ProductPlanOutputMain productPlanOutputMain){
		R r = productPlanOutputMainService.saveOrUpdatePlan(productPlanOutputMain);
		r.setCode(1);
		if(r.getCode() == 1){
			throw new RuntimeException("保存计划失败");
		}
}
```

修改方法，把这个事务方法放到别的类，由Controller直接调用

```java
@Service
public class PlanServiceImpl implements PlanService {
    @Override
	@Transactional(rollbackFor = Exception.class)
	public R saveOrUpdateDailyPlan(ProductPlanOutputMain productPlanOutputMain){
		R r = productPlanOutputMainService.saveOrUpdatePlan(productPlanOutputMain);
		r.setCode(1);
		if(r.getCode() == 1){
			throw new RuntimeException("保存计划失败");
		}
}
```

Controller直接调用

```java
@PostMapping(value = "/savePlan")
    public R saveYearPlan(@RequestBody ProductPlanOutputMain productPlanOutputMain){
		if(DateTypeConstants.DAY.equals(productPlanOutputMain.getType()) || DateTypeConstants.WEEK.equals(productPlanOutputMain.getType())){
			return planService.saveOrUpdateDailyPlan(productPlanOutputMain);
		}
		return productPlanOutputMainService.saveOrUpdatePlanBatch(productPlanOutputMain);
	}
```



