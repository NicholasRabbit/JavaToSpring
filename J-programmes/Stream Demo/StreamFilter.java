
//获得集合总type==1的所有对象的code集合
List<String> codeList = productCategoryComps.stream().filter(pcc -> 1 == pcc.getType())
				.map(ProductCategoryComp::getCode)
				.collect(Collectors.toList());
