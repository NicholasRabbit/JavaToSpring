public class StaticTest001{

    public static void main(String[] args){
	
	     Human001 tom=new Human001();
		          tom.id=130555;
				  tom.name="Tom";
				  System.out.println(tom.id+","+tom.name+","+Human001.country); //�������tom��jerry�Ĺ�����ͬ����˶���Ϊstatic����,������������������

      
	     Human001 jerry=new Human001();
		          jerry.id=130666;
				  jerry.name="Jerry";
                  System.out.println(jerry.id+","+jerry.name+","+Human001.country);

	}
}