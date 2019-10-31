package homeWork3_task1;


import java.util.Arrays;
import java.util.Comparator;

import homeWork3_task1.FullGroupException;
import homeWork3_task1.StudentException;

public class Group {
	private Student[] groupOfStudents=new Student[10];
	
	public Group(Student[] group) {
	this.groupOfStudents=group;
		
	}
	
	public Group(){
		}
		public void addingStud(Student st) throws StudentException, FullGroupException {
			int id = -1;
			for (int i = 0; i < groupOfStudents.length; i++) {
				if (groupOfStudents[i] != null && groupOfStudents[i].equals(st)) {
					throw new StudentException();
				}
				if (groupOfStudents[i] == null && id == -1) {
					id = i;
				}
			}
			if (id == -1) {
				throw new FullGroupException();
			} else {
				groupOfStudents[id] = st;
				System.out.println("Student " + st.getName() + " "+ st.getSurname() + " was added");
			}

		}
			
		
		public void deleteStud (Student st) {
				for (int i=0;i<groupOfStudents.length;i++) {
					if (st.equals(groupOfStudents[i]) &&groupOfStudents!=null) {
						groupOfStudents[i]=null;
						System.out.println("Student " + st.getName()+ " " + st.getSurname()+ " was removed");
						return;
					}
				}
				System.out.println("Student " + st.getName() + " is not found");
			}
		
		
		public Student studentSearch(String name, String surname) {
			int id=0;
			for (int i=0; i<groupOfStudents.length;i++) {
				if (groupOfStudents[i]!=null && groupOfStudents[i].getSurname().equals(surname)&&groupOfStudents[i].getName().equals(name)) {
					return groupOfStudents[i];
				}  else {
					id=1;
					}				
			}
			if(id==1) {
			System.out.println("Student " + name+  " "+ surname + " is not found");
			}
			return null ;
	}

			
		
		 @Override
		    public String toString() throws NullPointerException {
		        Student[] temp = Arrays.copyOf(groupOfStudents, groupOfStudents.length);
		        Arrays.sort(temp, new Comparator<Student>() {
		           
		        	@Override
		            public int compare(Student st1, Student st2) {
		        		if(st1==null|| st2==null) {
		                return -1;
		            }else {
		            	return (st1.getSurname().compareToIgnoreCase(st2.getSurname()));
		            }
		        	}
		        });
		          
		       for (int i = 0; i < groupOfStudents.length; i++) {
		       	if (groupOfStudents[i]==null) {
		       		  	continue;
		        } else {
		        System.out.println((i + 1) + " : " + groupOfStudents[i].toString());
		        		}
		       		}
		 		
		        	  return "";
		 }
}

