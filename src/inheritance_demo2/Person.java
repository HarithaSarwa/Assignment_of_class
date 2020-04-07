package inheritance_demo2;

public class Person {

	private int id;
	private String name;

	public Person() {

	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
//player class cannot access id and name
//since they are private . 
// and the also cannot access through constructors also
// so we use Super()
//This keyword is used to  point to the same class object
//Super keyword is points to immediate parent class object

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printPerson() {
		System.out.println("Id = " + id);
		System.out.println("Name = " + name);

	}

}
