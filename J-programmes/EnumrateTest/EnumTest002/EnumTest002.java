public class EnumTest002 {

    public static void main(String[] args){     //����public enum Colours������Ĳ�������ֱ�Ӵ�ӡ������˴�enum��public class ��class���ơ�Ҳ��Ҫ�ļ���������һ�¡�
	
	    Colours c=traffic("���");
		System.out.println(c);
	}

    public static Colours traffic(String light){   //��һ������ִ�����ж��������������Ͳ�����ʱ��������enumö�٣��ѷ���ֵ�����趨Ϊenum���͵ġ�����Colours
	
	    if("�̵�".equals(light)){                  //�ַ���String��String�����equals()�����Ƚ��Ƿ���ȡ�
		    return Colours.GREEN;                  //�˴��ã�"�̵�".equals(light)�����ǣ�light.equals("�̵�")����Ϊ�˱�����ܷ�������light��ָ���쳣
		}else if("���".equals(light)){
		    return Colours.RED;
		}else if("�Ƶ�".equals(light)){
		    return Colours.YELLOW;
		}
		return Colours.ERROR;
	
	} 

}