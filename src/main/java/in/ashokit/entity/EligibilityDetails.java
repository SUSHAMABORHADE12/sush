package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
//@Table(name="ELIGIBILITY_DETAILS")
public class EligibilityDetails {
	
	@Id
	@Column(name="ELIG_ID")
	int elig_id;
	
	@Column(name="USER_NAME")
	String name;
	
	@Column(name="USER_MOBILE")
	int mobile;
	
	@Column(name="USER_EMAIL")
	String email;
	
	@Column(name="USER_GENDER")
	char gender;
	
	@Column(name="USER_SSN")
	int ssn;
	
	@Column(name="PLAN_NAME")
	String planName;
	
	@Column(name="PLAN_STATUS")
	String planStatus;
	
	@Column(name="PLAN_START_DATE")
	private LocalDate planStartDate;

	@Column(name="PLAN_END_DATE")
	private LocalDate planEndDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="CREATED_DATE")
	@CreationTimestamp
	private LocalDate createdDate;

	@Column(name="UPDATED_DATE")
	@UpdateTimestamp
	private LocalDate updatedDate;
	

}
