package entity;
// Generated Mar 4, 2019, 5:23:51 PM by Hibernate Tools 4.3.1



/**
 * Projectemployee generated by hbm2java
 */
public class Projectemployee  implements java.io.Serializable {


     private ProjectemployeeId id;
     private Employee employee;
     private Proyecto proyecto;

    public Projectemployee() {
    }

	
    public Projectemployee(ProjectemployeeId id) {
        this.id = id;
    }
    public Projectemployee(ProjectemployeeId id, Employee employee, Proyecto proyecto) {
       this.id = id;
       this.employee = employee;
       this.proyecto = proyecto;
    }
   
    public ProjectemployeeId getId() {
        return this.id;
    }
    
    public void setId(ProjectemployeeId id) {
        this.id = id;
    }
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Proyecto getProyecto() {
        return this.proyecto;
    }
    
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }




}

