package com.pic.entity;

import java.util.Date;

public class DBs {
    private Integer id;

    private String imei;

    private Integer acc;

    private Integer alarm;

    private Integer vOilAmount;

    private Integer vBatteryEle;

    private Integer vModEle;

    private String gps;

    private Double avgSpeed;

    private Double distance;

    private Double oilMount;

    private Double batteryEle;

    private Double modEle;

    private Integer status;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public Integer getAcc() {
        return acc;
    }

    public void setAcc(Integer acc) {
        this.acc = acc;
    }

    public Integer getAlarm() {
        return alarm;
    }

    public void setAlarm(Integer alarm) {
        this.alarm = alarm;
    }

    public Integer getvOilAmount() {
        return vOilAmount;
    }

    public void setvOilAmount(Integer vOilAmount) {
        this.vOilAmount = vOilAmount;
    }

    public Integer getvBatteryEle() {
        return vBatteryEle;
    }

    public void setvBatteryEle(Integer vBatteryEle) {
        this.vBatteryEle = vBatteryEle;
    }

    public Integer getvModEle() {
        return vModEle;
    }

    public void setvModEle(Integer vModEle) {
        this.vModEle = vModEle;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps == null ? null : gps.trim();
    }

    public Double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(Double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getOilMount() {
        return oilMount;
    }

    public void setOilMount(Double oilMount) {
        this.oilMount = oilMount;
    }

    public Double getBatteryEle() {
        return batteryEle;
    }

    public void setBatteryEle(Double batteryEle) {
        this.batteryEle = batteryEle;
    }

    public Double getModEle() {
        return modEle;
    }

    public void setModEle(Double modEle) {
        this.modEle = modEle;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}