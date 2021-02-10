package in.co.sunrays.project0.form;

import org.hibernate.validator.constraints.NotEmpty;

import in.co.sunrays.project0.dto.BaseDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class ChangePasswordForm.
 */
public class ChangePasswordForm extends BaseForm {

	/** The old password. */
	@NotEmpty
	private String oldPassword;
	
	/** The new password. */
	@NotEmpty
	private String newPassword;
	
	/** The confirm password. */
	@NotEmpty
	private String confirmPassword;
	

	/**
	 * Gets the old password.
	 *
	 * @return the old password
	 */
	public String getOldPassword() {
		return oldPassword;
	}

	/**
	 * Sets the old password.
	 *
	 * @param oldPassword the new old password
	 */
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	/**
	 * Gets the new password.
	 *
	 * @return the new password
	 */
	public String getNewPassword() {
		return newPassword;
	}

	/**
	 * Sets the new password.
	 *
	 * @param newPassword the new new password
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	/**
	 * Gets the confirm password.
	 *
	 * @return the confirm password
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * Sets the confirm password.
	 *
	 * @param confirmPassword the new confirm password
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.form.BaseForm#getDto()
	 */
	@Override
	public BaseDTO getDto() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see in.co.sunrays.project0.form.BaseForm#populate(in.co.sunrays.project0.dto.BaseDTO)
	 */
	@Override
	public void populate(BaseDTO bDto) {
		// TODO Auto-generated method stub
		
	}
	

	
	
}
