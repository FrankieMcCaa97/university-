package university;

//declaring java class to import statement
import java.util.ArrayList;
import java.util.Iterator;

public class Student extends Person {
    private int cin;
    ArrayList<Course> courseSchedule = new ArrayList<>();

    public Student(String name, Address address, int in) {
        //Super constructor
        super(name, address);
        this.cin = cin;
    }

    //get cin
    public int getCin() {
        return cin;
    }
    //set sin
    public void setCin(int cin) {
        this.cin = cin;
    }

    public ArrayList<Course> getCourseSchedule() {
        return courseSchedule;
    }

    public Course getCourse(String Id) {
        //for loop
        for (int i = 0; i < courseSchedule.size(); i++) {
            if (courseSchedule.get(i).getCourseId().equals(Id)) {
                return courseSchedule.get(i);
            }
        }
        return null;
    }

    public void addCourse(Course course){
        //if else statement for course
        if(getCourse(course.getCourseId()) == null){
            courseSchedule.add(course);
        }else{
            System.out.println("Course is already in the schedule.");
        }
    }

    public void removeCourse(String id){
        Iterator itr = courseSchedule.iterator();
        //while loop
        while (itr.hasNext()){
            Course course = (Course) itr.next();
            if(course.getCourseId().equals(id)){
                itr.remove();
                return;
            }
        }
    }

    //Override method for student
    @Override
    public String toString(){
        return "Student{" + "cin=" + cin + ", name='" + name + '\'' + ", address=" + address + ", courseSchedule=" + courseSchedule + '}';
    }
}