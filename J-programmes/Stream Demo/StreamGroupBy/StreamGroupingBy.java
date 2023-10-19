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
			//获取分公司审核人信息
			Long parentId = compEntry.getValue().get(0).getParentId();
			ReportApprovalJimu reportApprovalJimu = reportApprovalJimuService.getReportApproval(parentId, planDate, approvalType,ApprovalConstants.ReportTypeEnum.煤炭日报.getValue());
			if(reportApprovalJimu != null){
				compSumReport.setSubmitName(reportApprovalJimu.getPersonnelName());
				compSumReport.setSubmitPhone(reportApprovalJimu.getSubmitPhone());
				compSumReport.setLeaderName(reportApprovalJimu.getCompLeaderName());
			}
			//获取分公司值班领导
			R<String> leaderNameR = leaderDutyManagementService.getLeaderDutyByCompIdADate(parentId, planDate);
			if(leaderNameR.getData() != null)
				compSumReport.setLeaderName(leaderNameR.getData());
			compSumReport.setParentCompName("合计");
			data.add(compSumReport);

		});


}
