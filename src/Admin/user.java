/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;

/**
 *
 * @author student.admin
 */
class user {
   private int UserID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String Role;
    private String Status;
    
    public user(int UserID,String FirstName,String LastName,String Email,String Password,String Role, String Status){
        this.UserID = UserID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
        this. Role = Role;
        this. Status = Status;
       
        
    }
    public int getid(){
        return UserID;
        
    }
    public String getFristName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getEmail(){
        return Email;
    }
   public String getPassword(){
       return Password;
   }
    public String getRole(){
       return Role;
   } 
    public String getStatus(){
       return Status;
   }
}
