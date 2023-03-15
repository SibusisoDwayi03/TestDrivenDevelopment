public class Tenants {
    private String firstname;
    private String lastname;
    private String roomnumber;
    private String email;

    public Tenants(String firstname, String lastname, String roomnumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.roomnumber = roomnumber;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;

    }

    public String getRoomnumber() {
        return roomnumber;
    }

    public String getEmail() {
        return email;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Tenants{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", roomnumber='" + roomnumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


