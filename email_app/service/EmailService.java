package service;

import model.Email;
import repository.EmailManager;

public class EmailService {
    
    private final EmailManager emailRegistry;

    public EmailService(EmailManager emailRegistry){
        this.emailRegistry = emailRegistry;
    }

    public void createNewEmail(String firstName, String lastName){
        try{
            Email newEmail = new Email(firstName, lastName);
            emailRegistry.addEmail(newEmail);
            System.out.println("SUCCESS: new email added to Registry");

        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("ERROR: Could not add new email to registry");
        }
    }
}
