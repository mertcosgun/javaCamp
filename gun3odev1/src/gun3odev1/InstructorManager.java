package gun3odev1;

public class InstructorManager extends  UserManager {
    @Override
    void addUser(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " Eğitmen başarıyla eklendi.");
    }

    void addCourse(Instructor instructor, Course course) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " yeni kurs ekledi: " + course.getName());
    }

    void addMultipleCourse(Instructor instructor,Course[] courses) {
        for(Course course : courses) {
            addCourse(instructor, course);
        }
    }

    @Override
    void watchCourse(User user, Course course) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + course.getName() + " izlemeye başladı.");
    }

    void removeCourse(Instructor instructor, Course course) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " eğitmen " + course.getName() + " Kursunu kaldırdı");
    }

}
