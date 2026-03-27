package student.DTO;

public class StudentDTO {

	// DTO : Data Transfer Object
	// 학생번호 : stuNo
	// 학생이름 : stuName
	// 국어점수 : korScore
	// 영어점수 : engScore
	// 수학점수 : mathScore
	// 총점점수 : totalScore
	// 평균점수 : avrScore
	// 등급 : stuGrade
	
	// 필드선언
	private int stuNo = -1;
	private String stuName;
	private int korScore;
	private int engScore;
	private int mathScore;
	private int totalScore;
	private int avrScore;
	private String stuGrade;
	
	
	
	// get/set 메소드
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public int getAvrScore() {
		return avrScore;
	}
	public void setAvrScore(int avrScore) {
		this.avrScore = avrScore;
	}
	public String getStuGrade() {
		return stuGrade;
	}
	public void setStuGrade(String stuGrade) {
		this.stuGrade = stuGrade;
	}
	
	@Override
	public String toString() {
		return "studentDTO [stuNo=" + stuNo + ", stuName=" + stuName + ", korScore=" + korScore + ", engScore="
				+ engScore + ", mathScore=" + mathScore + ", totalScore=" + totalScore + ", avrScore=" + avrScore
				+ ", stuGrade=" + stuGrade + "]";
	}
	
	
}
