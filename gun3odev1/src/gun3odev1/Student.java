package gun3odev1;

public class Student extends User{

    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String address, String cardNumber) {
        super(id, firstName, lastName, address);
        this.cardNumber = cardNumber;
    }
}
