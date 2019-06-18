package practicum.Composite;

public class Client {
    public void doSomething() {
        // Create a CEO (the top of the company hierarchy)
        IEmployee ceo = new Manager();
        // Add 3 managers beneath the CEO
        IEmployee shipping = new Manager();
        shipping.setManager(ceo);
        ceo.add(shipping);
        IEmployee manufacturing = new Manager();
        manufacturing.setManager(ceo);
        ceo.add(manufacturing);
        IEmployee sales = new Manager();
        sales.setManager(ceo);
        ceo.add(sales);
        // Add 3 workers beneath each manager, give each one a unique specialty task
        // they perform
        IEmployee worker = new Worker("Find_Client");
        worker.setManager(sales);
        sales.add(worker);
        worker = new Worker("Collect_Money");
        worker.setManager(sales);
        sales.add(worker);
        worker = new Worker("Create_Account");
        worker.setManager(sales);
        sales.add(worker);
        worker = new Worker("Build");
        worker.setManager(manufacturing);
        sales.add(worker);
        worker = new Worker("Prep");
        worker.setManager(manufacturing);
        sales.add(worker);
        worker = new Worker("Store");
        worker.setManager(manufacturing);
        sales.add(worker);
        worker = new Worker("Mail");
        worker.setManager(shipping);
        sales.add(worker);
        worker = new Worker("Pick");
        worker.setManager(shipping);
        sales.add(worker);
        worker = new Worker("Cancel");
        worker.setManager(shipping);
        sales.add(worker);
        // Assign all of the unique tasks to the CEO.
        ceo.assignTask("Find_Client");
        ceo.assignTask("Collect_Money");
        ceo.assignTask("Create_Account");
        ceo.assignTask("Build");
        ceo.assignTask("Prep");
        ceo.assignTask("Store");
        ceo.assignTask("Mail");
        ceo.assignTask("Pick");
        ceo.assignTask("Cancel");
    }
}
