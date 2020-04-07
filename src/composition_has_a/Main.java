package composition_has_a;

public class Main {

	public static void main(String[] args) {
		Team team = new Team(3, "India", "Haritha");
		Player p = new Player(1, "Abhiram", 100, team);
		p.printPlayer();
		
		
		Organization org = new Organization( 10 , "Salesforce ", 100, "North ");
		org.printOrganisation();

		 Employee e1 = new Employee(2, "Kalyan", org , "Sr.Tech Arch");
		 e1.printEmployee();

	}
}
