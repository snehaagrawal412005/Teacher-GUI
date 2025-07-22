public class TutorObject extends TeacherObject {
    private double salary;
    private String specialization;
    private String academicQualification;
    private int performanceIndex;
    private boolean isCertified;

    //To create Constructor
    public TutorObject(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
                 int workingHours, double salary, String specialization, String academicQualification, int performanceIndex) {
        super(teacherId, teacherName, address, workingType, employmentStatus,workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualification = academicQualification;
        this.performanceIndex = performanceIndex;
        this.isCertified = false; // Initially set to false
    }

    //Creating a setter method for salary
    public void setSalary(double Salary, int performancIndex) {
        if (!isCertified) {
            if (performancIndex > 5 && workingHours > 20) {
                double appraisalPercentage;
                if (performanceIndex >= 5 && performanceIndex <= 7) {
                    appraisalPercentage = 0.05;
                } else if (performanceIndex >= 8 && performancIndex <= 9) {
                    appraisalPercentage = 0.10;
                } else {
                    appraisalPercentage = 0.20;
                }

                // new salary calculation
                double appraisalAmount = salary * appraisalPercentage;
                this.salary += appraisalAmount;

                this.performanceIndex = performanceIndex;
                this.isCertified = true;

                System.out.println("Salary is approved with appraisal. New salary: " + this.salary);
            } else {
                System.out.println(" Sorry! salary cannot be approved. Performance index or working hours did not meet the criteria.");
            }
        } else {
            System.out.println("Sorry! Salary cannot be approved for a certified tutor.");
        }
    }

    // Tutor removing method
    public void removeTutor() {
        if (!isCertified) {
            this.salary = 0;
            this.specialization = "";
            this.academicQualification = "";
            this.performanceIndex = 0;
            this.isCertified = false;
            System.out.println("Tutor is not removed.");
        } else {
            System.out.println("Sorry! Cannot remove a certified tutor.");
        }
    }

    // Method for displaying details
    @Override
    public void display() {
        if (!isCertified) {
            super.display(); // Call the display method in the parent class
        } else {
            // Display details of Tutor class along with parent class details
            super.display();
            System.out.println("Salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualification: " + academicQualification);
            System.out.println("Performance Index: " + performanceIndex);
        }
    }
}