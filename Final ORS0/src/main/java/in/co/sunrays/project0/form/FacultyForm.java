package in.co.sunrays.project0.form;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import in.co.sunrays.project0.dto.BaseDTO;
import in.co.sunrays.project0.dto.FacultyDTO;
import in.co.sunrays.project0.util.Util;

// TODO: Auto-generated Javadoc
/**
 * The Class FacultyForm.
 */
public class FacultyForm extends BaseForm {

	/** The subject id. */
	@NotNull
	private Long subjectId;
	
	/** The college id. */
	@NotNull
	private Long collegeId;
	
	/** The course id. */
	@NotNull
	private Long courseId;
	
	
	/** The subject name. */
	private String subjectName;
	
	
	/** The course name. */
	private String courseName;
	
	/** The college name. */
	private String collegeName;
	
	/** The first name. */
	@NotEmpty
	private String firstName;
	
	/** The last name. */
	@NotEmpty
	private String lastName;
	
	/** The login id. */
	@Email
	@NotEmpty
    private String loginId;
	
	/** The doj. */
	@NotEmpty
	private String doj;
	
	/** The mobile no. */
	@NotEmpty
	private String mobileNo;

	/**
	 * Gets the subject id.
	 *
	 * @return the subject id
	 */
	public Long getSubjectId() {
		return subjectId;
	}

	/**
	 * Sets the subject id.
	 *
	 * @param subjectId the new subject id
	 */
	public void setSubjectId(Long subjectId) {
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
	public Long getCourseId() {
		return courseId;
	}

	/**
	 * Sets the course id.
	 *
	 * @param courseId the new course id
	 */
	public void setCourseId(Long courseId) {
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
	public Long getCollegeId() {
		return collegeId;
	}

	/**
	 * Sets the college id.
	 *
	 * @param collegeId the new college id
	 */
	public void setCollegeId(Long collegeId) {
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
	public String getDoj() {
		return doj;
	}

	/**
	 * Sets the doj.
	 *
	 * @param doj the new doj
	 */
	public void setDoj(String doj) {
		this.doj = doj;
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

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.form.BaseForm#getDto()
	 */
	@Override
	public BaseDTO getDto() {
		FacultyDTO dto=new FacultyDTO();
		dto.setId(id);
		if(collegeId!=null){
		dto.setCollegeId(collegeId);
		}
		dto.setCollegeName(collegeName);
		if(courseId!=null){
		dto.setCourseId(courseId);
		}
		if(subjectId!=null)
		{
		dto.setSubjectId(subjectId);
				
		}
		dto.setCourseName(courseName);
		dto.setSubjectName(subjectName);
		dto.setDoj(Util.getDate(doj));
		dto.setLoginId(loginId);
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setMobileNo(mobileNo);
		dto.setCreatedBy(createdBy);
	    dto.setModifiedBy(modifiedBy);
	    dto.setCreatedDateTime(new Timestamp(new Date().getTime()));
	    dto.setModifiedDateTime(new Timestamp(new Date().getTime()));		
			return dto;
		}


	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.form.BaseForm#populate(in.co.sunrays.project0.dto.BaseDTO)
	 */
	@Override
	public void populate(BaseDTO bDto) {
		FacultyDTO dto=(FacultyDTO) bDto;
		id=dto.getId();
		collegeId=dto.getCollegeId();
		collegeName=dto.getCollegeName();
		courseId=dto.getCourseId();
		courseName=dto.getCourseName();
		subjectId=dto.getSubjectId();
		subjectName=dto.getSubjectName();
		loginId=dto.getLoginId();
		firstName=dto.getFirstName();
		lastName=dto.getLastName();
		mobileNo=dto.getMobileNo();
		doj=Util.getDate(dto.getDoj());
	    createdBy = dto.getCreatedBy();
	    modifiedBy = dto.getModifiedBy();
        if(createdDatetime!=0)
        {
        	createdDatetime = dto.getCreatedDateTime().getTime();	
        }
        
        if(modifiedDatetime!=0)
        {
        	modifiedDatetime = dto.getModifiedDateTime().getTime();	
        }

		
	}
	
	
	
}
