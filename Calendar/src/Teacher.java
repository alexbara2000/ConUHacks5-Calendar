
public class Teacher {

  private String tName;
	private int classTimeStart;
	private int classTimeEnd;
	private boolean[] daysOfClass;
	private Student[] myStudents;
	private int exam_St;
	private int exam_End;
	private int exam_Day;
	private Exams e1=null;
	  
  public int getExam_Day() {
		return exam_Day;
	}

	public void setExam_Day(int exam_Day) {
		this.exam_Day = exam_Day;
	}

  
  public int getExam_St() {
	return exam_St;
}

public void setExam_St(int exam_St) {
	this.exam_St = exam_St;
}

public int getExam_End() {
	return exam_End;
}

public void setExam_End(int exam_End) {
	this.exam_End = exam_End;
}
  




    
  public Teacher(String tName, int classTimeStart, int classTimeEnd, boolean[] daysOfClass, Student[] s1){
    this.tName = tName;
    this.classTimeStart = classTimeStart;
    this.classTimeEnd = classTimeEnd;
    this.myStudents=s1;
    this.daysOfClass=new boolean[5];
    
    for(int i=0; i<daysOfClass.length;i++){
      	this.daysOfClass[i] = daysOfClass[i];
      }
    }
  
  public String getExams()
  {
    return "The day of the exam in on the "+ e1.getExamDayString()+". the exam start at: "+e1.getExamStart()+" and ends at: "+e1.getExamEnd();    
  }
  
  
  public void setExam(Exams e1) {
		
	  this.e1=new Exams(e1);
	  
	  for(int i=0;i<myStudents.length;i++)
	  {
		  myStudents[i].setExamStudent(e1);
	  }
    		
    }
    
    public int getClassTimeStart(){
        return classTimeStart;
      }
    public int getClassTimeeEnd(){
        return classTimeEnd;
      }
  	public String getExam(){
      return "The exam is "+ e1.getExamDayString()+", and it starts at :"+e1.getExamStart()+", and it finishes at :"+e1.getExamEnd();
    }
    
    
  
  
  public void setClassTimeStart (int classTimeStart){
      if(classTimeStart>=0&&classTimeStart<2400){
    		this.classTimeStart = classTimeStart;
    	}
    else{
      classTimeStart=0;
      System.out.println("Not a valid Start time please enter another time");
    	}
  }
 
	 public void setClassTimeEnd (int classTimeEnd){
    
    if(classTimeStart>=0&&classTimeStart<2400){
   			this.classTimeEnd = classTimeEnd;
    }
    else{
      classTimeStart=0;
      System.out.println("Not a valid Start time please enter another time");
      
    }
     
}
	 
	 
     public boolean equals(Teacher t1)
     {
       if(t1==null)
    	   return false;
    	 
    	return this.exam_Day!=0 && t1.exam_Day!=0 && this.exam_Day==t1.exam_Day &&
        (this.exam_St>=t1.exam_St && this.exam_St<=t1.exam_End) ||
        (this.exam_End>=t1.exam_St && this.exam_End<=t1.exam_End) ||
         (t1.exam_St>=this.exam_St && t1.exam_St<=this.exam_End);
        
     }
     
     
     public String PossibleDates()
     {
    	 
    	 return"";
     }
  	
  	public String toString(){
     String s1="";
     for (int i=0;i<myStudents.length;i++)
     {
    	 s1=s1+"Student "+(i+1)+": "+myStudents[i].getName()+", and the student ID is: "+myStudents[i].getID()+".\n";
     }
      return "the name of the teacher is "+ tName+ " and the students of the class are: \n"+s1;
    }
  	

public String dayCount(){
 	int sunCount = 0;
  int monCount =0;
  int tueCount = 0;
  int wedCount = 0;
  int thurCount = 0;
  int friCount = 0;
  int satCount = 0;

  for(int i = 0; i<myStudents.length; i++){
	  for(int j=0;j<myStudents[i].e1.length;j++)
	  {
		  if(this.myStudents[i].e1[j].getExamDay() == 1)
		    {
		      sunCount++;
		    }
		    else if(this.myStudents[i].e1[j].getExamDay() == 2)
		    {
		      monCount++;
		    }
		     else if(this.myStudents[i].e1[j].getExamDay() == 3)
		    {
		      tueCount++;
		    }
		     else if(this.myStudents[i].e1[j].getExamDay() == 4)
		    {
		      wedCount++;
		    }
		     else if(this.myStudents[i].e1[j].getExamDay() == 5)
		    {
		      thurCount++;
		    }
		     else if(this.myStudents[i].e1[j].getExamDay() == 6)
		    {
		      friCount++;
		    }
		     else if(this.myStudents[i].e1[j].getExamDay()== 7)
		    {
		      satCount++;
		    }
	  }
   
    
  }
 return ("Number of students who have class on Monday: " + monCount + "\nNumber of students who have class on Tuesday: " + tueCount +
                     "\nNumber of students who have class on Wednesday: " + wedCount + "\nNumber of students who have class on Thursday: " + thurCount + 
                     "\nNumber of students who have class on Friday: " + friCount + "\nNumber of students who have class on Saturday: " + satCount +
                    "\nNumber of students who have class on Sunday: " + sunCount);
}

     
     
}  
	
	

