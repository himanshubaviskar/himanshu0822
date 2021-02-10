package in.co.sunrays.project0.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.co.sunrays.project0.form.MarksheetForm;
import in.co.sunrays.project0.util.DataValidator;

// TODO: Auto-generated Javadoc
/**
 * The Class MarksheetValidator.
 */
@Component
public class MarksheetValidator implements Validator {

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
		
		MarksheetForm form = (MarksheetForm) target;
		
		String rollNo=form.getRollNo();
		
		String physics =String.valueOf(form.getPhysics());
		
		String chemistry =String.valueOf(form.getChemistry());
		
		
		String maths =String.valueOf(form.getMaths());
			
		
		if(!DataValidator.isNull(rollNo))
		{
			if(DataValidator.isRollNO(rollNo)){
				 errors.rejectValue("rollNo", "error.rollNo.invalid");
			}	
		}
		

		
		if (!DataValidator.isMarks(physics)) 
        {
    		errors.rejectValue("physics", "error.physics.invalid");
        }
         else if (!DataValidator.isMark(physics)) {
        	
        	 errors.rejectValue("physics", "error.physics.invalid1");
        }
		
		
        if (!DataValidator.isMarks(chemistry)) 
        {
    		errors.rejectValue("chemistry", "error.physics.invalid");
        }
         else if (!DataValidator.isMark(chemistry)) {
        	
        	 errors.rejectValue("chemistry", "error.physics.invalid1");
        }
		
        
        if (!DataValidator.isMarks(maths)) 
        {
    		errors.rejectValue("maths", "error.physics.invalid");
        }
         else if (!DataValidator.isMark(maths)) {
        	
        	 errors.rejectValue("maths", "error.physics.invalid1");
        }
		
        
        
		
	}

	
	
}
