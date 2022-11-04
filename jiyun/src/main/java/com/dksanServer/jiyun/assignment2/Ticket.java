package com.dksanServer.jiyun.assignment2;

import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Getter
public class Ticket {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String time;
    private String airplane;

    @ColumnDefault("false")
    private boolean isDeleted;

    public Ticket() {

    }

    public Ticket(Long id, String name, String time, String airplane, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.airplane = airplane;
        this.isDeleted = isDeleted;
    }


}
