package adapterpattern;

public class SchoolStudent implements Student {

    String name;
    String surName;
    String email;

     SchoolStudent(String name,String surName,String email)
    {
        this.name = name;
        this.surName = surName;
        this.email = email;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.surName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
    
    
}
