public class Hotel {
        private Rooms[][] rooms;
		private Rooms r;
    public Hotel(){
	    rooms=new Rooms[2][5];                    //动态初始化二维数组2层，每层5个房间，每个元素（房间）默认值为null,需要为创建每个房间对象（带有属性的）放进去
		for(int i=0;i<rooms.length;i++){          //用for循环创建每个房间对象。
		    for(int j=0;j<rooms[i].length;j++){       
			    rooms[i][j]=new Rooms();
				rooms[i][j].setRoomNO((i+1)*10+(j+1));  //设定房间号，元素下标比房号小1，i表示层数，需乘以10
			}
	    }
		System.out.println(rooms[1][3]);
	}

	public void checkIn(int i, int j){            //这里i，j代表房号了，与上边不一样的变量
	    
	    
		r=rooms[i-1][j-1];                        //元素下标比房号小1
		if(r.getRoomAvailable()){
		    System.out.println("房间已被预订");
			return;
		}
		r.setRoomNO(i*10+j);                      //楼层号i需乘以10，以便打印时放在十位上。
		r.setRoomAvailable(true);
		System.out.println("房间："+i+"层"+j+"订房成功");
	}

	public void checkOut(int i, int j){
	    
		r=rooms[i-1][j-1];
		r.setRoomAvailable(false);
		System.out.println("房间:"+i+"层"+j+"退房成功");
	
	}

	public void printRoom(){
	    
		for(int i=0; i<rooms.length;i++){
		    for(int j=0; j<rooms[i].length;j++){
			    System.out.println(rooms[i][j]);        //此处打印不加-ln    
			}
			System.out.println('\n');
		
		}
	
	}

}