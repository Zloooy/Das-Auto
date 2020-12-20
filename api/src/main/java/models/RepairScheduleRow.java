package models;

import java.util.Date;

public class RepairScheduleRow extends IdentifiedView {
    private Date workStart;
    private Date workEnd;
    private long mechanicId;

    public RepairScheduleRow(long id, Date workStart, Date workEnd, long mechanicId, long carId) {
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

    public long getMechanicId() {
        return mechanicId;
    }

}
