/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MohamedSharbudeen
 */
class User {
    private String username,password,firstname,lastname,email;
    private String mobileno;
    
    public User(String username,String password,String firstname,String lastname,String email,String mobileno)
    {
        this.username=username;
        this.password=password;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.mobileno=mobileno;
    }
    public String getusername(){
        return username;
    }
    public String getpassword(){
        return password;
    }
    public String getfirstname(){
        return firstname;
    }
    public String getlastname(){
        return lastname;
    }
    public String getemail(){
        return email;
    }
    public String getmobileno(){
        return mobileno;
    }
}
