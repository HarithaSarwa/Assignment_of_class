package composition_has_a;

public class Employee extends Person {

	//private String organization;
	private String designation;
	private Organization org;

	public Employee() {

	}
	public void printEmployee() {
		System.out.println("Printing Employee details");
		super.printPerson();
		System.out.println("Designation " + designation);
	}
	
	public Employee(int id, String name, Organization org, String designation) {
		super(id, name);
		//this.organization = organization;
		this.designation = designation;
	}
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Organization getOrganization() {
		return org;
	}
	public void setOrganization(Organization org) {
		this.org = org;
	}
}
