package com.gd.student.service.report;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@RequiredArgsConstructor
@Getter
public enum ReportType {
    FULL,
    SHORT;

    public static ReportType fromString(String value) {
        if (value.equals("0")) {
            return SHORT;
        } else {
            return FULL;
        }

    }


}
