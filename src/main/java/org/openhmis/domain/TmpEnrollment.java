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
 * TmpEnrollment generated by hbm2java
 */
@Entity
@Table(name = "TMP_ENROLLMENT")
public class TmpEnrollment implements java.io.Serializable {

	private Integer enrollmentId;
	private Integer personalId;
	private Integer projectExit;
	private Integer disablingCondition;
	private Integer residencePrior;
	private String otherResidence;
	private Integer residencePriorLengthOfStay;
	private Date entryDate;
	private Integer householdId;
	private Integer relationshipToHoH;
	private Date clientLocationInformationDate;
	private String cocCode;
	private Integer continuouslyHomelessOneYear;
	private Integer timesHomelessInPastThreeYears;
	private Integer monthsHomelessPastThreeYears;
	private Integer monthsHomelessThisTime;
	private Integer statusDocumentedCode;
	private Integer housingStatus;
	private Date dateOfEngagement;
	private Date residentialMoveInDate;
	private Integer inPermanentHousing;
	private Date permanentHousingMoveDate;
	private Date dateOfPathStatus;
	private Integer clientEnrolledInPath;
	private Integer reasonNotEnrolled;
	private Date dateOfBcpStatus;
	private Integer fysbYouth;
	private Integer reasonNoServices;
	private Integer sexualOrientation;
	private Integer lastGradeCompleted;
	private Integer schoolStatus;
	private Date employedInformationDate;
	private Integer employed;
	private Integer employmentType;
	private Integer notEmployedReason;
	private Integer generalHealthStatus;
	private Integer dentalHealthStatus;
	private Integer mentalHealthStatus;
	private Integer pregnancyStatusCode;
	private Date pregnancyDueDate;
	private Integer formerlyChildWelfare;
	private Integer childWelfareYears;
	private Integer childWelfareMonths;
	private Integer formerWardJuvenileJustice;
	private Integer juvenileJusticeYears;
	private Integer juvenileJusticeMonths;
	private Integer householdDynamics;
	private Integer sexualOrientationGenderIdYouth;
	private Integer sexualOrientationGenderIdFam;
	private Integer housingIssuesYouth;
	private Integer housingIssuesFam;
	private Integer schoolEducationalIssuesYouth;
	private Integer schoolEducationalIssuesFam;
	private Integer unemploymentYouth;
	private Integer unemploymentFam;
	private Integer mentalHealthIssuesYouth;
	private Integer mentalHealthIssuesFam;
	private Integer healthIssuesYouth;
	private Integer healthIssuesFam;
	private Integer physicalDisabilityYouth;
	private Integer physicalDisabilityFam;
	private Integer mentalDisabilityYouth;
	private Integer mentalDisabilityFam;
	private Integer abuseAndNeglectYouth;
	private Integer abuseAndNeglectFam;
	private Integer alcoholDrugAbuseYouth;
	private Integer alcoholDrugAbuseFam;
	private Integer insufficientIncome;
	private Integer activeMilitaryParent;
	private Integer incarceratedParent;
	private Integer incarceratedParentStatus;
	private Integer referralSource;
	private Integer countOutreachReferralApproaches;
	private Integer exchangeForSexPastThreeMonths;
	private Integer countOfExchangeForSex;
	private Integer askedOrForcedToExchangeForSex;
	private Integer worstHousingSituation;
	private Integer percentAmi;
	private String lastPermanentStreet;
	private String lastPermanentCity;
	private String lastPermanentState;
	private String lastPermanentZip;
	private Integer addressDataQuality;
	private Date dateCreated;
	private Date dateUpdated;

	public TmpEnrollment() {
	}

	public TmpEnrollment(Integer personalId, Integer projectExit,
			Integer disablingCondition, Integer residencePrior,
			String otherResidence, Integer residencePriorLengthOfStay,
			Date entryDate, Integer householdId, Integer relationshipToHoH,
			Date clientLocationInformationDate, String cocCode,
			Integer continuouslyHomelessOneYear,
			Integer timesHomelessInPastThreeYears,
			Integer monthsHomelessPastThreeYears,
			Integer monthsHomelessThisTime, Integer statusDocumentedCode,
			Integer housingStatus, Date dateOfEngagement,
			Date residentialMoveInDate, Integer inPermanentHousing,
			Date permanentHousingMoveDate, Date dateOfPathStatus,
			Integer clientEnrolledInPath, Integer reasonNotEnrolled,
			Date dateOfBcpStatus, Integer fysbYouth, Integer reasonNoServices,
			Integer sexualOrientation, Integer lastGradeCompleted,
			Integer schoolStatus, Date employedInformationDate,
			Integer employed, Integer employmentType,
			Integer notEmployedReason, Integer generalHealthStatus,
			Integer dentalHealthStatus, Integer mentalHealthStatus,
			Integer pregnancyStatusCode, Date pregnancyDueDate,
			Integer formerlyChildWelfare, Integer childWelfareYears,
			Integer childWelfareMonths, Integer formerWardJuvenileJustice,
			Integer juvenileJusticeYears, Integer juvenileJusticeMonths,
			Integer householdDynamics, Integer sexualOrientationGenderIdYouth,
			Integer sexualOrientationGenderIdFam, Integer housingIssuesYouth,
			Integer housingIssuesFam, Integer schoolEducationalIssuesYouth,
			Integer schoolEducationalIssuesFam, Integer unemploymentYouth,
			Integer unemploymentFam, Integer mentalHealthIssuesYouth,
			Integer mentalHealthIssuesFam, Integer healthIssuesYouth,
			Integer healthIssuesFam, Integer physicalDisabilityYouth,
			Integer physicalDisabilityFam, Integer mentalDisabilityYouth,
			Integer mentalDisabilityFam, Integer abuseAndNeglectYouth,
			Integer abuseAndNeglectFam, Integer alcoholDrugAbuseYouth,
			Integer alcoholDrugAbuseFam, Integer insufficientIncome,
			Integer activeMilitaryParent, Integer incarceratedParent,
			Integer incarceratedParentStatus, Integer referralSource,
			Integer countOutreachReferralApproaches,
			Integer exchangeForSexPastThreeMonths,
			Integer countOfExchangeForSex,
			Integer askedOrForcedToExchangeForSex,
			Integer worstHousingSituation, Integer percentAmi,
			String lastPermanentStreet, String lastPermanentCity,
			String lastPermanentState, String lastPermanentZip,
			Integer addressDataQuality, Date dateCreated, Date dateUpdated) {
		this.personalId = personalId;
		this.projectExit = projectExit;
		this.disablingCondition = disablingCondition;
		this.residencePrior = residencePrior;
		this.otherResidence = otherResidence;
		this.residencePriorLengthOfStay = residencePriorLengthOfStay;
		this.entryDate = entryDate;
		this.householdId = householdId;
		this.relationshipToHoH = relationshipToHoH;
		this.clientLocationInformationDate = clientLocationInformationDate;
		this.cocCode = cocCode;
		this.continuouslyHomelessOneYear = continuouslyHomelessOneYear;
		this.timesHomelessInPastThreeYears = timesHomelessInPastThreeYears;
		this.monthsHomelessPastThreeYears = monthsHomelessPastThreeYears;
		this.monthsHomelessThisTime = monthsHomelessThisTime;
		this.statusDocumentedCode = statusDocumentedCode;
		this.housingStatus = housingStatus;
		this.dateOfEngagement = dateOfEngagement;
		this.residentialMoveInDate = residentialMoveInDate;
		this.inPermanentHousing = inPermanentHousing;
		this.permanentHousingMoveDate = permanentHousingMoveDate;
		this.dateOfPathStatus = dateOfPathStatus;
		this.clientEnrolledInPath = clientEnrolledInPath;
		this.reasonNotEnrolled = reasonNotEnrolled;
		this.dateOfBcpStatus = dateOfBcpStatus;
		this.fysbYouth = fysbYouth;
		this.reasonNoServices = reasonNoServices;
		this.sexualOrientation = sexualOrientation;
		this.lastGradeCompleted = lastGradeCompleted;
		this.schoolStatus = schoolStatus;
		this.employedInformationDate = employedInformationDate;
		this.employed = employed;
		this.employmentType = employmentType;
		this.notEmployedReason = notEmployedReason;
		this.generalHealthStatus = generalHealthStatus;
		this.dentalHealthStatus = dentalHealthStatus;
		this.mentalHealthStatus = mentalHealthStatus;
		this.pregnancyStatusCode = pregnancyStatusCode;
		this.pregnancyDueDate = pregnancyDueDate;
		this.formerlyChildWelfare = formerlyChildWelfare;
		this.childWelfareYears = childWelfareYears;
		this.childWelfareMonths = childWelfareMonths;
		this.formerWardJuvenileJustice = formerWardJuvenileJustice;
		this.juvenileJusticeYears = juvenileJusticeYears;
		this.juvenileJusticeMonths = juvenileJusticeMonths;
		this.householdDynamics = householdDynamics;
		this.sexualOrientationGenderIdYouth = sexualOrientationGenderIdYouth;
		this.sexualOrientationGenderIdFam = sexualOrientationGenderIdFam;
		this.housingIssuesYouth = housingIssuesYouth;
		this.housingIssuesFam = housingIssuesFam;
		this.schoolEducationalIssuesYouth = schoolEducationalIssuesYouth;
		this.schoolEducationalIssuesFam = schoolEducationalIssuesFam;
		this.unemploymentYouth = unemploymentYouth;
		this.unemploymentFam = unemploymentFam;
		this.mentalHealthIssuesYouth = mentalHealthIssuesYouth;
		this.mentalHealthIssuesFam = mentalHealthIssuesFam;
		this.healthIssuesYouth = healthIssuesYouth;
		this.healthIssuesFam = healthIssuesFam;
		this.physicalDisabilityYouth = physicalDisabilityYouth;
		this.physicalDisabilityFam = physicalDisabilityFam;
		this.mentalDisabilityYouth = mentalDisabilityYouth;
		this.mentalDisabilityFam = mentalDisabilityFam;
		this.abuseAndNeglectYouth = abuseAndNeglectYouth;
		this.abuseAndNeglectFam = abuseAndNeglectFam;
		this.alcoholDrugAbuseYouth = alcoholDrugAbuseYouth;
		this.alcoholDrugAbuseFam = alcoholDrugAbuseFam;
		this.insufficientIncome = insufficientIncome;
		this.activeMilitaryParent = activeMilitaryParent;
		this.incarceratedParent = incarceratedParent;
		this.incarceratedParentStatus = incarceratedParentStatus;
		this.referralSource = referralSource;
		this.countOutreachReferralApproaches = countOutreachReferralApproaches;
		this.exchangeForSexPastThreeMonths = exchangeForSexPastThreeMonths;
		this.countOfExchangeForSex = countOfExchangeForSex;
		this.askedOrForcedToExchangeForSex = askedOrForcedToExchangeForSex;
		this.worstHousingSituation = worstHousingSituation;
		this.percentAmi = percentAmi;
		this.lastPermanentStreet = lastPermanentStreet;
		this.lastPermanentCity = lastPermanentCity;
		this.lastPermanentState = lastPermanentState;
		this.lastPermanentZip = lastPermanentZip;
		this.addressDataQuality = addressDataQuality;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "enrollmentId", unique = true, nullable = false)
	public Integer getEnrollmentId() {
		return this.enrollmentId;
	}

	public void setEnrollmentId(Integer enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	@Column(name = "personalId")
	public Integer getPersonalId() {
		return this.personalId;
	}

	public void setPersonalId(Integer personalId) {
		this.personalId = personalId;
	}

	@Column(name = "projectExit")
	public Integer getProjectExit() {
		return this.projectExit;
	}

	public void setProjectExit(Integer projectExit) {
		this.projectExit = projectExit;
	}

	@Column(name = "disablingCondition")
	public Integer getDisablingCondition() {
		return this.disablingCondition;
	}

	public void setDisablingCondition(Integer disablingCondition) {
		this.disablingCondition = disablingCondition;
	}

	@Column(name = "residencePrior")
	public Integer getResidencePrior() {
		return this.residencePrior;
	}

	public void setResidencePrior(Integer residencePrior) {
		this.residencePrior = residencePrior;
	}

	@Column(name = "otherResidence")
	public String getOtherResidence() {
		return this.otherResidence;
	}

	public void setOtherResidence(String otherResidence) {
		this.otherResidence = otherResidence;
	}

	@Column(name = "residencePriorLengthOfStay")
	public Integer getResidencePriorLengthOfStay() {
		return this.residencePriorLengthOfStay;
	}

	public void setResidencePriorLengthOfStay(Integer residencePriorLengthOfStay) {
		this.residencePriorLengthOfStay = residencePriorLengthOfStay;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "entryDate", length = 10)
	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	@Column(name = "householdId")
	public Integer getHouseholdId() {
		return this.householdId;
	}

	public void setHouseholdId(Integer householdId) {
		this.householdId = householdId;
	}

	@Column(name = "relationshipToHoH")
	public Integer getRelationshipToHoH() {
		return this.relationshipToHoH;
	}

	public void setRelationshipToHoH(Integer relationshipToHoH) {
		this.relationshipToHoH = relationshipToHoH;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "clientLocationInformationDate", length = 10)
	public Date getClientLocationInformationDate() {
		return this.clientLocationInformationDate;
	}

	public void setClientLocationInformationDate(
			Date clientLocationInformationDate) {
		this.clientLocationInformationDate = clientLocationInformationDate;
	}

	@Column(name = "cocCode")
	public String getCocCode() {
		return this.cocCode;
	}

	public void setCocCode(String cocCode) {
		this.cocCode = cocCode;
	}

	@Column(name = "continuouslyHomelessOneYear")
	public Integer getContinuouslyHomelessOneYear() {
		return this.continuouslyHomelessOneYear;
	}

	public void setContinuouslyHomelessOneYear(
			Integer continuouslyHomelessOneYear) {
		this.continuouslyHomelessOneYear = continuouslyHomelessOneYear;
	}

	@Column(name = "timesHomelessInPastThreeYears")
	public Integer getTimesHomelessInPastThreeYears() {
		return this.timesHomelessInPastThreeYears;
	}

	public void setTimesHomelessInPastThreeYears(
			Integer timesHomelessInPastThreeYears) {
		this.timesHomelessInPastThreeYears = timesHomelessInPastThreeYears;
	}

	@Column(name = "monthsHomelessPastThreeYears")
	public Integer getMonthsHomelessPastThreeYears() {
		return this.monthsHomelessPastThreeYears;
	}

	public void setMonthsHomelessPastThreeYears(
			Integer monthsHomelessPastThreeYears) {
		this.monthsHomelessPastThreeYears = monthsHomelessPastThreeYears;
	}

	@Column(name = "monthsHomelessThisTime")
	public Integer getMonthsHomelessThisTime() {
		return this.monthsHomelessThisTime;
	}

	public void setMonthsHomelessThisTime(Integer monthsHomelessThisTime) {
		this.monthsHomelessThisTime = monthsHomelessThisTime;
	}

	@Column(name = "statusDocumentedCode")
	public Integer getStatusDocumentedCode() {
		return this.statusDocumentedCode;
	}

	public void setStatusDocumentedCode(Integer statusDocumentedCode) {
		this.statusDocumentedCode = statusDocumentedCode;
	}

	@Column(name = "housingStatus")
	public Integer getHousingStatus() {
		return this.housingStatus;
	}

	public void setHousingStatus(Integer housingStatus) {
		this.housingStatus = housingStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateOfEngagement", length = 10)
	public Date getDateOfEngagement() {
		return this.dateOfEngagement;
	}

	public void setDateOfEngagement(Date dateOfEngagement) {
		this.dateOfEngagement = dateOfEngagement;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "residentialMoveInDate", length = 10)
	public Date getResidentialMoveInDate() {
		return this.residentialMoveInDate;
	}

	public void setResidentialMoveInDate(Date residentialMoveInDate) {
		this.residentialMoveInDate = residentialMoveInDate;
	}

	@Column(name = "inPermanentHousing")
	public Integer getInPermanentHousing() {
		return this.inPermanentHousing;
	}

	public void setInPermanentHousing(Integer inPermanentHousing) {
		this.inPermanentHousing = inPermanentHousing;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "permanentHousingMoveDate", length = 10)
	public Date getPermanentHousingMoveDate() {
		return this.permanentHousingMoveDate;
	}

	public void setPermanentHousingMoveDate(Date permanentHousingMoveDate) {
		this.permanentHousingMoveDate = permanentHousingMoveDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateOfPathStatus", length = 10)
	public Date getDateOfPathStatus() {
		return this.dateOfPathStatus;
	}

	public void setDateOfPathStatus(Date dateOfPathStatus) {
		this.dateOfPathStatus = dateOfPathStatus;
	}

	@Column(name = "clientEnrolledInPath")
	public Integer getClientEnrolledInPath() {
		return this.clientEnrolledInPath;
	}

	public void setClientEnrolledInPath(Integer clientEnrolledInPath) {
		this.clientEnrolledInPath = clientEnrolledInPath;
	}

	@Column(name = "reasonNotEnrolled")
	public Integer getReasonNotEnrolled() {
		return this.reasonNotEnrolled;
	}

	public void setReasonNotEnrolled(Integer reasonNotEnrolled) {
		this.reasonNotEnrolled = reasonNotEnrolled;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateOfBcpStatus", length = 10)
	public Date getDateOfBcpStatus() {
		return this.dateOfBcpStatus;
	}

	public void setDateOfBcpStatus(Date dateOfBcpStatus) {
		this.dateOfBcpStatus = dateOfBcpStatus;
	}

	@Column(name = "fysbYouth")
	public Integer getFysbYouth() {
		return this.fysbYouth;
	}

	public void setFysbYouth(Integer fysbYouth) {
		this.fysbYouth = fysbYouth;
	}

	@Column(name = "reasonNoServices")
	public Integer getReasonNoServices() {
		return this.reasonNoServices;
	}

	public void setReasonNoServices(Integer reasonNoServices) {
		this.reasonNoServices = reasonNoServices;
	}

	@Column(name = "sexualOrientation")
	public Integer getSexualOrientation() {
		return this.sexualOrientation;
	}

	public void setSexualOrientation(Integer sexualOrientation) {
		this.sexualOrientation = sexualOrientation;
	}

	@Column(name = "lastGradeCompleted")
	public Integer getLastGradeCompleted() {
		return this.lastGradeCompleted;
	}

	public void setLastGradeCompleted(Integer lastGradeCompleted) {
		this.lastGradeCompleted = lastGradeCompleted;
	}

	@Column(name = "schoolStatus")
	public Integer getSchoolStatus() {
		return this.schoolStatus;
	}

	public void setSchoolStatus(Integer schoolStatus) {
		this.schoolStatus = schoolStatus;
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

	@Column(name = "pregnancyStatusCode")
	public Integer getPregnancyStatusCode() {
		return this.pregnancyStatusCode;
	}

	public void setPregnancyStatusCode(Integer pregnancyStatusCode) {
		this.pregnancyStatusCode = pregnancyStatusCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "pregnancyDueDate", length = 10)
	public Date getPregnancyDueDate() {
		return this.pregnancyDueDate;
	}

	public void setPregnancyDueDate(Date pregnancyDueDate) {
		this.pregnancyDueDate = pregnancyDueDate;
	}

	@Column(name = "formerlyChildWelfare")
	public Integer getFormerlyChildWelfare() {
		return this.formerlyChildWelfare;
	}

	public void setFormerlyChildWelfare(Integer formerlyChildWelfare) {
		this.formerlyChildWelfare = formerlyChildWelfare;
	}

	@Column(name = "childWelfareYears")
	public Integer getChildWelfareYears() {
		return this.childWelfareYears;
	}

	public void setChildWelfareYears(Integer childWelfareYears) {
		this.childWelfareYears = childWelfareYears;
	}

	@Column(name = "childWelfareMonths")
	public Integer getChildWelfareMonths() {
		return this.childWelfareMonths;
	}

	public void setChildWelfareMonths(Integer childWelfareMonths) {
		this.childWelfareMonths = childWelfareMonths;
	}

	@Column(name = "formerWardJuvenileJustice")
	public Integer getFormerWardJuvenileJustice() {
		return this.formerWardJuvenileJustice;
	}

	public void setFormerWardJuvenileJustice(Integer formerWardJuvenileJustice) {
		this.formerWardJuvenileJustice = formerWardJuvenileJustice;
	}

	@Column(name = "juvenileJusticeYears")
	public Integer getJuvenileJusticeYears() {
		return this.juvenileJusticeYears;
	}

	public void setJuvenileJusticeYears(Integer juvenileJusticeYears) {
		this.juvenileJusticeYears = juvenileJusticeYears;
	}

	@Column(name = "juvenileJusticeMonths")
	public Integer getJuvenileJusticeMonths() {
		return this.juvenileJusticeMonths;
	}

	public void setJuvenileJusticeMonths(Integer juvenileJusticeMonths) {
		this.juvenileJusticeMonths = juvenileJusticeMonths;
	}

	@Column(name = "householdDynamics")
	public Integer getHouseholdDynamics() {
		return this.householdDynamics;
	}

	public void setHouseholdDynamics(Integer householdDynamics) {
		this.householdDynamics = householdDynamics;
	}

	@Column(name = "sexualOrientationGenderIdYouth")
	public Integer getSexualOrientationGenderIdYouth() {
		return this.sexualOrientationGenderIdYouth;
	}

	public void setSexualOrientationGenderIdYouth(
			Integer sexualOrientationGenderIdYouth) {
		this.sexualOrientationGenderIdYouth = sexualOrientationGenderIdYouth;
	}

	@Column(name = "sexualOrientationGenderIdFam")
	public Integer getSexualOrientationGenderIdFam() {
		return this.sexualOrientationGenderIdFam;
	}

	public void setSexualOrientationGenderIdFam(
			Integer sexualOrientationGenderIdFam) {
		this.sexualOrientationGenderIdFam = sexualOrientationGenderIdFam;
	}

	@Column(name = "housingIssuesYouth")
	public Integer getHousingIssuesYouth() {
		return this.housingIssuesYouth;
	}

	public void setHousingIssuesYouth(Integer housingIssuesYouth) {
		this.housingIssuesYouth = housingIssuesYouth;
	}

	@Column(name = "housingIssuesFam")
	public Integer getHousingIssuesFam() {
		return this.housingIssuesFam;
	}

	public void setHousingIssuesFam(Integer housingIssuesFam) {
		this.housingIssuesFam = housingIssuesFam;
	}

	@Column(name = "schoolEducationalIssuesYouth")
	public Integer getSchoolEducationalIssuesYouth() {
		return this.schoolEducationalIssuesYouth;
	}

	public void setSchoolEducationalIssuesYouth(
			Integer schoolEducationalIssuesYouth) {
		this.schoolEducationalIssuesYouth = schoolEducationalIssuesYouth;
	}

	@Column(name = "schoolEducationalIssuesFam")
	public Integer getSchoolEducationalIssuesFam() {
		return this.schoolEducationalIssuesFam;
	}

	public void setSchoolEducationalIssuesFam(Integer schoolEducationalIssuesFam) {
		this.schoolEducationalIssuesFam = schoolEducationalIssuesFam;
	}

	@Column(name = "unemploymentYouth")
	public Integer getUnemploymentYouth() {
		return this.unemploymentYouth;
	}

	public void setUnemploymentYouth(Integer unemploymentYouth) {
		this.unemploymentYouth = unemploymentYouth;
	}

	@Column(name = "unemploymentFam")
	public Integer getUnemploymentFam() {
		return this.unemploymentFam;
	}

	public void setUnemploymentFam(Integer unemploymentFam) {
		this.unemploymentFam = unemploymentFam;
	}

	@Column(name = "mentalHealthIssuesYouth")
	public Integer getMentalHealthIssuesYouth() {
		return this.mentalHealthIssuesYouth;
	}

	public void setMentalHealthIssuesYouth(Integer mentalHealthIssuesYouth) {
		this.mentalHealthIssuesYouth = mentalHealthIssuesYouth;
	}

	@Column(name = "mentalHealthIssuesFam")
	public Integer getMentalHealthIssuesFam() {
		return this.mentalHealthIssuesFam;
	}

	public void setMentalHealthIssuesFam(Integer mentalHealthIssuesFam) {
		this.mentalHealthIssuesFam = mentalHealthIssuesFam;
	}

	@Column(name = "healthIssuesYouth")
	public Integer getHealthIssuesYouth() {
		return this.healthIssuesYouth;
	}

	public void setHealthIssuesYouth(Integer healthIssuesYouth) {
		this.healthIssuesYouth = healthIssuesYouth;
	}

	@Column(name = "healthIssuesFam")
	public Integer getHealthIssuesFam() {
		return this.healthIssuesFam;
	}

	public void setHealthIssuesFam(Integer healthIssuesFam) {
		this.healthIssuesFam = healthIssuesFam;
	}

	@Column(name = "physicalDisabilityYouth")
	public Integer getPhysicalDisabilityYouth() {
		return this.physicalDisabilityYouth;
	}

	public void setPhysicalDisabilityYouth(Integer physicalDisabilityYouth) {
		this.physicalDisabilityYouth = physicalDisabilityYouth;
	}

	@Column(name = "physicalDisabilityFam")
	public Integer getPhysicalDisabilityFam() {
		return this.physicalDisabilityFam;
	}

	public void setPhysicalDisabilityFam(Integer physicalDisabilityFam) {
		this.physicalDisabilityFam = physicalDisabilityFam;
	}

	@Column(name = "mentalDisabilityYouth")
	public Integer getMentalDisabilityYouth() {
		return this.mentalDisabilityYouth;
	}

	public void setMentalDisabilityYouth(Integer mentalDisabilityYouth) {
		this.mentalDisabilityYouth = mentalDisabilityYouth;
	}

	@Column(name = "mentalDisabilityFam")
	public Integer getMentalDisabilityFam() {
		return this.mentalDisabilityFam;
	}

	public void setMentalDisabilityFam(Integer mentalDisabilityFam) {
		this.mentalDisabilityFam = mentalDisabilityFam;
	}

	@Column(name = "abuseAndNeglectYouth")
	public Integer getAbuseAndNeglectYouth() {
		return this.abuseAndNeglectYouth;
	}

	public void setAbuseAndNeglectYouth(Integer abuseAndNeglectYouth) {
		this.abuseAndNeglectYouth = abuseAndNeglectYouth;
	}

	@Column(name = "abuseAndNeglectFam")
	public Integer getAbuseAndNeglectFam() {
		return this.abuseAndNeglectFam;
	}

	public void setAbuseAndNeglectFam(Integer abuseAndNeglectFam) {
		this.abuseAndNeglectFam = abuseAndNeglectFam;
	}

	@Column(name = "alcoholDrugAbuseYouth")
	public Integer getAlcoholDrugAbuseYouth() {
		return this.alcoholDrugAbuseYouth;
	}

	public void setAlcoholDrugAbuseYouth(Integer alcoholDrugAbuseYouth) {
		this.alcoholDrugAbuseYouth = alcoholDrugAbuseYouth;
	}

	@Column(name = "alcoholDrugAbuseFam")
	public Integer getAlcoholDrugAbuseFam() {
		return this.alcoholDrugAbuseFam;
	}

	public void setAlcoholDrugAbuseFam(Integer alcoholDrugAbuseFam) {
		this.alcoholDrugAbuseFam = alcoholDrugAbuseFam;
	}

	@Column(name = "insufficientIncome")
	public Integer getInsufficientIncome() {
		return this.insufficientIncome;
	}

	public void setInsufficientIncome(Integer insufficientIncome) {
		this.insufficientIncome = insufficientIncome;
	}

	@Column(name = "activeMilitaryParent")
	public Integer getActiveMilitaryParent() {
		return this.activeMilitaryParent;
	}

	public void setActiveMilitaryParent(Integer activeMilitaryParent) {
		this.activeMilitaryParent = activeMilitaryParent;
	}

	@Column(name = "incarceratedParent")
	public Integer getIncarceratedParent() {
		return this.incarceratedParent;
	}

	public void setIncarceratedParent(Integer incarceratedParent) {
		this.incarceratedParent = incarceratedParent;
	}

	@Column(name = "incarceratedParentStatus")
	public Integer getIncarceratedParentStatus() {
		return this.incarceratedParentStatus;
	}

	public void setIncarceratedParentStatus(Integer incarceratedParentStatus) {
		this.incarceratedParentStatus = incarceratedParentStatus;
	}

	@Column(name = "referralSource")
	public Integer getReferralSource() {
		return this.referralSource;
	}

	public void setReferralSource(Integer referralSource) {
		this.referralSource = referralSource;
	}

	@Column(name = "countOUtreachReferralApproaches")
	public Integer getCountOutreachReferralApproaches() {
		return this.countOutreachReferralApproaches;
	}

	public void setCountOutreachReferralApproaches(
			Integer countOutreachReferralApproaches) {
		this.countOutreachReferralApproaches = countOutreachReferralApproaches;
	}

	@Column(name = "exchangeForSexPastThreeMonths")
	public Integer getExchangeForSexPastThreeMonths() {
		return this.exchangeForSexPastThreeMonths;
	}

	public void setExchangeForSexPastThreeMonths(
			Integer exchangeForSexPastThreeMonths) {
		this.exchangeForSexPastThreeMonths = exchangeForSexPastThreeMonths;
	}

	@Column(name = "countOfExchangeForSex")
	public Integer getCountOfExchangeForSex() {
		return this.countOfExchangeForSex;
	}

	public void setCountOfExchangeForSex(Integer countOfExchangeForSex) {
		this.countOfExchangeForSex = countOfExchangeForSex;
	}

	@Column(name = "askedOrForcedToExchangeForSex")
	public Integer getAskedOrForcedToExchangeForSex() {
		return this.askedOrForcedToExchangeForSex;
	}

	public void setAskedOrForcedToExchangeForSex(
			Integer askedOrForcedToExchangeForSex) {
		this.askedOrForcedToExchangeForSex = askedOrForcedToExchangeForSex;
	}

	@Column(name = "worstHousingSituation")
	public Integer getWorstHousingSituation() {
		return this.worstHousingSituation;
	}

	public void setWorstHousingSituation(Integer worstHousingSituation) {
		this.worstHousingSituation = worstHousingSituation;
	}

	@Column(name = "percentAmi")
	public Integer getPercentAmi() {
		return this.percentAmi;
	}

	public void setPercentAmi(Integer percentAmi) {
		this.percentAmi = percentAmi;
	}

	@Column(name = "lastPermanentStreet")
	public String getLastPermanentStreet() {
		return this.lastPermanentStreet;
	}

	public void setLastPermanentStreet(String lastPermanentStreet) {
		this.lastPermanentStreet = lastPermanentStreet;
	}

	@Column(name = "lastPermanentCity")
	public String getLastPermanentCity() {
		return this.lastPermanentCity;
	}

	public void setLastPermanentCity(String lastPermanentCity) {
		this.lastPermanentCity = lastPermanentCity;
	}

	@Column(name = "lastPermanentState")
	public String getLastPermanentState() {
		return this.lastPermanentState;
	}

	public void setLastPermanentState(String lastPermanentState) {
		this.lastPermanentState = lastPermanentState;
	}

	@Column(name = "lastPermanentZip")
	public String getLastPermanentZip() {
		return this.lastPermanentZip;
	}

	public void setLastPermanentZip(String lastPermanentZip) {
		this.lastPermanentZip = lastPermanentZip;
	}

	@Column(name = "addressDataQuality")
	public Integer getAddressDataQuality() {
		return this.addressDataQuality;
	}

	public void setAddressDataQuality(Integer addressDataQuality) {
		this.addressDataQuality = addressDataQuality;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateCreated", length = 10)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateUpdated", length = 10)
	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

}
