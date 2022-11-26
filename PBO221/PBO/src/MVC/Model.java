package MVC;

public class Model {
//    berisi constructor, setter, getter, attribute
    String fullName, sex, competency, department, workStartDate;

    public Model() {
        
    }
    
    public Model(String fullName, String sex, String competency, String department, String workStartDate) {
        this.fullName = fullName;
        this.sex = sex;
        this.competency = competency;
        this.department = department;
        this.workStartDate = workStartDate;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setWorkStartDate(String workStartDate) {
        this.workStartDate = workStartDate;
    }

    
    
    public String getFullName() {
        return fullName;
    }

    public String getSex() {
        return sex;
    }

    public String getCompetency() {
        return competency;
    }

    public String getDepartment() {
        return department;
    }

    public String getWorkStartDate() {
        return workStartDate;
    }
    
}
