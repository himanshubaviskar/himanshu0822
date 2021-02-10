package in.co.sunrays.project0.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.co.sunrays.project0.form.ChangePasswordForm;
import in.co.sunrays.project0.util.DataValidator;

// TODO: Auto-generated Javadoc
/**
 * The Class ChangePassowrdValidator.
 */
@Component
public class ChangePassowrdValidator implements Validator {

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
		ChangePasswordForm form = (ChangePasswordForm) target;
		String oldPassword =form.getOldPassword();
		String newpassword = form.getNewPassword();
		String confirmPassword = form.getConfirmPassword();
		
		if (!DataValidator.isNull(oldPassword)) {
			if (!DataValidator.isPassword(oldPassword)) {
				errors.rejectValue("oldPassword", "error.password");
			}
		}
		
		if (!DataValidator.isNull(newpassword)) {
			if (oldPassword.equals(newpassword)) 
			{
				errors.rejectValue("newPassword", "error.oldnewpassword");
			}
			
		else if (!DataValidator.isPassword(newpassword)) {
				errors.rejectValue("newPassword", "error.password");
			}
		}
		
        if (!DataValidator.isNull(confirmPassword)) {
			
			if (!newpassword.equals(confirmPassword) && !"".equals(confirmPassword)) 
			{
				errors.rejectValue("confirmPassword", "error.confirmPassword");
			}
			
		}
		
		
	}

}
