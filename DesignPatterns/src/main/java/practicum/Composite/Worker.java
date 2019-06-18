package practicum.Composite;

public class Worker implements IEmployee {
    private String mySpecialty;
    private IEmployee manager;

    public Worker(String specialty) {
        mySpecialty = specialty;
    }

    @Override
    public IEmployee getManager() {
        return this.manager;
    }

    @Override
    public void assignTask(String task) {
        if (task.equals(mySpecialty)) {
            System.out.println("Performing " + task);
        }
    }

    @Override
    public void add(IEmployee employee) {

    }

    @Override
    public void remove(IEmployee employee) {

    }

    @Override
    public IEmployee getChild(int index) {
        return null;
    }

    @Override
    public void setManager(IEmployee manager) {
        this.manager = manager;
    }
}
