/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymbookings7095;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * this method is used to get member bookings by the members ID this is used for
 * filling in the viewing and updating tables
 *
 * @author 7095
 */
public class BookingDAL {

    public static Booking[] getMemberBookings(Member m) { //gets all booking by member ID and returns an aray
        ArrayList<Booking> a = new ArrayList();
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//will store java db login as object
            Statement stat = conn.createStatement();//con stores all db details.//statement class deals with sql
            ResultSet rs = stat.executeQuery("SELECT * FROM booking WHERE memberid = " + m.getMemberID());
            while (rs.next()) {
                a.add(new Booking(rs.getInt(1), rs.getString(2), m.getMemberID(), m.getmemberUsername(), rs.getString(5), rs.getString(6)));

            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        Booking[] b = new Booking[a.size()]; //array of bookings
        for (int i = 0; i < a.size(); i++) {
            b[i] = a.get(i);
            System.out.println(b[i].toString());
            System.out.println("in booking dal");
        }
        return b;
    }

    /**
     * this is used to insert the attributes of a booking into the database to
     * be stored there
     *
     * @param newBooking this is the object which used in this method to get the
     * data that the user has inputted into the form
     * @return the ID of the booking
     */
    public static int insertnewBooking(Booking newBooking) {
        int keyGot = -1;
        String insertStatement = "INSERT INTO Booking(BOOKINGTIME,BOOKINGDATE,MEMBERID,MEMBERUSERNAME,StaffUSERNAME) VALUES('"
                + newBooking.getBookingTime() + "','" + newBooking.getBookingDate() + "'," + newBooking.getMemberID() + ",'"
                + newBooking.getMemberUsername() + "','" + newBooking.getStaffUsername() + "')";

        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");//will store java db login as object
            Statement stat = conn.createStatement();//con stores all db details.//statement class deals with sql
            stat.executeUpdate(insertStatement, Statement.RETURN_GENERATED_KEYS);

            ResultSet keysReturned = stat.getGeneratedKeys();

            System.out.println("The Booking record was successfully added");
            if (keysReturned.next()) {// if results contains a number it will go get it the number is the id
                keyGot = keysReturned.getInt(1);
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
     * This methods deltes a booking from the database by its ID
     *
     * @param bookingIDToDelete the ID chosen by the user
     * @return true as method is a boolean
     */
    public static boolean deleteBookingID(int bookingIDToDelete) {
        String sqlToDeleteRecord = "DELETE FROM Booking WHERE BOOKINGID= " + bookingIDToDelete;
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlToDeleteRecord);
            conn.close();

        } catch (SQLException sqle) {  //sqle is just the name of the error
            System.out.println(sqle);
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    /**
     * This prints all the bookings stored in the databse
     *
     * @return
     */
    public static ArrayList<Booking> getAllBooking() {
        String selectMemberQuery = "SELECT * FROM BOOKING";
        ArrayList<Booking> allBooking = new ArrayList<Booking>();

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1");
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(selectMemberQuery);

            int BookingID = 0;
            String BookingDate = "";
            String BookingTime = "";
            int MemberID = 0;//meant ot be username
            String StaffUsername = "";
            String MemberUsername = "";

            Booking newBookingObject;

            while (res.next()) {
                BookingID = res.getInt(1);
                BookingTime = res.getString(2);
                MemberID = res.getInt(3);
                MemberUsername = res.getString(4);
                StaffUsername = res.getString(5);
                BookingDate = res.getString(6);
                newBookingObject = new Booking(BookingID, BookingTime, MemberID, MemberUsername, StaffUsername, BookingDate);
                System.out.println(">>>>>>" + BookingID);
                allBooking.add(newBookingObject);
            }
            conn.close();

        } catch (SQLException sqle) {
            System.out.println(sqle + "in booking dal");
        } catch (Exception e) {
            System.out.println(e);
        }

        return allBooking;
    }

    /**
     * used to update the table with a changed value that value was changed on a
     * JTable in UPDATE FORM
     *
     * @param updateB the object that is used to get the data to be able to
     * update the database
     * @return
     */
    public static boolean updateBooking(Booking updateB) {// cant change member ID
        String sqlToUpdateRecord = "UPDATE Booking "
                + "SET BOOKINGTIME='" + updateB.getBookingTime() + "'," //sql that will set each variable to what the 
                + "STAFFUSERNAME='" + updateB.getStaffUsername() + "'," //new object is that was passed to this method
                + "BOOKINGDATE='" + updateB.getBookingDate()
                + "'WHERE BOOKINGID =" + updateB.getBookingID();
        System.out.println(updateB.getBookingID());

        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GYMDB", "gymowner", "Password1"); //connection to db
            Statement smt = conn.createStatement();
            smt.executeUpdate(sqlToUpdateRecord); //execute sql on table
            conn.close();

            System.out.println("Updating member");
            return true;
        } catch (SQLException sqle) {
            System.out.println(sqle + "in boooking dal");
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }

}
