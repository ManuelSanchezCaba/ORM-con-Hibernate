package entity;
// Generated Mar 4, 2019, 5:23:51 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * ProjectemployeeId generated by hbm2java
 */
public class ProjectemployeeId  implements java.io.Serializable {


     private BigDecimal projectid;
     private BigDecimal employeeid;

    public ProjectemployeeId() {
    }

    public ProjectemployeeId(BigDecimal projectid, BigDecimal employeeid) {
       this.projectid = projectid;
       this.employeeid = employeeid;
    }
   
    public BigDecimal getProjectid() {
        return this.projectid;
    }
    
    public void setProjectid(BigDecimal projectid) {
        this.projectid = projectid;
    }
    public BigDecimal getEmployeeid() {
        return this.employeeid;
    }
    
    public void setEmployeeid(BigDecimal employeeid) {
        this.employeeid = employeeid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProjectemployeeId) ) return false;
		 ProjectemployeeId castOther = ( ProjectemployeeId ) other; 
         
		 return ( (this.getProjectid()==castOther.getProjectid()) || ( this.getProjectid()!=null && castOther.getProjectid()!=null && this.getProjectid().equals(castOther.getProjectid()) ) )
 && ( (this.getEmployeeid()==castOther.getEmployeeid()) || ( this.getEmployeeid()!=null && castOther.getEmployeeid()!=null && this.getEmployeeid().equals(castOther.getEmployeeid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getProjectid() == null ? 0 : this.getProjectid().hashCode() );
         result = 37 * result + ( getEmployeeid() == null ? 0 : this.getEmployeeid().hashCode() );
         return result;
   }   


}


