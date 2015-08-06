package org.openhmis.domain;

// Generated Aug 5, 2015 8:35:20 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TmpMentalHealthProblem generated by hbm2java
 */
@Entity
@Table(name = "TMP_MENTAL_HEALTH_PROBLEM")
public class TmpMentalHealthProblem implements java.io.Serializable {

	private Integer mentalHealthProblemId;
	private Integer enrollmentId;
	private Date informationDate;
	private Integer response;
	private Integer indefiniteAndImpairs;
	private Integer documentationOnFile;
	private Integer receivingServices;
	private Integer pathHowConfirmed;
	private Integer pathSmiInformation;

	public TmpMentalHealthProblem() {
	}

	public TmpMentalHealthProblem(Integer enrollmentId, Date informationDate,
			Integer response, Integer indefiniteAndImpairs,
			Integer documentationOnFile, Integer receivingServices,
			Integer pathHowConfirmed, Integer pathSmiInformation) {
		this.enrollmentId = enrollmentId;
		this.informationDate = informationDate;
		this.response = response;
		this.indefiniteAndImpairs = indefiniteAndImpairs;
		this.documentationOnFile = documentationOnFile;
		this.receivingServices = receivingServices;
		this.pathHowConfirmed = pathHowConfirmed;
		this.pathSmiInformation = pathSmiInformation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "mentalHealthProblemId", unique = true, nullable = false)
	public Integer getMentalHealthProblemId() {
		return this.mentalHealthProblemId;
	}

	public void setMentalHealthProblemId(Integer mentalHealthProblemId) {
		this.mentalHealthProblemId = mentalHealthProblemId;
	}

	@Column(name = "enrollmentId")
	public Integer getEnrollmentId() {
		return this.enrollmentId;
	}

	public void setEnrollmentId(Integer enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "informationDate", length = 10)
	public Date getInformationDate() {
		return this.informationDate;
	}

	public void setInformationDate(Date informationDate) {
		this.informationDate = informationDate;
	}

	@Column(name = "response")
	public Integer getResponse() {
		return this.response;
	}

	public void setResponse(Integer response) {
		this.response = response;
	}

	@Column(name = "indefiniteAndImpairs")
	public Integer getIndefiniteAndImpairs() {
		return this.indefiniteAndImpairs;
	}

	public void setIndefiniteAndImpairs(Integer indefiniteAndImpairs) {
		this.indefiniteAndImpairs = indefiniteAndImpairs;
	}

	@Column(name = "documentationOnFile")
	public Integer getDocumentationOnFile() {
		return this.documentationOnFile;
	}

	public void setDocumentationOnFile(Integer documentationOnFile) {
		this.documentationOnFile = documentationOnFile;
	}

	@Column(name = "receivingServices")
	public Integer getReceivingServices() {
		return this.receivingServices;
	}

	public void setReceivingServices(Integer receivingServices) {
		this.receivingServices = receivingServices;
	}

	@Column(name = "pathHowConfirmed")
	public Integer getPathHowConfirmed() {
		return this.pathHowConfirmed;
	}

	public void setPathHowConfirmed(Integer pathHowConfirmed) {
		this.pathHowConfirmed = pathHowConfirmed;
	}

	@Column(name = "pathSmiInformation")
	public Integer getPathSmiInformation() {
		return this.pathSmiInformation;
	}

	public void setPathSmiInformation(Integer pathSmiInformation) {
		this.pathSmiInformation = pathSmiInformation;
	}

}
