import java.util.Scanner;
class Stu_Mark {
    public static void main(String[] args) {
        int mark;  String grade;
		 Scanner g = new Scanner(System.in);
		 mark=g.nextInt();
       
        switch (mark / 10) {
            case 10, 9 -> grade = "A+";
            case 8 -> grade = "A";
            case 7 -> grade = "B+";
            case 6 -> grade = "B";
            case 5 -> grade = "C";
            default -> grade = "F";
        }
        System.out.println("Student Grade: " + grade);
    }
}
