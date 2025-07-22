
class TeacherObject //to create class 
{
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    public int workingHours;
   
    //To create Constructor//
    public TeacherObject(int teacherid, String teacherName, String address, String workingType, String employmentStatus, int workingHours)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
        this.workingHours = workingHours;
    }
   
    //To create getter//
    public int getteacherId()
    {
        return teacherId;
    }
    public String getteacherName()
    {
        return teacherName;
    }
    public String getaddress()
    {
        return address;
    }
    public String getworkingType()
    {
        return workingType;
    }
    public String getemploymentStatus()
    {
        return employmentStatus;
    }
   
    //Creating method of Set Working hours//
    public void setworkingHours(int workingHours)
    {
        this.workingHours = workingHours;
    }
   
    //Creating a method to display //
    public void display()
    {
        System.out.println("Teacher ID is: " +teacherId);
        System.out.println("Teacher Name is: " +teacherName);
        System.out.println("Address is: " +address);
        System.out.println("Working Type is: " +workingType);
        System.out.println("Employment Status is: " +employmentStatus);
        if(workingHours == 0)
        {
            System.out.println("Working Hours: Is Not Assigned");
        }
        else
        {
            System.out.println("Working Hours is: " +workingHours);
        }
    }
}