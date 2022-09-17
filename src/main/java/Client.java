public class Client {
    private String name;
    private String address;

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client " + name + ", address: " + address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
