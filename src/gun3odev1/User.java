package gun3odev1;

public class User {
    
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private Course[] courses;



    
    public int getId() {
        return this.id;
    }
    
    void setId(int id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public User() {
        
    }

    public User(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    

}
