package inheritance_demo2;

public class Main {

	public static void main(String[] args) {
		Player p = new Player(1, "Abhiram", "India", 100);
		p.printPlayer();

		Employee e = new Employee(2, "Kalyan", "Infosys", "Sr.Tech Arch");
		e.printEmployee();

	}
}
