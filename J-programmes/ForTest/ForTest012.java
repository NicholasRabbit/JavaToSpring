public class ForTest012{
    public static void main(String[] args){
	     int count=0;
		 for(int c=2;c<=10000;c++){
			 boolean bePrime=true;
			 for(int d=2;d<c;d+=1){
			     if(c%d==0){
				     bePrime=false;
					 break;
				 }
			 
			 
			 }
		     if(bePrime){
				 //count+=1;д���ﲻ��,д����˵����û����أ����Ȼ�����
				 if(count==8){
				    System.out.print('\n');
					count=0;
				 }else{
				    System.out.print(c+" ");
					count+=1;                   //ע��count+=1Ӧд���������֮��
					                            //��д�����棬���ȼ�����û��������ͻ����ˣ�ÿ�о�ֻ���߸�
				 }
			    
			 
			 }
		
		
		 }
	
	}



}