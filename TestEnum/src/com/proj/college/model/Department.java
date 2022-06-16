package com.proj.college.model;

public enum Department {
	CSE("Comp.Sci.Engg","Bheem"), 
	Civil("Civil Engg.","Khalia"), 
	Mech("Mech. Engg.","Chutki"), 
	IT("Info. Tech.", "Rajakumari"), 
	ECE("Elec. Comm. Engg.","Bubble"), 
	EEE("Elec. Electr. Engg.","Blossom");
	
	private String name;
	private String hod;
	private Department(String name, String hod) {
		this.name = name;
		this.hod = hod;
	}
	
	public String toString() {
		return name+", HOD:"+hod;
	}
	
}
