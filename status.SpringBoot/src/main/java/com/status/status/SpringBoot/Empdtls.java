package com.status.status.SpringBoot;

public class Empdtls {
	public int id;
	public String name;
	public String phoneno;
	public String departmentit;
	public String status;
	public String createddtm;
	public String createdby;
	public String updateddtm;
	public String updatedby;

	public Empdtls(int id, String name, String phoneno, String departmentit, String status, String createddtm,
			String createdby, String updateddtm, String updatedby) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.departmentit = departmentit;
		this.status = status;
		this.createddtm = createddtm;
		this.createdby = createdby;
		this.updateddtm = updateddtm;
		this.updatedby = updatedby;
	}

}
