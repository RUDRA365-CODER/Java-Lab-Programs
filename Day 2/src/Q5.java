import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    // method to read student details
    void read(Scanner sc) {
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    // method to display student details
    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name   : " + name);
        System.out.println("CGPA   : " + cgpa);
        System.out.println("----------------------");
    }
}

class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        // create and read student objects
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            s[i] = new Student();
            s[i].read(sc);
        }

        // display all students
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        // find student with lowest CGPA
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[minIndex].cgpa) {
                minIndex = i;
            }
        }

        System.out.println("Student with lowest CGPA: " + s[minIndex].name);
    }
}

