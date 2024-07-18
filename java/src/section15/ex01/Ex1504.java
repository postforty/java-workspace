package section15.ex01;

class Customer {
    private int customerId;
    private String customerName;

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public int hashCode() {
        return customerId;
    }
}

public class Ex1504 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setCustomerId(123);
        c1.setCustomerName("김일남");
        System.out.println(c1.hashCode());
    }
}
