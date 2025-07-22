class LecturerObject extends TeacherObject
{
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
   
    //To create Constructor//
    public LecturerObject(int teacherid, String teacherName, String address, String workType, String employmentStatus, int workingHours,
    String department, int yearsOfExperience, int gradedScore, boolean hasGraded)
    {
        super(teacherid, teacherName, address, workType, employmentStatus, workingHours);
       
        //Initialize the additional attributes and set hasGraded false
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
       
    }
    //Accessor method for department,graded score and experirnce
    public String getDepartment()
    {
        return department;
    }
    public int getYearsOfExperience()
    {
        return yearsOfExperience;
    }
    public int gradedScore()
    {
        return gradedScore;
    }
   
    
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore = gradedScore;
    }
   
    //Grading assignments methods.
    public void gradeAssigment(int gradedScore, String department,int yearsOfExperience)
    {
        if(!hasGraded && yearsOfExperience>=5 && this.department.equals(department))
        {
             if(gradedScore >=70){
                System.out.println("Graded score is = A");
            }
            else if(gradedScore>=6){
                System.out.println("Graded score is = B+");
            }
            else if(gradedScore>=50){
                System.out.println("Graded score is = B");
            }
            else if(gradedScore>=40){
                System.out.println("Graded score is = C+");
            }
            else{
                System.out.println("Graded score is = C");
            }
           
            hasGraded=true;
        }
        else{
            System.out.println("Sorry unable to grade at this time");
        }
    }
    //displaying details of the Lecturer method
    public void display()
    {
       
        //Way to call the display method of the superclass(Teacher class)
        super.display();
       
        
        System.out.println("Department: "+department);
        System.out.println("Years of Experience: "+yearsOfExperience);
       
        //Checking weather if the score has been graded
        if(hasGraded){
            System.out.println("Graded Score is: "+gradedScore);
        }
        else{
            System.out.println("Sorry score has not been graded yet");
        }
    }
}