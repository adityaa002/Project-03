package in.co.rays.dto;

import java.util.Date;

public class TimetableDTO extends BaseDTO {
	private static final long serialVersionUID = 1L;

	public long getSubId() {
		return subId;
	}

	public void setSubId(long subId) {
		this.subId = subId;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getExamTime() {
		return examTime;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private long subId;
	private long courseId;
	private String subName;
	private String courseName;
	private Date examDate;
	private String semester;
	private String examTime;

	public String getKey() {
 		return id+"";
	}

	public String getValue() {
 		return subName;
	}
}
