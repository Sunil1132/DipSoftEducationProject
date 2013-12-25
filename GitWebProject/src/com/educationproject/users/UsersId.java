package com.educationproject.users;

/**
 * UsersId entity. @author MyEclipse Persistence Tools
 */

public class UsersId implements java.io.Serializable {

	// Fields

	private Integer recNum;
	private String email;

	// Constructors

	/** default constructor */
	public UsersId() {
	}

	/** full constructor */
	public UsersId(Integer recNum, String email) {
		this.recNum = recNum;
		this.email = email;
	}

	// Property accessors

	public Integer getRecNum() {
		return this.recNum;
	}

	public void setRecNum(Integer recNum) {
		this.recNum = recNum;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UsersId))
			return false;
		UsersId castOther = (UsersId) other;

		return ((this.getRecNum() == castOther.getRecNum()) || (this
				.getRecNum() != null && castOther.getRecNum() != null && this
				.getRecNum().equals(castOther.getRecNum())))
				&& ((this.getEmail() == castOther.getEmail()) || (this
						.getEmail() != null && castOther.getEmail() != null && this
						.getEmail().equals(castOther.getEmail())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRecNum() == null ? 0 : this.getRecNum().hashCode());
		result = 37 * result
				+ (getEmail() == null ? 0 : this.getEmail().hashCode());
		return result;
	}

}