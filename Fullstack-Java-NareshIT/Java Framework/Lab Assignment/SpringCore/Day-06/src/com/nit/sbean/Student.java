package com.nit.sbean;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
    private Library library;

    @Autowired
    public void setLibrary(Library library) {
        this.library = library;
    }

    public void visitLibrary() {
        String today = LocalDate.now().toString();
        library.grantAccess("registered", today);
    }
}