package com.pic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FarmMachineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FarmMachineExample() {
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

        public Criteria andWorkStatusIsNull() {
            addCriterion("work_status is null");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIsNotNull() {
            addCriterion("work_status is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStatusEqualTo(Boolean value) {
            addCriterion("work_status =", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusNotEqualTo(Boolean value) {
            addCriterion("work_status <>", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusGreaterThan(Boolean value) {
            addCriterion("work_status >", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("work_status >=", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusLessThan(Boolean value) {
            addCriterion("work_status <", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("work_status <=", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIn(List<Boolean> values) {
            addCriterion("work_status in", values, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusNotIn(List<Boolean> values) {
            addCriterion("work_status not in", values, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("work_status between", value1, value2, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("work_status not between", value1, value2, "workStatus");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIsNull() {
            addCriterion("machine_type is null");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIsNotNull() {
            addCriterion("machine_type is not null");
            return (Criteria) this;
        }

        public Criteria andMachineTypeEqualTo(String value) {
            addCriterion("machine_type =", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeNotEqualTo(String value) {
            addCriterion("machine_type <>", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeGreaterThan(String value) {
            addCriterion("machine_type >", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeGreaterThanOrEqualTo(String value) {
            addCriterion("machine_type >=", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeLessThan(String value) {
            addCriterion("machine_type <", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeLessThanOrEqualTo(String value) {
            addCriterion("machine_type <=", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeLike(String value) {
            addCriterion("machine_type like", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeNotLike(String value) {
            addCriterion("machine_type not like", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIn(List<String> values) {
            addCriterion("machine_type in", values, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeNotIn(List<String> values) {
            addCriterion("machine_type not in", values, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeBetween(String value1, String value2) {
            addCriterion("machine_type between", value1, value2, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeNotBetween(String value1, String value2) {
            addCriterion("machine_type not between", value1, value2, "machineType");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andModelNoIsNull() {
            addCriterion("model_no is null");
            return (Criteria) this;
        }

        public Criteria andModelNoIsNotNull() {
            addCriterion("model_no is not null");
            return (Criteria) this;
        }

        public Criteria andModelNoEqualTo(String value) {
            addCriterion("model_no =", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotEqualTo(String value) {
            addCriterion("model_no <>", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoGreaterThan(String value) {
            addCriterion("model_no >", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoGreaterThanOrEqualTo(String value) {
            addCriterion("model_no >=", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLessThan(String value) {
            addCriterion("model_no <", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLessThanOrEqualTo(String value) {
            addCriterion("model_no <=", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLike(String value) {
            addCriterion("model_no like", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotLike(String value) {
            addCriterion("model_no not like", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoIn(List<String> values) {
            addCriterion("model_no in", values, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotIn(List<String> values) {
            addCriterion("model_no not in", values, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoBetween(String value1, String value2) {
            addCriterion("model_no between", value1, value2, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotBetween(String value1, String value2) {
            addCriterion("model_no not between", value1, value2, "modelNo");
            return (Criteria) this;
        }

        public Criteria andOperationPowerIsNull() {
            addCriterion("operation_power is null");
            return (Criteria) this;
        }

        public Criteria andOperationPowerIsNotNull() {
            addCriterion("operation_power is not null");
            return (Criteria) this;
        }

        public Criteria andOperationPowerEqualTo(String value) {
            addCriterion("operation_power =", value, "operationPower");
            return (Criteria) this;
        }

        public Criteria andOperationPowerNotEqualTo(String value) {
            addCriterion("operation_power <>", value, "operationPower");
            return (Criteria) this;
        }

        public Criteria andOperationPowerGreaterThan(String value) {
            addCriterion("operation_power >", value, "operationPower");
            return (Criteria) this;
        }

        public Criteria andOperationPowerGreaterThanOrEqualTo(String value) {
            addCriterion("operation_power >=", value, "operationPower");
            return (Criteria) this;
        }

        public Criteria andOperationPowerLessThan(String value) {
            addCriterion("operation_power <", value, "operationPower");
            return (Criteria) this;
        }

        public Criteria andOperationPowerLessThanOrEqualTo(String value) {
            addCriterion("operation_power <=", value, "operationPower");
            return (Criteria) this;
        }

        public Criteria andOperationPowerLike(String value) {
            addCriterion("operation_power like", value, "operationPower");
            return (Criteria) this;
        }

        public Criteria andOperationPowerNotLike(String value) {
            addCriterion("operation_power not like", value, "operationPower");
            return (Criteria) this;
        }

        public Criteria andOperationPowerIn(List<String> values) {
            addCriterion("operation_power in", values, "operationPower");
            return (Criteria) this;
        }

        public Criteria andOperationPowerNotIn(List<String> values) {
            addCriterion("operation_power not in", values, "operationPower");
            return (Criteria) this;
        }

        public Criteria andOperationPowerBetween(String value1, String value2) {
            addCriterion("operation_power between", value1, value2, "operationPower");
            return (Criteria) this;
        }

        public Criteria andOperationPowerNotBetween(String value1, String value2) {
            addCriterion("operation_power not between", value1, value2, "operationPower");
            return (Criteria) this;
        }

        public Criteria andPlateNoIsNull() {
            addCriterion("plate_no is null");
            return (Criteria) this;
        }

        public Criteria andPlateNoIsNotNull() {
            addCriterion("plate_no is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNoEqualTo(String value) {
            addCriterion("plate_no =", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotEqualTo(String value) {
            addCriterion("plate_no <>", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoGreaterThan(String value) {
            addCriterion("plate_no >", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoGreaterThanOrEqualTo(String value) {
            addCriterion("plate_no >=", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLessThan(String value) {
            addCriterion("plate_no <", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLessThanOrEqualTo(String value) {
            addCriterion("plate_no <=", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLike(String value) {
            addCriterion("plate_no like", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotLike(String value) {
            addCriterion("plate_no not like", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoIn(List<String> values) {
            addCriterion("plate_no in", values, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotIn(List<String> values) {
            addCriterion("plate_no not in", values, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoBetween(String value1, String value2) {
            addCriterion("plate_no between", value1, value2, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotBetween(String value1, String value2) {
            addCriterion("plate_no not between", value1, value2, "plateNo");
            return (Criteria) this;
        }

        public Criteria andRegistAddrIsNull() {
            addCriterion("regist_addr is null");
            return (Criteria) this;
        }

        public Criteria andRegistAddrIsNotNull() {
            addCriterion("regist_addr is not null");
            return (Criteria) this;
        }

        public Criteria andRegistAddrEqualTo(String value) {
            addCriterion("regist_addr =", value, "registAddr");
            return (Criteria) this;
        }

        public Criteria andRegistAddrNotEqualTo(String value) {
            addCriterion("regist_addr <>", value, "registAddr");
            return (Criteria) this;
        }

        public Criteria andRegistAddrGreaterThan(String value) {
            addCriterion("regist_addr >", value, "registAddr");
            return (Criteria) this;
        }

        public Criteria andRegistAddrGreaterThanOrEqualTo(String value) {
            addCriterion("regist_addr >=", value, "registAddr");
            return (Criteria) this;
        }

        public Criteria andRegistAddrLessThan(String value) {
            addCriterion("regist_addr <", value, "registAddr");
            return (Criteria) this;
        }

        public Criteria andRegistAddrLessThanOrEqualTo(String value) {
            addCriterion("regist_addr <=", value, "registAddr");
            return (Criteria) this;
        }

        public Criteria andRegistAddrLike(String value) {
            addCriterion("regist_addr like", value, "registAddr");
            return (Criteria) this;
        }

        public Criteria andRegistAddrNotLike(String value) {
            addCriterion("regist_addr not like", value, "registAddr");
            return (Criteria) this;
        }

        public Criteria andRegistAddrIn(List<String> values) {
            addCriterion("regist_addr in", values, "registAddr");
            return (Criteria) this;
        }

        public Criteria andRegistAddrNotIn(List<String> values) {
            addCriterion("regist_addr not in", values, "registAddr");
            return (Criteria) this;
        }

        public Criteria andRegistAddrBetween(String value1, String value2) {
            addCriterion("regist_addr between", value1, value2, "registAddr");
            return (Criteria) this;
        }

        public Criteria andRegistAddrNotBetween(String value1, String value2) {
            addCriterion("regist_addr not between", value1, value2, "registAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiIsNull() {
            addCriterion("device_imei is null");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiIsNotNull() {
            addCriterion("device_imei is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiEqualTo(String value) {
            addCriterion("device_imei =", value, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiNotEqualTo(String value) {
            addCriterion("device_imei <>", value, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiGreaterThan(String value) {
            addCriterion("device_imei >", value, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiGreaterThanOrEqualTo(String value) {
            addCriterion("device_imei >=", value, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiLessThan(String value) {
            addCriterion("device_imei <", value, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiLessThanOrEqualTo(String value) {
            addCriterion("device_imei <=", value, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiLike(String value) {
            addCriterion("device_imei like", value, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiNotLike(String value) {
            addCriterion("device_imei not like", value, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiIn(List<String> values) {
            addCriterion("device_imei in", values, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiNotIn(List<String> values) {
            addCriterion("device_imei not in", values, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiBetween(String value1, String value2) {
            addCriterion("device_imei between", value1, value2, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceImeiNotBetween(String value1, String value2) {
            addCriterion("device_imei not between", value1, value2, "deviceImei");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoIsNull() {
            addCriterion("device_model_no is null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoIsNotNull() {
            addCriterion("device_model_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoEqualTo(String value) {
            addCriterion("device_model_no =", value, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoNotEqualTo(String value) {
            addCriterion("device_model_no <>", value, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoGreaterThan(String value) {
            addCriterion("device_model_no >", value, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoGreaterThanOrEqualTo(String value) {
            addCriterion("device_model_no >=", value, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoLessThan(String value) {
            addCriterion("device_model_no <", value, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoLessThanOrEqualTo(String value) {
            addCriterion("device_model_no <=", value, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoLike(String value) {
            addCriterion("device_model_no like", value, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoNotLike(String value) {
            addCriterion("device_model_no not like", value, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoIn(List<String> values) {
            addCriterion("device_model_no in", values, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoNotIn(List<String> values) {
            addCriterion("device_model_no not in", values, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoBetween(String value1, String value2) {
            addCriterion("device_model_no between", value1, value2, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNoNotBetween(String value1, String value2) {
            addCriterion("device_model_no not between", value1, value2, "deviceModelNo");
            return (Criteria) this;
        }

        public Criteria andMachinePowerIsNull() {
            addCriterion("machine_power is null");
            return (Criteria) this;
        }

        public Criteria andMachinePowerIsNotNull() {
            addCriterion("machine_power is not null");
            return (Criteria) this;
        }

        public Criteria andMachinePowerEqualTo(String value) {
            addCriterion("machine_power =", value, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMachinePowerNotEqualTo(String value) {
            addCriterion("machine_power <>", value, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMachinePowerGreaterThan(String value) {
            addCriterion("machine_power >", value, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMachinePowerGreaterThanOrEqualTo(String value) {
            addCriterion("machine_power >=", value, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMachinePowerLessThan(String value) {
            addCriterion("machine_power <", value, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMachinePowerLessThanOrEqualTo(String value) {
            addCriterion("machine_power <=", value, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMachinePowerLike(String value) {
            addCriterion("machine_power like", value, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMachinePowerNotLike(String value) {
            addCriterion("machine_power not like", value, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMachinePowerIn(List<String> values) {
            addCriterion("machine_power in", values, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMachinePowerNotIn(List<String> values) {
            addCriterion("machine_power not in", values, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMachinePowerBetween(String value1, String value2) {
            addCriterion("machine_power between", value1, value2, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMachinePowerNotBetween(String value1, String value2) {
            addCriterion("machine_power not between", value1, value2, "machinePower");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeIsNull() {
            addCriterion("max_operate_time is null");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeIsNotNull() {
            addCriterion("max_operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeEqualTo(String value) {
            addCriterion("max_operate_time =", value, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeNotEqualTo(String value) {
            addCriterion("max_operate_time <>", value, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeGreaterThan(String value) {
            addCriterion("max_operate_time >", value, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("max_operate_time >=", value, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeLessThan(String value) {
            addCriterion("max_operate_time <", value, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeLessThanOrEqualTo(String value) {
            addCriterion("max_operate_time <=", value, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeLike(String value) {
            addCriterion("max_operate_time like", value, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeNotLike(String value) {
            addCriterion("max_operate_time not like", value, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeIn(List<String> values) {
            addCriterion("max_operate_time in", values, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeNotIn(List<String> values) {
            addCriterion("max_operate_time not in", values, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeBetween(String value1, String value2) {
            addCriterion("max_operate_time between", value1, value2, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMaxOperateTimeNotBetween(String value1, String value2) {
            addCriterion("max_operate_time not between", value1, value2, "maxOperateTime");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthIsNull() {
            addCriterion("machine_tool_width is null");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthIsNotNull() {
            addCriterion("machine_tool_width is not null");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthEqualTo(String value) {
            addCriterion("machine_tool_width =", value, "machineToolWidth");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthNotEqualTo(String value) {
            addCriterion("machine_tool_width <>", value, "machineToolWidth");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthGreaterThan(String value) {
            addCriterion("machine_tool_width >", value, "machineToolWidth");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthGreaterThanOrEqualTo(String value) {
            addCriterion("machine_tool_width >=", value, "machineToolWidth");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthLessThan(String value) {
            addCriterion("machine_tool_width <", value, "machineToolWidth");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthLessThanOrEqualTo(String value) {
            addCriterion("machine_tool_width <=", value, "machineToolWidth");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthLike(String value) {
            addCriterion("machine_tool_width like", value, "machineToolWidth");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthNotLike(String value) {
            addCriterion("machine_tool_width not like", value, "machineToolWidth");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthIn(List<String> values) {
            addCriterion("machine_tool_width in", values, "machineToolWidth");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthNotIn(List<String> values) {
            addCriterion("machine_tool_width not in", values, "machineToolWidth");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthBetween(String value1, String value2) {
            addCriterion("machine_tool_width between", value1, value2, "machineToolWidth");
            return (Criteria) this;
        }

        public Criteria andMachineToolWidthNotBetween(String value1, String value2) {
            addCriterion("machine_tool_width not between", value1, value2, "machineToolWidth");
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

        public Criteria andRegistTimeIsNull() {
            addCriterion("regist_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNotNull() {
            addCriterion("regist_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeEqualTo(Date value) {
            addCriterion("regist_time =", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotEqualTo(Date value) {
            addCriterion("regist_time <>", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThan(Date value) {
            addCriterion("regist_time >", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("regist_time >=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThan(Date value) {
            addCriterion("regist_time <", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThanOrEqualTo(Date value) {
            addCriterion("regist_time <=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIn(List<Date> values) {
            addCriterion("regist_time in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotIn(List<Date> values) {
            addCriterion("regist_time not in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeBetween(Date value1, Date value2) {
            addCriterion("regist_time between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotBetween(Date value1, Date value2) {
            addCriterion("regist_time not between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andOilPoolIsNull() {
            addCriterion("oil_pool is null");
            return (Criteria) this;
        }

        public Criteria andOilPoolIsNotNull() {
            addCriterion("oil_pool is not null");
            return (Criteria) this;
        }

        public Criteria andOilPoolEqualTo(Integer value) {
            addCriterion("oil_pool =", value, "oilPool");
            return (Criteria) this;
        }

        public Criteria andOilPoolNotEqualTo(Integer value) {
            addCriterion("oil_pool <>", value, "oilPool");
            return (Criteria) this;
        }

        public Criteria andOilPoolGreaterThan(Integer value) {
            addCriterion("oil_pool >", value, "oilPool");
            return (Criteria) this;
        }

        public Criteria andOilPoolGreaterThanOrEqualTo(Integer value) {
            addCriterion("oil_pool >=", value, "oilPool");
            return (Criteria) this;
        }

        public Criteria andOilPoolLessThan(Integer value) {
            addCriterion("oil_pool <", value, "oilPool");
            return (Criteria) this;
        }

        public Criteria andOilPoolLessThanOrEqualTo(Integer value) {
            addCriterion("oil_pool <=", value, "oilPool");
            return (Criteria) this;
        }

        public Criteria andOilPoolIn(List<Integer> values) {
            addCriterion("oil_pool in", values, "oilPool");
            return (Criteria) this;
        }

        public Criteria andOilPoolNotIn(List<Integer> values) {
            addCriterion("oil_pool not in", values, "oilPool");
            return (Criteria) this;
        }

        public Criteria andOilPoolBetween(Integer value1, Integer value2) {
            addCriterion("oil_pool between", value1, value2, "oilPool");
            return (Criteria) this;
        }

        public Criteria andOilPoolNotBetween(Integer value1, Integer value2) {
            addCriterion("oil_pool not between", value1, value2, "oilPool");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOilMaxIsNull() {
            addCriterion("oil_max is null");
            return (Criteria) this;
        }

        public Criteria andOilMaxIsNotNull() {
            addCriterion("oil_max is not null");
            return (Criteria) this;
        }

        public Criteria andOilMaxEqualTo(Integer value) {
            addCriterion("oil_max =", value, "oilMax");
            return (Criteria) this;
        }

        public Criteria andOilMaxNotEqualTo(Integer value) {
            addCriterion("oil_max <>", value, "oilMax");
            return (Criteria) this;
        }

        public Criteria andOilMaxGreaterThan(Integer value) {
            addCriterion("oil_max >", value, "oilMax");
            return (Criteria) this;
        }

        public Criteria andOilMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("oil_max >=", value, "oilMax");
            return (Criteria) this;
        }

        public Criteria andOilMaxLessThan(Integer value) {
            addCriterion("oil_max <", value, "oilMax");
            return (Criteria) this;
        }

        public Criteria andOilMaxLessThanOrEqualTo(Integer value) {
            addCriterion("oil_max <=", value, "oilMax");
            return (Criteria) this;
        }

        public Criteria andOilMaxIn(List<Integer> values) {
            addCriterion("oil_max in", values, "oilMax");
            return (Criteria) this;
        }

        public Criteria andOilMaxNotIn(List<Integer> values) {
            addCriterion("oil_max not in", values, "oilMax");
            return (Criteria) this;
        }

        public Criteria andOilMaxBetween(Integer value1, Integer value2) {
            addCriterion("oil_max between", value1, value2, "oilMax");
            return (Criteria) this;
        }

        public Criteria andOilMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("oil_max not between", value1, value2, "oilMax");
            return (Criteria) this;
        }

        public Criteria andOilMinIsNull() {
            addCriterion("oil_min is null");
            return (Criteria) this;
        }

        public Criteria andOilMinIsNotNull() {
            addCriterion("oil_min is not null");
            return (Criteria) this;
        }

        public Criteria andOilMinEqualTo(Integer value) {
            addCriterion("oil_min =", value, "oilMin");
            return (Criteria) this;
        }

        public Criteria andOilMinNotEqualTo(Integer value) {
            addCriterion("oil_min <>", value, "oilMin");
            return (Criteria) this;
        }

        public Criteria andOilMinGreaterThan(Integer value) {
            addCriterion("oil_min >", value, "oilMin");
            return (Criteria) this;
        }

        public Criteria andOilMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("oil_min >=", value, "oilMin");
            return (Criteria) this;
        }

        public Criteria andOilMinLessThan(Integer value) {
            addCriterion("oil_min <", value, "oilMin");
            return (Criteria) this;
        }

        public Criteria andOilMinLessThanOrEqualTo(Integer value) {
            addCriterion("oil_min <=", value, "oilMin");
            return (Criteria) this;
        }

        public Criteria andOilMinIn(List<Integer> values) {
            addCriterion("oil_min in", values, "oilMin");
            return (Criteria) this;
        }

        public Criteria andOilMinNotIn(List<Integer> values) {
            addCriterion("oil_min not in", values, "oilMin");
            return (Criteria) this;
        }

        public Criteria andOilMinBetween(Integer value1, Integer value2) {
            addCriterion("oil_min between", value1, value2, "oilMin");
            return (Criteria) this;
        }

        public Criteria andOilMinNotBetween(Integer value1, Integer value2) {
            addCriterion("oil_min not between", value1, value2, "oilMin");
            return (Criteria) this;
        }

        public Criteria andOilAlarmIsNull() {
            addCriterion("oil_alarm is null");
            return (Criteria) this;
        }

        public Criteria andOilAlarmIsNotNull() {
            addCriterion("oil_alarm is not null");
            return (Criteria) this;
        }

        public Criteria andOilAlarmEqualTo(Double value) {
            addCriterion("oil_alarm =", value, "oilAlarm");
            return (Criteria) this;
        }

        public Criteria andOilAlarmNotEqualTo(Double value) {
            addCriterion("oil_alarm <>", value, "oilAlarm");
            return (Criteria) this;
        }

        public Criteria andOilAlarmGreaterThan(Double value) {
            addCriterion("oil_alarm >", value, "oilAlarm");
            return (Criteria) this;
        }

        public Criteria andOilAlarmGreaterThanOrEqualTo(Double value) {
            addCriterion("oil_alarm >=", value, "oilAlarm");
            return (Criteria) this;
        }

        public Criteria andOilAlarmLessThan(Double value) {
            addCriterion("oil_alarm <", value, "oilAlarm");
            return (Criteria) this;
        }

        public Criteria andOilAlarmLessThanOrEqualTo(Double value) {
            addCriterion("oil_alarm <=", value, "oilAlarm");
            return (Criteria) this;
        }

        public Criteria andOilAlarmIn(List<Double> values) {
            addCriterion("oil_alarm in", values, "oilAlarm");
            return (Criteria) this;
        }

        public Criteria andOilAlarmNotIn(List<Double> values) {
            addCriterion("oil_alarm not in", values, "oilAlarm");
            return (Criteria) this;
        }

        public Criteria andOilAlarmBetween(Double value1, Double value2) {
            addCriterion("oil_alarm between", value1, value2, "oilAlarm");
            return (Criteria) this;
        }

        public Criteria andOilAlarmNotBetween(Double value1, Double value2) {
            addCriterion("oil_alarm not between", value1, value2, "oilAlarm");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmIsNull() {
            addCriterion("battery_ele_alarm is null");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmIsNotNull() {
            addCriterion("battery_ele_alarm is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmEqualTo(Integer value) {
            addCriterion("battery_ele_alarm =", value, "batteryEleAlarm");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmNotEqualTo(Integer value) {
            addCriterion("battery_ele_alarm <>", value, "batteryEleAlarm");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmGreaterThan(Integer value) {
            addCriterion("battery_ele_alarm >", value, "batteryEleAlarm");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("battery_ele_alarm >=", value, "batteryEleAlarm");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmLessThan(Integer value) {
            addCriterion("battery_ele_alarm <", value, "batteryEleAlarm");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmLessThanOrEqualTo(Integer value) {
            addCriterion("battery_ele_alarm <=", value, "batteryEleAlarm");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmIn(List<Integer> values) {
            addCriterion("battery_ele_alarm in", values, "batteryEleAlarm");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmNotIn(List<Integer> values) {
            addCriterion("battery_ele_alarm not in", values, "batteryEleAlarm");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmBetween(Integer value1, Integer value2) {
            addCriterion("battery_ele_alarm between", value1, value2, "batteryEleAlarm");
            return (Criteria) this;
        }

        public Criteria andBatteryEleAlarmNotBetween(Integer value1, Integer value2) {
            addCriterion("battery_ele_alarm not between", value1, value2, "batteryEleAlarm");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmIsNull() {
            addCriterion("mod_ele_alarm is null");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmIsNotNull() {
            addCriterion("mod_ele_alarm is not null");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmEqualTo(Integer value) {
            addCriterion("mod_ele_alarm =", value, "modEleAlarm");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmNotEqualTo(Integer value) {
            addCriterion("mod_ele_alarm <>", value, "modEleAlarm");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmGreaterThan(Integer value) {
            addCriterion("mod_ele_alarm >", value, "modEleAlarm");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("mod_ele_alarm >=", value, "modEleAlarm");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmLessThan(Integer value) {
            addCriterion("mod_ele_alarm <", value, "modEleAlarm");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmLessThanOrEqualTo(Integer value) {
            addCriterion("mod_ele_alarm <=", value, "modEleAlarm");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmIn(List<Integer> values) {
            addCriterion("mod_ele_alarm in", values, "modEleAlarm");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmNotIn(List<Integer> values) {
            addCriterion("mod_ele_alarm not in", values, "modEleAlarm");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmBetween(Integer value1, Integer value2) {
            addCriterion("mod_ele_alarm between", value1, value2, "modEleAlarm");
            return (Criteria) this;
        }

        public Criteria andModEleAlarmNotBetween(Integer value1, Integer value2) {
            addCriterion("mod_ele_alarm not between", value1, value2, "modEleAlarm");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andMachineNameIsNull() {
            addCriterion("machine_name is null");
            return (Criteria) this;
        }

        public Criteria andMachineNameIsNotNull() {
            addCriterion("machine_name is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNameEqualTo(String value) {
            addCriterion("machine_name =", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotEqualTo(String value) {
            addCriterion("machine_name <>", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThan(String value) {
            addCriterion("machine_name >", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThanOrEqualTo(String value) {
            addCriterion("machine_name >=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThan(String value) {
            addCriterion("machine_name <", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThanOrEqualTo(String value) {
            addCriterion("machine_name <=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLike(String value) {
            addCriterion("machine_name like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotLike(String value) {
            addCriterion("machine_name not like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameIn(List<String> values) {
            addCriterion("machine_name in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotIn(List<String> values) {
            addCriterion("machine_name not in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameBetween(String value1, String value2) {
            addCriterion("machine_name between", value1, value2, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotBetween(String value1, String value2) {
            addCriterion("machine_name not between", value1, value2, "machineName");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceIsNull() {
            addCriterion("keep_repair_distance is null");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceIsNotNull() {
            addCriterion("keep_repair_distance is not null");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceEqualTo(Integer value) {
            addCriterion("keep_repair_distance =", value, "keepRepairDistance");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceNotEqualTo(Integer value) {
            addCriterion("keep_repair_distance <>", value, "keepRepairDistance");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceGreaterThan(Integer value) {
            addCriterion("keep_repair_distance >", value, "keepRepairDistance");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("keep_repair_distance >=", value, "keepRepairDistance");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceLessThan(Integer value) {
            addCriterion("keep_repair_distance <", value, "keepRepairDistance");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("keep_repair_distance <=", value, "keepRepairDistance");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceIn(List<Integer> values) {
            addCriterion("keep_repair_distance in", values, "keepRepairDistance");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceNotIn(List<Integer> values) {
            addCriterion("keep_repair_distance not in", values, "keepRepairDistance");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceBetween(Integer value1, Integer value2) {
            addCriterion("keep_repair_distance between", value1, value2, "keepRepairDistance");
            return (Criteria) this;
        }

        public Criteria andKeepRepairDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("keep_repair_distance not between", value1, value2, "keepRepairDistance");
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