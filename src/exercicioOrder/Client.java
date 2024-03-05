package exercicioOrder;

public class Client {
    private String name;
    private String email;
    private String birthDate;

    public Client(String name, String email, String birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String toString() {
        return String.format("%s (%s) - %s", this.name, this.birthDate, this.email);
    }


}
