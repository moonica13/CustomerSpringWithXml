import managers.AdminManager;
import managers.CustomerManager;
import model.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {

            CustomerManager CustomerManager = context.getBean("customerManager", CustomerManager.class);
            System.out.println(CustomerManager.getCustomer());

            AdminManager AdminManager = context.getBean("adminManager", AdminManager.class);
            System.out.println(AdminManager.getAdmin());

        }

    }
}
