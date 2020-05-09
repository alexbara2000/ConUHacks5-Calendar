
public class test {
	public static void main(String[] args) {
		
		
		Exams e1=new Exams(1200, 1400, 3);
		Exams e2=new Exams(1155, 1255, 6);
		
		
		 Student[] stu = new Student[10];
		    stu[0] = new Student(1,"Maira",5);
		    stu[1] = new Student(2,"Alexandru",5);
		    stu[2] = new Student(3,"Jonathan",5);
		    stu[3] = new Student(4,"Joseph",5);
		    stu[4] = new Student(5, "Aiman Hanna",5);
		    stu[5] = new Student(6,"Kool-Aid Man",5);
		    
		    boolean[] b0 = {false, true, false, true, false};
		    Student[] s0 = {stu[0], stu[1], stu[3]};
		    
		    boolean[] b1 = {true, false, true, false, false};
		    Student[] s1 = {stu[0], stu[1], stu[3], stu[4]};
		    
		    boolean[] b2 = {true, true, false, true, false};
		    Student[] s2 = {stu[5], stu[1], stu[4]}; 
		    
		    boolean[] b3 = {false, true, false, true, false};
		    Student[] s3 = {stu[2], stu[5]}; 
		    
		    Teacher[] tea = new Teacher[5];
		   	tea[0] = new Teacher("Lincoln", 1400, 1530, b0, s0 );
		  	tea[1] = new Teacher("Bush", 1300, 1530, b1, s1);
		    tea[2] = new Teacher("Roosevelt", 1000, 1130, b2 ,s2);
		    tea[3] = new Teacher("Nixon", 1200, 1330, b3, s3);
		    

		    System.out.println(stu[0].getExam());
		    System.out.println(tea[1]);
		    
		    tea[1].setExam_Day(3);
		    tea[1].setExam_St(1200);
		    tea[1].setExam_End(1200);
		    
		    tea[1].setExam(e1);
		    tea[0].setExam(e2);
		    
		    System.out.println(tea[1].getExam_Day());
		    System.out.println(tea[1].getExam_St());
		    System.out.println(tea[1].getExam_End());
		    System.out.println(tea[1].getExam()+"\n\n");
		    
		    
		    	
		    
		    System.out.println(stu[0].getExam());
		    
		    
		    
		    
	}

}
