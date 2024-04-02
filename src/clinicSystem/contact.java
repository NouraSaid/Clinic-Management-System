package clinicSystem;

import java.util.Objects;

public class contact {
    Integer id;
    String phoneNum;
    String emailAdress;
    String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        contact contact = (contact) o;
        return Objects.equals(phoneNum, contact.phoneNum) && Objects.equals(emailAdress, contact.emailAdress) && Objects.equals(location, contact.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNum, emailAdress, location);

    }

    @Override
    public String toString() {
        return "contact{" +
                "phoneNum='" + phoneNum + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
