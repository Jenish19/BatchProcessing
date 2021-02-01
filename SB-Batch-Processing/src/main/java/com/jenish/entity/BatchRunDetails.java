package com.jenish.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "BATCH_RUN_DTLS")
public class BatchRunDetails {
	
	@Id
	@Column(name="BATCH_RUN_SEQ")
	private Integer batchRunSequence;
	
	@Column(name="BATCH_NAME")
	private String batchName;
	
	@Column(name="BATCH_RUN_STATUS")
	private String batchRunStatus;
	
	@Column(name="END_DATE") //Time stamp data type?
	private String endDate;
	
	@Column(name="INSTANCE_NUM")
	private Integer instanceNumber;
	
	@Column(name="START_DATE") //time stamp data type?
	private String startDate;

}
