/*
* 使用Stream按条件过滤集合，并求出过滤出来的集合中对象的某个字段值的
*/

public class StreamFilterSum {
	
	public static void main(String[] args){
	
		double totalProductionPlan = allProductList.stream()
			.filter(p -> "010203".equals(p.getProductCategoryCode()))  //过滤条件
			.mapToDouble(ProductPlanOutput::getProductionPlan)
			.sum();

	}

}



class ProductPlanOutput extends BaseModel<ProductPlanOutput> {
	private Double productionPlan;
}