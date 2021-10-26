package com.epam.jb2.entities.habittracker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Habit {
    private String name;
    private Date startDate;
    private Date endDate;
    private List<Date> completeList = new ArrayList<>();
}
