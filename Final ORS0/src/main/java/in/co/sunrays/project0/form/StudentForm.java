package in.co.sunrays.project0.form;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import in.co.sunrays.project0.dto.BaseDTO;
import in.co.sunrays.project0.dto.StudentDTO;
import in.co.sunrays.project0.util.Util;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentForm.
 */
public class StudentForm extends BaseForm {

	/** The first name. */
	@NotEmpty
	private String firstName;
	
	/** The last name. */
	@NotEmpty
	private String lastName;
	
	/** The dob. */
	@NotEmpty
	private String dob;
	
	/** The mobile no. */
	@NotEmpty
	private String mobileNo;
	
	/** The Email id. */
	@Email
    @NotEmpty
	private String EmailId;
	
    /** The college id. */
    @NotNull
	private Long collegeId;
	
	/** The college name. */
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
	public String getDob() {
		return dob;
	}

	/**
	 * Sets the dob.
	 *
	 * @param dob the new dob
	 */
	public void setDob(String dob) {
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

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.form.BaseForm#getDto()
	 */
	@Override
	public BaseDTO getDto() {
		StudentDTO dto = new StudentDTO();
        dto.setId(id);
        dto.setFirstName(firstName);
        dto.setLastName(lastName);
        dto.setDob(Util.getDate(dob));
        dto.setMobileNo(mobileNo);
        dto.setEmailId(EmailId);
        if(collegeId!=null){
        	
        dto.setCollegeId(collegeId);
        }
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
        StudentDTO dto = (StudentDTO) bDto;
        id = dto.getId();
        firstName = dto.getFirstName();
        lastName = dto.getLastName();
        dob = Util.getDate(dto.getDob());
        mobileNo = dto.getMobileNo();
        EmailId = dto.getEmailId();
        collegeId = dto.getCollegeId();
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
