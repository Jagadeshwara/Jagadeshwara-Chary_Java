package q1.assignment;

public class Project1 {

	String projectCode;
	String projectName;
	int projectStrength;
	
	public Project1(String projectCode, String projectName, int projectStrength) {
		super();
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.projectStrength = projectStrength;
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
		return "Project1 [projectCode=" + projectCode + ", projectName=" + projectName + ", projectStrength="
				+ projectStrength + "]";
	}
	
}
