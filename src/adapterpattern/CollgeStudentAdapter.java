package adapterpattern;

public class CollgeStudentAdapter implements Student{
    CollegeStudent cStd;

     CollgeStudentAdapter(CollegeStudent std)
    {
        this.cStd = std;
    }

    @Override
    public String getName() {
        
        return this.cStd.name;
    }

    @Override
    public String getSurname() {
        
        return this.cStd.surName;
    }

    @Override
    public String getEmail() {
        
        return this.cStd.email;
    }
    
}
