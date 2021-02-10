package in.co.sunrays.project0.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import in.co.sunrays.project0.form.CourseForm;
import in.co.sunrays.project0.util.DataValidator;

// TODO: Auto-generated Javadoc
/**
 * The Class CourseValidator.
 */
@Component
public class CourseValidator implements Validator {

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object target, Errors errors) {
		CourseForm form = (CourseForm) target;
		String courseName = form.getCourseName();
		
		   if (!DataValidator.isNull(courseName)) {
				
				if(!DataValidator.isNameWithSpace(courseName)) {
				
			errors.rejectValue("courseName", "error.courseName.invalid");
				 }
				
			          }
	    
	}

}
