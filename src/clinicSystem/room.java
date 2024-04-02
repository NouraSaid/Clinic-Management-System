package clinicSystem;

import java.util.Objects;
import java.util.SplittableRandom;

public class room {

    Integer id;
    patientName PatientName;
    doctoerName  DoctoerName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public patientName getPatientName() {
        return PatientName;
    }

    public void setPatientName(patientName patientName) {
        PatientName = patientName;
    }

    public doctoerName getDoctoerName() {
        return DoctoerName;
    }

    public void setDoctoerName(doctoerName doctoerName) {
        DoctoerName = doctoerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        room room = (room) o;
        return Objects.equals(PatientName, room.PatientName) && Objects.equals(DoctoerName, room.DoctoerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PatientName, DoctoerName);
    }

    @Override
    public String toString() {
        return "room{" +
                "id=" + id +
                ", PatientName=" + PatientName +
                ", DoctoerName=" + DoctoerName +
                '}';
    }
}
