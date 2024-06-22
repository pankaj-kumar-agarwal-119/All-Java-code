//Education platform
interface Course {
    int MAX_ENROLLMENT = 30;//final + static + public
    int MIN_INROLLMENT = 1;
    void enrollStudent(String studentName);
    default void printCourseDetails(){
        System.out.println("The course details goes here...");
    }
    static boolean validateCourseId(String courseId){
      return true;
    }
    interface CourseDetails{
        String getCourseName();
        int getEnrollStudents();
    }
}
class OnlineCourse implements Course {
    private String courseName;
    private int enrolledStudents;

    OnlineCourse(String courseName){
     this.courseName = courseName;
     this.enrolledStudents = 0;
    }
    public void enrollStudent(String studentName){
     if(this.enrolledStudents > MAX_ENROLLMENT){
        System.out.println("The Course is full. Cannot enroll : "+studentName);
     }
     else{
        this.enrolledStudents++;
        System.out.println("The student "+studentName+" got enrolled");
     }
    }
    class OnlineCourseDetails implements Course.CourseDetails{
        @Override
        public String getCourseName(){
            return courseName;
        }
        @Override
        public int getEnrollStudents(){
            return enrolledStudents;
        }
    }

    public Course.CourseDetails getCourseDetails() {
        return new OnlineCourseDetails();
    }
}

class Prog18 {
    public static void main(String args[]){
        OnlineCourse course = new OnlineCourse("Java programming");
        //the course name get attached to object with 0 enrollment
        course.enrollStudent("Mohan");
        course.enrollStudent("SOhan");
        course.printCourseDetails();
       
        Course.CourseDetails details = course.getCourseDetails();
        System.out.println("Coursename : "+details.getCourseName());
        System.out.println("CourEnrolled Students : "+details.getEnrollStudents());
    }
}