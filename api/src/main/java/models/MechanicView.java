package models;

import java.util.ArrayList;

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
