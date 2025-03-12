import java.util.*;

public class Student {
    private int roll_num;
    private String name;
    private int num_of_sub;
    private int[] marks;
    private int totalMarks;

    Student() {
        roll_num = 0;
        name = "NA";
        num_of_sub = 0;
        marks = new int[0];
        totalMarks = 0;
    }

    Student(int r, String n, int s) {
        roll_num = r;
        name = n;
        num_of_sub = s;
        marks = new int[s];
        totalMarks = 0;
    }

    public void setMarks() {
        Scanner sc = new Scanner(System.in);
        totalMarks = 0;
        for (int i = 0; i < num_of_sub; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
    }

    public void display() {
        System.out.println("Roll Number: " + roll_num);
        System.out.println("Name: " + name);
        System.out.println("Number of subjects: " + num_of_sub);
        System.out.println("Total Marks: " + totalMarks);
        float percent = ((float) totalMarks / (num_of_sub * 100)) * 100;
        System.out.println("Percentage :" + percent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];
        s[0] = new Student(123, "ram", 5);
        s[1] = new Student(43, "rohan", 4);
        s[2] = new Student(34, "abhay", 4);

        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ": ");
            s[i].setMarks();
        }

        for (int i = 0; i < s.length; i++) {
            s[i].display();

        }
    }
}