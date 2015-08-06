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
 * TmpExit generated by hbm2java
 */
@Entity
@Table(name = "TMP_EXIT")
public class TmpExit implements java.io.Serializable {

	private Integer exitId;
	private Integer enrollmentId;
	private Date projectExitDate;
	private Integer destinationTypeCode;
	private String otherDestination;
	private Integer assessmentDisposition;
	private String otherDisposition;
	private Integer housingAssessment;
	private Integer subsidyInformation;
	private Integer connectionWithSoar;
	private Date employedInformationDate;
	private Integer employed;
	private Integer employmentType;
	private Integer notEmployedReason;
	private Integer generalHealthStatus;
	private Integer dentalHealthStatus;
	private Integer mentalHealthStatus;
	private Integer writtenAftercarePlan;
	private Integer assistanceMainstreamBenefits;
	private Integer permanentHousingPlacement;
	private Integer temporaryShelterPlacement;
	private Integer exitCounciling;
	private Integer furtherFollowupServices;
	private Integer scheduledFollowupContacts;
	private Integer resourcePackage;
	private Integer otherAftercarePlanOrAction;
	private Integer projectCompletionStatus;
	private Integer earlyExitReason;
	private Integer earlyExpulsionReason;
	private Integer familyReunificationCode;

	public TmpExit() {
	}

	public TmpExit(Integer enrollmentId, Date projectExitDate,
			Integer destinationTypeCode, String otherDestination,
			Integer assessmentDisposition, String otherDisposition,
			Integer housingAssessment, Integer subsidyInformation,
			Integer connectionWithSoar, Date employedInformationDate,
			Integer employed, Integer employmentType,
			Integer notEmployedReason, Integer generalHealthStatus,
			Integer dentalHealthStatus, Integer mentalHealthStatus,
			Integer writtenAftercarePlan, Integer assistanceMainstreamBenefits,
			Integer permanentHousingPlacement,
			Integer temporaryShelterPlacement, Integer exitCounciling,
			Integer furtherFollowupServices, Integer scheduledFollowupContacts,
			Integer resourcePackage, Integer otherAftercarePlanOrAction,
			Integer projectCompletionStatus, Integer earlyExitReason,
			Integer earlyExpulsionReason, Integer familyReunificationCode) {
		this.enrollmentId = enrollmentId;
		this.projectExitDate = projectExitDate;
		this.destinationTypeCode = destinationTypeCode;
		this.otherDestination = otherDestination;
		this.assessmentDisposition = assessmentDisposition;
		this.otherDisposition = otherDisposition;
		this.housingAssessment = housingAssessment;
		this.subsidyInformation = subsidyInformation;
		this.connectionWithSoar = connectionWithSoar;
		this.employedInformationDate = employedInformationDate;
		this.employed = employed;
		this.employmentType = employmentType;
		this.notEmployedReason = notEmployedReason;
		this.generalHealthStatus = generalHealthStatus;
		this.dentalHealthStatus = dentalHealthStatus;
		this.mentalHealthStatus = mentalHealthStatus;
		this.writtenAftercarePlan = writtenAftercarePlan;
		this.assistanceMainstreamBenefits = assistanceMainstreamBenefits;
		this.permanentHousingPlacement = permanentHousingPlacement;
		this.temporaryShelterPlacement = temporaryShelterPlacement;
		this.exitCounciling = exitCounciling;
		this.furtherFollowupServices = furtherFollowupServices;
		this.scheduledFollowupContacts = scheduledFollowupContacts;
		this.resourcePackage = resourcePackage;
		this.otherAftercarePlanOrAction = otherAftercarePlanOrAction;
		this.projectCompletionStatus = projectCompletionStatus;
		this.earlyExitReason = earlyExitReason;
		this.earlyExpulsionReason = earlyExpulsionReason;
		this.familyReunificationCode = familyReunificationCode;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "exitId", unique = true, nullable = false)
	public Integer getExitId() {
		return this.exitId;
	}

	public void setExitId(Integer exitId) {
		this.exitId = exitId;
	}

	@Column(name = "enrollmentId")
	public Integer getEnrollmentId() {
		return this.enrollmentId;
	}

	public void setEnrollmentId(Integer enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "projectExitDate", length = 10)
	public Date getProjectExitDate() {
		return this.projectExitDate;
	}

	public void setProjectExitDate(Date projectExitDate) {
		this.projectExitDate = projectExitDate;
	}

	@Column(name = "destinationTypeCode")
	public Integer getDestinationTypeCode() {
		return this.destinationTypeCode;
	}

	public void setDestinationTypeCode(Integer destinationTypeCode) {
		this.destinationTypeCode = destinationTypeCode;
	}

	@Column(name = "otherDestination")
	public String getOtherDestination() {
		return this.otherDestination;
	}

	public void setOtherDestination(String otherDestination) {
		this.otherDestination = otherDestination;
	}

	@Column(name = "assessmentDisposition")
	public Integer getAssessmentDisposition() {
		return this.assessmentDisposition;
	}

	public void setAssessmentDisposition(Integer assessmentDisposition) {
		this.assessmentDisposition = assessmentDisposition;
	}

	@Column(name = "otherDisposition")
	public String getOtherDisposition() {
		return this.otherDisposition;
	}

	public void setOtherDisposition(String otherDisposition) {
		this.otherDisposition = otherDisposition;
	}

	@Column(name = "housingAssessment")
	public Integer getHousingAssessment() {
		return this.housingAssessment;
	}

	public void setHousingAssessment(Integer housingAssessment) {
		this.housingAssessment = housingAssessment;
	}

	@Column(name = "subsidyInformation")
	public Integer getSubsidyInformation() {
		return this.subsidyInformation;
	}

	public void setSubsidyInformation(Integer subsidyInformation) {
		this.subsidyInformation = subsidyInformation;
	}

	@Column(name = "connectionWithSoar")
	public Integer getConnectionWithSoar() {
		return this.connectionWithSoar;
	}

	public void setConnectionWithSoar(Integer connectionWithSoar) {
		this.connectionWithSoar = connectionWithSoar;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "employedInformationDate", length = 10)
	public Date getEmployedInformationDate() {
		return this.employedInformationDate;
	}

	public void setEmployedInformationDate(Date employedInformationDate) {
		this.employedInformationDate = employedInformationDate;
	}

	@Column(name = "employed")
	public Integer getEmployed() {
		return this.employed;
	}

	public void setEmployed(Integer employed) {
		this.employed = employed;
	}

	@Column(name = "employmentType")
	public Integer getEmploymentType() {
		return this.employmentType;
	}

	public void setEmploymentType(Integer employmentType) {
		this.employmentType = employmentType;
	}

	@Column(name = "notEmployedReason")
	public Integer getNotEmployedReason() {
		return this.notEmployedReason;
	}

	public void setNotEmployedReason(Integer notEmployedReason) {
		this.notEmployedReason = notEmployedReason;
	}

	@Column(name = "generalHealthStatus")
	public Integer getGeneralHealthStatus() {
		return this.generalHealthStatus;
	}

	public void setGeneralHealthStatus(Integer generalHealthStatus) {
		this.generalHealthStatus = generalHealthStatus;
	}

	@Column(name = "dentalHealthStatus")
	public Integer getDentalHealthStatus() {
		return this.dentalHealthStatus;
	}

	public void setDentalHealthStatus(Integer dentalHealthStatus) {
		this.dentalHealthStatus = dentalHealthStatus;
	}

	@Column(name = "mentalHealthStatus")
	public Integer getMentalHealthStatus() {
		return this.mentalHealthStatus;
	}

	public void setMentalHealthStatus(Integer mentalHealthStatus) {
		this.mentalHealthStatus = mentalHealthStatus;
	}

	@Column(name = "writtenAftercarePlan")
	public Integer getWrittenAftercarePlan() {
		return this.writtenAftercarePlan;
	}

	public void setWrittenAftercarePlan(Integer writtenAftercarePlan) {
		this.writtenAftercarePlan = writtenAftercarePlan;
	}

	@Column(name = "assistanceMainstreamBenefits")
	public Integer getAssistanceMainstreamBenefits() {
		return this.assistanceMainstreamBenefits;
	}

	public void setAssistanceMainstreamBenefits(
			Integer assistanceMainstreamBenefits) {
		this.assistanceMainstreamBenefits = assistanceMainstreamBenefits;
	}

	@Column(name = "permanentHousingPlacement")
	public Integer getPermanentHousingPlacement() {
		return this.permanentHousingPlacement;
	}

	public void setPermanentHousingPlacement(Integer permanentHousingPlacement) {
		this.permanentHousingPlacement = permanentHousingPlacement;
	}

	@Column(name = "temporaryShelterPlacement")
	public Integer getTemporaryShelterPlacement() {
		return this.temporaryShelterPlacement;
	}

	public void setTemporaryShelterPlacement(Integer temporaryShelterPlacement) {
		this.temporaryShelterPlacement = temporaryShelterPlacement;
	}

	@Column(name = "exitCounciling")
	public Integer getExitCounciling() {
		return this.exitCounciling;
	}

	public void setExitCounciling(Integer exitCounciling) {
		this.exitCounciling = exitCounciling;
	}

	@Column(name = "furtherFollowupServices")
	public Integer getFurtherFollowupServices() {
		return this.furtherFollowupServices;
	}

	public void setFurtherFollowupServices(Integer furtherFollowupServices) {
		this.furtherFollowupServices = furtherFollowupServices;
	}

	@Column(name = "scheduledFollowupContacts")
	public Integer getScheduledFollowupContacts() {
		return this.scheduledFollowupContacts;
	}

	public void setScheduledFollowupContacts(Integer scheduledFollowupContacts) {
		this.scheduledFollowupContacts = scheduledFollowupContacts;
	}

	@Column(name = "resourcePackage")
	public Integer getResourcePackage() {
		return this.resourcePackage;
	}

	public void setResourcePackage(Integer resourcePackage) {
		this.resourcePackage = resourcePackage;
	}

	@Column(name = "otherAftercarePlanOrAction")
	public Integer getOtherAftercarePlanOrAction() {
		return this.otherAftercarePlanOrAction;
	}

	public void setOtherAftercarePlanOrAction(Integer otherAftercarePlanOrAction) {
		this.otherAftercarePlanOrAction = otherAftercarePlanOrAction;
	}

	@Column(name = "projectCompletionStatus")
	public Integer getProjectCompletionStatus() {
		return this.projectCompletionStatus;
	}

	public void setProjectCompletionStatus(Integer projectCompletionStatus) {
		this.projectCompletionStatus = projectCompletionStatus;
	}

	@Column(name = "earlyExitReason")
	public Integer getEarlyExitReason() {
		return this.earlyExitReason;
	}

	public void setEarlyExitReason(Integer earlyExitReason) {
		this.earlyExitReason = earlyExitReason;
	}

	@Column(name = "earlyExpulsionReason")
	public Integer getEarlyExpulsionReason() {
		return this.earlyExpulsionReason;
	}

	public void setEarlyExpulsionReason(Integer earlyExpulsionReason) {
		this.earlyExpulsionReason = earlyExpulsionReason;
	}

	@Column(name = "familyReunificationCode")
	public Integer getFamilyReunificationCode() {
		return this.familyReunificationCode;
	}

	public void setFamilyReunificationCode(Integer familyReunificationCode) {
		this.familyReunificationCode = familyReunificationCode;
	}

}
