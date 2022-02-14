package methods;

public class Test {
    public static void main(String[] args) {
        Student ivo = new Student("KST", 123456);

        System.out.println(ivo.getFaculty());
        System.out.println(ivo.getFacultyNumber());

        System.out.println(ivo.takeExam(true));

        String ivoTakingExam = ivo.takeExam(true);

        int numberOfsubjectForIvo = ivo.getNumberOfSubjects(12);
        int doubleTheWork = ivo.getNumberOfSubjects(12) * 2;

        System.out.println(numberOfsubjectForIvo);
        System.out.println(doubleTheWork);

        Student.setUniversity("Sofia University");
        System.out.println(Student.getUniversity());

        Student facultyOnly = new Student("Engineer");
        Student facultyNumberOnly = new Student(12345);

        ivo.setLectureDay(WeekDays.THU);

        //method reference Todo check project build versions
        //Student::setUniversity("Sofia University");
        sum(average(2,6), average(7,5));
    }

    public static int average(int a, int b){
        return 10;
    }

    public static int sum(int a, int b){
        return 20;
    }
}
