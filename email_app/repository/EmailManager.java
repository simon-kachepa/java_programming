package repository;

import java.util.ArrayList;
import java.util.List;

import model.Email;

public class EmailManager {

    private List<Email> emailRegistry = new ArrayList<Email>();
    private boolean isChange = false;

    public EmailManager(List<Email> emailRegistry){
        this.emailRegistry = emailRegistry;
    }

    public void addEmail(Email newEmail){
        if (newEmail == null){
            throw new IllegalArgumentException("ERROR: Could not add new email to registry");
        }
        emailRegistry.add(newEmail);
        isChange = true;
    }

    public void removeEmail(Email email){
        if (emailRegistry.contains(email)){
            emailRegistry.remove(email);
            isChange = true;
        }
        else{
            throw new IllegalArgumentException("ERROR: Could not find email: " + email);
        }
    }
    
    public void searchEmail(String lastName, int departmentCode){
       List<Email> matches = emailRegistry.stream().
        filter(email -> lastName.equals(email.getLastName()) && departmentCode == email.getDepartmentCode()).
        toList();

        if (matches.isEmpty()){
            throw new IllegalArgumentException("ERROR: no matching email found");
        }
        else {
            matches.forEach(System.out::println);
        }
    }
     
    public void displayAllEmails(){
        emailRegistry.forEach(System.out::println);
    }

    public boolean hasChange(){
        return this.isChange;
    }
    
}
