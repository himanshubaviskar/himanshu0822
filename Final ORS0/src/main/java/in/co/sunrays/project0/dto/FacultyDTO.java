package in.co.sunrays.project0.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

// TODO: Auto-generated Javadoc
/**
 * The Class FacultyDTO.
 */
@Entity
@Table(name = "ST_FACULTY")
public class FacultyDTO extends BaseDTO{

	/** The subject id. */
	@Column(name = "SUBJECT_ID" ,length = 50)
	private long subjectId;
	
	/** The subject name. */
	@Transient
	/** The subject name. */
	private String subjectName;
	
	/** The course id. */
	@Column(name = "COURSE_ID" ,length = 50)
	private long courseId;
	
	/** The course name. */
	@Transient
	/** The course name. */
	private String courseName;
	
	
	/** The college id. */
	@Column(name = "COLLEGE_ID" ,length = 50)
	private long collegeId;
	
	/** The college name. */
	@Transient
	/** The college name. */
	private String collegeName;
	
	
	/** The first name. */
	@Column(name = "FIRST_NAME" ,length =255)
	private String firstName;
	
	/** The last name. */
	@Column(name = "LAST_NAME" ,length =255)
	private String lastName;
	
	
	/** The mobile no. */
	@Column(name = "MOBILE_NO" ,length =255)
	private String mobileNo;
	

	
    /** The login id. */
	@Column(name = "LOGIN_ID" ,length =255)
    private String loginId;
    
    
    /** The doj. */
	@Column(name = "DOJ" ,length =255)
    private Date doj;


	/**
	 * Gets the subject id.
	 *
	 * @return the subject id
	 */
	public long getSubjectId() {
		return subjectId;
	}


	/**
	 * Sets the subject id.
	 *
	 * @param subjectId the new subject id
	 */
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}


	/**
	 * Gets the subject name.
	 *
	 * @return the subject name
	 */
	public String getSubjectName() {
		return subjectName;
	}


	/**
	 * Sets the subject name.
	 *
	 * @param subjectName the new subject name
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	/**
	 * Gets the course id.
	 *
	 * @return the course id
	 */
	public long getCourseId() {
		return courseId;
	}


	/**
	 * Sets the course id.
	 *
	 * @param courseId the new course id
	 */
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}


	/**
	 * Gets the course name.
	 *
	 * @return the course name
	 */
	public String getCourseName() {
		return courseName;
	}


	/**
	 * Sets the course name.
	 *
	 * @param courseName the new course name
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
	 * Gets the login id.
	 *
	 * @return the login id
	 */
	public String getLoginId() {
		return loginId;
	}


	/**
	 * Sets the login id.
	 *
	 * @param loginId the new login id
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}


	/**
	 * Gets the doj.
	 *
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}


	/**
	 * Sets the doj.
	 *
	 * @param doj the new doj
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}


	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dto.DropdownList#getKey()
	 */
	public String getKey() {
		// TODO Auto-generated method stub
		return id+"";
	}


	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.dto.DropdownList#getValue()
	 */
	public String getValue() {
		// TODO Auto-generated method stub
		return firstName+" "+lastName;
	}

	
	
}
