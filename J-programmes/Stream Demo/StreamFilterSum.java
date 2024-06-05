/*
* 使用Stream按条件过滤集合，并求出过滤出来的集合中对象的某个字段值的
*/

public class StreamFilterSum {
	
	public static void main(String[] args){
	
		// Code: 1
		double totalProductionPlan = allProductList.stream()
			.filter(p -> "010203".equals(p.getProductCategoryCode()))  //过滤条件
			.mapToDouble(ProductPlanOutput::getProductionPlan)
			.sum();


		// Code: 2
		//获得集合总type==1的所有对象的code集合
		List<String> codeList = productCategoryComps.stream().filter(pcc -> 1 == pcc.getType())
			.map(ProductCategoryComp::getCode)
			.collect(Collectors.toList());

	}

}



class ProductPlanOutput extends BaseModel<ProductPlanOutput> {
	private Double productionPlan;
}
