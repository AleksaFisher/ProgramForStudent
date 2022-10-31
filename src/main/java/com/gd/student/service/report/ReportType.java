package com.gd.student.service.report;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
@Getter
public enum ReportType {
    FULL,
    SHORT;

    public static void fromString() {
        ReportType.fromString();
    }
}
