package PBO221.M221005.LatihanInheritance3;

import java.lang.reflect.Constructor;

public class employee extends person {
    String department, title;

    // Constructor dari super class (person)
    public employee(String id, String name, String address, String department, String title) {
        super(id, name, address);
        this.department = department;
        this.title = title;
    }

    // getter
    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }

    public void getData() {
        System.out.println(
                "ID\t\t: " + super.getId() + "\nName\t\t: " + super.getName() + "\nAddress\t\t: " + super.getAddress()
                        + "\nDepartment\t: " + getDepartment()
                        + "\nTitle\t\t: " + getTitle());
    }
}
