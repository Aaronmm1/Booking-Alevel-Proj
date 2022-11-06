package gymbookings7095;

import javax.swing.JTextField;

/**
 * This java class is the class associated with the creating of staff objects
 * and their attributes and methods
 *
 * @author 7095
 */
public class Staff {

    // ATTRIBUTES
    private int staffID;//A unique identifier auto-generated in the database
    private String staffUsername; //User-chosen username
    private String staffPassword;//User-chosen password
    private String staffDOB;//The staff member's date of birth
    private String staffAdminLevel;//The level of privileges/access rights they have (admin or staff)

    // METHODS
    /**
     * Create a new Staff member as an object/instance
     *
     * @param staffID A unique identifier auto-generated in the database
     * @param staffUsername User-chosen username
     * @param staffPassword User-chosen password
     * @param staffDOB The staff member's date of birth
     * @param staffAdminLevel The level of privileges/access rights they have
     * (admin or staff) This constructor is used when creating a new object in
     * the method used to get all staff
     */
    public Staff(int staffID, String staffUsername, String staffPassword, String staffAdminLevel, String staffDOB) {
        this.staffID = staffID;
        this.staffUsername = staffUsername;
        this.staffPassword = staffPassword;
        this.staffDOB = staffDOB;
        this.staffAdminLevel = staffAdminLevel;
    }

    /**
     * Creates a new staff member as an object with these attributes
     *
     * @param staffUsername User-chosen username
     * @param staffPassword User-chosen password
     * @param staffAdminLevel The level of privileges/access rights they have
     * (admin or staff)
     * @param staffDOB The staff member's date of birth This constructor is used
     * for the insert method to insert a new staff member into the database
     */
    public Staff(String staffUsername, String staffPassword, String staffAdminLevel, String staffDOB) {
        this.staffUsername = staffUsername;
        this.staffPassword = staffPassword;
        this.staffDOB = staffDOB;
        this.staffAdminLevel = staffAdminLevel;
    }

    /**
     *
     * @param staffUsername
     * @param staffPassword This constructor is used to get the password and
     * username to check they match the inputted username and password for the
     * login
     */
    public Staff(String staffUsername, String staffPassword, String staffAdminLevel) {
        this.staffUsername = staffUsername;
        this.staffPassword = staffPassword;
        this.staffAdminLevel = staffAdminLevel;
    }

    /*
    //DRAFT USED IN FIRST ITERATION OF REGISTER 
    Staff(String givenUsername, String pass, JTextField DOBReg, String AdminLev) {//for registering new user
        this.staffUsername=givenUsername;
        this.staffPassword=pass;
        this.DOBReg1=DOBReg;
        this.staffAdminLevel=AdminLev;
    }
     */

    Staff(String username) {
        this.staffUsername = username;
    }

    /**
     * Obtain the ID of the staff member stored privately
     *
     * @return A unique identifier auto-generated in the database
     */
    public int getStaffID() {
        return this.staffID;
    }

    /**
     * Obtains the staffUsername stored privately
     *
     * @return The staff username stored in database
     */
    public String getstaffUsername() {
        return this.staffUsername;
    }

    /**
     * Obtains the staffPassword stored privately
     *
     * @return the staff password stored in the database
     */
    public String getstaffPassword() {
        return this.staffPassword;
    }

    /**
     * Obtains the staffDOB stored privately
     *
     * @return the staff date of birth stored in database
     */
    public String getstaffDOB() {
        return this.staffDOB;
    }

    /**
     * Obtains the staffAdminLevel stored privately
     *
     * @return the staff admin level which acts as an access level
     */
    public String getstaffAdminLevel() {
        return this.staffAdminLevel;
    }

    /**
     * Overwrite the staff member's ID
     *
     * @param staffID T
     */
    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    /**
     * Overwrite the staff username
     *
     * @param staffUsername t
     */
    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername;
    }

    /**
     * Overwrite the staffPassword that is stored privately
     *
     * @param staffPassword
     */
    public void setStaffPassoord(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    /**
     * Overwrite the staff date of birth
     *
     * @param staffDOB
     */
    public void setStaffDOB(String staffDOB) {
        this.staffDOB = staffDOB;
    }

    /**
     * Overwrite the staff admin level that is stored privately
     *
     * @param staffAdminLevel
     */
    public void setStaffAdminLevel(String staffAdminLevel) {
        this.staffAdminLevel = staffAdminLevel;
    }

    @Override// to overide the java in built method of toString 

    public String toString() {//doesnt print
        return "Staff ID: " + this.staffID + "\n"
                + "Staff Username: " + this.staffUsername + "\n"
                + "Staff Password: " + this.staffPassword + "\n"
                + "Staff DOB: " + this.staffDOB + "\n"
                + "Staff Admin Level: " + this.staffAdminLevel + "\n";
    }

    /*
    public boolean AdLev() {
      
        boolean ad;
                if (this.staffAdminLevel=="admin") {
            ad=true;
       }else{
         ad=false;
       }
        return ad;
    
    }
     */
    public String getstaffcbx() {
        return this.staffUsername + " " + this.staffID;
    }

    public String checkAdmin() {
        return this.staffAdminLevel;
    }
}
