package com.citiustech.mrr;

import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */
@javax.persistence.Table(name = "CPMM_CHSE_LST")
@javax.persistence.Entity
public class CPMM1 implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(name = "CPMM_ID_GENERATOR", sequenceName = "CPMM_ID_SEQ")
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CPMM_ID_GENERATOR")
    @javax.persistence.Column(name = "CPMM_ID")
    private Long cpmmId;

    @javax.persistence.Column(name = "CPMM_CHSE_CD")
    private String cpmmChseCd;

    @javax.persistence.Column(name = "CMM_ID")
    private Long cmmId;

    @javax.persistence.Column(name = "CMM_CHSE_CD")
    private String cmmChaseCode;

    @javax.persistence.Column(name = "RAW_CHSE_ID")
    private Long rawChseId;

    @javax.persistence.Column(name = "CMPG_ID")
    private Long cpmgId;

    @javax.persistence.Column(name = "CMPG_CD")
    private String cmpgCd;

    @javax.persistence.Column(name = "MEM_ID")
    private Long memId;

    @javax.persistence.Column(name = "ADDR_MSTR_ID")
    private Long addrId;

    @javax.persistence.Transient
    private String addrZipCd;

    @javax.persistence.Column(name = "PROV_ID")
    private Long provId;

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

    @javax.persistence.Column(name = "HLTHPLN_ID")
    private Long healthPlanId;

    @javax.persistence.Column(name = "HLTHPLN_CD")
    private String healthPlanCd;

    @javax.persistence.Column(name = "LOB_ID")
    private Long lobId;

    @javax.persistence.Column(name = "LOB_CD")
    private String lobCd;

    @javax.persistence.Column(name = "PROD_ID")
    private Long prodId;

    @javax.persistence.Column(name = "PROD_CD")
    private String productCode;

    @javax.persistence.Column(name = "MOC_DTL_ID")
    private Long mocDtlId;

    @javax.persistence.Column(name = "DNRTR_QLFNG_EVNT_DT")
    private Date denominatorQualifyingEventDate;

    @javax.persistence.Column(name = "ASSGD_TO_LGN_ID")
    private String assgdToUser;

    @javax.persistence.Column(name = "CPMM_CHSE_STS_MSTR_ID")
    private Long cpmmChaseStatusMasterId;

    @javax.persistence.Column(name = "CPMM_CHSE_STS_MSTR_CD")
    private String cpmmChseStsCd;

    @javax.persistence.Column(name = "CP_CHSE_CD")
    private String cpChaseCode;

    @javax.persistence.Column(name = "OVRD_CNT")
    private Long overrideCount;

    @javax.persistence.Column(name = "VLD_FRM_DT")
    private Date validFromDate;

    @javax.persistence.Column(name = "VLD_TO_DT")
    private Date validToDate;

    @javax.persistence.Column(name = "DEL_FLG")
    private Boolean deleted;

    @javax.persistence.Column(name = "ACT_CD")
    private String action;

    @javax.persistence.Column(name = "LOGIN_USR")
    private String loginUser;

    @javax.persistence.Column(name = "PRVS_ACTY")
    private String previousActivity;

    @javax.persistence.Column(name = "SUB_PROCESS_INSTANCE_ID")
    private Long subProcessInstanceId;

    @javax.persistence.Column(name = "OWNER")
    private String owner;

    @javax.persistence.Column(name = "CPMM_CHSE_DUE_DT")
    private java.util.Date chseDueDt;
    
    @javax.persistence.Column(name = "PARENT_PROCESS_ID")
    private java.lang.Long parentProcessID;
    
    @javax.persistence.Column(name = "MNL_CPMM_CHSE_FLG")
    private boolean manualChase;
    
    @javax.persistence.Transient
	private java.lang.String defaultRule;
	
	@javax.persistence.Transient
	private java.lang.String prefMoc;
    
    public CPMM1() {
    }

	public Long getCpmmId() {
		return cpmmId;
	}

	public void setCpmmId(Long cpmmId) {
		this.cpmmId = cpmmId;
	}

	public String getCpmmChseCd() {
		return cpmmChseCd;
	}

	public void setCpmmChseCd(String cpmmChseCd) {
		this.cpmmChseCd = cpmmChseCd;
	}

	public Long getCmmId() {
		return cmmId;
	}

	public void setCmmId(Long cmmId) {
		this.cmmId = cmmId;
	}

	public String getCmmChaseCode() {
		return cmmChaseCode;
	}

	public void setCmmChaseCode(String cmmChaseCode) {
		this.cmmChaseCode = cmmChaseCode;
	}

	public Long getRawChseId() {
		return rawChseId;
	}

	public void setRawChseId(Long rawChseId) {
		this.rawChseId = rawChseId;
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

	public Long getMemId() {
		return memId;
	}

	public void setMemId(Long memId) {
		this.memId = memId;
	}

	public Long getAddrId() {
		return addrId;
	}

	public void setAddrId(Long addrId) {
		this.addrId = addrId;
	}

	public String getAddrZipCd() {
		return addrZipCd;
	}

	public void setAddrZipCd(String addrZipCd) {
		this.addrZipCd = addrZipCd;
	}

	public Long getProvId() {
		return provId;
	}

	public void setProvId(Long provId) {
		this.provId = provId;
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

	public Long getHealthPlanId() {
		return healthPlanId;
	}

	public void setHealthPlanId(Long healthPlanId) {
		this.healthPlanId = healthPlanId;
	}

	public String getHealthPlanCd() {
		return healthPlanCd;
	}

	public void setHealthPlanCd(String healthPlanCd) {
		this.healthPlanCd = healthPlanCd;
	}

	public Long getLobId() {
		return lobId;
	}

	public void setLobId(Long lobId) {
		this.lobId = lobId;
	}

	public String getLobCd() {
		return lobCd;
	}

	public void setLobCd(String lobCd) {
		this.lobCd = lobCd;
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Long getMocDtlId() {
		return mocDtlId;
	}

	public void setMocDtlId(Long mocDtlId) {
		this.mocDtlId = mocDtlId;
	}

	public Date getDenominatorQualifyingEventDate() {
		return denominatorQualifyingEventDate;
	}

	public void setDenominatorQualifyingEventDate(Date denominatorQualifyingEventDate) {
		this.denominatorQualifyingEventDate = denominatorQualifyingEventDate;
	}

	public String getAssgdToUser() {
		return assgdToUser;
	}

	public void setAssgdToUser(String assgdToUser) {
		this.assgdToUser = assgdToUser;
	}

	public Long getCpmmChaseStatusMasterId() {
		return cpmmChaseStatusMasterId;
	}

	public void setCpmmChaseStatusMasterId(Long cpmmChaseStatusMasterId) {
		this.cpmmChaseStatusMasterId = cpmmChaseStatusMasterId;
	}

	public String getCpmmChseStsCd() {
		return cpmmChseStsCd;
	}

	public void setCpmmChseStsCd(String cpmmChseStsCd) {
		this.cpmmChseStsCd = cpmmChseStsCd;
	}

	public String getCpChaseCode() {
		return cpChaseCode;
	}

	public void setCpChaseCode(String cpChaseCode) {
		this.cpChaseCode = cpChaseCode;
	}

	public Long getOverrideCount() {
		return overrideCount;
	}

	public void setOverrideCount(Long overrideCount) {
		this.overrideCount = overrideCount;
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

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	public String getPreviousActivity() {
		return previousActivity;
	}

	public void setPreviousActivity(String previousActivity) {
		this.previousActivity = previousActivity;
	}

	public Long getSubProcessInstanceId() {
		return subProcessInstanceId;
	}

	public void setSubProcessInstanceId(Long subProcessInstanceId) {
		this.subProcessInstanceId = subProcessInstanceId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public java.util.Date getChseDueDt() {
		return chseDueDt;
	}

	public void setChseDueDt(java.util.Date chseDueDt) {
		this.chseDueDt = chseDueDt;
	}

	public java.lang.Long getParentProcessID() {
		return parentProcessID;
	}

	public void setParentProcessID(java.lang.Long parentProcessID) {
		this.parentProcessID = parentProcessID;
	}

	public boolean isManualChase() {
		return manualChase;
	}

	public void setManualChase(boolean manualChase) {
		this.manualChase = manualChase;
	}

	public java.lang.String getDefaultRule() {
		return defaultRule;
	}

	public void setDefaultRule(java.lang.String defaultRule) {
		this.defaultRule = defaultRule;
	}

	public java.lang.String getPrefMoc() {
		return prefMoc;
	}

	public void setPrefMoc(java.lang.String prefMoc) {
		this.prefMoc = prefMoc;
	}

	public CPMM1(Long cpmmId, String cpmmChseCd, Long cmmId, String cmmChaseCode, Long rawChseId, Long cpmgId,
			String cmpgCd, Long memId, Long addrId, String addrZipCd, Long provId, Integer msrVer, Long measureId,
			String msrCd, Long submsrId, String submsrCd, Long healthPlanId, String healthPlanCd, Long lobId,
			String lobCd, Long prodId, String productCode, Long mocDtlId, Date denominatorQualifyingEventDate,
			String assgdToUser, Long cpmmChaseStatusMasterId, String cpmmChseStsCd, String cpChaseCode,
			Long overrideCount, Date validFromDate, Date validToDate, Boolean deleted, String action, String loginUser,
			String previousActivity, Long subProcessInstanceId, String owner, Date chseDueDt, Long parentProcessID,
			boolean manualChase, String defaultRule, String prefMoc) {
		super();
		this.cpmmId = cpmmId;
		this.cpmmChseCd = cpmmChseCd;
		this.cmmId = cmmId;
		this.cmmChaseCode = cmmChaseCode;
		this.rawChseId = rawChseId;
		this.cpmgId = cpmgId;
		this.cmpgCd = cmpgCd;
		this.memId = memId;
		this.addrId = addrId;
		this.addrZipCd = addrZipCd;
		this.provId = provId;
		this.msrVer = msrVer;
		this.measureId = measureId;
		this.msrCd = msrCd;
		this.submsrId = submsrId;
		this.submsrCd = submsrCd;
		this.healthPlanId = healthPlanId;
		this.healthPlanCd = healthPlanCd;
		this.lobId = lobId;
		this.lobCd = lobCd;
		this.prodId = prodId;
		this.productCode = productCode;
		this.mocDtlId = mocDtlId;
		this.denominatorQualifyingEventDate = denominatorQualifyingEventDate;
		this.assgdToUser = assgdToUser;
		this.cpmmChaseStatusMasterId = cpmmChaseStatusMasterId;
		this.cpmmChseStsCd = cpmmChseStsCd;
		this.cpChaseCode = cpChaseCode;
		this.overrideCount = overrideCount;
		this.validFromDate = validFromDate;
		this.validToDate = validToDate;
		this.deleted = deleted;
		this.action = action;
		this.loginUser = loginUser;
		this.previousActivity = previousActivity;
		this.subProcessInstanceId = subProcessInstanceId;
		this.owner = owner;
		this.chseDueDt = chseDueDt;
		this.parentProcessID = parentProcessID;
		this.manualChase = manualChase;
		this.defaultRule = defaultRule;
		this.prefMoc = prefMoc;
	}

	@Override
	public String toString() {
		return "CPMM1 [cpmmId=" + cpmmId + ", cpmmChseCd=" + cpmmChseCd + ", cmmId=" + cmmId + ", cmmChaseCode="
				+ cmmChaseCode + ", cpmmChseStsCd=" + cpmmChseStsCd + ", cpChaseCode=" + cpChaseCode + "]";
	}
    
}