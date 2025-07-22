import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class TeacherUserInterface {
    
    ArrayList<TeacherUserInterface> t = new ArrayList<>();
    public static void M1() {
        // Creating JFrame for lecturer
        JFrame jFrame = new JFrame("TeacherUserInterface");
        jFrame.setSize(1000, 1000);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        JPanel jPanel1 = new JPanel();
        jPanel1.add(new JLabel("Lecturer User Interface:"));
        jPanel1.setBounds(0, 0, 1000, 1000);
        jPanel1.setLayout(null);
        jFrame.add(jPanel1);

        JLabel jLabel1 = new JLabel("Lecturer User Interface");
        jLabel1.setBounds(450, 40, 100, 50);
        jLabel1.setFont(new Font("Arial", Font.BOLD, 25));
        jPanel1.add(jLabel1);

        JLabel jLabel2 = new JLabel("Teacher Name:");
        jLabel2.setBounds(70, 75, 100, 50);
        jPanel1.add(jLabel2);

        JLabel jLabel3 = new JLabel("Teacher ID:");
        jLabel3.setBounds(70, 120, 100, 50);
        jPanel1.add(jLabel3);
        
        JLabel jLabel4 = new JLabel("Working Type:");
        jLabel4.setBounds(70, 165, 100, 50);
        jPanel1.add(jLabel4);
        
         JLabel jLabel5 = new JLabel("Address:");
        jLabel5.setBounds(70, 220, 100, 50);
        jPanel1.add(jLabel5);

        JLabel jLabel6 = new JLabel("Working Hours:");
        jLabel6.setBounds(650,75,150,50);
        jPanel1.add(jLabel6);
        
         JLabel jLabel7 = new JLabel("Employment Status:");
        jLabel7.setBounds(650,120,150,50);
        jPanel1.add(jLabel7);
        
        JLabel jLabel8 = new JLabel("Years Of Experience:");
        jLabel8.setBounds(650,165,130,50);
        jPanel1.add(jLabel8);

        JLabel jLabel9 = new JLabel("Department:");
        jLabel9.setBounds(650,210,130,50);
        jPanel1.add(jLabel9);

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(160, 80, 120, 35);
        jPanel1.add(jTextField1);

        JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(160, 130, 120, 35);
        jPanel1.add(jTextField2);

        JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(160, 180, 120, 35);
        jPanel1.add(jTextField3);

        JTextField jTextField4 = new JTextField();
        jTextField4.setBounds(160, 230, 120, 35);
        jPanel1.add(jTextField4);

        JTextField jTextField5 = new JTextField();
        jTextField5.setBounds(780,80,120,35);
        jPanel1.add(jTextField5);

        JTextField jTextField6 = new JTextField();
        jTextField6.setBounds(780,130,120,35);
        jPanel1.add(jTextField6);

        JTextField jTextField7 = new JTextField();
        jTextField7.setBounds(780,180,120,35);
        jPanel1.add(jTextField7);

        JTextField jTextField8 = new JTextField();
        jTextField8.setBounds(780,230,120,35);
        jPanel1.add(jTextField8);

        JButton jButton1 = new JButton("Add Lecturer:");
        jButton1.setBounds(400,280, 150, 40);
        jButton1.setBackground(Color.WHITE);
        jPanel1.add(jButton1);

        // ActionListener for button
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Checcking if the text field id empty
                if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()
                        || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty()
                        || jTextField7.getText().isEmpty() || jTextField8.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(jFrame, "Kindly fill all the text fields to proceed!");
                } else {
                    try {
                        Integer.parseInt(jTextField2.getText());
                        Integer.parseInt(jTextField7.getText());
                        Integer.parseInt(jTextField5.getText());
                        JOptionPane.showMessageDialog(jFrame, "Successfully added a lecturer.");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(jFrame, "Kindly add a numerical value for Teacher ID, Year of experience, Working hours of teacher");
                    }
                }
            }
        });
       
        JButton jb2 = new JButton("Display");
        jb2.setBounds(680, 280, 150, 40);
        jb2.setBackground(Color.WHITE);
        jPanel1.add(jb2);

       
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder displayMessage = new StringBuilder();
                displayMessage.append("Teacher ID: ").append(jTextField1.getText()).append("\n");
                displayMessage.append("Teacher Name: ").append(jTextField2.getText()).append("\n");
                displayMessage.append("Address: ").append(jTextField3.getText()).append("\n");
                displayMessage.append("Working Type: ").append(jTextField4.getText()).append("\n");
                displayMessage.append("Employment Status: ").append(jTextField5.getText()).append("\n");
                displayMessage.append("Working Hours: ").append(jTextField6.getText()).append("\n");
                displayMessage.append("Years Of Experience: ").append(jTextField7.getText()).append("\n");
                displayMessage.append("Department: ").append(jTextField8.getText()).append("\n");

                JOptionPane.showMessageDialog(jFrame, displayMessage.toString(), "Lecturer Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
       
        JButton jb3 = new JButton("Clear");
        jb3.setBounds(100, 280, 150, 40);
        jb3.setBackground(Color.WHITE);
        jPanel1.add(jb3);


      jb3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int option = JOptionPane.showConfirmDialog(jFrame, "Warning! Are you sure?", "Clear", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            jTextField1.setText(""); // Removing everything written in  text fields
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
        }
    }
});


JLabel TeacherID = new JLabel("Teacher_id (TeacherID)");
TeacherID.setBounds(400, 350, 100, 25);
jPanel1.add(TeacherID);

JLabel AddDepartment = new JLabel("Add Department");
AddDepartment.setBounds(400, 430, 100, 25);
jPanel1.add(AddDepartment);

JLabel ScoreGraded = new JLabel("Graded Score");
ScoreGraded.setBounds(400, 390, 100, 25);
jPanel1.add(ScoreGraded);

JLabel ExperienceYears = new JLabel("Add Years of Experience");
ExperienceYears.setBounds(400, 460, 130, 40);
jPanel1.add(ExperienceYears);

JTextField TeacherIdtf = new JTextField();
TeacherIdtf.setBounds(520, 350, 120, 25);
jPanel1.add(TeacherIdtf);

JTextField AddDepartmenttf = new JTextField();
AddDepartmenttf.setBounds(520, 390, 120, 25);
jPanel1.add(AddDepartmenttf);

JTextField GradedScoretf = new JTextField();
GradedScoretf.setBounds(520, 430, 120, 25);
jPanel1.add(GradedScoretf);

JTextField ExperienceYearstf = new JTextField();
ExperienceYearstf.setBounds(520, 470, 120, 25);
jPanel1.add(ExperienceYearstf);

JButton jb4 = new JButton("Grade Assignment");
jb4.setBounds(400, 510, 200, 40);
jb4.setBackground(Color.WHITE);
jPanel1.add(jb4);


jb4.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()
                || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty()
                || jTextField7.getText().isEmpty() || jTextField8.getText().isEmpty() || TeacherIdtf.getText().isEmpty()
                || AddDepartmenttf.getText().isEmpty() || GradedScoretf.getText().isEmpty() || ExperienceYearstf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(jFrame, "Please fill all the text fields.");
        } else {
            try {
                Integer.parseInt(jTextField2.getText());
                Integer.parseInt(jTextField7.getText());
                Integer.parseInt(TeacherIdtf.getText());
                Integer.parseInt(AddDepartmenttf.getText());
                Integer.parseInt(ExperienceYearstf.getText());
           
                JOptionPane.showMessageDialog(jFrame, "Assignment Graded.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(jFrame, "Kindly give numerical values for TeacherID, GradeScore & Years of Experience");
            }
        }
    }
});

JButton jb5 = new JButton("Display");
jb5.setBounds(100, 510, 150, 40);
jb5.setBackground(Color.WHITE);
jPanel1.add(jb5);


jb5.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder displayMessage = new StringBuilder();
        displayMessage.append("Teacher identity Number (TeacherID): ").append(TeacherIdtf.getText()).append("\n");
        displayMessage.append("GradedScore: ").append(AddDepartmenttf.getText()).append("\n");
        displayMessage.append("Department: ").append(GradedScoretf.getText()).append("\n");
        displayMessage.append("Years of Experience: ").append(ExperienceYearstf.getText()).append("\n");

        JOptionPane.showMessageDialog(jFrame, displayMessage.toString(), "Additional Teacher Information", JOptionPane.INFORMATION_MESSAGE);
    }
});

JButton jb6 = new JButton("Clear");// Button to clear what written in text fields
jb6.setBounds(680, 510, 150, 40);
jb6.setBackground(Color.WHITE);
jPanel1.add(jb6);


jb6.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int option = JOptionPane.showConfirmDialog(jFrame, "Are you sure?", "Clear", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            TeacherIdtf.setText("");
            AddDepartmenttf.setText("");
            GradedScoretf.setText("");
            ExperienceYearstf.setText("");
        }
    }
});

JButton jb7 = new JButton("Open Tutor");
jb7.setBounds(400, 580, 200, 40);
jb7.setBackground(Color.WHITE);
jPanel1.add(jb7);


jb7.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        jFrame.setTitle("TutorGUI");
        jFrame.dispose();

        // Open the Tutor GUI
        TutorGUI.M2();
    }
});
}



public class TutorGUI {
    public static void M2() {
        // Creating the JFrame for TutorGUI
        JFrame tutorGUIFrame = new JFrame("TutorGUI");
        tutorGUIFrame.setSize(1400, 1000);
        tutorGUIFrame.setLayout(null);
        tutorGUIFrame.setVisible(true);

        JPanel tutorPanel = new JPanel();
        tutorPanel.add(new JLabel("Tutor:"));
        tutorPanel.setBounds(0, 0, 1000, 1000);
        tutorPanel.setLayout(null);
        tutorPanel.setBackground(Color.LIGHT_GRAY);
        tutorGUIFrame.add(tutorPanel);

       
        JLabel tutorL = new JLabel("Tutor");
        tutorL.setBounds(450, 40, 100, 50);
        tutorL.setFont(new Font("Arial", Font.BOLD, 19));
        tutorPanel.add(tutorL);

       
        JLabel tutorIDL = new JLabel("Teacher ID");
        tutorIDL.setBounds(70, 75, 100, 50);
        tutorPanel.add(tutorIDL);

        JTextField tutorIDTf = new JTextField();
        tutorIDTf.setBounds(220, 80, 120, 35);
        tutorPanel.add(tutorIDTf);
       
       
        JLabel tutorNameL = new JLabel("Teacher Name");
        tutorNameL.setBounds(70, 120, 100, 50);
        tutorPanel.add(tutorNameL);

        JTextField tutorNameTf = new JTextField();
        tutorNameTf.setBounds(220, 130, 120, 35);
        tutorPanel.add(tutorNameTf);

       
        JLabel addressL = new JLabel("Address");
        addressL.setBounds(70, 165, 100, 50);
        tutorPanel.add(addressL);

        JTextField addressTf = new JTextField();
        addressTf.setBounds(220, 180, 120, 35);
        tutorPanel.add(addressTf);

       
        JLabel workingTypeL = new JLabel("Working Type");
        workingTypeL.setBounds(70, 220, 100, 50);
        tutorPanel.add(workingTypeL);

        JTextField workingTf = new JTextField();
        workingTf.setBounds(220, 230, 120, 35);
        tutorPanel.add(workingTf);

       
        JLabel employmentStatusL = new JLabel("Employment Status");
        employmentStatusL.setBounds(650,75,150,50);
        tutorPanel.add(employmentStatusL);

        JTextField employmentStatusTf = new JTextField();
        employmentStatusTf.setBounds(780,80,120,35);
        tutorPanel.add(employmentStatusTf);

     
        JLabel workingHoursL = new JLabel("Working Hours");
        workingHoursL.setBounds(650,120,150,50);
        tutorPanel.add(workingHoursL);

        JTextField workingHoursTf = new JTextField();
        workingHoursTf.setBounds(780,130,120,35);
        tutorPanel.add(workingHoursTf);

     
        JLabel salaryL = new JLabel("Salary");
        salaryL.setBounds(650,165,130,50);
        tutorPanel.add(salaryL);

        JTextField salaryTf = new JTextField();
        salaryTf.setBounds(780,180,120,35);
        tutorPanel.add(salaryTf);

       
        JLabel specializationL = new JLabel("Specialization");
        specializationL.setBounds(650,210,130,50);
        tutorPanel.add(specializationL);

        JTextField specializationTf = new JTextField();
        specializationTf.setBounds(780,230,120,35);
        tutorPanel.add(specializationTf);

       
        JLabel academicQualificationsL = new JLabel("Academic Qualifications");
        academicQualificationsL.setBounds(610,260,130,50);
        tutorPanel.add(academicQualificationsL);

        JTextField academicQualificationsTf = new JTextField();
        academicQualificationsTf.setBounds(780,280,200,35);
        tutorPanel.add(academicQualificationsTf);

       
        JLabel performanceIndexL = new JLabel("Performance Index");
        performanceIndexL.setBounds(70, 270, 150, 50);
        tutorPanel.add(performanceIndexL);

        JTextField performanceIndexTf = new JTextField();
        performanceIndexTf.setBounds(220, 280, 200, 35);
        tutorPanel.add(performanceIndexTf);

JButton jb8 = new JButton("Add Tutor");
jb8.setBounds(400, 350, 250, 40);
jb8.setBackground(Color.WHITE);
tutorPanel.add(jb8);

jb8.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (tutorIDTf.getText().isEmpty() || tutorNameTf.getText().isEmpty() || 
            addressTf.getText().isEmpty() || workingTf.getText().isEmpty() || 
            employmentStatusTf.getText().isEmpty() || workingHoursTf.getText().isEmpty() ||
            salaryTf.getText().isEmpty() || specializationTf.getText().isEmpty() || 
            academicQualificationsTf.getText().isEmpty() || performanceIndexTf.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(tutorGUIFrame, "Kindly fill all the text fields to proceed!");
        
        } else {
            // Validate numerical input fields
            try {
                Integer.parseInt(tutorIDTf.getText());
                Integer.parseInt(workingHoursTf.getText());
                Integer.parseInt(salaryTf.getText());
                Integer.parseInt(academicQualificationsTf.getText());
                Integer.parseInt(performanceIndexTf.getText());
                
                JOptionPane.showMessageDialog(tutorGUIFrame, "Successfully added a Tutor.");
                
                String tutorID = tutorIDTf.getText();
                String tutorName = tutorNameTf.getText();
                String address = addressTf.getText();
                String workingType = workingTf.getText();
                String employmentStatus = employmentStatusTf.getText();
                String workingHours = workingHoursTf.getText();
                String salary = salaryTf.getText();
                String specialization = specializationTf.getText();
                String academicQualifications = academicQualificationsTf.getText();
                String performanceIndex = performanceIndexTf.getText();
        
               
                System.out.println("Tutor ID: " + tutorID);
                System.out.println("Tutor Name: " + tutorName);
                System.out.println("Address: " + address);
                System.out.println("Working Type: " + workingType);
                System.out.println("Employment Status: " + employmentStatus);
                System.out.println("Working Hours: " + workingHours);
                System.out.println("Salary: " + salary);
                System.out.println("Specialization: " + specialization);
                System.out.println("Academic Qualifications: " + academicQualifications);
                System.out.println("Performance Index: " + performanceIndex);
                        

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(tutorGUIFrame, 
                    "Kindly add a numerical value for Teacher ID, Salary, Working hours, " +
                    "Academic qualifications, Performance index of teacher");
            }
        }
    }
});



JLabel teacherIDL = new JLabel("Teacher identity Number (TeacherID)");
teacherIDL.setBounds(70, 420, 100, 25);
tutorPanel.add(teacherIDL);


JTextField teacherIDTf = new JTextField();
teacherIDTf.setBounds(220, 420, 120, 25);
tutorPanel.add(teacherIDTf);


JLabel newSalaryL = new JLabel("New Salary");
newSalaryL.setBounds(70, 450, 100, 25);
tutorPanel.add(newSalaryL);


JTextField newSalaryTf = new JTextField();
newSalaryTf.setBounds(220, 450, 120, 25);
tutorPanel.add(newSalaryTf);


JLabel newPerformanceIndexL = new JLabel("New Performance Index");
newPerformanceIndexL.setBounds(70, 480, 150, 25);
tutorPanel.add(newPerformanceIndexL);


JTextField newPerformanceIndexTf = new JTextField();
newPerformanceIndexTf.setBounds(220, 480, 120, 25);
tutorPanel.add(newPerformanceIndexTf);


JButton jb9 = new JButton("Set Salary of Tutor");
jb9.setBounds(400, 550, 250, 40);
jb9.setBackground(Color.WHITE);
tutorPanel.add(jb9);


jb9.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String teacherID = teacherIDTf.getText();
        String newSalary = newSalaryTf.getText();
        String newPerformanceIndex = newPerformanceIndexTf.getText();

       
        if (teacherID.isEmpty() || newSalary.isEmpty() || newPerformanceIndex.isEmpty()) {
            JOptionPane.showMessageDialog(tutorGUIFrame, "Please fill all the fields.");
            return;
        }

       
        try {
            int teacherIDInt = Integer.parseInt(teacherID);
            int newSalaryInt = Integer.parseInt(newSalary);
            int newPerformanceIndexInt = Integer.parseInt(newPerformanceIndex);

            System.out.println("Teacher identity Number (TeacherID): " + teacherIDInt);
            System.out.println("New Salary: " + newSalaryInt);
            System.out.println("New Performance Index: " + newPerformanceIndexInt);

           
            teacherIDTf.setText("");
            newSalaryTf.setText("");
            newPerformanceIndexTf.setText("");

            JOptionPane.showMessageDialog(tutorGUIFrame, "Salary of Tutor set successfully.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(tutorGUIFrame, "Teacher identity Number (TeacherID), New Salary, and New Performance Index must be integer values.");
        }
    }
});


JButton jb10 = new JButton("Remove the Tutor");
jb10.setBounds(100, 550, 250, 40);
jb10.setBackground(Color.WHITE);
tutorPanel.add(jb10);



jb10.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       
        String tutorID = teacherIDTf.getText();

        if (tutorID.isEmpty()) {
            JOptionPane.showMessageDialog(tutorGUIFrame, "Please enter the Tutor's ID.");
            return;
        }

       
        System.out.println("Removing Tutor with ID: " + tutorID);

       
        teacherIDTf.setText("");

        JOptionPane.showMessageDialog(tutorGUIFrame, "Tutor removed successfully.");
    }
});



JButton jb11= new JButton("Display");
jb11.setBounds(700, 550, 200, 40);
jb11.setBackground(Color.WHITE);
tutorPanel.add(jb11);



jb11.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String tutorID = teacherIDTf.getText();
        String tutorName = tutorNameTf.getText();
        String address = addressTf.getText();
        String workingType = workingTf.getText();
        String employmentStatus = employmentStatusTf.getText();
        String workingHours = workingHoursTf.getText();
        String salary = salaryTf.getText();
        String specialization = specializationTf.getText();
        String academicQualifications = academicQualificationsTf.getText();
        String performanceIndex = performanceIndexTf.getText();

       
        StringBuilder displayMessage = new StringBuilder();
        displayMessage.append("Tutor Information:\n");
        displayMessage.append("Teacher ID: ").append(tutorID).append("\n");
        displayMessage.append("Teacher Name: ").append(tutorName).append("\n");
        displayMessage.append("Address: ").append(address).append("\n");
        displayMessage.append("Working Type: ").append(workingType).append("\n");
        displayMessage.append("Employment Status: ").append(employmentStatus).append("\n");
        displayMessage.append("Working Hours: ").append(workingHours).append("\n");
        displayMessage.append("Salary: ").append(salary).append("\n");
        displayMessage.append("Specialization: ").append(specialization).append("\n");
        displayMessage.append("Academic Qualifications: ").append(academicQualifications).append("\n");
        displayMessage.append("Performance Index: ").append(performanceIndex).append("\n");

       
        JOptionPane.showMessageDialog(tutorGUIFrame, displayMessage.toString(), "Tutor Information", JOptionPane.INFORMATION_MESSAGE);
    }
});



JButton jb12 = new JButton("Clear");
jb12.setBounds(100, 600, 200, 40);
jb12.setBackground(Color.WHITE);
tutorPanel.add(jb12);



jb12.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Clearing all JTextFields
        int option = JOptionPane.showConfirmDialog(tutorGUIFrame, "Are you sure?", "Clear", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            tutorIDTf.setText("");
            tutorNameTf.setText("");
            addressTf.setText("");
            workingTf.setText("");
            employmentStatusTf.setText("");
            workingHoursTf.setText("");
            salaryTf.setText("");
            specializationTf.setText("");
            academicQualificationsTf.setText("");
            performanceIndexTf.setText("");
        }
    }
});



JButton jb13 = new JButton("Open Lecturer");
jb13.setBounds(700, 600, 200, 40);
jb13.setBackground(Color.WHITE);
tutorPanel.add(jb13);


jb13.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Close the Tutor GUI
        tutorGUIFrame.dispose();

        // Open the Lecturer GUI
        TeacherUserInterface.M1();
    }
});

       
    }
}
}



