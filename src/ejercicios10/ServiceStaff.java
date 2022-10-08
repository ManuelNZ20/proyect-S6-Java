package ejercicios10;

public class ServiceStaff extends Employee{
    private String section;

    public ServiceStaff(String section, String yearIncorporation, short officeNumber, String dni,String name, String lastName, String civilStatus) {
        super(yearIncorporation, officeNumber,dni, name, lastName, civilStatus);
        this.section = section;
    }

    public ServiceStaff()
    {
        this(null, null, (short)0, null, null, null, null);
    }
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    
    
}
