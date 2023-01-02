package university;

//declaring java class to import statement
import java.util.ArrayList;
import java.util.Iterator;

public class FacultyMember extends Person {
    private int employeeId;
    private ArrayList<Course> teachingSchedule = new ArrayList<>();

    public FacultyMember(String name, Address address, int employeeId) {
        //super constructor
        super(name, address);
        this.employeeId = employeeId;
    }
    //get employee id
    public int getEmployeeId() {
        return employeeId;
    }

    //getter for teaching schedule
    public ArrayList<Course> getTeachingSchedule() {
        return teachingSchedule;
    }
    //getter for course
    public Course getCourse(String id) {
        //for loop
        for (int i = 0; i < teachingSchedule.size(); i++) {
            if (teachingSchedule.get(i).getCourseId().equals(id)) {
                return teachingSchedule.get(i);
            }
        }
        return null;
    }

    public void addCourse(Course course) {
        //if else statement for course
        if (getCourse(course.getCourseId()) == null) {
            teachingSchedule.add(course);
        } else {
            System.out.println("Course is already in the schedule.");
        }
    }

    public void removeCourse(String id) {
        Iterator itr = teachingSchedule.iterator();
        //while loop for removing a course
        while (itr.hasNext()) {
            Course course = (Course) itr.next();
            if (course.getCourseId().equals(id)) {
                itr.remove();
                return;
            }
        }
    }

    // override method for faculty member
    @Override
    public String toString() {
        return "FacultyMember{" + "employeeId =" + employeeId + ", name = '" + name + '\'' + ", address = " + address + ", teachingSchedule = " + teachingSchedule + '}';
    }
}