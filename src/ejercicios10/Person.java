package ejercicios10;

public abstract class Person {
   private String dni;
   private String name;
   private String lastName;
   private String civilStatus;

    public Person(String dni,String name, String lastName, String civilStatus) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.civilStatus = civilStatus;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }
   
}
