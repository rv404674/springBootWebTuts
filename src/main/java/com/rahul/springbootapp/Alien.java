package com.rahul.springbootapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// NOTE: by default singleton.
// object will only be created once.
// for prototype, a new bean will be created everytime a request is made for that bean.
// and object wont be created automatically, it will be only created when it is requested for.
@Component
@Scope(value="prototype")
public class Alien {
    private int aid;
    private String aName;
    private String tech;

    // constructor
    public Alien(){
        System.out.println("Alien Object created");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show(){
        System.out.println("Hey I am an alien");
    }
}
