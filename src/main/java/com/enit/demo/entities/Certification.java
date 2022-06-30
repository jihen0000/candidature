package com.enit.demo.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
@CrossOrigin(origins = "*")
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Certification {
    @Id
    private String cerName;
    private String cerDescription;
    private Date obtentionCert;
    private Date expirationCert;
    private String userName;
  //  private String filename;


    /*
    public Certification(String cerName, String cerDescription, Date obtentionCert, Date expirationCert,
			String userName, String filename) {
		super();
		this.cerName = cerName;
		this.cerDescription = cerDescription;
		this.obtentionCert = obtentionCert;
		this.expirationCert = expirationCert;
		this.userName = userName;
		this.filename = filename;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}*/

	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certification(String cerName, String cerDescription, Date obtentionCert, Date expirationCert,
			String userName) {
		super();
		this.cerName = cerName;
		this.cerDescription = cerDescription;
		this.obtentionCert = obtentionCert;
		this.expirationCert = expirationCert;
		this.userName = userName;
	}

	

	public String getCerName() {
        return cerName;
    }

    public void setCerName(String cerName) {
        this.cerName = cerName;
    }

    public String getCerDescription() {
        return cerDescription;
    }

    public void setCerDescription(String cerDescription) {
        this.cerDescription = cerDescription;
    }

    public Date getObtentionCert() {
        return obtentionCert;
    }

    public void setObtentionCert(Date obtentionCert) {
        this.obtentionCert = obtentionCert;
    }

    public Date getExpirationCert() {
        return expirationCert;
    }

    public void setExpirationCert(Date expirationCert) {
        this.expirationCert = expirationCert;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

	
	}

    

