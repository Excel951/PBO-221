package MVC;


import java.util.ArrayList;

public class Controller implements InterfaceController {

    ArrayList<Model> listData = new ArrayList<Model>();
    
    Model m = new Model();
    
    public Controller() {
        
    }
    
    public Controller(ArrayList<Model> listData) {
        this.listData=listData;
    }
    
    @Override
    public void insert(String fullName, String sex, String competency, String department, String workStartDate) {
//        simpan sementara ke constructor
        m = new Model(fullName, sex, competency, department, workStartDate);
//        simpan ke arraylist
        listData.add(m);
    }

    @Override
    public void update(int i, String fullName, String sex, String competency, String department, String workStartDate) {
        m = new Model(fullName, sex, competency, department, workStartDate);
        listData.get(i).setFullName(m.getFullName());
        listData.get(i).setCompetency(m.getCompetency());
        listData.get(i).setDepartment(m.getDepartment());
        listData.get(i).setSex(m.getSex());
        listData.get(i).setWorkStartDate(m.getWorkStartDate());
    }

    @Override
    public void delete(int j) {
        listData.remove(j);
    }

    @Override
    public ArrayList<Model> getArrayList() {
        return listData;
    }

    @Override
    public void setArrayList(ArrayList<Model> listData) {
        this.listData=listData;
    }

    @Override
    public int getArrayListSize() {
        return listData.size();
    }
//    fungsi insert, update, delete --> arraylist in dimensi
    
}
