public class Books {

    private String title;
    private int pageNum=200;

	public void setTitle(String title){
	
	     this.title=title;

	}

	public String getTitle(){
	     return title;
	}


	public void setPageNum(int pageNum){
	
	     if(pageNum<200){
		
		   System.out.println("ҳ����Ϣ����������200");
		   return;
		}
		
		 this.pageNum=pageNum;
	}

	public int getPageNum(){
	     return pageNum;
	}

    public void detail(){
	
	    System.out.println("�̲�����:"+title+"�̲�ҳ����"+pageNum);
	
	}





}