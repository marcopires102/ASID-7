package com.asidG1.parentservice.studentservice.model.entity.enums;

public enum MarkEnum {
    POOR(2),
    AVERAGE(3),
    GOOD(4),
    VERY_GOOD(5),
    EXCELLENT(6);

    private int value;

    MarkEnum(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }
}