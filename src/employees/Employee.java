package employees;

public abstract class Employee implements IEmployee {
    private String firstname;
    private String surname;
    private String dob;
    private String street;
    private String zipcode;
    private String city;
    private String salary;

    public Employee(String firstname, String surname, String dob, String street, String zipcode, String city, String salary) {
        this.firstname = firstname;
        this.surname = surname;
        this.dob = dob;
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
