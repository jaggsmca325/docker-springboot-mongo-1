/**
 * 
 */
package com.jaggs.jgcodeassist.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author jaggsosx
 *
 */
@Document
public class Customer {
	
	@Id
	private ObjectId _id;
	
	private String customerfName;
	private String customerlName;
	private String phoneNumber;
	private String email;
	private String address;
	/**
	 * @return the _id
	 */
	public ObjectId getId() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void setId(ObjectId _id) {
		this._id = _id;
	}
	/**
	 * @return the customerfName
	 */
	public String getCustomerfName() {
		return customerfName;
	}
	/**
	 * @param customerfName the customerfName to set
	 */
	public void setCustomerfName(String customerfName) {
		this.customerfName = customerfName;
	}
	/**
	 * @return the customerlName
	 */
	public String getCustomerlName() {
		return customerlName;
	}
	/**
	 * @param customerlName the customerlName to set
	 */
	public void setCustomerlName(String customerlName) {
		this.customerlName = customerlName;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
