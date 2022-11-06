package gymbookings7095;

/**
 *
 * @author 7095
 */
public class Member {
    // ATTRIBUTES

    private int memberID;//Uniquely identifies each member
    private String memberUsername;//Used by the member to log in
    private String memberDOB;//Used to ensure over 18s only use the system
    private String memberENumber;//Used for emergency phone calls

    // CONSTRUCTORS //////
    /**
     * Construct a new Member object when all attributes are known
     *
     * @param memberID Uniquely identifies each member
     * @param memberUsername Used by the member to log in
     * @param memberDOB Used to ensure over 18s only use the system
     * @param memberENumber Used for emergency phone calls
     */
    public Member(int memberID, String memberUsername, String memberENumber, String memberDOB) {
        this.memberID = memberID;
        this.memberUsername = memberUsername;
        this.memberDOB = memberDOB;
        this.memberENumber = memberENumber;

    }

    /**
     * Construct a new Member object when only the username is known
     *
     * @param memberUsername Used by the member to log in
     */
    /*
    not used as there is no member log in
    public Member(String memberUsername) {
        this.memberUsername = memberUsername;
    }
     */
    /**
     * This constructor is used in the form to add a new member dont need
     * username as username
     *
     * @param givenMemUser
     * @param givenENum
     * @param date
     */
    Member(String givenMemUser, String givenENum, String date) {
        this.memberUsername = givenMemUser;
        this.memberDOB = date;
        this.memberENumber = givenENum;
    }

    /*
    // DRAFT
    
    public Member(String memberUsername, String memberPassword) {
        this.memberUsername = memberUsername;
    }
     */
    // ACCESSOR & MUTATOR METHODS /////
    /**
     * Obtain the ID of the member member
     *
     * @return A unique identifier auto-generated in the database
     */
    public int getMemberID() {
        return this.memberID;
    }

    /**
     * Obtain the member username from private attributes
     *
     * @return the member's username
     */
    public String getmemberUsername() {
        return this.memberUsername;
    }

    /**
     * Obtain the member DOB from private attributes
     *
     * @return
     */
    public String getmemberDOB() {
        return this.memberDOB;
    }

    /**
     * Obtain the member emergency number from private attributes
     *
     * @return
     */
    public String getmemberENumber() {
        return this.memberENumber;
    }

    /**
     * Overwrite the members ID currently stored
     *
     * @param memberID The new ID to set for the member's ID
     */
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    /**
     * Overwrite the members username currently stored
     *
     * @param memberUsername
     */
    public void setmembersUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    /**
     * Overwrite the members DOB currently stored
     *
     * @param memberDOB
     */
    public void setmemberDOB(String memberDOB) {
        this.memberDOB = memberDOB;
    }

    /**
     * Overwrite the members emergency number currently stored
     *
     * @param memberENumber
     */
    public void setmemberENumber(String memberENumber) {
        this.memberENumber = memberENumber;
    }

    @Override//overides java toString method

    public String toString() {//doesnt print
        return "Member ID: " + this.memberID + "\n"
                + "Member Username: " + this.memberUsername + "\n"
                + "Member DOB: " + this.memberDOB + "\n"
                + "Member Admin Level: " + this.memberENumber + "\n";
    }

    public void printStringmember() {
        System.out.println(this.toString());
    }

    //this is used when filling the combo box with all members and there IDs
    public String getShortString() {
        return this.memberID + " " + this.memberUsername;
    }

}
