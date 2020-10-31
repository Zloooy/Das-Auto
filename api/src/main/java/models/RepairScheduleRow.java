package models;

import java.util.Date;

public class RepairScheduleRow extends Identified<RepairScheduleRow>{
    private Date workStart;
    private Date workEnd;
    private Id<Mechanic> mechanicId;

    public RepairScheduleRow(Id<RepairScheduleRow> id, Date workStart, Date workEnd, Id<Mechanic> mechanicId, Id<Car> carId) {
        super(id);
        this.workStart = workStart;
        this.workEnd = workEnd;
        this.mechanicId = mechanicId;
    }
    public Date getWorkStart() {
        return workStart;
    }

    public Date getWorkEnd() {
        return workEnd;
    }

    public Id<Mechanic> getMechanicId() {
        return mechanicId;
    }

}
