package in.co.bytehub.learn.rest.controller.model;

public class Person {

	private Integer personId;
	private String name;
	private String aadharNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public Person(String name, String aadharNo, Integer personId) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.personId = personId;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", aadharNo=" + aadharNo + "]";
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

}
