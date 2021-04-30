package gun3odev1;

public class StudentManager extends  UserManager{
    private Course[] studentCourses = {};
    @Override
    void  addUser(User user) {
        super.addUser(user);
        System.out.println("Öğrenci başarıyla eklendi.");
    }


    @Override
    void watchCourse(User user, Course course) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + course.getName() + " kursunu izlemeye başladı.");
    }
}
