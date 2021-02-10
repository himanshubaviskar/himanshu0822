package in.co.sunrays.project0.form;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

import in.co.sunrays.project0.dto.BaseDTO;
import in.co.sunrays.project0.dto.CourseDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class CourseForm.
 */
public class CourseForm extends BaseForm {

	/** The course name. */
	@NotEmpty
	private String courseName;
	
	/** The description. */
	@NotEmpty
	private String description;
	
	
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
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.form.BaseForm#getDto()
	 */
	@Override
	public BaseDTO getDto() {
		CourseDTO dto=new CourseDTO();
    	dto.setId(id);
    	dto.setCourseName(courseName);
        dto.setDescription(description);
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
	  CourseDTO dto=(CourseDTO) bDto;
  	  id=dto.getId();
  	  courseName=dto.getCourseName();
  	  description=dto.getDescription();
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
