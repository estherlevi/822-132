package c;

import java.util.Objects;

public class Person {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	

//	public String toString() {
//		return "Person[id=" + id + ", name=" + name + ", age=" + age + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return id * 2 + 8; 
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if(!(obj instanceof Person)) {
//			return false;
//		}
//		
//		Person other = (Person) obj;
//		return this.id == other.id;
////		if(this.id == other.id) {
////			return true;
////		}else {
////			return false;
////		}
//	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return id == other.id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
