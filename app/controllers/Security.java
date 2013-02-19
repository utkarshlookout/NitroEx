package controllers;
 
import models.*;
 
import play.*;
import play.mvc.*;

public class Security extends Secure.Security {
	
    static boolean authenticate(String username, String password) {
        return true;
    }
    
}
