package university;

public class Course {
    private String courseId;
    private int noOfUnits;

    //public constructor for course id and number of units
    public Course(String courseId, int noOfUnits){
        this.courseId = courseId;
        this.noOfUnits = noOfUnits;
    }

    //getter for course id
    public String getCourseId(){
        return courseId;
    }

    //setter course id
    public void setCourseId(String courseId){
        this.courseId = courseId;
    }
    //getter for number of units
    public int getNoOfUnits(){
        return noOfUnits;
    }
    // setter for number of units
    public void setNoOfUnits(int noOfUnits){
        this.noOfUnits = noOfUnits;
    }

    //Override method for course
    @Override
    public String toString(){
        return "Course(" + "courseId='" + courseId + '\'' + ", noOfUnits=" + noOfUnits + '}';
    }
}
