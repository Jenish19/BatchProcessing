package com.jenish.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "CO_TRIGGERS")
public class CoTriggers {

	@Id
	@Column(name="TRG_ID")
	private Integer triggerId;
	
	@Column(name="CASE_NUM")
	private Integer caseNumber;
	
	@Column(name="CREATE_DT")
	private Date createDate;
	
	@Column(name="TRG_STATUS")
	private String triggerStatus;
	
	@Column(name="UPDATE_DT")
	private Date updateDate;

	
}
