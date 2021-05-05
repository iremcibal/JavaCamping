package Ders4_2.Entities;

import Ders4_2.IEntity;

public class Player implements IEntity {
    private int id;
    private String name;
    private String surName;
    private int Birthday;
    private String NationalityId;

    public Player(){

    }
    public Player(int id, String name, String surName, int birthday, String nationalityId) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        Birthday = birthday;
        NationalityId = nationalityId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getBirthday() {
        return Birthday;
    }

    public void setBirthday(int birthday) {
        Birthday = birthday;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}
