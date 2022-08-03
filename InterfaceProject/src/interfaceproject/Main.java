package interfaceproject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine = new Machine(12);
		Manager manager = new Manager("VietND");

		manager.study();
		machine.start();

		// gap implement khi gap multi threating,...
		// Runnable, Comparable, Comparator,...

		manager.showInfo();
		machine.showInfo();
		System.out.println("--------");
		IInfo infoMachine = new Machine(1); // 
		IInfo infoManager = new Manager("New manager"); //
		// infoMachine va infoManager, khong co quan he cha con.
		// la kieu tham chieu cua Info chung hanh dong.
		infoMachine.showInfo();
		infoManager.showInfo();
		System.out.println("--------");
		showInfoDetail(new Machine(111));
		System.out.println("--------");
		IStudiable studiableMachine = new Machine(222);
		studiableMachine.study();
		System.out.println("--------");
		machine.study();
//		infoMachine.study(); khong the goi vi study la hanh dong cua IStudiable,
		// can phai dung tham chieu cua IStudiable de thuc hien hanh dong stuudy
		// infoMachine la tham chieu cua IInfos
	}
	
	public static void showInfoDetail(IInfo info) {
		info.showInfo();
	}
}
