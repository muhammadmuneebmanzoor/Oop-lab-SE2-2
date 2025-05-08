class Course {
    protected String courseID, courseTitle;
    protected int creditHours;

    public Course(String id, String title, int hrs) {
        courseID = id; courseTitle = title; creditHours = hrs;
    }

    public void showCourseDetails() {
        System.out.println("ID: " + courseID + ", Title: " + courseTitle + ", Hours: " + creditHours);
    }
}

class OnlineCourse extends Course {
    String platform, instructor;
    int duration;

    public OnlineCourse(String id, String title, int hrs, String plat, String instr, int dur) {
        super(id, title, hrs);
        platform = plat; instructor = instr; duration = dur;
    }

    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Platform: " + platform + ", Instructor: " + instructor + ", Weeks: " + duration);
    }
}

class OnsiteCourse extends Course {
    String location, room, instructor;

    public OnsiteCourse(String id, String title, int hrs, String loc, String rm, String instr) {
        super(id, title, hrs);
        location = loc; room = rm; instructor = instr;
    }

    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Location: " + location + ", Room: " + room + ", Instructor: " + instructor);
    }
}

class Feedback {
    public void submitFeedback(String comment) {
        System.out.println("Comment: " + comment);
    }

    public void submitFeedback(int rating) {
        System.out.println("Rating: " + rating);
    }

    public void submitFeedback(String comment, int rating) {
        System.out.println("Comment: " + comment + ", Rating: " + rating);
    }
}

public class Main {
    public static void main(String[] args) {
        Course c1 = new OnlineCourse("C101", "Java", 3, "Hamza", "Ali", 6);
        Course c2 = new OnsiteCourse("C202", "DBMS", 4, "Campus", "A101", "Akbar");

        c1.showCourseDetails();
        System.out.println("---");
        c2.showCourseDetails();
        System.out.println("---");

        Feedback fb = new Feedback();
        fb.submitFeedback("Great course!");
        fb.submitFeedback(5);
        fb.submitFeedback("Excellent!", 5);
    }
}
