package com.mycompany.employee.employe;

public class Employee {


    private String name;
    private String surename;
    private String idnp;
    private gender genn = null;
    // private Date 

    private enum gender {
        MALE, FEMALE;
    }

    public Employee(String name, String surename, String idnp, String gen) {

        this.name = name;
        this.surename = surename;
        this.idnp = idnp;
        genn = genn.valueOf(gen);
    
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public String getIdnp() {
        return idnp;
    }

    public gender getGenn() {
        return genn;
    }

    @Override
    public String toString() {
        return " Nume: " + this.name + "\n Prenume: " + this.surename + "\n Idnp: "
                + this.idnp + "\ngender " + this.genn;
    }

    public void setGenn(String gen) {
        genn = genn.valueOf(gen);
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

}
