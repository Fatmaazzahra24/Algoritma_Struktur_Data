import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(201, "Della"));
        customers.add(new Customer(202, "Victor"));
        customers.add(new Customer(203, "Sarah"));
        customers.add(new Customer(203, "Azzahra"));

        System.out.println("Sebelum diurutkan:");
        for (Customer cust : customers) {
            System.out.println(cust);
        }

        customers.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));

        System.out.println("\nSetelah diurutkan berdasarkan nama:");
        for (Customer cust : customers) {
            System.out.println(cust);
        }
    }
}
