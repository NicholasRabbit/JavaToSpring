

public class StreamEntrySetDemo {

	//Stream使用EntrySet执行多层分组范例。分公司->省内外
	public static void main(String[] args){

		List<ReportDailyV> reportDailyVList = BeanUtil.copyToList(compInformationList, ReportDailyV.class);
		ScddBeanUtil.addProperties(reportDailyVList);
		List<ReportDailyV> data= new ArrayList<>();
		//按分公司分组
		reportDailyVList.stream().collect(Collectors.groupingBy(ReportDailyV::getParentCompName)).entrySet().forEach(compEntry -> {
			//每个分公司的合计数据对象
			ReportDailyV compSumReport = new ReportDailyV();
			//分公司内按省内外分组
			compEntry.getValue().stream().collect(Collectors.groupingBy(ReportDailyV::getProvinceTag)).entrySet().forEach(provinceEntry -> {
				data.addAll(provinceEntry.getValue());
				//分公司范围内省内外合计数据对象
				ReportDailyV provinceSumReport = new ReportDailyV();
				provinceSumReport.setParentCompName(compEntry.getKey());
				provinceSumReport.setProvinceTag(provinceEntry.getKey() +  "合计");
				data.add(provinceSumReport);
			});
			compSumReport.setParentCompName(compEntry.getKey() +  "合计");
			data.add(compSumReport);

		});
	}

}

