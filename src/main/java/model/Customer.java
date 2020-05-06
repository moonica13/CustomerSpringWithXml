package model;

public class Customer {

    private int id;
    private String customerName;
    private String country;
    private int age;
    private int zip;

    public Customer(int id, String customerName, String country, int age, int zip) {
        this.id = id;
        this.customerName = customerName;
        this.country = country;
        this.age = age;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Customer {" +
                " id = " + id +
                ", name = " + customerName +
                ", country = " + country +
                ", age = " + age +
                ", zip code = " + zip +
                " }";
    }

}
