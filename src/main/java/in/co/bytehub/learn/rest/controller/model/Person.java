package in.co.bytehub.learn.rest.controller.model;

import java.time.Duration;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	private Integer personId;
	private String name;
	private String aadharNo;
	private Duration ttl;
	private Instant instant;

	public Instant getInstant() {
		return instant;
	}

	public Person setInstant(Instant instant) {
		this.instant = instant;
		return this;
	}

	public String getName() {
		return name;
	}

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public Person setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
		return this;
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

	public Person setPersonId(Integer personId) {
		this.personId = personId;
		return this;
	}

	public Duration getTtl() {
		return ttl;
	}

	public Person setTtl(Duration ttl) {
		this.ttl = ttl;
		return this;
	}
}
