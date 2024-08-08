/*
 * 使用Stream进行多层分组
 *
 * */
//
public void doSome(){
		//按分公司分组
		reportDailyVList.stream().collect(Collectors.groupingBy(ReportDailyV::getParentCompName)).entrySet().forEach(compEntry -> {
			//每个分公司的合计数据对象
			ReportDailyV compSumReport = new ReportDailyV();
			//分公司内按省内外分组
			compEntry.getValue().stream().collect(Collectors.groupingBy(ReportDailyV::getProvinceTag)).entrySet().forEach(provinceEntry -> {
				data.addAll(provinceEntry.getValue());
				//分公司范围内省内外合计数据对象
				ReportDailyV provinceSumReport = ScddBeanUtil.sumCompPlan(provinceEntry.getValue(),null);
				provinceSumReport.setParentCompName(compEntry.getKey());
				provinceSumReport.setProvinceTag("合计");
				data.add(provinceSumReport);
			});
			//合计分公司数据
			compSumReport = ScddBeanUtil.sumCompPlan(compEntry.getValue(),null);
			compSumReport.setParentCompName("合计");
			data.add(compSumReport);

		});


}
