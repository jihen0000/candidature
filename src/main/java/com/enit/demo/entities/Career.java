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
	public class Career {
	    @Id
	    private String carName;
	    private String carDescription;
	    private String userName;
	    private Date startDate;
	    private Date endDate;
	    public Career() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Career(String carName, String carDescription, String userName, Date startDate, Date endDate) {
			super();
			this.carName = carName;
			this.carDescription = carDescription;
			this.userName = userName;
			this.startDate = startDate;
			this.endDate = endDate;
		}

		
		

	  

	    public String getCarDescription() {
	        return carDescription;
	    }

	    public void setCarDescription(String carDescription) {
	        this.carDescription = carDescription;
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    public Date getStartDate() {
	        return startDate;
	    }

	    public Date getEndDate() {
	        return endDate;
	    }

	    public void setEndDate(Date endDate) {
	        this.endDate = endDate;
	    }

		public String getCarName() {
			return carName;
		}

		public void setCarName(String carName) {
			this.carName = carName;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
	    
	}



