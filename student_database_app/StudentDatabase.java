import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StudentDatabase {
    
    String filePath = "students.txt";

    //Method to get the from a file
    public ArrayList<Student> getStudents(){
        try(FileInputStream inputStream = new FileInputStream(filePath);
            ObjectInputStream objInput = new ObjectInputStream(inputStream)){

                return (ArrayList<Student>)objInput.readObject();
        }
        catch(FileNotFoundException e){
            System.out.println("LOG: No existing Registry file found. Starting fresh");
            return new ArrayList<>();
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("ERROR: Could not read students from file " + filePath + ". Starting fresh");
            return new ArrayList<>();
        }
    }

    //Method to save student list to a file
    public void saveStudents(ArrayList<Student> updatedStudentList){
        try(FileOutputStream outputStream = new FileOutputStream(filePath);
            ObjectOutputStream objOut = new ObjectOutputStream(outputStream)){
                objOut.writeObject(updatedStudentList);
                System.out.println("SUCCESS: DATABASE successfully saved to file");
        }
        catch(IOException e){
            System.out.println("ERROR: Could not save DATABASE to File: " + filePath);
        }
    }
}
