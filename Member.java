package gott;

import java.sql.*;
import java.util.*;

class Member{
	Integer MEMBER_NUMBER;
	String MEMBER_ID;
	String MEMBER_PW;
	String MEMBER_NAME;
	Integer MEMBER_AGE;
	Integer MEMBER_MILEAGE;
	String MEMBER_JOB;
	String MEMBER_ADD;
	String MEMBER_REGDATE;
	
	
	
	public Member(Integer mEMBER_NUMBER, String mEMBER_ID, String mEMBER_PW, String mEMBER_NAME, Integer mEMBER_AGE,
			Integer mEMBER_MILEAGE, String mEMBER_JOB, String mEMBER_ADD, String mEMBER_REGDATE) {
		
		MEMBER_NUMBER = mEMBER_NUMBER;
		MEMBER_ID = mEMBER_ID;
		MEMBER_PW = mEMBER_PW;
		MEMBER_NAME = mEMBER_NAME;
		MEMBER_AGE = mEMBER_AGE;
		MEMBER_MILEAGE = mEMBER_MILEAGE;
		MEMBER_JOB = mEMBER_JOB;
		MEMBER_ADD = mEMBER_ADD;
		MEMBER_REGDATE = mEMBER_REGDATE;
	}
	
	public Integer getMEMBER_NUMBER() {
		return MEMBER_NUMBER;
	}
	public void setMEMBER_NUMBER(Integer mEMBER_NUMBER) {
		MEMBER_NUMBER = mEMBER_NUMBER;
	}
	public String getMEMBER_ID() {
		return MEMBER_ID;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}
	public String getMEMBER_PW() {
		return MEMBER_PW;
	}
	public void setMEMBER_PW(String mEMBER_PW) {
		MEMBER_PW = mEMBER_PW;
	}
	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}
	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}
	public Integer getMEMBER_AGE() {
		return MEMBER_AGE;
	}
	public void setMEMBER_AGE(Integer mEMBER_AGE) {
		MEMBER_AGE = mEMBER_AGE;
	}
	public Integer getMEMBER_MILEAGE() {
		return MEMBER_MILEAGE;
	}
	public void setMEMBER_MILEAGE(Integer mEMBER_MILEAGE) {
		MEMBER_MILEAGE = mEMBER_MILEAGE;
	}
	public String getMEMBER_JOB() {
		return MEMBER_JOB;
	}
	public void setMEMBER_JOB(String mEMBER_JOB) {
		MEMBER_JOB = mEMBER_JOB;
	}
	public String getMEMBER_ADD() {
		return MEMBER_ADD;
	}
	public void setMEMBER_ADD(String mEMBER_ADD) {
		MEMBER_ADD = mEMBER_ADD;
	}
	public String getMEMBER_REGDATE() {
		return MEMBER_REGDATE;
	}
	public void setMEMBER_REGDATE(String mEMBER_REGDATE) {
		MEMBER_REGDATE = mEMBER_REGDATE;
	}
	
}