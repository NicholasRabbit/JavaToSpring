public class OOTest005{
    
    public static void main(String[] args){
	Student a=new Student();
	a.no=19900606;
	a.name="Jonathan Swift";
	
	a.pc=new Computer();
	a.pc.brand="DELL";
	a.pc.model=5110L;
	a.pc.colour="Black";

    System.out.println("ѧ�ţ�"+a.no+"���֣�"+a.name+"�ĵ����ǣ�"+a.pc.brand+a.pc.model+a.pc.colour);
    
    }
}

class Student{
    int no;
	String name;
	Computer pc;

}

class Computer{
    String brand;
	long   model;
	String colour;

}