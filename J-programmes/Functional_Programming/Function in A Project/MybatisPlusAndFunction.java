
public class Foo {


	/**
	 * SFunction 是MyBatisPlus对Funcation的实现，专门为函数做为形参准备的
	 * 以下把getCompId(),getRegulationId()当作参数，从而删除了重复的代码。
	 * 否则的话findPageByCompId()方法里的代码得在每个接口写一遍，这样的话
	 * 代码就重复冗余了。
	 * */
	@GetMapping("/findPageByCompId")
	public R findPageByCompId(Page page, Long compId) {
		return findPageByField(RegulationRelease::getCompId, page, compId);
	}

	@GetMapping("/getByRegulationId")
	public R getByRegulationId(Page page, Long regulationId) {
		return findPageByField(RegulationRelease::getRegulationId, page, regulationId);
	}

	private <T> R<Page> findPageByField(SFunction<RegulationRelease, T> function, Page page, T value) {
		LambdaQueryWrapper<RegulationRelease> wrapper = Wrappers.lambdaQuery();
		wrapper.eq(function, value);
		wrapper.orderByDesc(RegulationRelease::getCreateTime);
		return R.ok(regulationReleaseService.page(page, wrapper));
	}

}
