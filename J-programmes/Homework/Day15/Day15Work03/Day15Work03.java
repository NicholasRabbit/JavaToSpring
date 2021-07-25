public class Day15Work03 {

    public static void main(String[] args){
	
	    Student stu001=new Student();
		System.out.println(stu001.getPostAddress("河北省","056602"));

		stu001.setName("Adolf Hitler");
		System.out.println(stu001.getName());

		stu001.setAge(30);
		System.out.println(stu001.getAge());

		stu001.setZipCode("056630");
		System.out.println(stu001.getZipCode());

		stu001.setAddress("大名县城里");
		System.out.println(stu001.getAddress());

		stu001.setMobileNo(1306666);
		System.out.println(stu001.getMobileNo());
	
	}

}