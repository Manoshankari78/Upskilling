public class Main{
    public static void main(String[] args) {
        Student student = new Student(5, "John Doe", 20, "Computer Science");
        StudentDAO studentDAO = new StudentDAO();
        if(studentDAO.insertStudent(student)){
            System.out.println("Student inserted successfully");
        } else {
            System.out.println("Failed to insert student");
        }
        Student updatedStudent = new Student(5, "John Doe", 21, "Software Engineering");
        if(studentDAO.updateStudent(updatedStudent)){
            System.out.println("Student updated successfully");
        } else {
            System.out.println("Failed to update student");
        }
    }
}
