public class ArrayTest003 {

    public static void main(String[] args){
	
	    System.out.println(args.length);    //����ʱjava ArrayTest003��ʲôҲ��д���������0����String[]���鳤��Ϊ0������ʲôԪ��Ҳû�С�
		
		for(int m=0;m<args.length;m++){
		
		    System.out.println(args[m]);    //����ʱ��"java ArrayTest003"������:" abc ��� ...."�ȵ�Sring������ֵ,����������ӡ������
		}

		if(args.length!=2){
		    System.out.println("��������������û���������:");
			return;
		}
		
		
		String username=args[0];
		String code=args[1];
		if(username.equals("root")&code.equals("12345")){
		    System.out.println("��ӭ��������¼�ɹ�");
		}else{
		    System.out.println("������û�������");
		}

	
	}

}