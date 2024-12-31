
/*
 * Only "int", "char" and "String" data type could be used as condition in "switch()".
 * */

public class SwitchTest001{
    public static void main(String[] args){
		condition_int();
		condition_char('a');
		condition_string("tom");

		
    }

	public static void condition_int() {
     java.util.Scanner scan =new java.util.Scanner(System.in);
     System.out.print("请输入数字： ");
     int  number=scan.nextInt();
     
         switch(number){
              case 1:
              System.out.println("Monday");
			  break;
              case 2:
              System.out.println("Tuesday");
			  break;
              case 3:
              System.out.println("Wednesday");
			  break;
              case 4:
              System.out.println("Thursday");
			  break;
              case 5:
              System.out.println("Friday");
			  break;
              case 6:
              System.out.println("Saturday");
			  break;
              case 7:
              System.out.println("Sunday");
			  break;
              default:
              System.out.println("输入错误");


         }
	}

	public static void condition_char(char x) {
		
		for (int i = 0; i < 26; i++) {
			int vowel = 'a' + i;
			switch (vowel) {
				case 'a' : 
				case 'e' : 
				case 'i' : 
				case 'o' : 
				case 'u' : 
					System.out.printf("vowels ==> %c\n", vowel);
					break;
				default :
					System.out.printf("consonants ==> %c\n", vowel);

			}
		}


	
	}

	public static void condition_string(String s) {
		switch (s) {
			case "tom" : 
				System.out.printf("%s\n", s);
				break;
			default :
				System.out.println("nothing");
		
		}
	}

	/*
	public static void condition_boolean(boolean b) {
		// An exception is thrown out when the code is compiled. It is "incompatible types: boolean can not be converted to int."
		switch (b) {  
			case true : 
				System.out.println(b);
				break;
			default :
				System.out.println("nothing");
		
		}
	
	}
	*/


}
