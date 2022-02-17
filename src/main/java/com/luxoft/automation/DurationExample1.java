package com.luxoft.automation;

import java.time.*;
import java.time.temporal.ChronoUnit;
public class DurationExample1 {
    public static void main(String[] args) {
        Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);
        System.out.println(d.get(ChronoUnit.SECONDS));
    }
}
