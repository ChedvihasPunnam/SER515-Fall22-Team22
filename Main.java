public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.addSyllabus(new Syllabus());
        Course course = new Course();
        course.setCourseName("SER 515");

        Syllabus syllabus = instructor.modifySyllabus(new Syllabus());
        System.out.println("Syllabus for "+ course.getCourseName() +" is modified");

        Course course_2 = new Course();
        course_2.setCourseName("SER 501");

        Syllabus syllabus_2 = instructor.modifySyllabus(new Syllabus());
        System.out.println("Syllabus for "+ course_2.getCourseName() +" is modified");
    }
}