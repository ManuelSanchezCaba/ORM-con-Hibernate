package entity;
// Generated Mar 4, 2019, 5:23:51 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Phone generated by hbm2java
 */
public class Phone  implements java.io.Serializable {


     private BigDecimal phoneid;
     private Employee employee;
     private String tipo;
     private String phonenumber;
     private String areacode;

    public Phone() {
    }

	
    public Phone(BigDecimal phoneid, String tipo, String phonenumber, String areacode) {
        this.phoneid = phoneid;
        this.tipo = tipo;
        this.phonenumber = phonenumber;
        this.areacode = areacode;
    }
    public Phone(BigDecimal phoneid, Employee employee, String tipo, String phonenumber, String areacode) {
       this.phoneid = phoneid;
       this.employee = employee;
       this.tipo = tipo;
       this.phonenumber = phonenumber;
       this.areacode = areacode;
    }
   
    public BigDecimal getPhoneid() {
        return this.phoneid;
    }
    
    public void setPhoneid(BigDecimal phoneid) {
        this.phoneid = phoneid;
    }
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getPhonenumber() {
        return this.phonenumber;
    }
    
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getAreacode() {
        return this.areacode;
    }
    
    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }




}


