package com.example.testS.sbmongotutorial.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("student")
public class Student {
    @Id
    private String id;

    @Field(name = "name")
    private String sName;

    @Field(name = "sid")
    @Indexed(unique = true)
    private String sID;

    public Student(String id, String sName, String sID) {
        this.id = id;
        this.sName = sName;
        this.sID = sID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

}
