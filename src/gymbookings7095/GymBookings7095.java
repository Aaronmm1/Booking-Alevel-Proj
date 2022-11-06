package gymbookings7095;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import java.util.Date;
import java.time.Month;
import java.time.LocalDate;
import java.lang.String;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;

/**
 * @author Candidate 7095
 */
public class GymBookings7095 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        String mem="test";
        mem= mem.substring(0, 2).toUpperCase() + mem.substring(2);
        System.out.println(mem);
      */
 /*doesnt work
    // Driver Codepublic static void main(String args[])
    
        // Given Date
        String date = "2020-07-18";
 
        // Function Call
        getDayMonthYear(date);
       
        */
 /*
        System.out.println("2222222");
       DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate.format(df));
works   
 */
        
        /*
        Member m = new Member(2006, "JScott", "2000-47-23", "07876547389");
        
        BookingDAL.getMemberBookings(m);
        */
       
       LoginForm logf = new LoginForm();// Opens username creation form

        logf.setSize(800, 600);

        logf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logf.setVisible(true);

//DRAFTS/////
        
        // logf. pullThePlug();
       
       //test
       /* 
       ArrayList<Member> c = new ArrayList<Member>();
        c = MemberDAL.getAllMember();
        for (int b = 0; b < c.size(); b++) {
            System.out.println(c.get(b).toString());
        }
        /*
         ArrayList<Member> d = new ArrayList<Member>();
        d = MemberDAL.getAllMemberUsername();
        for (int b = 0; b < c.size(); b++) {
            System.out.println(c.get(b).toString());

        // Testing
        Staff aaron = new Staff(101, "Aaron", "Brown", "2021-05-04", "staff");
        //System.out.println(aaron.toString());
        aaron.printString();
        
      
   
       
        

        Staff[] committee = {aaron, aaron, aaron};

        int id = aaron.getStaffID();
        System.out.println(id);

        aaron.toString();

        ArrayList<Staff> s = new ArrayList<Staff>();
        s = StaffDAL.getAllStaff();
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i).toString());
        }
         */
//Staff newStaff=new Staff("RThompson","Pass","2003-09-22","staff");
//StaffDAL.insertnewStaff(newStaff);
/*      
BookingForm logB = new BookingForm();

        logB.setSize(800, 600);

        logB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        logB.setVisible(true);
         */

    }
    /*
 public static void getDayMonthYear(String date)
    {
 
        // Get an instance of LocalTime
        // from date
        LocalDate currentDate
            = LocalDate.parse(date);
 
        // Get day from date
        int day = currentDate.getDayOfMonth();
 
        // Get month from date
        Month month = currentDate.getMonth();
 
        // Get year from date
        int year = currentDate.getYear();
 
        // Print the day, month, and year
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
*///doesnt work
   
}

