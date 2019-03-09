package Exercise3;

public class Certificate {

	String certificateName;
	String university;
	String grade;

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void printCertificate() {
		System.out.println("Name of University:" + university + "\n" + "Name of Certificate:"
				+ certificateName + "\n"+ "Grade:" + grade);
	}

}
