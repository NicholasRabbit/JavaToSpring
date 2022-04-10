public class BookTest {

    public static void main(String[] args){
	
	    Books janeEyre=new Books();

		      janeEyre.setTitle("Jane Eyre");
			  System.out.println(janeEyre.getTitle());
              
			  janeEyre.setPageNum(230);
			  int get=janeEyre.getPageNum();   //可以接受返回值
			  System.out.println(get);

			  janeEyre.detail();   
	
	}

}