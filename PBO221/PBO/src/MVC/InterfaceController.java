package MVC;


import java.util.ArrayList;

public interface InterfaceController {
//    berisi method atau fungsi yang ada di controller
    
    void insert(String fullName, String sex, String competency, String department, String workStartDate);
    void update(int i, String fullName, String sex, String competency, String department, String workStartDate);
    void delete(int j);
    
    ArrayList<Model> getArrayList();
    void setArrayList(ArrayList<Model> listData);
    int getArrayListSize();
}
