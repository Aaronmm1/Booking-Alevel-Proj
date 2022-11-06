package gymbookings7095;
//crud create,reading.update,delete

import java.sql.*;
import java.util.*;
//import java.text.*;// SimpleDateFormat
//import java.util.Date;

/**
 * Establishes connections to the STAFF table in the database
 *
 * @author 7095
 */
public abstract class StaffDAL {

    /**
     * This method is used to retrieve all the data stored in the staff table
     *
     * @returns a array list filled with all the data stored in the staff table
     */
    public static ArrayList<Staff> getAllStaff() {
        String selectStaffQuery = "SELECT * FROM STAFF";//sql code to get all data from the staff table
        ArrayList<Staff> allStaff = new ArrayList<Staff>();//creating of the allStaff array list

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//pathway for connection to database
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(selectStaffQuery);

            int staffID = 0;            //initalising the attributes that are stored in the staff class and database
            String staffUsername = "";
            String staffPassword = "";
            String staffDOB;
            String staffAdminLevel = "";

            Staff newStaffObject;

            while (res.next()) { //this creates a staff object for each member in the data base and then adds it to the array list
                staffID = res.getInt(1);
                staffUsername = res.getString(2);
                staffPassword = res.getString(3);
                staffDOB = res.getString(4);
                staffAdminLevel = res.getString(5);
                newStaffObject = new Staff(staffID, staffUsername, staffPassword, staffAdminLevel, staffDOB);
                allStaff.add(newStaffObject);
            }
            conn.close();

        } catch (Exception e) {
            System.out.println("Connection to staff table was not successful");
        }
        return allStaff;
    }

    /*
   //DRAFT////////
first attempt at a login 
    public static boolean login(String staffUsername, String staffPassword) throws SQLException {
        boolean allowLogin = true;

        if (!staffUsername.isEmpty()) {
            String query = String.format("SELECT * FROM Staff where STAFFUSERNAME = '%s' AND STAFFPASSWORD = '%s'", staffUsername, staffPassword);
            ResultSet results = executeQuery(query);
            System.out.println(staffUsername + staffPassword);
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

    /*
    
     */
//creates a new staff record
    /**
     * Will create one new record in the staff table and returns the staffid
     * static because dal doesnt produce an object
     *
     * @param newStaff (Staff newStaff is using the staff class previously made)
     * @return
     */
    public static int insertnewStaff(Staff newStaff) {
        int keyGot = -1;
        String insertStatement = "INSERT INTO STAFF(STAFFUSERNAME,STAFFPASSWORD,STAFFADMINLEVEL,STAFFDOB) VALUES('"
                + newStaff.getstaffUsername() + "','"
                + newStaff.getstaffPassword() + "','"
                + newStaff.getstaffAdminLevel() + "','"
                + newStaff.getstaffDOB() + "')"; // sql statement to insert each staff attribute into the staff table

        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//will store java db login as object
            Statement stat = conn.createStatement();//con stores all db details
            stat.executeUpdate(insertStatement, Statement.RETURN_GENERATED_KEYS);

            ResultSet keysReturned = stat.getGeneratedKeys();

            //System.out.println("The Staff record was successfully added");// a test to see if the insertion was successfull or if a connection was made
            if (keysReturned.next()) {// if results contains a number it will go get it the number is the id
                keyGot = keysReturned.getInt(1);// the staffid is auto generated in databse this keyGot takes that into account 
            }
            System.out.println("Generated keys = " + keyGot);
            keysReturned.close();
            conn.close();//to stop corruption

        } catch (SQLException sqle) {  //sqle is just the name of the error
            System.out.println(sqle);
        } catch (Exception e) {
            System.out.println(e);
        }
        return keyGot;
    }

    /**
     *
     * @param staffIDToDelete this is the id chosen from the user to be deleted
     * @return
     */
    public static boolean deleteStaffID(int staffIDToDelete) {
        String sqlToDeleteRecord = "DELETE FROM STAFF WHERE STAFFID=" + staffIDToDelete;//sql statement to delete the staff by the id chosen
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//pathway to database
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlToDeleteRecord);//statement to excute sql on the staff table
            conn.close();//stops corruption
            return true;

        } catch (SQLException ex) {
            System.err.println("Deleting customer id" + staffIDToDelete + "failed");
            return false;
        }
    }

    /**
     * This method is the same as getAllStaff but just gets the password and
     * username it is used for the login system
     *
     * @returns an array list filled with all passwords and usernames of the
     * staff table
     */
    public static ArrayList<Staff> getPasswordUsername() { // adding admin level to constructor
        String selectStaffQuery = "SELECT * FROM STAFF";//gets all the info from the staff table
        ArrayList<Staff> upStaff = new ArrayList<Staff>();//intialises the upStaff array list

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//pathway to the database,used to make connection
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(selectStaffQuery);

            String staffUsername = "";//means only these to attributes of the staff class are filled from the database
            String staffPassword = "";//i.e ignores stafDOB, only password and username and admin level
            String staffAdminLevel = "";// admin level needed to determine there level later in code

            Staff newStaffObject;

            while (res.next()) {

                staffUsername = res.getString(2);
                staffPassword = res.getString(3);
                staffAdminLevel = res.getString(4);

                newStaffObject = new Staff(staffUsername, staffPassword, staffAdminLevel);
                upStaff.add(newStaffObject);//adds new staff object to array list 
            }
            conn.close();

        } catch (Exception e) {
            System.out.println("Connection to staff table was not successful");
        }
        return upStaff;
    }

    /*
    public static Staff[] getStaffbyAdmin(Staff m){ //gets all the admins then compares that to the orginal admin
        ArrayList<Member> a = new ArrayList();
        try{
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//will store java db login as object
            Statement stat = conn.createStatement();//con stores all db details.//statement class deals with sql
            ResultSet rs = stat.executeQuery("SELECT * FROM STAFF WHERE STAFFADMINLEVEL = " + m.getstaffAdminLevel());
            
            while(rs.next()){
                a.add(new Member( m.getMemberID(), rs.getString(2), rs.getString(3), rs.getString(4)));
            
            }
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        Member[] b = new Member[a.size()];
        for(int i = 0; i < a.size(); i++){
            b[i] = a.get(i);
            System.out.println(b[i].toString());
            System.out.println("in memdal ");
        }
        return b;
    }
    /*
    public static Staff[] getStaffIDbyU(Staff s){
        ArrayList<Staff> a = new ArrayList();
        try{
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//will store java db login as object
            Statement stat = conn.createStatement();//con stores all db details.//statement class deals with sql
            ResultSet rs = stat.executeQuery("SELECT * FROM STAFF WHERE STAFFUSERNAME = " + s.getstaffUsername());
          
            while(rs.next()){
               a.add(new Staff( rs.getInt(1), s.getstaffUsername(), rs.getString(3), rs.getString(4),rs.getString(5)));
            }
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        Staff[] b = new Staff[a.size()];
        for(int i = 0; i < a.size(); i++){
            b[i] = a.get(i);
            System.out.println(b[i].toString());
            System.out.println("in staffdal ");
        }
        return b;
    }
    
     */
    public static ArrayList<Staff> getStaffbyID(Staff m) {//used to check admin level
        ArrayList<Staff> a = new ArrayList();
        System.out.println("in staff dal rn just chilling lol");
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//will store java db login as object
            Statement stat = conn.createStatement();//con stores all db details.//statement class deals with sql
            ResultSet rs = stat.executeQuery("SELECT * FROM STAFF WHERE STAFFID = " + m.getStaffID());
            while (rs.next()) {
                a.add(new Staff(m.getStaffID(), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));

            }
        } catch (SQLException ex) {
            System.out.println(ex);

        } catch (Exception e) {
            System.out.println(e + "non-SQL issue MemberDAL");
        }
        System.out.println(a);
        return a;

    }

    public static boolean updateStaff(Staff updateB) {// cant change member ID
        String sqlToUpdateRecord = "UPDATE STAFF "
                + "SET STAFFUSERNAME='" + updateB.getstaffUsername() + "'," //sql that will set each variable to what the 
                + "STAFFPASSWORD='" + updateB.getstaffPassword() + "'," //new object is that was passed to this method
                + "STAFFADMINLEVEL='" + updateB.getstaffAdminLevel() + "',"
                + "STAFFDOB='" + updateB.getstaffDOB()
                + "'WHERE STAFFID =" + updateB.getStaffID();

        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1"); //connection to db
            Statement smt = conn.createStatement();
            smt.executeUpdate(sqlToUpdateRecord); //execute sql on table
            conn.close();

            System.out.println("Updating Staff");
            return true;
        } catch (SQLException sqle) {
            System.out.println(sqle + "in staff dal");
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }

}
