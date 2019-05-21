package com.citiustech.mrr;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * This class was automatically generated by the data modeler tool.
 */
@javax.persistence.Table(name = "CMM_CHSE_LST")
@javax.persistence.Entity
public class CMM1 implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "CMM_ID_GENERATOR", sequenceName = "CMM_ID_SEQ")
	@javax.persistence.GeneratedValue(generator = "CMM_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Column(name = "CMM_ID")
	private Long cmmId;

	@javax.persistence.Column(name = "CMM_CHSE_CD")
	private String cmmChseCd;

	@javax.persistence.Column(name = "MEM_ID")
	private Long memId;

	@javax.persistence.Column(name = "CMPG_ID")
	private Long cpmgId;

	@javax.persistence.Column(name = "CMPG_CD")
	private String cmpgCd;

	@javax.persistence.Column(name = "MSR_VER")
	private Integer msrVer;

	@javax.persistence.Column(name = "MSR_ID")
	private Long measureId;

	@javax.persistence.Column(name = "MSR_CD")
	private String msrCd;

	@javax.persistence.Column(name = "SUBMSR_ID")
	private Long submsrId;

	@javax.persistence.Column(name = "SUBMSR_CD")
	private String submsrCd;

	@javax.persistence.Column(name = "CMM_CHSE_STS_MSTR_ID")
	private Long cmmChseStsId;

	@javax.persistence.Column(name = "CMM_CHSE_STS_MSTR_CD")
	private String cmmChseSts;

	@javax.persistence.Column(name = "VLD_FRM_DT")
	private Date validFromDate;

	@javax.persistence.Column(name = "VLD_TO_DT")
	private Date validToDate;

	@javax.persistence.Column(name = "DEL_FLG")
	private Boolean deleted;

	@javax.persistence.Column(name = "RAW_CHSE_ID")
	private Long rawChseId;

	@javax.persistence.Column(name = "CMM_CHSE_DUE_DT")
	private Date cmmChseDueDt;

	@javax.persistence.Column(name = "OVRD_CNT")
	private Long ovrdCnt;

	@javax.persistence.Column(name = "RPT_FRM_DT")
	private Date rptFrom;

	@javax.persistence.Column(name = "RPT_TO_DT")
	private Date rptTo;

	@javax.persistence.Column(name = "ACT_CD")
	private String action;

	@javax.persistence.Column(name = "ASSGD_TO_LGN_ID")
	private String assignToUser;

	@javax.persistence.Column(name = "PROCESS_INSTANCE_ID")
	private Long processInstanceId;

	@javax.persistence.Transient
	private List<com.citiustech.mrr.CPMM1> cpmmList;

	@javax.persistence.Transient
	private Integer counter;

	@javax.persistence.Transient
	private Integer abstracterCounter;

	@javax.persistence.Transient
	private java.lang.String defaultRule;

	@javax.persistence.Column(name = "ASSGD_DT")
	private Date assignedDate;

	public CMM1() {
	}

	public Long getCmmId() {
		return cmmId;
	}

	public void setCmmId(Long cmmId) {
		this.cmmId = cmmId;
	}

	public String getCmmChseCd() {
		return cmmChseCd;
	}

	public void setCmmChseCd(String cmmChseCd) {
		this.cmmChseCd = cmmChseCd;
	}

	public Long getMemId() {
		return memId;
	}

	public void setMemId(Long memId) {
		this.memId = memId;
	}

	public Long getCpmgId() {
		return cpmgId;
	}

	public void setCpmgId(Long cpmgId) {
		this.cpmgId = cpmgId;
	}

	public String getCmpgCd() {
		return cmpgCd;
	}

	public void setCmpgCd(String cmpgCd) {
		this.cmpgCd = cmpgCd;
	}

	public Integer getMsrVer() {
		return msrVer;
	}

	public void setMsrVer(Integer msrVer) {
		this.msrVer = msrVer;
	}

	public Long getMeasureId() {
		return measureId;
	}

	public void setMeasureId(Long measureId) {
		this.measureId = measureId;
	}

	public String getMsrCd() {
		return msrCd;
	}

	public void setMsrCd(String msrCd) {
		this.msrCd = msrCd;
	}

	public Long getSubmsrId() {
		return submsrId;
	}

	public void setSubmsrId(Long submsrId) {
		this.submsrId = submsrId;
	}

	public String getSubmsrCd() {
		return submsrCd;
	}

	public void setSubmsrCd(String submsrCd) {
		this.submsrCd = submsrCd;
	}

	public Long getCmmChseStsId() {
		return cmmChseStsId;
	}

	public void setCmmChseStsId(Long cmmChseStsId) {
		this.cmmChseStsId = cmmChseStsId;
	}

	public String getCmmChseSts() {
		return cmmChseSts;
	}

	public void setCmmChseSts(String cmmChseSts) {
		this.cmmChseSts = cmmChseSts;
	}

	public Date getValidFromDate() {
		return validFromDate;
	}

	public void setValidFromDate(Date validFromDate) {
		this.validFromDate = validFromDate;
	}

	public Date getValidToDate() {
		return validToDate;
	}

	public void setValidToDate(Date validToDate) {
		this.validToDate = validToDate;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Long getRawChseId() {
		return rawChseId;
	}

	public void setRawChseId(Long rawChseId) {
		this.rawChseId = rawChseId;
	}

	public Date getCmmChseDueDt() {
		return cmmChseDueDt;
	}

	public void setCmmChseDueDt(Date cmmChseDueDt) {
		this.cmmChseDueDt = cmmChseDueDt;
	}

	public Long getOvrdCnt() {
		return ovrdCnt;
	}

	public void setOvrdCnt(Long ovrdCnt) {
		this.ovrdCnt = ovrdCnt;
	}

	public Date getRptFrom() {
		return rptFrom;
	}

	public void setRptFrom(Date rptFrom) {
		this.rptFrom = rptFrom;
	}

	public Date getRptTo() {
		return rptTo;
	}

	public void setRptTo(Date rptTo) {
		this.rptTo = rptTo;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAssignToUser() {
		return assignToUser;
	}

	public void setAssignToUser(String assignToUser) {
		this.assignToUser = assignToUser;
	}

	public List<com.citiustech.mrr.CPMM1> getCpmmList() {
		return cpmmList;
	}

	public void setCpmmList(List<com.citiustech.mrr.CPMM1> cpmmList) {
		this.cpmmList = cpmmList;
	}

	public Long getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public Integer getAbstracterCounter() {
		return abstracterCounter;
	}

	public void setAbstracterCounter(Integer abstracterCounter) {
		this.abstracterCounter = abstracterCounter;
	}

	public java.lang.String getDefaultRule() {
		return this.defaultRule;
	}

	public void setDefaultRule(java.lang.String defaultRule) {
		this.defaultRule = defaultRule;
	}

	public Date getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	public CMM1(java.lang.Long cmmId, java.lang.String cmmChseCd,
			java.lang.Long memId, java.lang.Long cpmgId,
			java.lang.String cmpgCd, java.lang.Integer msrVer,
			java.lang.Long measureId, java.lang.String msrCd,
			java.lang.Long submsrId, java.lang.String submsrCd,
			java.lang.Long cmmChseStsId, java.lang.String cmmChseSts,
			java.util.Date validFromDate, java.util.Date validToDate,
			java.lang.Boolean deleted, java.lang.Long rawChseId,
			java.util.Date cmmChseDueDt, java.lang.Long ovrdCnt,
			java.util.Date rptFrom, java.util.Date rptTo,
			java.lang.String action, java.lang.String assignToUser,
			java.lang.Long processInstanceId,
			java.util.List<com.citiustech.mrr.CPMM1> cpmmList,
			java.lang.Integer counter, java.lang.Integer abstracterCounter,
			java.lang.String defaultRule, java.util.Date assignedDate) {
		this.cmmId = cmmId;
		this.cmmChseCd = cmmChseCd;
		this.memId = memId;
		this.cpmgId = cpmgId;
		this.cmpgCd = cmpgCd;
		this.msrVer = msrVer;
		this.measureId = measureId;
		this.msrCd = msrCd;
		this.submsrId = submsrId;
		this.submsrCd = submsrCd;
		this.cmmChseStsId = cmmChseStsId;
		this.cmmChseSts = cmmChseSts;
		this.validFromDate = validFromDate;
		this.validToDate = validToDate;
		this.deleted = deleted;
		this.rawChseId = rawChseId;
		this.cmmChseDueDt = cmmChseDueDt;
		this.ovrdCnt = ovrdCnt;
		this.rptFrom = rptFrom;
		this.rptTo = rptTo;
		this.action = action;
		this.assignToUser = assignToUser;
		this.processInstanceId = processInstanceId;
		this.cpmmList = cpmmList;
		this.counter = counter;
		this.abstracterCounter = abstracterCounter;
		this.defaultRule = defaultRule;
		this.assignedDate = assignedDate;
	}
}