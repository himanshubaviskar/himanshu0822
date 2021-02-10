package in.co.sunrays.project0.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.transaction.annotation.Transactional;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentDTO.
 */
@Entity
@Table(name = "ST_STUDENT")
public class StudentDTO extends BaseDTO {

/** First Name of Student. */
@Column(name="FIRST_NAME",length=255)
private String firstName;

/** Last Name of Student. */
@Column(name="LAST_NAME",length=255)
private String lastName;

/** Date of Birth of Student. */
@Column(name="DOB")
private Date dob;

/** Mobileno of Student. */
@Column(name="MOBILE_NO",length=255)
private String mobileNo;

/** Email of Student. */

@Column(name="EMAIL_ID",length=255)
private String EmailId;

/** CollegeId of Student. */
@Column(name="COLLEGE_ID",length=50)
private long collegeId;

/** College name of Student. */
@Transient
private String collegeName;

/**
 * Gets the first name.
 *
 * @return the first name
 */
public String getFirstName() {
	return firstName;
}

/**
 * Sets the first name.
 *
 * @param firstName the new first name
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * Gets the last name.
 *
 * @return the last name
 */
public String getLastName() {
	return lastName;
}

/**
 * Sets the last name.
 *
 * @param lastName the new last name
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * Gets the dob.
 *
 * @return the dob
 */
public Date getDob() {
	return dob;
}

/**
 * Sets the dob.
 *
 * @param dob the new dob
 */
public void setDob(Date dob) {
	this.dob = dob;
}

/**
 * Gets the mobile no.
 *
 * @return the mobile no
 */
public String getMobileNo() {
	return mobileNo;
}

/**
 * Sets the mobile no.
 *
 * @param mobileNo the new mobile no
 */
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

/**
 * Gets the email id.
 *
 * @return the email id
 */
public String getEmailId() {
	return EmailId;
}

/**
 * Sets the email id.
 *
 * @param emailId the new email id
 */
public void setEmailId(String emailId) {
	EmailId = emailId;
}

/**
 * Gets the college id.
 *
 * @return the college id
 */
public long getCollegeId() {
	return collegeId;
}

/**
 * Sets the college id.
 *
 * @param collegeId the new college id
 */
public void setCollegeId(long collegeId) {
	this.collegeId = collegeId;
}



/**
 * Gets the college name.
 *
 * @return the college name
 */
public String getCollegeName() {
	return collegeName;
}

/**
 * Sets the college name.
 *
 * @param collegeName the new college name
 */
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}

/* (non-Javadoc)
 * @see in.co.sunrays.project0.dto.DropdownList#getKey()
 */
public String getKey() {
	// TODO Auto-generated method stub
	 return id + "";
}

/* (non-Javadoc)
 * @see in.co.sunrays.project0.dto.DropdownList#getValue()
 */
public String getValue() {
	// TODO Auto-generated method stub
	return firstName + " " + lastName;
}



	
}
