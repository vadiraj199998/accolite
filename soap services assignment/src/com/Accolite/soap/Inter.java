package com.Accolite.soap;

public class Inter {
	Assignment Runner=new Assignment();
	public String insertEmp(int id, String name, String department) {
		return Runner.addemploy(id,name,department);
	}
	
	public String updateEmp(int id, String name, String department) {
		return Runner.updateemployee(id,name,department);
	}
	
	public String deleteEmp(int id) {
		return Runner.Deleteemp(id);
	}
	
	public  String getEmp(int id) {
		return Runner.showemployee(id);
	}
	
	public String getAllEmp() {
		return Runner.getAllEmp();
	}
}
