package university;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class University {
    //array list for students, courses and faculty members
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<FacultyMember> facultyMembers = new ArrayList<>();

    public void menu() {
        //scanner method for menu
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        int choice;
        while (repeat) {
            System.out.println("Menu:");
            System.out.println("1. Show all Students");
            System.out.println("2. Show all Courses");
            System.out.println("3. Show all Faculty Members");
            System.out.println("4. Add Student");
            System.out.println("5. Add a new Course");
            System.out.println("6. Add Faculty Member");
            System.out.println("7. Delete Student");
            System.out.println("8. Delete Faculty Member");
            System.out.println("9. Add Course in a Student's Course Schedule");
            System.out.println("10. Add Course in a Faculty Member's Teaching Schedule");
            System.out.println("11. Delete Course in a Student's Course Schedule");
            System.out.println("12. Delete Course in a Faculty Member's Teaching Schedule");
            System.out.println("13. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            //switch statement for the select choices
                switch (choice) {
                    case 1:
                        showStudents();
                        break;
                    case 2:
                        showCourses();
                        break;
                    case 3:
                        showFacultyMembers();
                        break;
                    case 4:
                        addStudent(scanner);
                        break;
                    case 5:
                        addCourse(scanner);
                        break;
                    case 6:
                        addFacultyMember(scanner);
                        break;
                    case 7:
                        deleteStudent(scanner);
                        break;
                    case 8:
                        deleteFacultyMember(scanner);
                        break;
                    case 9:
                        addCourseInStudent(scanner);
                        break;
                    case 10:
                        addCourseInFacultyMember(scanner);
                        break;
                    case 11:
                        deleteCourseInStudent(scanner);
                        break;
                    case 12:
                        deleteCourseInFacultyMember(scanner);
                        break;
                    case 13:
                        System.out.println("Aborting!!!");
                        repeat = false;
                        break;
                    default:
                        System.out.println("Invalid input!!!");
                        break;
                }
            }
        }

        public void showStudents () {
            //for loop for show students
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i).toString());
            }
        }

        public void showCourses () {
            //for loop for show courses
            for (int i = 0; i < courses.size(); i++) {
                System.out.println(courses.get(i).toString());
            }
        }

        public void showFacultyMembers () {
            //for loop for the showing for show faculty mmembers
            for (int i = 0; i < facultyMembers.size(); i++) {
                System.out.println(facultyMembers.get(i).toString());
            }
        }

        public int getStudent ( int cin){
            //for loop for getter student
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getCin() == cin) {
                    return i;
                }
            }
            return -1;
        }

        public void addStudent (Scanner scanner){
            System.out.print("Enter Student CIN: ");
            int cin = scanner.nextInt();
            if (getStudent(cin) != -1) {
                System.out.println("Invalid CIN!! Student with the same CIN already exists.");
                return;
            }
            System.out.print("Enter Student Name: ");
            String name = scanner.next();
            System.out.print("Enter Street no: ");
            int streetNo = scanner.nextInt();
            System.out.print("Enter Street Name: ");
            String streetName = scanner.next();
            System.out.print("Enter City: ");
            String city = scanner.next();
            System.out.print("Enter State: ");
            String state = scanner.next();
            System.out.print("Enter Country: ");
            String country = scanner.next();

            students.add(new Student(name, new Address(streetNo, streetName, city, state, country), cin));
        }

        public void insertStudent (Student student){
            int cin = student.getCin();
            if (getStudent(cin) == -1) {
                students.add(student);
            } else {
                System.out.println("Student with same CIN already exists.");
            }
        }


        public int getCourse (String cid){
            for (int i = 0; i < courses.size(); i++) {
                if (courses.get(i).getCourseId().equals(cid)) {
                    return i;
                }
            }
            return -1;
        }

        public void addCourse (Scanner scanner){
            System.out.print("Enter Course Id: ");
            String cid = scanner.next();
            if (getCourse(cid) != -1) {
                System.out.println("Invalid Course Id!! Course with the same Id already exists.");
                return;
            }
            System.out.print("Enter Number of Units: ");
            int noOfUnits = scanner.nextInt();

            courses.add(new Course(cid, noOfUnits));
        }

        public void insertCourse (Course course){
            String cid = course.getCourseId();
            if (getCourse(cid) == -1) {
                courses.add(course);
            } else {
                System.out.println("Course with same CourseId already exists.");
            }
        }


        public int getFacultyMember ( int eid){
            for (int i = 0; i < facultyMembers.size(); i++) {
                if (facultyMembers.get(i).getEmployeeId() == eid) {
                    return i;
                }
            }
            return -1;
        }

        public void addFacultyMember (Scanner scanner){
            System.out.print("Enter FacultyMember Employee Id: ");
            int eid = scanner.nextInt();
            if (getFacultyMember(eid) != -1) {
                System.out.println("Invalid Employee Id!! FacultyMember with the same Id already exists.");
                return;
            }
            System.out.print("Enter FacultyMember Name: ");
            String name = scanner.next();
            System.out.print("Enter Street no: ");
            int streetNo = scanner.nextInt();
            System.out.print("Enter Street Name: ");
            String streetName = scanner.next();
            System.out.print("Enter City: ");
            String city = scanner.next();
            System.out.print("Enter State: ");
            String state = scanner.next();
            System.out.print("Enter Country: ");
            String country = scanner.next();

            facultyMembers.add(new FacultyMember(name, new Address(streetNo, streetName, city, state, country), eid));
        }

        public void insertFacultyMember (FacultyMember facultyMember){
            int eid = facultyMember.getEmployeeId();
            if (getFacultyMember(eid) == -1) {
                facultyMembers.add(facultyMember);
            } else {
                System.out.println("FacultyMember with same Employee Id already exists.");
            }
        }


        public void deleteStudent (Scanner scanner){
            System.out.print("Enter Student CIN which needs to be removed: ");
            int cin = scanner.nextInt();
            Iterator itr = students.iterator();
            while (itr.hasNext()) {
                Student student = (Student) itr.next();
                if (student.getCin() == cin) {
                    itr.remove();
                    return;
                }
            }
        }


        public void deleteFacultyMember (Scanner scanner){
            System.out.print("Enter FacultyMember's Employee Id which needs to be removed: ");
            int eid = scanner.nextInt();
            Iterator itr = facultyMembers.iterator();
            while (itr.hasNext()) {
                FacultyMember facultyMember = (FacultyMember) itr.next();
                if (facultyMember.getEmployeeId() == eid) {
                    itr.remove();
                    return;
                }
            }
        }


        public void addCourseInStudent (Scanner scanner){
            System.out.print("Enter Student CIN in which course needs to be added: ");
            int cin = scanner.nextInt();

            int pos = getStudent(cin);
            if (pos == -1) {
                System.out.println("Invalid CIN!! Student with the given CIN doesn't exists.");
                return;
            }

            System.out.println(courses);
            System.out.println("Enter the course Id from the above courses: ");
            String cid = scanner.next();
            int coursePos = getCourse(cid);
            if (coursePos != -1) {
                students.get(pos).addCourse(courses.get(coursePos));
            } else {
                System.out.println("No such course exists!!");
            }
        }


        public void addCourseInFacultyMember (Scanner scanner){
            System.out.print("Enter FacultyMember employee id in which course needs to be added: ");
            int eid = scanner.nextInt();

            int pos = getFacultyMember(eid);
            if (pos == -1) {
                System.out.println("Invalid Employee Id!! Faculty Member with the given id doesn't exists.");
                return;
            }

            System.out.println(courses);
            System.out.println("Enter the course Id from the above courses: ");
            String cid = scanner.next();
            int coursePos = getCourse(cid);
            if (coursePos != -1) {
                students.get(pos).addCourse(courses.get(coursePos));
            } else {
                System.out.println("No such course exists!!");
            }
        }

        public void deleteCourseInStudent (Scanner scanner){
            System.out.print("Enter Student CIN in which course needs to be deleted: ");
            int cin = scanner.nextInt();

            int pos = getStudent(cin);
            if (pos == -1) {
                System.out.println("Invalid CIN!! Student with the given CIN doesn't exists.");
                return;
            }

            System.out.println(students.get(pos).getCourseSchedule());
            System.out.println("Enter the course Id from the above courses that needs to be deleted: ");
            String cid = scanner.next();
            students.get(pos).removeCourse(cid);
        }


        public void deleteCourseInFacultyMember (Scanner scanner){
            System.out.print("Enter FacultyMember employee id in which course needs to be deleted: ");
            int eid = scanner.nextInt();

            int pos = getFacultyMember(eid);
            if (pos == -1) {
                System.out.println("Invalid employee id!! FacultyMember with the given id doesn't exists.");
                return;
            }

            System.out.println(facultyMembers.get(pos).getTeachingSchedule());
            System.out.println("Enter the course Id from the above courses that needs to be deleted: ");
            String cid = scanner.next();
            facultyMembers.get(pos).removeCourse(cid);
        }

    }

