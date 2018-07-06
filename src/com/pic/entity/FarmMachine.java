package com.pic.entity;

import java.util.Date;

public class FarmMachine {
    private Integer id;

    private Boolean workStatus;

    private String machineType;

    private String brandName;

    private String modelNo;

    private String operationPower;

    private String plateNo;

    private String registAddr;

    private String deviceImei;

    private String deviceModelNo;

    private String machinePower;

    private String maxOperateTime;

    private String machineToolWidth;

    private Date createTime;

    private Date registTime;

    private Integer oilPool;

    private String phone;

    private Integer oilMax;

    private Integer oilMin;

    private Double oilAlarm;

    private Integer batteryEleAlarm;

    private Integer modEleAlarm;

    private Date updatetime;

    private String machineName;

    private Integer keepRepairDistance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(Boolean workStatus) {
        this.workStatus = workStatus;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType == null ? null : machineType.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo == null ? null : modelNo.trim();
    }

    public String getOperationPower() {
        return operationPower;
    }

    public void setOperationPower(String operationPower) {
        this.operationPower = operationPower == null ? null : operationPower.trim();
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo == null ? null : plateNo.trim();
    }

    public String getRegistAddr() {
        return registAddr;
    }

    public void setRegistAddr(String registAddr) {
        this.registAddr = registAddr == null ? null : registAddr.trim();
    }

    public String getDeviceImei() {
        return deviceImei;
    }

    public void setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei == null ? null : deviceImei.trim();
    }

    public String getDeviceModelNo() {
        return deviceModelNo;
    }

    public void setDeviceModelNo(String deviceModelNo) {
        this.deviceModelNo = deviceModelNo == null ? null : deviceModelNo.trim();
    }

    public String getMachinePower() {
        return machinePower;
    }

    public void setMachinePower(String machinePower) {
        this.machinePower = machinePower == null ? null : machinePower.trim();
    }

    public String getMaxOperateTime() {
        return maxOperateTime;
    }

    public void setMaxOperateTime(String maxOperateTime) {
        this.maxOperateTime = maxOperateTime == null ? null : maxOperateTime.trim();
    }

    public String getMachineToolWidth() {
        return machineToolWidth;
    }

    public void setMachineToolWidth(String machineToolWidth) {
        this.machineToolWidth = machineToolWidth == null ? null : machineToolWidth.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Integer getOilPool() {
        return oilPool;
    }

    public void setOilPool(Integer oilPool) {
        this.oilPool = oilPool;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getOilMax() {
        return oilMax;
    }

    public void setOilMax(Integer oilMax) {
        this.oilMax = oilMax;
    }

    public Integer getOilMin() {
        return oilMin;
    }

    public void setOilMin(Integer oilMin) {
        this.oilMin = oilMin;
    }

    public Double getOilAlarm() {
        return oilAlarm;
    }

    public void setOilAlarm(Double oilAlarm) {
        this.oilAlarm = oilAlarm;
    }

    public Integer getBatteryEleAlarm() {
        return batteryEleAlarm;
    }

    public void setBatteryEleAlarm(Integer batteryEleAlarm) {
        this.batteryEleAlarm = batteryEleAlarm;
    }

    public Integer getModEleAlarm() {
        return modEleAlarm;
    }

    public void setModEleAlarm(Integer modEleAlarm) {
        this.modEleAlarm = modEleAlarm;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName == null ? null : machineName.trim();
    }

    public Integer getKeepRepairDistance() {
        return keepRepairDistance;
    }

    public void setKeepRepairDistance(Integer keepRepairDistance) {
        this.keepRepairDistance = keepRepairDistance;
    }
}