
//跟UserDao一样的写法，只是泛型改为Student
public class StudentDao implements BaseDao<Student> {
	
	public Student get(Student Student){ 
		System.out.println("查询中..." + Student);
		return Student;
	}
	
}