public class ArrayTest005 {

    public static void main(String[] args){
	
	    arrayMethod();

	}

	public static void arrayMethod(){
	
	    int[] array01={11,22,33,44};
		int[] array02=new int[10];
		
		System.arraycopy(array01, 0, array02, 2, 4);

		for(int k=0; k<array02.length; k++){
		
		    System.out.println("扩容后新数组:"+array02[k]);
		}
	
	}

}
