
public class Person {

	String name;
	String surname;
	Integer number;
	
	public Person(String name, String surname, Integer number) {
		this.name = name;
		this.surname = surname;
		this.number = number;
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
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", number=" + number + "]";
	}

	
}
