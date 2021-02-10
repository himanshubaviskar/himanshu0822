package in.co.sunrays.project0.form;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import in.co.sunrays.project0.dto.BaseDTO;
import in.co.sunrays.project0.dto.TimetableDTO;
import in.co.sunrays.project0.util.Util;

// TODO: Auto-generated Javadoc
/**
 * The Class TimetableForm.
 */
public class TimetableForm extends BaseForm {


	/** The course id. */
	@NotNull
	private Long courseId;
	
	
	/** The course name. */
	private String courseName;
	
	/** The subject id. */
	@NotNull
	private Long subjectId;
	
	
	/** The subject name. */
	private String subjectName;
	
	/** The exam date. */
	@NotEmpty
	private String examDate;
	
	/** The exam time. */
	@NotEmpty
	private String examTime;
	
	/** The semester. */
	@NotEmpty
	private String semester;
	
	
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
	 * Gets the exam date.
	 *
	 * @return the exam date
	 */
	public String getExamDate() {
		return examDate;
	}

	/**
	 * Sets the exam date.
	 *
	 * @param examDate the new exam date
	 */
	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	/**
	 * Gets the exam time.
	 *
	 * @return the exam time
	 */
	public String getExamTime() {
		return examTime;
	}

	/**
	 * Sets the exam time.
	 *
	 * @param examTime the new exam time
	 */
	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	/**
	 * Gets the semester.
	 *
	 * @return the semester
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * Sets the semester.
	 *
	 * @param semester the new semester
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.form.BaseForm#getDto()
	 */
	@Override
	public BaseDTO getDto() {
		TimetableDTO dto=new TimetableDTO();
		dto.setId(id);
		if(courseId!=null)
		{
		dto.setCourseId(courseId);	
		}
        dto.setCourseName(courseName);
        if(subjectId!=null)
        {
        dto.setSubjectId(subjectId);	
        }
        dto.setSubjectName(subjectName);
	    dto.setExamDate(Util.getDate(examDate));      
		dto.setSemester(semester);
		dto.setExamTime(examTime);
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

		TimetableDTO dto=(TimetableDTO) bDto;
		id=dto.getId();
		courseId=dto.getCourseId();
		subjectId=dto.getSubjectId();
		courseName=dto.getCourseName();
		subjectName=dto.getSubjectName();
		examTime=dto.getExamTime();
		examDate=Util.getDate(dto.getExamDate()); 
		semester=dto.getSemester();
		createdBy=dto.getCreatedBy();
	   	modifiedBy=dto.getModifiedBy();
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
