class Student {
    String name;
    int marks;
    int RollNo;
}


public class ObjectsArray {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Aniket";
        s1.RollNo = 1;
        s1.marks = 80;

        Student s2 = new Student();
        s2.name = "Sam";
        s2.RollNo = 2;
        s2.marks = 83;
        
        Student s3 = new Student();
        s3.name = "Parth";
        s3.RollNo = 3;
        s3.marks = 50;

        Student students[] = new Student[3];  // This is array which stores refrence to our objects which we have to create manually.
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int index = 0; index < students.length; index++) {
            System.out.println(students[index].name + " : " + students[index].marks);
        }

        // Enhanced for loop
        for(Student stud: students) {
            System.out.println(stud.name + " : " + stud.RollNo);
        }
        
    }
}
