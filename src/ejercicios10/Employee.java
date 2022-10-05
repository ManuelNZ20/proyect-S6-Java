package ejercicios10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person {

    private Date yearIncorporation;
    private short officeNumber;
    private static final SimpleDateFormat formatt = new SimpleDateFormat("dd/MMM/aa");

    public Employee(String yearIncorporation, short officeNumber,String dni, String name, String lastName, String civilStatus) {
        super(dni,name, lastName, civilStatus);
        try {
            this.yearIncorporation = formatt.parse(yearIncorporation);
            this.officeNumber = officeNumber;
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public Date getYearIncorporation() {
        return yearIncorporation;
    }
    
    public String yearIncorporation(){
        return getYearIncorporation().toString();
    }
    public void setYearIncorporation(Date yearIncorporation) {
        this.yearIncorporation = yearIncorporation;
    }

    public short getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(short officeNumber) {
        this.officeNumber = officeNumber;
    }
    

}
