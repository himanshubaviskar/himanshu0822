package in.co.sunrays.project0.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class CollegeDTO.
 */
@Entity
@Table(name = "ST_COLLEGE")
public class CollegeDTO extends BaseDTO {

/** Name of College. */
@Column(name = "NAME", length =255)
private String name;

/** Address of College. */
@Column(name = "ADDRESS", length =255)
private String address;

/** State of College. */
@Column(name = "STATE", length =255)
private String state;

/** City of College. */
@Column(name = "CITY", length =255)
private String city;

/** Phoneno of College. */
@Column(name = "PHONE_NO", length =255)
private String phoneNo;

/**
 * Gets the name.
 *
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * Sets the name.
 *
 * @param name the new name
 */
public void setName(String name) {
	this.name = name;
}

/**
 * Gets the address.
 *
 * @return the address
 */
public String getAddress() {
	return address;
}

/**
 * Sets the address.
 *
 * @param address the new address
 */
public void setAddress(String address) {
	this.address = address;
}

/**
 * Gets the state.
 *
 * @return the state
 */
public String getState() {
	return state;
}

/**
 * Sets the state.
 *
 * @param state the new state
 */
public void setState(String state) {
	this.state = state;
}

/**
 * Gets the city.
 *
 * @return the city
 */
public String getCity() {
	return city;
}

/**
 * Sets the city.
 *
 * @param city the new city
 */
public void setCity(String city) {
	this.city = city;
}

/**
 * Gets the phone no.
 *
 * @return the phone no
 */
public String getPhoneNo() {
	return phoneNo;
}

/**
 * Sets the phone no.
 *
 * @param phoneNo the new phone no
 */
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}

/* (non-Javadoc)
 * @see in.co.sunrays.project0.dto.DropdownList#getKey()
 */
public String getKey() {
	// TODO Auto-generated method stub
  return id + "";
}

/* (non-Javadoc)
 * @see in.co.sunrays.project0.dto.DropdownList#getValue()
 */
public String getValue() {
	// TODO Auto-generated method stub
	return name;
}



	
}
