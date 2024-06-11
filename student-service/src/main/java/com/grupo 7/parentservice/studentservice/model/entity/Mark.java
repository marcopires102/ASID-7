package com.grupo7.parentservice.studentservice.model.entity;

import com.grupo7.parentservice.studentservice.model.entity.base.BaseEntityWithIdLong;
import com.grupo7.parentservice.studentservice.model.entity.enums.MarkEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "marks")
public class Mark extends BaseEntityWithIdLong {

    @Enumerated(EnumType.STRING)
    private MarkEnum mark;

    public MarkEnum getMark() {
        return mark;
    }

    public void setMark(MarkEnum mark) {
        this.mark = mark;
    }
}
