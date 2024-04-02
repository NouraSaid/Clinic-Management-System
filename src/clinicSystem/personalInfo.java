package clinicSystem;

import java.util.Objects;

public class personalInfo {

    Integer id;
    Integer age;
    String bloodType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        personalInfo that = (personalInfo) o;
        return Objects.equals(age, that.age) && Objects.equals(bloodType, that.bloodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, bloodType);
    }

    @Override
    public String toString() {
        return "personalInfo{" +
                "id=" + id +
                ", age=" + age +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}


