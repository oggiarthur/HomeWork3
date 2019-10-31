package homeWork3_task1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Group tenis= new Group();
		Student st1 = new Student ("Nikolay","Petrov",19,"male", 1, 3);
		Student st2 = new Student ("Vasiliy","Ivanow",20,"male",1,4);
		Student st3 = new Student ("Ivan","Yashura",19,"male",2,3);
		Student st4 = new Student ("Petr","Vasilev",18,"male",1,2);
		Student st5 = new Student ("Olga","Petrova",20,"female",2,3);
		Student st6 = new Student ("Joch","Cena",18,"male",1,2);
		Student st7 = new Student ("Nik","Buche",17,"male",1,2);
		Student st8 = new Student ("Denis","Kurochkin",17,"male",2,1);
		Student st9 = new Student ("Vera","Kyzmina",17,"female",2,1);
		Student st10 = new Student ("Nikolay","Petruchev",17,"male",2,3);
		Student st11 = new Student ("Vladimir","Rubkin",17,"male",1,3);
		
		try {
		tenis.addingStud(st1);
		tenis.addingStud(st2);
		tenis.addingStud(st3);
		tenis.addingStud(st4);
		tenis.addingStud(st5);
		tenis.addingStud(st6);
		tenis.addingStud(st7);
		tenis.addingStud(st8);
		//tenis.addingStud(st9);
		//tenis.addingStud(st10);
		
	///	tenis.addingStud(st11);
		
		
		tenis.deleteStud(st10);
		
		
		} catch (FullGroupException e) {
			System.out.println("_______________\n" +e.getMessage());
		} catch (StudentException e){
			System.out.println( "_______________\n"+ e.getMessage());			
		} 
		
		
	
			System.out.println("_______________\n" +tenis.studentSearch("Vera","Kyzmina"));
		   
			
			tenis.toString();
			
	}
	  
	
	}


