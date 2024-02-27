
//stream流按多个字段排序
public void test(){
	List<Voucher> data = list.stream()
		.sorted( Comparator.comparing(Voucher::getCompName)
				.thenComparing(Voucher::getCustomerName)
				.thenComparing(Voucher::getToStation)
			   ) .collect(toList());
}

