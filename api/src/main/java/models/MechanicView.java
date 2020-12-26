package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MechanicView extends IdentifiedView {
    private String surname;
    private String nameMiddleName;
    //private ArrayList<MechanicSpecializationView> specializations;
    //private ArrayList<RepairScheduleRow> scheduleRows;

    public String getSurname() {
        return surname;
    }

    public String getNameMiddleName() {
        return nameMiddleName;
    }

    /*public ArrayList<MechanicSpecializationView> getSpecializations() {
        return specializations;
    }*/
    /*public ArrayList<RepairScheduleRow> getScheduleRows()
    {}*/

    public MechanicView(long id, String surname, String nameMiddleName, ArrayList<Long> specializations) {
        super(id);
        this.surname = surname;
        this.nameMiddleName = nameMiddleName;
        //this.specializations = specializations;
    }

}
