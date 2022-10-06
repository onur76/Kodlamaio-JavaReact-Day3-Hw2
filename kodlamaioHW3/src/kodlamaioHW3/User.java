package kodlamaioHW3;

public class User {
	
	private int id;
	private String name;
	private String surname;
	private int age;
	private String gender;
	private String nationalIdentity;
	

	public void log() {
		System.out.println("Common configuration.\n");
	}
	
	public User() {
	}

	public User(int id, String name, String surname, int age, String gender, String nationalIdentity) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.nationalIdentity = nationalIdentity;
	}

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

	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getNationalIdentity() {
		return nationalIdentity;
	}



	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	
	
	

}
