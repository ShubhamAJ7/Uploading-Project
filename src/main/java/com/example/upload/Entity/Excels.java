package com.example.upload.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Excels {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Id;
	private String firstColumn = "sdsxs";
	private String secondColumn;
	private String thirdColumn;
	private String fourthColumn;
	private String fifthColumn;
	private String sixthColumn;
	private String seventhColumn;
	private String eighthColumn;
	private String ninethColumn;
	private String tenthColumn;
	private String eleventhColumn;
	private String twelethColumn;
	private String thirteenthColumn;
	private String fourtheenthColumn;
	private String fifteenthColumn ="def";
	private String sixteenthColumn ="def";
	private String seventeenthColumn ="def";
	private String eighteenthColumn ="def";

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
	public String getSixthColumn() {
		return sixthColumn;
	}
	public void setSixthColumn(String sixthColumn) {
		this.sixthColumn = sixthColumn;
	}
	public String getSeventhColumn() {
		return seventhColumn;
	}
	public void setSeventhColumn(String seventhColumn) {
		this.seventhColumn = seventhColumn;
	}
	public String getEighthColumn() {
		return eighthColumn;
	}
	public void setEighthColumn(String eighthColumn) {
		this.eighthColumn = eighthColumn;
	}
	public String getNinethColumn() {
		return ninethColumn;
	}
	public void setNinethColumn(String ninethColumn) {
		this.ninethColumn = ninethColumn;
	}
	public String getTenthColumn() {
		return tenthColumn;
	}
	public void setTenthColumn(String tenthColumn) {
		this.tenthColumn = tenthColumn;
	}
	public String getEleventhColumn() {
		return eleventhColumn;
	}
	public void setEleventhColumn(String eleventhColumn) {
		this.eleventhColumn = eleventhColumn;
	}
	public String getTwelethColumn() {
		return twelethColumn;
	}
	public void setTwelethColumn(String twelethColumn) {
		this.twelethColumn = twelethColumn;
	}
	public String getThirteenthColumn() {
		return thirteenthColumn;
	}
	public void setThirteenthColumn(String thirteenthColumn) {
		this.thirteenthColumn = thirteenthColumn;
	}
	public String getFourtheenthColumn() {
		return fourtheenthColumn;
	}
	public void setFourtheenthColumn(String fourtheenthColumn) {
		this.fourtheenthColumn = fourtheenthColumn;
	}
	public String getFifteenthColumn() {
		return fifteenthColumn;
	}
	public void setFifteenthColumn(String fifteenthColumn) {
		this.fifteenthColumn = fifteenthColumn;
	}
	public String getSixteenthColumn() {
		return sixteenthColumn;
	}
	public void setSixteenthColumn(String sixteenthColumn) {
		this.sixteenthColumn = sixteenthColumn;
	}
	public String getSeventeenthColumn() {
		return seventeenthColumn;
	}
	public void setSeventeenthColumn(String seventeenthColumn) {
		this.seventeenthColumn = seventeenthColumn;
	}
	public String getEighteenthColumn() {
		return eighteenthColumn;
	}
	public void setEighteenthColumn(String eighteenthColumn) {
		this.eighteenthColumn = eighteenthColumn;
	}
	public Excels(String id, String firstColumn, String secondColumn, String thirdColumn, String fourthColumn,
			String fifthColumn, String sixthColumn, String seventhColumn, String eighthColumn, String ninethColumn,
			String tenthColumn, String eleventhColumn, String twelethColumn, String thirteenthColumn,
			String fourtheenthColumn, String fifteenthColumn, String sixteenthColumn, String seventeenthColumn,
			String eighteenthColumn) {
		super();
		Id = id;
		this.firstColumn = firstColumn;
		this.secondColumn = secondColumn;
		this.thirdColumn = thirdColumn;
		this.fourthColumn = fourthColumn;
		this.fifthColumn = fifthColumn;
		this.sixthColumn = sixthColumn;
		this.seventhColumn = seventhColumn;
		this.eighthColumn = eighthColumn;
		this.ninethColumn = ninethColumn;
		this.tenthColumn = tenthColumn;
		this.eleventhColumn = eleventhColumn;
		this.twelethColumn = twelethColumn;
		this.thirteenthColumn = thirteenthColumn;
		this.fourtheenthColumn = fourtheenthColumn;
		this.fifteenthColumn = fifteenthColumn;
		this.sixteenthColumn = sixteenthColumn;
		this.seventeenthColumn = seventeenthColumn;
		this.eighteenthColumn = eighteenthColumn;
	}
	public Excels() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}
