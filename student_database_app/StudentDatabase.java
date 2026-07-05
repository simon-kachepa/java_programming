import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StudentDatabase {
    
    ArrayList<Student> studentRegistry;
    String filePath = "/Users/rutendogono/Desktop/students.txt";

    public StudentDatabase(StudentRegistry studentRegistry){
        this.studentRegistry = studentRegistry.getStudentList();
    }

    //Method to get the from a file
    public void readStudents(){
        try(FileInputStream inputStream = new FileInputStream(filePath);
            ObjectInputStream objInput = new ObjectInputStream(inputStream)){

                this.studentRegistry = (ArrayList<Student>)objInput.readObject();
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR: File: " + filePath + " not found");
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR: ");
        }
        catch(IOException e){
            System.out.println("ERROR: Could not read students from file: " + filePath);
        }
    }

    //Method to save student list to a file
    public void saveStudents(){
        try(FileOutputStream outputStream = new FileOutputStream(filePath);
            ObjectOutputStream objOut = new ObjectOutputStream(outputStream)){
                objOut.writeObject(this.studentRegistry);
        }
        catch(FileNotFoundException e){
            System.out.println("ERROR: File: " + filePath + " not found");
        }
        catch(IOException e){
            System.out.println("ERROR: Could not save File: " + filePath);
        }
        catch(Exception e){
            System.out.println("ERROR: Something went wrong");
        }
    }
}
