public class Day21Test {

    public static void main(String[] args){
	    
		InsertDrawable i=new Mouse();

		Notepad dell=new Notepad();
		        dell.setInsert(i);
				dell.assembly();
        
		InsertDrawable j=new Keyboard();
		        dell.setInsert(j);
				dell.assembly();
		               
	
	}

}