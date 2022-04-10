public class Ticket {

    private int ticketNum;

	public Ticket(){
	}
    public Ticket(int ticketNum){
		this.ticketNum=ticketNum;
	}
	public void setTicketNum(int ticketNum){
		this.ticketNum=ticketNum;
	}
	public int getTicketNum(){
	    return this.ticketNum;
	}

	public synchronized void book(int buy){
	    
        Thread t=Thread.currentThread();
		
		if(this.ticketNum>0 && buy <= this.ticketNum){
		   int left=ticketNum-buy;
		   this.setTicketNum(left);
		   System.out.println(t.getName()+"��Ʊ�ɹ�,������"+buy+"�ţ�ʣ��Ʊ����"+ticketNum);
		}else{
		   System.out.println(t.getName()+"��Ʊ���㻹ʣ�ࣺ"+this.ticketNum);
		}

		
		
	}
}