public class SynchronizedHomework {

    public static void main(String[] args){
	     Ticket tk=new Ticket(100);
		 Thread t1=new TicketThread(tk);
		 Thread t2=new TicketThread(tk);
         
		 t1.setName("ѧ��1");
		 t2.setName("ѧ��2");

		 t1.start();
		 t2.start();
	}

}

