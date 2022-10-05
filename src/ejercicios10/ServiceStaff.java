package ejercicios10;

public class ServiceStaff extends Employee{
    private String seccion;

    public ServiceStaff(String seccion, String yearIncorporation, short officeNumber, String dni,String name, String lastName, String civilStatus) {
        super(yearIncorporation, officeNumber,dni, name, lastName, civilStatus);
        this.seccion = seccion;
    }

    public ServiceStaff()
    {
        this(null, null, (short)0, null, null, null, null);
    }
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    
}
