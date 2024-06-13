
	// 验证用户密码强度: 要求最低8位，必须包含大小写，特殊字符，数字。
	private boolean verifyPassword(String password) {
		if (null == password) return false;
		// The length of password must not be less than eight.
		String regex = "^(?=.*[A-Z][a-z]+)(?=.*[a-z]+)(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$";
		// The length must be between eight and twenty.
		String regex2 = "^(?=.*[A-Z][a-z]+)(?=.*[a-z]+)(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,20}$";

		Matcher matcher = Pattern.compile(regex).matcher(password);
		return  matcher.matches();
	}
