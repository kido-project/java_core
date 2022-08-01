package package_jar_file;

public class Main {

	static int globalVariable = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pham vi truy cap
		globalVariable = 5;
		
		// ham static chi goi phuong thuc static
		somethings();
		somethinsGlobal();
		System.out.println(globalVariable);
	}
	
	public static void somethings() {
		globalVariable = 11;
	}
	
	public static void somethinsGlobal () {
		int globalVariable = 22;
		System.out.println(globalVariable);
	}
}
