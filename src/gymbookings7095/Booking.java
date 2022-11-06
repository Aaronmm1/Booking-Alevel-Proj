/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymbookings7095;

import java.util.Date;

/**
 *
 * @author aaronmontgomery
 */
public class Booking {

    //attributes
    private int BookingID;//the unique identifier of each booking
    private String BookingDate;//the date that the booking starts
    private String BookingTime;//the time that the booking starts
    private int MemberID;//the unique identifier of each member
    private String StaffUsername;//the username of the staff member that booked the booking
    private String MemberUsername;//the username of each member
//meant to be username

//for getingall for combo box
    /**
     * for getting all for combo box when deleting a booking
     *
     * @param BookingID the unique identifier of each booking
     * @param BookingTime the time that the booking starts
     * @param MemberID the unique identifier of each member
     * @param MemberUsername the username of each member
     * @param StaffUsername the username of the staff member that booked the
     * booking
     * @param BookingDate the date that the booking starts
     */
    Booking(int BookingID, String BookingTime, int MemberID, String MemberUsername, String StaffUsername, String BookingDate) {
        this.BookingID = BookingID;
        this.BookingDate = BookingDate;
        this.BookingTime = BookingTime;
        this.MemberID = MemberID;
        this.StaffUsername = StaffUsername;
        this.MemberUsername = MemberUsername;

    }

    /**
     * for making a booking
     *
     * @param chosenTime the time that the booking starts
     * @param chosenDate the date that the booking starts
     * @param mID the unique identifier of each member
     * @param memUser the username of each member
     * @param chosenStaff the username of the staff member that booked the
     * booking missing booking ID as it is generated
     */
    Booking(String chosenTime, String chosenDate, int mID, String memUser, String chosenStaff) {
        this.MemberUsername = memUser;
        this.MemberID = mID;
        this.BookingDate = chosenDate;
        this.BookingTime = chosenTime;
        this.StaffUsername = chosenStaff;
    }

    /**
     * used when updating a booking in the update booking form
     *
     * @param updatedTime the time that the booking starts
     * @param updateMem the unique identifier of each member
     * @param updateStaff the username of the staff member that booked the
     * booking
     * @param date the date that the booking starts missing member username
     * which will be changed in update member form
     */
    Booking(String updatedTime, String updateMem, String updateStaff, String date) {
        this.BookingTime = updatedTime;
        this.MemberUsername = updateMem;
        this.StaffUsername = updateStaff;
        this.BookingDate = date;

    }

    /**
     * Used to fill booking table in the view form as it doesnt need any members
     * detials as they are chosen before this function performed
     *
     * @param bookingID the unique identifier of each booking
     * @param updTime the time that the booking starts
     * @param updDate the date that the booking starts
     * @param updStaff the username of the staff member that booked the booking
     */
    Booking(int bookingID, String updTime, String updDate, String updStaff) {
        this.BookingID = bookingID;
        this.BookingDate = updDate;
        this.BookingTime = updTime;
        this.StaffUsername = updStaff;
    }

    /**
     *
     * @return The booking ID stored in the object
     */
    public int getBookingID() {
        return this.BookingID;
    }

    /**
     *
     * @return The booking date stored in the object
     */
    public String getBookingDate() {
        return this.BookingDate;
    }

    /**
     *
     * @return The booking time stored in the object
     */
    public String getBookingTime() {
        return this.BookingTime;
    }

    /**
     *
     * @return The member ID stored in the object
     */
    public int getMemberID() {
        return this.MemberID;
    }

    /**
     *
     * @return The staffUsername stored in the object
     */
    public String getStaffUsername() {
        return this.StaffUsername;
    }

    /**
     *
     * @return The member username stored in the object
     */
    public String getMemberUsername() {
        return this.MemberUsername;
    }

    /**
     * used to overwrite the currently stored booking ID
     *
     * @param BookingID this is the new variable that will be stored
     */
    public void setBookingID(int BookingID) {
        this.BookingID = BookingID;
    }

    /**
     * used to overwrite the currently stored booking date
     *
     * @param BookingDate this is the new variable that will be stored
     */
    public void setBookingDate(String BookingDate) {
        this.BookingDate = BookingDate;
    }

    /**
     * used to overwrite the currently stored booking time
     *
     * @param BookingTime this is the new variable that will be stored
     */
    public void setBookingTime(String BookingTime) {
        this.BookingTime = BookingTime;
    }

    /**
     * used to overwrite the currently stored member ID
     *
     * @param MemberID this is the new variable that will be stored
     */
    public void setMemberID(int MemberID) {
        this.MemberID = MemberID;
    }

    /**
     * used to overwrite the currently stored staf username
     *
     * @param StaffUsername
     */
    public void setStaffUsername(String StaffUsername) {
        this.StaffUsername = StaffUsername;
    }

    /**
     * used to overwrite the currently stored member username
     *
     * @param MemberUsername this is the new variable that will be stored
     */
    public void setMemberUsername(String MemberUsername) {
        this.MemberUsername = MemberUsername;
    }

    /**
     *
     * @return BookingID MemberUsername
     */
    public String getBookingcbx() {
        return this.BookingID + " " + this.MemberUsername;
    }

}
