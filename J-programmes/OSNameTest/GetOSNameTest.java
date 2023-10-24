public class GetOSNameTest{

	public static void main(String[] args){
		System.out.println("isLinux==>" + isLinux());
		System.out.println("isWindows==>" + isWindows());
	}
		
    public static boolean isLinux() {
        return System.getProperty("os.name").toLowerCase().contains("linux");
    }

    public static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("windows");
	}

}
