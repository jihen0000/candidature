package com.enit.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@CrossOrigin(origins = "*")
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Skill {
	
		@Id
		private String comName;
		
	    private String userName;
	    private String comDescription;
	    
	    
	    
		public Skill() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Skill(String comName, String comDescription, String userName) {
			super();
			this.comName = comName;
			this.comDescription = comDescription;
			this.userName = userName;
		}
		public String getComName() {
			return comName;
		}
		public void setComName(String comName) {
			this.comName = comName;
		}
		public String getComDescription() {
			return comDescription;
		}
		public void setComDescription(String comDescription) {
			this.comDescription = comDescription;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}

	    

}
