package com.dhl.ocnt.model;

import java.util.Date;

public class HandlingUnitInMovement {

    private String id;                          //      HUIM_ID     VARCHAR2(35) NOT NULL,
    private String huId;                        //      HU_ID       VARCHAR2(35),
    private String movementId;                  //      MOVEMENT_ID VARCHAR2(35),
    private String originalFacilityId;          //      ORI_FAC_ID  VARCHAR2(6),
    private Date movementScheduleDepartureDate; //      MVMT_SCHD_DEPARTURE_DT TIMESTAMP,
    private String destinationFacilityId;       //      DEST_FAC_ID               VARCHAR2(6),
    private String firstSecDesig;               //      FIRST_SEC_DESIG           VARCHAR2(6),
    private String lastSecDesig;                //      LAST_SEC_DESIG            VARCHAR2(6),
    private String sealNumber;                  //      SEAL_NUMBER               VARCHAR2(35),
    private String sectorPosId;                 //      HUIM_SECTOR_POS_ID        VARCHAR2(6),
    private String sectorPosNum;                //      HUIM_SECTOR_POS_NUM       NUMBER(10,0),
    private String sectorCustomStatus;          //      HUIM_SECTOR_CUSTOM_STATUS VARCHAR2(6),    
    private String huTyCd;
    
    public String getHuTyCd() {
		return huTyCd;
	}

	public void setHuTyCd(String huTyCd) {
		this.huTyCd = huTyCd;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHuId() {
        return huId;
    }

    public void setHuId(String huId) {
        this.huId = huId;
    }

    public String getMovementId() {
        return movementId;
    }

    public void setMovementId(String movementId) {
        this.movementId = movementId;
    }

    public String getOriginalFacilityId() {
        return originalFacilityId;
    }

    public void setOriginalFacilityId(String originalFacilityId) {
        this.originalFacilityId = originalFacilityId;
    }

    public Date getMovementScheduleDepartureDate() {
        return movementScheduleDepartureDate;
    }

    public void setMovementScheduleDepartureDate(Date movementScheduleDepartureDate) {
        this.movementScheduleDepartureDate = movementScheduleDepartureDate;
    }

    public String getDestinationFacilityId() {
        return destinationFacilityId;
    }

    public void setDestinationFacilityId(String destinationFacilityId) {
        this.destinationFacilityId = destinationFacilityId;
    }

    public String getFirstSecDesig() {
        return firstSecDesig;
    }

    public void setFirstSecDesig(String firstSecDesig) {
        this.firstSecDesig = firstSecDesig;
    }

    public String getLastSecDesig() {
        return lastSecDesig;
    }

    public void setLastSecDesig(String lastSecDesig) {
        this.lastSecDesig = lastSecDesig;
    }

    public String getSealNumber() {
        return sealNumber;
    }

    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    public String getSectorPosId() {
        return sectorPosId;
    }

    public void setSectorPosId(String sectorPosId) {
        this.sectorPosId = sectorPosId;
    }

    public String getSectorPosNum() {
        return sectorPosNum;
    }

    public void setSectorPosNum(String sectorPosNum) {
        this.sectorPosNum = sectorPosNum;
    }

    public String getSectorCustomStatus() {
        return sectorCustomStatus;
    }

    public void setSectorCustomStatus(String sectorCustomStatus) {
        this.sectorCustomStatus = sectorCustomStatus;
    }
}
