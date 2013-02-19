package models;

import javax.persistence.Entity;
import javax.persistence.Table;

import play.db.jpa.Model;

@Entity
@Table(name="nitro_files")
public class File extends Model{

		public int fileId;
	    public String fileName;
	    public String user_email;
	    public String tag;
	    public String s3_url;

	    public File(int fieldId, String fileName, String user_email, String tag, String s3_url) {
	        this.fileId = fieldId;
	    	this.fileName = fileName;
	        this.tag = tag;
	        this.s3_url = s3_url;
	        this.user_email = user_email;
	    }
	
}
