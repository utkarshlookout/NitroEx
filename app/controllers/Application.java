package controllers;

import play.*;
import play.db.DB;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	System.out.println("Inside index funcation");
        render();
    }
    
    public static void signup()	{
    	System.out.println("Inside signup funcation");
    	render();
    }
    
    public static void uploadFile() {
    	System.out.println("Inside upload funcation");
        render();
    }
    
    public static void homepage()	{
    	System.out.println("Inside homepage funcation");
    	render();
    }
    
    public static void registerUser()	{
    	User user = new User(params.get("username"),params.get("password"));
    	user.create();
    }
    
    public static void users() {
        List<User> users = User.findAll();
        renderJSON(users);
    }

}