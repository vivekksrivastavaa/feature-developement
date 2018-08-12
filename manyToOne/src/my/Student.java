package my;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="STUDENT_MASTER")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	

	private  int studentId;
	
	@Column(name="studentName")


	private String studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="STD_ADDR")
    private Address address;
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	Student()
	{
		
	}
	
	
	Student(String studentName,Address address)
	{
		
		this.studentName=studentName;
		this.address=address;
		
	}
	
}
