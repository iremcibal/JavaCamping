package Ders4_1.Entities;

import Ders4_1.Abstracts.IEntity;

public class Customer implements IEntity  {
    private int id;
    private String FirstName;
    private String LastName;
    private int Birthday;
    private String NationalityId;

    public Customer(){

    }
    public Customer(int id, String firstName, String lastName, int birthday, String nationalityId) {
        this.id = id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Birthday = birthday;
        this.NationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getBirthday() { return Birthday; }

    public void setBirthday(int birthday) { Birthday = birthday; }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }

}
