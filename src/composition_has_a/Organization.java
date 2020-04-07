package composition_has_a;

public class Organization {

	private int oid;
	private String oname;
	private long noofemps;
	private String location;

	public Organization() {

	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public long getNoofemps() {
		return noofemps;
	}

	public void setNoofemps(long noofemps) {
		this.noofemps = noofemps;
	}

	public String getLocationl() {
		return location;
	}

	public void setLocationl(String locationl) {
		this.location = location;
	}

	public Organization(int oid, String oname, long noofemps, String locationl) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.noofemps = noofemps;
		this.location = location;
	}

	public void printOrganisation() {
		System.out.println("Organisation Details");
		System.out.println("Organisation Id : " + oid);
		System.out.println("Organisation Name : " + oname);
		System.out.println("No of emps in Organisation : " + noofemps);
		System.out.println("Organisation Location : " + location);
	}

}
