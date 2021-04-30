package gun3odev1;

public class Instructor extends  User {

    private String IBAN;

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public Instructor() {
    }

    public Instructor(int id, String firstName, String lastName, String address, String IBAN) {
        super(id, firstName, lastName, address);
        this.IBAN = IBAN;
    }
}
