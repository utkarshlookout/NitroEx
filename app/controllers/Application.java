package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void uploadFile(String myName) {
    	System.out.println("myName variable : "+myName);
        //render(myName);
    }
    
    public static void users() {
        List<User> users = User.findAll();
        renderJSON(users);
    }
}