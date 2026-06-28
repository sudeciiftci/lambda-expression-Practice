@FunctionalInterface
interface GradeChecker{
    String check(int grade);
}

public class StudentGradeChecker {

    public static void main(String[] args) {

        GradeChecker gradeChecker = grade -> {

            if (grade >= 90) {
                return "Excellent";
            } else if (grade >= 75) {
                return "Good";
            } else if (grade >= 50) {
                return "Pass";
            } else {
                return "Fail";
            }

        };

        System.out.println(gradeChecker.check(45));
        System.out.println(gradeChecker.check(60));
        System.out.println(gradeChecker.check(80));
        System.out.println(gradeChecker.check(95));

    }
}