package gun3odev1;

public class UserManager {

    void addUser(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " başarıyla eklendi.");
    }
    
    void addMultipleUser(User[] users) {
        for (User user : users) {

            addUser(user);
            
        }
    }
    
    void watchCourse(User user, Course course) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + course.getName() + " kursunu izlemeye başladı.");
    }


}
