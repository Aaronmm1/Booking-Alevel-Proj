package gymbookings7095;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author7095
 */
public class MemberDAL {

    /*
    not needed used 
    public static ArrayList<Member> getAllMemUser() {
        ArrayList<Member> allMemUserlist = new ArrayList<Member>();
        try {

            Connection conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");
            Statement stat = conn.createStatement();
            String selectQuery = "SELECT MEMBERUSERNAME FROM MEMBERS";
            ResultSet rs = stat.executeQuery(selectQuery);

            while (rs.next()) {
                Member customer = new Member(rs.getString("memberusername"));
                allMemUserlist.add(customer);
            }

            rs.close();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        } catch (Exception e) {
            System.out.println(e);
        }

        return allMemUserlist;
    }
     */
 /*
    // DRAFT
    public static ArrayList<Member> getAllMember() {
        String selectMemberQuery = "SELECT MEMBERUSERNAME FROM MEMBERS";
        ArrayList<Member> allMember = new ArrayList<Member>();

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/GYMDB","gymowner","Password1");
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(selectMemberQuery);

            String memberUsername = "";
           

            Member newMemberObject;

            while (res.next()) {
                memberUsername = res.getString(1);
               
                newMemberObject = new Member(memberUsername);
                allMember.add(newMemberObject);
            }
            conn.close();

        } catch (SQLException sqle) {  
            System.out.println(sqle);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return allMember;
    }
     */
 /*
    public static ResultSet executeQuery(String query) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");
        Statement stat = conn.createStatement();
        ResultSet res = stat.executeQuery(query);
        return res;
    }
     */
    /**
     * Used to get all members from members table
     *
     * @return array list of all members in the members table
     */
    public static ArrayList<Member> getAllMember() {
        String selectMemberQuery = "SELECT * FROM MEMBERS";//sql to select all members
        ArrayList<Member> allMember = new ArrayList<Member>(); //intialise array list

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(selectMemberQuery);

            int memberID = 0;
            String memberUsername = "";
            String memberDOB = "";
            String memberENumber = "";

            Member newMemberObject;

            while (res.next()) {//keeps looping through each row or member in table until at end
                memberID = res.getInt(1);//position in table
                memberUsername = res.getString(2);
                memberDOB = res.getString(3);
                memberENumber = res.getString(4);
                newMemberObject = new Member(memberID, memberUsername, memberENumber, memberDOB);//creates a new member object
                //  System.out.println(">>>>>>" + memberID); to test code
                allMember.add(newMemberObject);//inserts this new object into the array list
            }
            conn.close();

        } catch (SQLException sqle) {
            System.out.println(sqle);//tells you what the sql problem is
        } catch (Exception e) {
            System.out.println(e);
        }

        return allMember;
    }

    /*
    public static boolean login(String memberUsername, String memberPassword) throws SQLException {
        boolean allowLogin = true;
        
        if (!memberUsername.isEmpty()) {
            String query = String.format("SELECT * FROM Staff where STAFFUSERNAME = '%s' AND STAFFPASSWORD = '%s'", memberUsername, memberPassword);
            ResultSet results = executeQuery(query);
            System.out.println(memberUsername+memberPassword);
            if (results.next()) {
                allowLogin = true;
            } else {
                allowLogin = false;
            }
        } else {
            allowLogin = false;
        }
        
        return allowLogin;
    }
     */
 /*
    public static List<Staff> getStaffbyID() {
        String selectStaffQuery = "SELECT * FROM STAFF";
        List<Staff> patternMatchStaff = new ArrayList<Staff>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB","gymowner","Password1");
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(selectStaffQuery);

            int staffID = 0;
            String staffUsername = "";
            String staffPassword = "";
            String staffDOB = "";
            String staffAdminLevel = "";

            Staff newStaffObject;

            while (res.next()) {

                staffID = res.getInt(1);
                staffUsername = res.getString(2);
                staffPassword = res.getString(3);
                staffDOB = res.getString(4);
                staffAdminLevel = res.getString(5);
                newStaffObject = new Staff(staffID, staffUsername, staffPassword, staffDOB, staffAdminLevel);
                patternMatchStaff.add(newStaffObject);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("The connection was unsuccessful");
        }
        return patternMatchStaff;
    }
     */
    /**
     * Will create one new record in the staff table and returns the staffid
     * static because dal doesnt produce an object
     *
     * @param newmember (Member newMemeber is using the staff class previously
     * made)
     * @return
     */
    /**
     * Used to insert a member into the database Used in the insert member form
     *
     * @param newMember
     * @return
     */
    public static int insertnewMem(Member newMember) {
        int keyGot = -1;
        String insertSatement = "INSERT INTO Members(MEMBERUSERNAME,MEMBERENUMBER,MEMBERDOB) VALUES('" //sql to insert into members table
                + newMember.getmemberUsername() + "','"
                + newMember.getmemberENumber() + "','"
                + newMember.getmemberDOB()
                + "')";

        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//will store java db login as object
            Statement stat = conn.createStatement();//con stores all db details.//statement class deals with sql
            stat.executeUpdate(insertSatement, Statement.RETURN_GENERATED_KEYS);

            ResultSet keysReturned = stat.getGeneratedKeys();

            System.out.println("The Member record was successfully added");
            if (keysReturned.next()) {// if results contains a number it will go get it the number is the id
                keyGot = keysReturned.getInt(1);
            }
            System.out.println("Generated keys = " + keyGot);
            keysReturned.close();
            conn.close();//to stop corruption

        } catch (SQLException sqle) {  //sqle is just the name of the error
            System.out.println(sqle + "SQL error in insert");
        } catch (Exception e) {
            System.out.println(e + "non-SQL issue MemberDAL");
        }
        return keyGot;
    }

    /**
     * Deletes a member by there ID
     *
     * @param memberIDToDelete
     * @return
     */
    public static boolean deleteMemberID(int memberIDToDelete) {//deletes a member by thier ID
        String sqlToDeleteRecord = "DELETE FROM MEMBERS WHERE MEMBERID=" + memberIDToDelete; //gets the chosen iD form form
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//connection to db
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlToDeleteRecord);//executes sql
            conn.close();
            return true;

        } catch (SQLException ex) {
            System.err.println("Deleting scustomer id" + memberIDToDelete + "failed");
            return false;
        }
    }

    public static boolean updateMember(Member updateM) {// cant change member ID
        String sqlToUpdateRecord = "UPDATE MEMBERS "
                + "SET MEMBERUSERNAME='" + updateM.getmemberUsername() + "',"
                + "MEMBERENUMBER='" + updateM.getmemberENumber() + "',"
                + "MEMBERDOB='" + updateM.getmemberDOB()
                + "'WHERE MEMBERID =" + updateM.getMemberID();

        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");
            Statement smt = conn.createStatement();
            smt.executeUpdate(sqlToUpdateRecord);
            conn.close();

            System.out.println("Updating member");
            return true;
        } catch (SQLException sqle) {
            System.out.println(sqle + "in members dal");
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }

    public static Member[] getMemberbyID(Member m) {
        ArrayList<Member> a = new ArrayList();
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//will store java db login as object
            Statement stat = conn.createStatement();//con stores all db details.//statement class deals with sql
            ResultSet rs = stat.executeQuery("SELECT * FROM MEMBERS WHERE memberid = " + m.getMemberID());
            while (rs.next()) {
                a.add(new Member(m.getMemberID(), rs.getString(2), rs.getString(3), rs.getString(4)));

            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        Member[] b = new Member[a.size()];
        for (int i = 0; i < a.size(); i++) {
            b[i] = a.get(i);
            System.out.println(b[i].toString());
            System.out.println("in memdal ");
        }
        return b;
    }

}
/*
    public static boolean updateStaff(Staff newStaff){
    String sqlToUpdateRecord="UPDATE Staff"
            + "SET staffUsername='"+newStaff.getstaffUsername() +"',"
            +"staffPassword='"+newStaff.getstaffPassword()+","
            +"staffDOB='"+newStaff.getstaffDOB()+","
            +"staffAdminLevel='"+newStaff.getstaffAdminLevel();
 return false;   
}
 */
