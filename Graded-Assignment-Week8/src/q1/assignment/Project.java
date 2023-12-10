package q1.assignment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Project implements Serializable {
	Employee e;

	String projectCode;
	String projectName;
	int projectStrength;

	public Project(String projectCode, String projectName, int projectStrength) {
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.projectStrength = projectStrength;
	}

	public Project(Employee e) {
		this.e = e;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectStrength() {
		return projectStrength;
	}

	public void setProjectStrength(int projectStrength) {
		this.projectStrength = projectStrength;
	}
	

	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", projectName=" + projectName + ", projectStrength="
				+ projectStrength + "]";
	}


	ArrayList<Employee> elist1 = new ArrayList<Employee>();
	ArrayList<Employee> elist2 = new ArrayList<Employee>();
	ArrayList<Employee> elist3 = new ArrayList<Employee>();
	
	
	Map<Project, ArrayList<Employee>> map1 = new HashMap<>();

	public void serializeProjectDetails(Map<Project, ArrayList<Employee>> map12) {
		System.out.println("Serialized map of project Successfully...");
	}
	
	public void printData() {
		//Project obj = new Project(e);
//		for (Employee employee : elist2) {
			System.out.println("\tDeSerialization Data :\n"+"The Project\n"+toString() + "\n");
//		}
	}
	
	
}
