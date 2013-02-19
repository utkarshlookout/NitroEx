package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
@Table(name="nitro_users")
public class User extends Model {

    public String email;
    public String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
}