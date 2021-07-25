public class TicketThread extends Thread {
    private Ticket tk;
	public TicketThread(){
	
	}
	public TicketThread(Ticket tk){
	    this.tk=tk;
	}
	
    public void run(){
	    int buy=60;
		tk.book(buy);
	}
}