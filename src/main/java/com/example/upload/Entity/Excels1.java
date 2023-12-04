package com.example.upload.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Excels1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Id;
	private String firstColumn;
	private String secondColumn;
	private String thirdColumn;
	private String fourthColumn;
	private String fifthColumn;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getFirstColumn() {
		return firstColumn;
	}
	public void setFirstColumn(String firstColumn) {
		this.firstColumn = firstColumn;
	}
	public String getSecondColumn() {
		return secondColumn;
	}
	public void setSecondColumn(String secondColumn) {
		this.secondColumn = secondColumn;
	}
	public String getThirdColumn() {
		return thirdColumn;
	}
	public void setThirdColumn(String thirdColumn) {
		this.thirdColumn = thirdColumn;
	}
	public String getFourthColumn() {
		return fourthColumn;
	}
	public void setFourthColumn(String fourthColumn) {
		this.fourthColumn = fourthColumn;
	}
	public String getFifthColumn() {
		return fifthColumn;
	}
	public void setFifthColumn(String fifthColumn) {
		this.fifthColumn = fifthColumn;
	}
	public Excels1(String id, String firstColumn, String secondColumn, String thirdColumn, String fourthColumn,
			String fifthColumn) {
		super();
		Id = id;
		this.firstColumn = firstColumn;
		this.secondColumn = secondColumn;
		this.thirdColumn = thirdColumn;
		this.fourthColumn = fourthColumn;
		this.fifthColumn = fifthColumn;
	}
	public Excels1() {
		super();
		// TODO Auto-generated constructor stub
	}
}
