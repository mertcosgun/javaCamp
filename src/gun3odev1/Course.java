package gun3odev1;

public class Course {

    private int id;
    private String name;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }



}
