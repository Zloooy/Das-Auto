package com.example.server.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="repair_schedule_row")
public class RepairScheduleRow extends Identified {
    @Column(name="work_start")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date workStart;
    @Column(name="work_end")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date workEnd;
    @ManyToMany
    @JoinTable(
            name="mechanics_schedule_rows_relation",
            joinColumns = @JoinColumn(name = "mechanic_id"),
            inverseJoinColumns = @JoinColumn(name = "schedule_id")
    )
    private List<Mechanic> mechanics;

    public RepairScheduleRow(long id, Date workStart, Date workEnd, long carId) {
        super(id);
        this.workStart = workStart;
        this.workEnd = workEnd;
    }

    public RepairScheduleRow() {
        super(1);
    }

    public Date getWorkStart() {
        return workStart;
    }

    public Date getWorkEnd() {
        return workEnd;
    }

    public List<Mechanic> getMechanics()
    {
        return mechanics;
    }

}
