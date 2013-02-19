import java.net.URI;
import java.net.URISyntaxException;
import java.sql.DriverManager;
import java.sql.SQLException;

import play.*;
import play.jobs.*;
import play.test.*;

import models.*;

import com.mysql.jdbc.Connection;

@OnApplicationStart
public class Bootstrap extends Job {

	public void doJob() {
		// Check if the database is empty
		if(User.count() == 0) {
			Fixtures.loadModels("initial-data.yml");
		}
	}
}
