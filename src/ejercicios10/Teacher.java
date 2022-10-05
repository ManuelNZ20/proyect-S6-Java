package ejercicios10;

public class Teacher extends Employee{
    private String departament;
    private String gradoAcademico;
    private String especialidad;

    public Teacher(String departament, String gradoAcademico, String especialidad, String yearIncorporation, short officeNumber, String dni, String name, String lastName, String civilStatus) {
        super(yearIncorporation, officeNumber, dni, name, lastName, civilStatus);
        this.departament = departament;
        this.gradoAcademico = gradoAcademico;
        this.especialidad = especialidad;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
