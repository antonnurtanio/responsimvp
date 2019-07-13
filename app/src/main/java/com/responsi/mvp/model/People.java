package com.responsi.mvp.model;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;


public class People implements Serializable {


	@SerializedName("gender")
	public String gender;

	@SerializedName("name")
	public Name name;

	@SerializedName("location")
	public Location location;

	@SerializedName("email")
	public String mail;

	@SerializedName("login")
	public Login login;

	@SerializedName("phone")
	public String phone;

	@SerializedName("cell")
	public String cell;

	@SerializedName("picture")
	public Picture picture;

	public String fullName;

	public boolean hashEmail() {
		return mail != null && !mail.isEmpty();
	}
}