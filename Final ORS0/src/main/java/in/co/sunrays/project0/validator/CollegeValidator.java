package in.co.sunrays.project0.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.co.sunrays.project0.form.CollegeForm;
import in.co.sunrays.project0.util.DataValidator;

// TODO: Auto-generated Javadoc
/**
 * The Class CollegeValidator.
 */
@Component
public class CollegeValidator implements Validator {

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
		CollegeForm form = (CollegeForm) target;
		String collegeName = form.getName();
		
		String mobileNo = form.getPhoneNo();

           if (!DataValidator.isNull(collegeName)) {
			
			if(!DataValidator.isNameWithSpace(collegeName)) {
				errors.rejectValue("name", "error.collegeName.invalid");
			 }
			
		          }
           
   		if (!DataValidator.isNull(mobileNo)) {

			
			 if(DataValidator.isMobLength(mobileNo)){
				errors.rejectValue("phoneNo", "error.mobile");
				}
				
				else if (DataValidator.isPhoneNo(mobileNo)) {
					errors.rejectValue("phoneNo", "error.mobileNo.invalid");
				}

			}
		}
	
		
	}


