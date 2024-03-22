package com.hexa.CourseApplication.entity; 
import java.math.BigInteger;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long courseId;
	private String courseName;
	private String courseDuration;
	private BigInteger coursePrice;
	private String courseImgUrl;
	
	public Course(Long courseId, String courseName, String courseDuration, BigInteger coursePrice,String courseImgUrl) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.coursePrice = coursePrice;
		this.courseImgUrl=courseImgUrl;
	}

	public Course() {
		super();
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public BigInteger getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(BigInteger coursePrice) {
		this.coursePrice = coursePrice;
	}

	
	public String getCourseImgUrl() {
		return courseImgUrl;
	}

	public void setCourseImgUrl(String courseImgUrl) {
		this.courseImgUrl = courseImgUrl;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", coursePrice=" + coursePrice + ", courseImgUrl=" + courseImgUrl + "]";
	}

	
		
}
