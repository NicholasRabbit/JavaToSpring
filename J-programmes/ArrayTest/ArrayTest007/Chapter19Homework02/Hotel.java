public class Hotel {
        private Rooms[][] rooms;
		private Rooms r;
    public Hotel(){
	    rooms=new Rooms[2][5];                    //��̬��ʼ����ά����2�㣬ÿ��5�����䣬ÿ��Ԫ�أ����䣩Ĭ��ֵΪnull,��ҪΪ����ÿ��������󣨴������Եģ��Ž�ȥ
		for(int i=0;i<rooms.length;i++){          //��forѭ������ÿ���������
		    for(int j=0;j<rooms[i].length;j++){       
			    rooms[i][j]=new Rooms();
				rooms[i][j].setRoomNO((i+1)*10+(j+1));  //�趨����ţ�Ԫ���±�ȷ���С1��i��ʾ�����������10
			}
	    }
		System.out.println(rooms[1][3]);
	}

	public void checkIn(int i, int j){            //����i��j�������ˣ����ϱ߲�һ���ı���
	    
	    
		r=rooms[i-1][j-1];                        //Ԫ���±�ȷ���С1
		if(r.getRoomAvailable()){
		    System.out.println("�����ѱ�Ԥ��");
			return;
		}
		r.setRoomNO(i*10+j);                      //¥���i�����10���Ա��ӡʱ����ʮλ�ϡ�
		r.setRoomAvailable(true);
		System.out.println("���䣺"+i+"��"+j+"�����ɹ�");
	}

	public void checkOut(int i, int j){
	    
		r=rooms[i-1][j-1];
		r.setRoomAvailable(false);
		System.out.println("����:"+i+"��"+j+"�˷��ɹ�");
	
	}

	public void printRoom(){
	    
		for(int i=0; i<rooms.length;i++){
		    for(int j=0; j<rooms[i].length;j++){
			    System.out.println(rooms[i][j]);        //�˴���ӡ����-ln    
			}
			System.out.println('\n');
		
		}
	
	}

}