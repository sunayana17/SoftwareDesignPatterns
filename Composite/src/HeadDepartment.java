import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{

    private int id;
    private String name;

    private List<Department> childDepartments;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        for(Department dept: this.childDepartments){
            dept.printDepartmentName();
        }

    }
    public void addDepartment(Department department){
        this.childDepartments.add(department);
    }

    public  void removeDepartment(Department department){
        this.childDepartments.remove(department);
    }
}
