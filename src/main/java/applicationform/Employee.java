package applicationform;

public class Employee {
    //initalize the employee entity
    private int id;
    private int personID;
    private String title;
    private String startDate;
    private String endDate;
    private int visastatusID;
    private String visastartDate;
    private String visaendDate;
    private String driverlicense_ExpirationDate;
    private int houseID;

    private String firstName;
    private String lastName;
    private String middleName;
    private String preferredName;
    private String avatar;
    private String address;
    private String car;
    private int cellPhone;
    private int workPhone;
    private String email;
    private int SSN;
    private String dob;
    private String gender;
    private boolean driverLicense;
    private boolean reference;


    //setter and getter
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public String getfirstName() {
        return firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAddress (String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
