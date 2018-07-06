package com.pic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DBsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andAccIsNull() {
            addCriterion("acc is null");
            return (Criteria) this;
        }

        public Criteria andAccIsNotNull() {
            addCriterion("acc is not null");
            return (Criteria) this;
        }

        public Criteria andAccEqualTo(Integer value) {
            addCriterion("acc =", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccNotEqualTo(Integer value) {
            addCriterion("acc <>", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccGreaterThan(Integer value) {
            addCriterion("acc >", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccGreaterThanOrEqualTo(Integer value) {
            addCriterion("acc >=", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccLessThan(Integer value) {
            addCriterion("acc <", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccLessThanOrEqualTo(Integer value) {
            addCriterion("acc <=", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccIn(List<Integer> values) {
            addCriterion("acc in", values, "acc");
            return (Criteria) this;
        }

        public Criteria andAccNotIn(List<Integer> values) {
            addCriterion("acc not in", values, "acc");
            return (Criteria) this;
        }

        public Criteria andAccBetween(Integer value1, Integer value2) {
            addCriterion("acc between", value1, value2, "acc");
            return (Criteria) this;
        }

        public Criteria andAccNotBetween(Integer value1, Integer value2) {
            addCriterion("acc not between", value1, value2, "acc");
            return (Criteria) this;
        }

        public Criteria andAlarmIsNull() {
            addCriterion("alarm is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIsNotNull() {
            addCriterion("alarm is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmEqualTo(Integer value) {
            addCriterion("alarm =", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmNotEqualTo(Integer value) {
            addCriterion("alarm <>", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmGreaterThan(Integer value) {
            addCriterion("alarm >", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm >=", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmLessThan(Integer value) {
            addCriterion("alarm <", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmLessThanOrEqualTo(Integer value) {
            addCriterion("alarm <=", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmIn(List<Integer> values) {
            addCriterion("alarm in", values, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmNotIn(List<Integer> values) {
            addCriterion("alarm not in", values, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmBetween(Integer value1, Integer value2) {
            addCriterion("alarm between", value1, value2, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm not between", value1, value2, "alarm");
            return (Criteria) this;
        }

        public Criteria andVOilAmountIsNull() {
            addCriterion("v_oil_amount is null");
            return (Criteria) this;
        }

        public Criteria andVOilAmountIsNotNull() {
            addCriterion("v_oil_amount is not null");
            return (Criteria) this;
        }

        public Criteria andVOilAmountEqualTo(Integer value) {
            addCriterion("v_oil_amount =", value, "vOilAmount");
            return (Criteria) this;
        }

        public Criteria andVOilAmountNotEqualTo(Integer value) {
            addCriterion("v_oil_amount <>", value, "vOilAmount");
            return (Criteria) this;
        }

        public Criteria andVOilAmountGreaterThan(Integer value) {
            addCriterion("v_oil_amount >", value, "vOilAmount");
            return (Criteria) this;
        }

        public Criteria andVOilAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("v_oil_amount >=", value, "vOilAmount");
            return (Criteria) this;
        }

        public Criteria andVOilAmountLessThan(Integer value) {
            addCriterion("v_oil_amount <", value, "vOilAmount");
            return (Criteria) this;
        }

        public Criteria andVOilAmountLessThanOrEqualTo(Integer value) {
            addCriterion("v_oil_amount <=", value, "vOilAmount");
            return (Criteria) this;
        }

        public Criteria andVOilAmountIn(List<Integer> values) {
            addCriterion("v_oil_amount in", values, "vOilAmount");
            return (Criteria) this;
        }

        public Criteria andVOilAmountNotIn(List<Integer> values) {
            addCriterion("v_oil_amount not in", values, "vOilAmount");
            return (Criteria) this;
        }

        public Criteria andVOilAmountBetween(Integer value1, Integer value2) {
            addCriterion("v_oil_amount between", value1, value2, "vOilAmount");
            return (Criteria) this;
        }

        public Criteria andVOilAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("v_oil_amount not between", value1, value2, "vOilAmount");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleIsNull() {
            addCriterion("v_battery_ele is null");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleIsNotNull() {
            addCriterion("v_battery_ele is not null");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleEqualTo(Integer value) {
            addCriterion("v_battery_ele =", value, "vBatteryEle");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleNotEqualTo(Integer value) {
            addCriterion("v_battery_ele <>", value, "vBatteryEle");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleGreaterThan(Integer value) {
            addCriterion("v_battery_ele >", value, "vBatteryEle");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleGreaterThanOrEqualTo(Integer value) {
            addCriterion("v_battery_ele >=", value, "vBatteryEle");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleLessThan(Integer value) {
            addCriterion("v_battery_ele <", value, "vBatteryEle");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleLessThanOrEqualTo(Integer value) {
            addCriterion("v_battery_ele <=", value, "vBatteryEle");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleIn(List<Integer> values) {
            addCriterion("v_battery_ele in", values, "vBatteryEle");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleNotIn(List<Integer> values) {
            addCriterion("v_battery_ele not in", values, "vBatteryEle");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleBetween(Integer value1, Integer value2) {
            addCriterion("v_battery_ele between", value1, value2, "vBatteryEle");
            return (Criteria) this;
        }

        public Criteria andVBatteryEleNotBetween(Integer value1, Integer value2) {
            addCriterion("v_battery_ele not between", value1, value2, "vBatteryEle");
            return (Criteria) this;
        }

        public Criteria andVModEleIsNull() {
            addCriterion("v_mod_ele is null");
            return (Criteria) this;
        }

        public Criteria andVModEleIsNotNull() {
            addCriterion("v_mod_ele is not null");
            return (Criteria) this;
        }

        public Criteria andVModEleEqualTo(Integer value) {
            addCriterion("v_mod_ele =", value, "vModEle");
            return (Criteria) this;
        }

        public Criteria andVModEleNotEqualTo(Integer value) {
            addCriterion("v_mod_ele <>", value, "vModEle");
            return (Criteria) this;
        }

        public Criteria andVModEleGreaterThan(Integer value) {
            addCriterion("v_mod_ele >", value, "vModEle");
            return (Criteria) this;
        }

        public Criteria andVModEleGreaterThanOrEqualTo(Integer value) {
            addCriterion("v_mod_ele >=", value, "vModEle");
            return (Criteria) this;
        }

        public Criteria andVModEleLessThan(Integer value) {
            addCriterion("v_mod_ele <", value, "vModEle");
            return (Criteria) this;
        }

        public Criteria andVModEleLessThanOrEqualTo(Integer value) {
            addCriterion("v_mod_ele <=", value, "vModEle");
            return (Criteria) this;
        }

        public Criteria andVModEleIn(List<Integer> values) {
            addCriterion("v_mod_ele in", values, "vModEle");
            return (Criteria) this;
        }

        public Criteria andVModEleNotIn(List<Integer> values) {
            addCriterion("v_mod_ele not in", values, "vModEle");
            return (Criteria) this;
        }

        public Criteria andVModEleBetween(Integer value1, Integer value2) {
            addCriterion("v_mod_ele between", value1, value2, "vModEle");
            return (Criteria) this;
        }

        public Criteria andVModEleNotBetween(Integer value1, Integer value2) {
            addCriterion("v_mod_ele not between", value1, value2, "vModEle");
            return (Criteria) this;
        }

        public Criteria andGpsIsNull() {
            addCriterion("gps is null");
            return (Criteria) this;
        }

        public Criteria andGpsIsNotNull() {
            addCriterion("gps is not null");
            return (Criteria) this;
        }

        public Criteria andGpsEqualTo(String value) {
            addCriterion("gps =", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotEqualTo(String value) {
            addCriterion("gps <>", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsGreaterThan(String value) {
            addCriterion("gps >", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsGreaterThanOrEqualTo(String value) {
            addCriterion("gps >=", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLessThan(String value) {
            addCriterion("gps <", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLessThanOrEqualTo(String value) {
            addCriterion("gps <=", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsLike(String value) {
            addCriterion("gps like", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotLike(String value) {
            addCriterion("gps not like", value, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsIn(List<String> values) {
            addCriterion("gps in", values, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotIn(List<String> values) {
            addCriterion("gps not in", values, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsBetween(String value1, String value2) {
            addCriterion("gps between", value1, value2, "gps");
            return (Criteria) this;
        }

        public Criteria andGpsNotBetween(String value1, String value2) {
            addCriterion("gps not between", value1, value2, "gps");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedIsNull() {
            addCriterion("avg_speed is null");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedIsNotNull() {
            addCriterion("avg_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedEqualTo(Double value) {
            addCriterion("avg_speed =", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedNotEqualTo(Double value) {
            addCriterion("avg_speed <>", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedGreaterThan(Double value) {
            addCriterion("avg_speed >", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_speed >=", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedLessThan(Double value) {
            addCriterion("avg_speed <", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedLessThanOrEqualTo(Double value) {
            addCriterion("avg_speed <=", value, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedIn(List<Double> values) {
            addCriterion("avg_speed in", values, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedNotIn(List<Double> values) {
            addCriterion("avg_speed not in", values, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedBetween(Double value1, Double value2) {
            addCriterion("avg_speed between", value1, value2, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andAvgSpeedNotBetween(Double value1, Double value2) {
            addCriterion("avg_speed not between", value1, value2, "avgSpeed");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Double value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Double value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Double value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Double value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Double value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Double> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Double> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Double value1, Double value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Double value1, Double value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andOilMountIsNull() {
            addCriterion("oil_mount is null");
            return (Criteria) this;
        }

        public Criteria andOilMountIsNotNull() {
            addCriterion("oil_mount is not null");
            return (Criteria) this;
        }

        public Criteria andOilMountEqualTo(Double value) {
            addCriterion("oil_mount =", value, "oilMount");
            return (Criteria) this;
        }

        public Criteria andOilMountNotEqualTo(Double value) {
            addCriterion("oil_mount <>", value, "oilMount");
            return (Criteria) this;
        }

        public Criteria andOilMountGreaterThan(Double value) {
            addCriterion("oil_mount >", value, "oilMount");
            return (Criteria) this;
        }

        public Criteria andOilMountGreaterThanOrEqualTo(Double value) {
            addCriterion("oil_mount >=", value, "oilMount");
            return (Criteria) this;
        }

        public Criteria andOilMountLessThan(Double value) {
            addCriterion("oil_mount <", value, "oilMount");
            return (Criteria) this;
        }

        public Criteria andOilMountLessThanOrEqualTo(Double value) {
            addCriterion("oil_mount <=", value, "oilMount");
            return (Criteria) this;
        }

        public Criteria andOilMountIn(List<Double> values) {
            addCriterion("oil_mount in", values, "oilMount");
            return (Criteria) this;
        }

        public Criteria andOilMountNotIn(List<Double> values) {
            addCriterion("oil_mount not in", values, "oilMount");
            return (Criteria) this;
        }

        public Criteria andOilMountBetween(Double value1, Double value2) {
            addCriterion("oil_mount between", value1, value2, "oilMount");
            return (Criteria) this;
        }

        public Criteria andOilMountNotBetween(Double value1, Double value2) {
            addCriterion("oil_mount not between", value1, value2, "oilMount");
            return (Criteria) this;
        }

        public Criteria andBatteryEleIsNull() {
            addCriterion("battery_ele is null");
            return (Criteria) this;
        }

        public Criteria andBatteryEleIsNotNull() {
            addCriterion("battery_ele is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryEleEqualTo(Double value) {
            addCriterion("battery_ele =", value, "batteryEle");
            return (Criteria) this;
        }

        public Criteria andBatteryEleNotEqualTo(Double value) {
            addCriterion("battery_ele <>", value, "batteryEle");
            return (Criteria) this;
        }

        public Criteria andBatteryEleGreaterThan(Double value) {
            addCriterion("battery_ele >", value, "batteryEle");
            return (Criteria) this;
        }

        public Criteria andBatteryEleGreaterThanOrEqualTo(Double value) {
            addCriterion("battery_ele >=", value, "batteryEle");
            return (Criteria) this;
        }

        public Criteria andBatteryEleLessThan(Double value) {
            addCriterion("battery_ele <", value, "batteryEle");
            return (Criteria) this;
        }

        public Criteria andBatteryEleLessThanOrEqualTo(Double value) {
            addCriterion("battery_ele <=", value, "batteryEle");
            return (Criteria) this;
        }

        public Criteria andBatteryEleIn(List<Double> values) {
            addCriterion("battery_ele in", values, "batteryEle");
            return (Criteria) this;
        }

        public Criteria andBatteryEleNotIn(List<Double> values) {
            addCriterion("battery_ele not in", values, "batteryEle");
            return (Criteria) this;
        }

        public Criteria andBatteryEleBetween(Double value1, Double value2) {
            addCriterion("battery_ele between", value1, value2, "batteryEle");
            return (Criteria) this;
        }

        public Criteria andBatteryEleNotBetween(Double value1, Double value2) {
            addCriterion("battery_ele not between", value1, value2, "batteryEle");
            return (Criteria) this;
        }

        public Criteria andModEleIsNull() {
            addCriterion("mod_ele is null");
            return (Criteria) this;
        }

        public Criteria andModEleIsNotNull() {
            addCriterion("mod_ele is not null");
            return (Criteria) this;
        }

        public Criteria andModEleEqualTo(Double value) {
            addCriterion("mod_ele =", value, "modEle");
            return (Criteria) this;
        }

        public Criteria andModEleNotEqualTo(Double value) {
            addCriterion("mod_ele <>", value, "modEle");
            return (Criteria) this;
        }

        public Criteria andModEleGreaterThan(Double value) {
            addCriterion("mod_ele >", value, "modEle");
            return (Criteria) this;
        }

        public Criteria andModEleGreaterThanOrEqualTo(Double value) {
            addCriterion("mod_ele >=", value, "modEle");
            return (Criteria) this;
        }

        public Criteria andModEleLessThan(Double value) {
            addCriterion("mod_ele <", value, "modEle");
            return (Criteria) this;
        }

        public Criteria andModEleLessThanOrEqualTo(Double value) {
            addCriterion("mod_ele <=", value, "modEle");
            return (Criteria) this;
        }

        public Criteria andModEleIn(List<Double> values) {
            addCriterion("mod_ele in", values, "modEle");
            return (Criteria) this;
        }

        public Criteria andModEleNotIn(List<Double> values) {
            addCriterion("mod_ele not in", values, "modEle");
            return (Criteria) this;
        }

        public Criteria andModEleBetween(Double value1, Double value2) {
            addCriterion("mod_ele between", value1, value2, "modEle");
            return (Criteria) this;
        }

        public Criteria andModEleNotBetween(Double value1, Double value2) {
            addCriterion("mod_ele not between", value1, value2, "modEle");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}