package com.epam.jb2.entities.notebook;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private String name;
    private String coverPath;

    private List<Note> notes = new ArrayList<Note>();
}
