package clinicSystem;

import java.util.List;
import java.util.Objects;

public class DoctoerName {
    Integer id;
     String firstName;
     String lastName;
     String Specialization;
     String time;
     List<patientName> Names;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        doctoerName that = (doctoerName) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(Specialization, that.Specialization) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, Specialization, time);
    }

    @Override
    public String toString() {
        return "doctoerName{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Specialization='" + Specialization + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
