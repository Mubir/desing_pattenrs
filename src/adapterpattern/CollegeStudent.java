package adapterpattern;

public class CollegeStudent {
    String name;
    String surName;
    String email;

    CollegeStudent(String name,String surName,String email)
    {
        this.name = name;
        this.surName = surName;
        this.email = email;
    }

    
    public String getName() {
        return this.name;
    }

    
    public String getSurname() {
        return this.surName;
    }

    public String getEmail() {
        return this.email;
    }
}
