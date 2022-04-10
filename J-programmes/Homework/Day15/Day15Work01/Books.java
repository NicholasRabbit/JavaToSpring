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
		
		   System.out.println("页数信息错误必须大于200");
		   return;
		}
		
		 this.pageNum=pageNum;
	}

	public int getPageNum(){
	     return pageNum;
	}

    public void detail(){
	
	    System.out.println("教材名称:"+title+"教材页数："+pageNum);
	
	}





}