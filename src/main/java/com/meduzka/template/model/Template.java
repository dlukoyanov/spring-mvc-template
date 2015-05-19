package com.meduzka.template.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Template {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long template_id;

    private String somedata;


    public Template() {
    }

    public Template(String somedata) {
        this.somedata = somedata;
    }

    public String getSomedata() {
        return somedata;
    }

    public void setSomedata(String somedata) {
        this.somedata = somedata;
    }
}
