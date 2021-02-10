package in.co.sunrays.project0.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import in.co.sunrays.project0.form.SubjectForm;
import in.co.sunrays.project0.util.DataValidator;

// TODO: Auto-generated Javadoc
/**
 * The Class SubjectValidator.
 */
@Component
public class SubjectValidator implements Validator {

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
		SubjectForm form = (SubjectForm) target;
		String subjectName = form.getSubjectName();
		
		   if (!DataValidator.isNull(subjectName)) {
				
				if(!DataValidator.isNameWithSpace(subjectName)) {
				
					errors.rejectValue("subjectName", "error.subjectName.invalid");
				 }
				
			          }
		
	}

}
