package homeWork3_task1;

public abstract class Human {
	private String name;
	private String surname;
	private int age;
	private String gender;
	
	public Human (String name, String surname, int age, String sex) {
		
		this.name=name;
		this.surname=surname;
		this.age= age;
		this.gender=sex;
	}
	
	public Human() {
		this.age=0;
		this.gender=" ";
		this.name=" ";
		this.surname= " ";
			
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname=surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setSex(String sex) {
		this.gender=sex;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Human other = (Human) obj;
		if (age != other.age) {
			return false;
		}
		if (gender == null) {
			if (other.gender != null) {
				return false;
			}
		} else if (!gender.equals(other.gender)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (surname == null) {
			if (other.surname != null) {
				return false;
			}
		} else if (!surname.equals(other.surname)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return " \nName: " + name + "\nSurname: "+ surname + "\nAge: "+ age+ "\ngender: "+ gender;
	}
	
}
