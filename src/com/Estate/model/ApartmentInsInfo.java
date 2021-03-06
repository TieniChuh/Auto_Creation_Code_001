package com.Estate.model;

import java.util.Date;

public class ApartmentInsInfo {
    private String id;

    private String insuranceno;

    private String insuredname;

    private Date insstartdate;

    private Date insenddate;

    private String inspropertyaddr;

    private String inscompanyname;

    private Double insamountsum;

    private Double premiumsum;

    private Date paydeadline;

    private String policystate;

    private String attachedinfo;

    private String attrabute1;

    private String attribute2;

    private String attribute3;

    private String createby;

    private Date createon;

    private String modifyby;

    private Date modifyon;

    private String owner;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getInsuranceno() {
        return insuranceno;
    }

    public void setInsuranceno(String insuranceno) {
        this.insuranceno = insuranceno == null ? null : insuranceno.trim();
    }

    public String getInsuredname() {
        return insuredname;
    }

    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname == null ? null : insuredname.trim();
    }

    public Date getInsstartdate() {
        return insstartdate;
    }

    public void setInsstartdate(Date insstartdate) {
        this.insstartdate = insstartdate;
    }

    public Date getInsenddate() {
        return insenddate;
    }

    public void setInsenddate(Date insenddate) {
        this.insenddate = insenddate;
    }

    public String getInspropertyaddr() {
        return inspropertyaddr;
    }

    public void setInspropertyaddr(String inspropertyaddr) {
        this.inspropertyaddr = inspropertyaddr == null ? null : inspropertyaddr.trim();
    }

    public String getInscompanyname() {
        return inscompanyname;
    }

    public void setInscompanyname(String inscompanyname) {
        this.inscompanyname = inscompanyname == null ? null : inscompanyname.trim();
    }

    public Double getInsamountsum() {
        return insamountsum;
    }

    public void setInsamountsum(Double insamountsum) {
        this.insamountsum = insamountsum;
    }

    public Double getPremiumsum() {
        return premiumsum;
    }

    public void setPremiumsum(Double premiumsum) {
        this.premiumsum = premiumsum;
    }

    public Date getPaydeadline() {
        return paydeadline;
    }

    public void setPaydeadline(Date paydeadline) {
        this.paydeadline = paydeadline;
    }

    public String getPolicystate() {
        return policystate;
    }

    public void setPolicystate(String policystate) {
        this.policystate = policystate == null ? null : policystate.trim();
    }

    public String getAttachedinfo() {
        return attachedinfo;
    }

    public void setAttachedinfo(String attachedinfo) {
        this.attachedinfo = attachedinfo == null ? null : attachedinfo.trim();
    }

    public String getAttrabute1() {
        return attrabute1;
    }

    public void setAttrabute1(String attrabute1) {
        this.attrabute1 = attrabute1 == null ? null : attrabute1.trim();
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreateon() {
        return createon;
    }

    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    public String getModifyby() {
        return modifyby;
    }

    public void setModifyby(String modifyby) {
        this.modifyby = modifyby == null ? null : modifyby.trim();
    }

    public Date getModifyon() {
        return modifyon;
    }

    public void setModifyon(Date modifyon) {
        this.modifyon = modifyon;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}