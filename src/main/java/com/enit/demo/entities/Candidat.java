package com.enit.demo.entities;



import lombok.Data;

import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "*")
@Document
@Data
@ToString

public class Candidat{
	@Id
    private String userName;
    private String candidatName;
    protected String userMail;
    private String password;
    protected String userCountry;
    private int candidatCin;
    private int candidatTelephone;
    private String candidatPrenom;
    private int activationCode;
    private boolean isEmailVerified;

    
    


	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Candidat(String userName, String candidatName, String userMail, String password, String userCountry,
			int candidatCin, int candidatTelephone, String candidatPrenom, int activationCode,
			boolean isEmailVerified) {
		super();
		this.userName = userName;
		this.candidatName = candidatName;
		this.userMail = userMail;
		this.password = password;
		this.userCountry = userCountry;
		this.candidatCin = candidatCin;
		this.candidatTelephone = candidatTelephone;
		this.candidatPrenom = candidatPrenom;
		this.activationCode = activationCode;
		this.isEmailVerified = isEmailVerified;
	}





	public String getUserName() {
		return userName;
	}





	public void setUserName(String userName) {
		this.userName = userName;
	}





	public String getCandidatName() {
		return candidatName;
	}





	public void setCandidatName(String candidatName) {
		this.candidatName = candidatName;
	}





	public String getUserMail() {
		return userMail;
	}





	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getUserCountry() {
		return userCountry;
	}





	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}





	public int getCandidatCin() {
		return candidatCin;
	}





	public void setCandidatCin(int candidatCin) {
		this.candidatCin = candidatCin;
	}





	public int getCandidatTelephone() {
		return candidatTelephone;
	}





	public void setCandidatTelephone(int candidatTelephone) {
		this.candidatTelephone = candidatTelephone;
	}





	public String getCandidatPrenom() {
		return candidatPrenom;
	}





	public void setCandidatPrenom(String candidatPrenom) {
		this.candidatPrenom = candidatPrenom;
	}





	public int getActivationCode() {
		return activationCode;
	}





	public void setActivationCode(int activationCode) {
		this.activationCode = activationCode;
	}





	public boolean isEmailVerified() {
		return isEmailVerified;
	}





	public void setEmailVerified(boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}





	public Candidat(int candidatCin, int candidatTelephone, String candidatPrenom,int activationCode, boolean isEmailVerified) {
        this.candidatCin = candidatCin;
        this.candidatTelephone = candidatTelephone;
        this.candidatPrenom = candidatPrenom;
        this.activationCode = activationCode;
        this.isEmailVerified = isEmailVerified;
    }
}
