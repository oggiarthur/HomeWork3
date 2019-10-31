package homeWork3_task1;

public class Student extends Human {
	private int group;
	private int yearOfStudy;
	
	public Student (String name, String surname, int age, String sex, int group, int year) {
		super(name,surname,age,sex);
		this.group=group;
		this.yearOfStudy=year;		
	}
	
	public Student() {
		this.group=0;
		this.yearOfStudy=0;
		
	}
	
	public Student (String name, String surname, int age, String sex) {
		super(name,surname,age,sex);
	}
	public int getGroup(){
		return group;
		}
	public void setGroup(int group) {
		this.group=group;
	}
	
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	
	public void setYearPfStudy(int year) {
		this.yearOfStudy=year;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + group;
		result = prime * result + yearOfStudy;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		if (group != other.group) {
			return false;
		}
		if (yearOfStudy != other.yearOfStudy) {
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "________________ \nStudent: " + super.toString() 
					+" \nGroup last year: " + group + " \nYear of study: " 
									+ yearOfStudy + "\n________________";
	}
}
