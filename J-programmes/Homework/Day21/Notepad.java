public class Notepad {

    private int price;
	private InsertDrawable insert;

	public void setInsert(InsertDrawable insert){
	
	    this.insert=insert;
	}
	public InsertDrawable getInsert(){
	
	    return insert;
	}

	public void assembly(){
	
	    insert.add();
	}

}