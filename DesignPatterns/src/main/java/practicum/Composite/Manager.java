package practicum.Composite;

import java.util.ArrayList;

public class Manager implements IEmployee {

    ArrayList<IEmployee> employees;
    IEmployee manager;

    @Override
    public IEmployee getManager() {
        return this.manager;
    }

    @Override
    public void assignTask(String task) {
        for (IEmployee employee : employees) {
            employee.assignTask(task);
        }
    }

    @Override
    public void add(IEmployee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(IEmployee employee) {
        employees.remove(employee);
    }

    @Override
    public IEmployee getChild(int index) {
        return employees.get(index);
    }

    @Override
    public void setManager(IEmployee manager) {
        this.manager = manager;
    }

}
