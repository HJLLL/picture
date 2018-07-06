package com.pic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaComputeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaComputeExample() {
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

        public Criteria andLandAreaIsNull() {
            addCriterion("land_area is null");
            return (Criteria) this;
        }

        public Criteria andLandAreaIsNotNull() {
            addCriterion("land_area is not null");
            return (Criteria) this;
        }

        public Criteria andLandAreaEqualTo(Double value) {
            addCriterion("land_area =", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaNotEqualTo(Double value) {
            addCriterion("land_area <>", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaGreaterThan(Double value) {
            addCriterion("land_area >", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("land_area >=", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaLessThan(Double value) {
            addCriterion("land_area <", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaLessThanOrEqualTo(Double value) {
            addCriterion("land_area <=", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaIn(List<Double> values) {
            addCriterion("land_area in", values, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaNotIn(List<Double> values) {
            addCriterion("land_area not in", values, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaBetween(Double value1, Double value2) {
            addCriterion("land_area between", value1, value2, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaNotBetween(Double value1, Double value2) {
            addCriterion("land_area not between", value1, value2, "landArea");
            return (Criteria) this;
        }

        public Criteria andWorkAreaIsNull() {
            addCriterion("work_area is null");
            return (Criteria) this;
        }

        public Criteria andWorkAreaIsNotNull() {
            addCriterion("work_area is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAreaEqualTo(Double value) {
            addCriterion("work_area =", value, "workArea");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNotEqualTo(Double value) {
            addCriterion("work_area <>", value, "workArea");
            return (Criteria) this;
        }

        public Criteria andWorkAreaGreaterThan(Double value) {
            addCriterion("work_area >", value, "workArea");
            return (Criteria) this;
        }

        public Criteria andWorkAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("work_area >=", value, "workArea");
            return (Criteria) this;
        }

        public Criteria andWorkAreaLessThan(Double value) {
            addCriterion("work_area <", value, "workArea");
            return (Criteria) this;
        }

        public Criteria andWorkAreaLessThanOrEqualTo(Double value) {
            addCriterion("work_area <=", value, "workArea");
            return (Criteria) this;
        }

        public Criteria andWorkAreaIn(List<Double> values) {
            addCriterion("work_area in", values, "workArea");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNotIn(List<Double> values) {
            addCriterion("work_area not in", values, "workArea");
            return (Criteria) this;
        }

        public Criteria andWorkAreaBetween(Double value1, Double value2) {
            addCriterion("work_area between", value1, value2, "workArea");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNotBetween(Double value1, Double value2) {
            addCriterion("work_area not between", value1, value2, "workArea");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andQualifiedIsNull() {
            addCriterion("qualified is null");
            return (Criteria) this;
        }

        public Criteria andQualifiedIsNotNull() {
            addCriterion("qualified is not null");
            return (Criteria) this;
        }

        public Criteria andQualifiedEqualTo(Integer value) {
            addCriterion("qualified =", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedNotEqualTo(Integer value) {
            addCriterion("qualified <>", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedGreaterThan(Integer value) {
            addCriterion("qualified >", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("qualified >=", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedLessThan(Integer value) {
            addCriterion("qualified <", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedLessThanOrEqualTo(Integer value) {
            addCriterion("qualified <=", value, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedIn(List<Integer> values) {
            addCriterion("qualified in", values, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedNotIn(List<Integer> values) {
            addCriterion("qualified not in", values, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedBetween(Integer value1, Integer value2) {
            addCriterion("qualified between", value1, value2, "qualified");
            return (Criteria) this;
        }

        public Criteria andQualifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("qualified not between", value1, value2, "qualified");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNull() {
            addCriterion("process_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNotNull() {
            addCriterion("process_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeEqualTo(Date value) {
            addCriterion("process_time =", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotEqualTo(Date value) {
            addCriterion("process_time <>", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThan(Date value) {
            addCriterion("process_time >", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("process_time >=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThan(Date value) {
            addCriterion("process_time <", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThanOrEqualTo(Date value) {
            addCriterion("process_time <=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIn(List<Date> values) {
            addCriterion("process_time in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotIn(List<Date> values) {
            addCriterion("process_time not in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeBetween(Date value1, Date value2) {
            addCriterion("process_time between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotBetween(Date value1, Date value2) {
            addCriterion("process_time not between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedIsNull() {
            addCriterion("government_qualified is null");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedIsNotNull() {
            addCriterion("government_qualified is not null");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedEqualTo(Integer value) {
            addCriterion("government_qualified =", value, "governmentQualified");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedNotEqualTo(Integer value) {
            addCriterion("government_qualified <>", value, "governmentQualified");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedGreaterThan(Integer value) {
            addCriterion("government_qualified >", value, "governmentQualified");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("government_qualified >=", value, "governmentQualified");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedLessThan(Integer value) {
            addCriterion("government_qualified <", value, "governmentQualified");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedLessThanOrEqualTo(Integer value) {
            addCriterion("government_qualified <=", value, "governmentQualified");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedIn(List<Integer> values) {
            addCriterion("government_qualified in", values, "governmentQualified");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedNotIn(List<Integer> values) {
            addCriterion("government_qualified not in", values, "governmentQualified");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedBetween(Integer value1, Integer value2) {
            addCriterion("government_qualified between", value1, value2, "governmentQualified");
            return (Criteria) this;
        }

        public Criteria andGovernmentQualifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("government_qualified not between", value1, value2, "governmentQualified");
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

        public Criteria andFarmIdIsNull() {
            addCriterion("farm_id is null");
            return (Criteria) this;
        }

        public Criteria andFarmIdIsNotNull() {
            addCriterion("farm_id is not null");
            return (Criteria) this;
        }

        public Criteria andFarmIdEqualTo(Integer value) {
            addCriterion("farm_id =", value, "farmId");
            return (Criteria) this;
        }

        public Criteria andFarmIdNotEqualTo(Integer value) {
            addCriterion("farm_id <>", value, "farmId");
            return (Criteria) this;
        }

        public Criteria andFarmIdGreaterThan(Integer value) {
            addCriterion("farm_id >", value, "farmId");
            return (Criteria) this;
        }

        public Criteria andFarmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("farm_id >=", value, "farmId");
            return (Criteria) this;
        }

        public Criteria andFarmIdLessThan(Integer value) {
            addCriterion("farm_id <", value, "farmId");
            return (Criteria) this;
        }

        public Criteria andFarmIdLessThanOrEqualTo(Integer value) {
            addCriterion("farm_id <=", value, "farmId");
            return (Criteria) this;
        }

        public Criteria andFarmIdIn(List<Integer> values) {
            addCriterion("farm_id in", values, "farmId");
            return (Criteria) this;
        }

        public Criteria andFarmIdNotIn(List<Integer> values) {
            addCriterion("farm_id not in", values, "farmId");
            return (Criteria) this;
        }

        public Criteria andFarmIdBetween(Integer value1, Integer value2) {
            addCriterion("farm_id between", value1, value2, "farmId");
            return (Criteria) this;
        }

        public Criteria andFarmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("farm_id not between", value1, value2, "farmId");
            return (Criteria) this;
        }

        public Criteria andInitJudgeIsNull() {
            addCriterion("init_judge is null");
            return (Criteria) this;
        }

        public Criteria andInitJudgeIsNotNull() {
            addCriterion("init_judge is not null");
            return (Criteria) this;
        }

        public Criteria andInitJudgeEqualTo(Integer value) {
            addCriterion("init_judge =", value, "initJudge");
            return (Criteria) this;
        }

        public Criteria andInitJudgeNotEqualTo(Integer value) {
            addCriterion("init_judge <>", value, "initJudge");
            return (Criteria) this;
        }

        public Criteria andInitJudgeGreaterThan(Integer value) {
            addCriterion("init_judge >", value, "initJudge");
            return (Criteria) this;
        }

        public Criteria andInitJudgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("init_judge >=", value, "initJudge");
            return (Criteria) this;
        }

        public Criteria andInitJudgeLessThan(Integer value) {
            addCriterion("init_judge <", value, "initJudge");
            return (Criteria) this;
        }

        public Criteria andInitJudgeLessThanOrEqualTo(Integer value) {
            addCriterion("init_judge <=", value, "initJudge");
            return (Criteria) this;
        }

        public Criteria andInitJudgeIn(List<Integer> values) {
            addCriterion("init_judge in", values, "initJudge");
            return (Criteria) this;
        }

        public Criteria andInitJudgeNotIn(List<Integer> values) {
            addCriterion("init_judge not in", values, "initJudge");
            return (Criteria) this;
        }

        public Criteria andInitJudgeBetween(Integer value1, Integer value2) {
            addCriterion("init_judge between", value1, value2, "initJudge");
            return (Criteria) this;
        }

        public Criteria andInitJudgeNotBetween(Integer value1, Integer value2) {
            addCriterion("init_judge not between", value1, value2, "initJudge");
            return (Criteria) this;
        }

        public Criteria andRepeateIdIsNull() {
            addCriterion("repeate_id is null");
            return (Criteria) this;
        }

        public Criteria andRepeateIdIsNotNull() {
            addCriterion("repeate_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepeateIdEqualTo(Integer value) {
            addCriterion("repeate_id =", value, "repeateId");
            return (Criteria) this;
        }

        public Criteria andRepeateIdNotEqualTo(Integer value) {
            addCriterion("repeate_id <>", value, "repeateId");
            return (Criteria) this;
        }

        public Criteria andRepeateIdGreaterThan(Integer value) {
            addCriterion("repeate_id >", value, "repeateId");
            return (Criteria) this;
        }

        public Criteria andRepeateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeate_id >=", value, "repeateId");
            return (Criteria) this;
        }

        public Criteria andRepeateIdLessThan(Integer value) {
            addCriterion("repeate_id <", value, "repeateId");
            return (Criteria) this;
        }

        public Criteria andRepeateIdLessThanOrEqualTo(Integer value) {
            addCriterion("repeate_id <=", value, "repeateId");
            return (Criteria) this;
        }

        public Criteria andRepeateIdIn(List<Integer> values) {
            addCriterion("repeate_id in", values, "repeateId");
            return (Criteria) this;
        }

        public Criteria andRepeateIdNotIn(List<Integer> values) {
            addCriterion("repeate_id not in", values, "repeateId");
            return (Criteria) this;
        }

        public Criteria andRepeateIdBetween(Integer value1, Integer value2) {
            addCriterion("repeate_id between", value1, value2, "repeateId");
            return (Criteria) this;
        }

        public Criteria andRepeateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repeate_id not between", value1, value2, "repeateId");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaIsNull() {
            addCriterion("repeate_area is null");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaIsNotNull() {
            addCriterion("repeate_area is not null");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaEqualTo(Double value) {
            addCriterion("repeate_area =", value, "repeateArea");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaNotEqualTo(Double value) {
            addCriterion("repeate_area <>", value, "repeateArea");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaGreaterThan(Double value) {
            addCriterion("repeate_area >", value, "repeateArea");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("repeate_area >=", value, "repeateArea");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaLessThan(Double value) {
            addCriterion("repeate_area <", value, "repeateArea");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaLessThanOrEqualTo(Double value) {
            addCriterion("repeate_area <=", value, "repeateArea");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaIn(List<Double> values) {
            addCriterion("repeate_area in", values, "repeateArea");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaNotIn(List<Double> values) {
            addCriterion("repeate_area not in", values, "repeateArea");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaBetween(Double value1, Double value2) {
            addCriterion("repeate_area between", value1, value2, "repeateArea");
            return (Criteria) this;
        }

        public Criteria andRepeateAreaNotBetween(Double value1, Double value2) {
            addCriterion("repeate_area not between", value1, value2, "repeateArea");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioIsNull() {
            addCriterion("repeate_ratio is null");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioIsNotNull() {
            addCriterion("repeate_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioEqualTo(Double value) {
            addCriterion("repeate_ratio =", value, "repeateRatio");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioNotEqualTo(Double value) {
            addCriterion("repeate_ratio <>", value, "repeateRatio");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioGreaterThan(Double value) {
            addCriterion("repeate_ratio >", value, "repeateRatio");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("repeate_ratio >=", value, "repeateRatio");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioLessThan(Double value) {
            addCriterion("repeate_ratio <", value, "repeateRatio");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioLessThanOrEqualTo(Double value) {
            addCriterion("repeate_ratio <=", value, "repeateRatio");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioIn(List<Double> values) {
            addCriterion("repeate_ratio in", values, "repeateRatio");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioNotIn(List<Double> values) {
            addCriterion("repeate_ratio not in", values, "repeateRatio");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioBetween(Double value1, Double value2) {
            addCriterion("repeate_ratio between", value1, value2, "repeateRatio");
            return (Criteria) this;
        }

        public Criteria andRepeateRatioNotBetween(Double value1, Double value2) {
            addCriterion("repeate_ratio not between", value1, value2, "repeateRatio");
            return (Criteria) this;
        }

        public Criteria andMassifCenterIsNull() {
            addCriterion("massif_center is null");
            return (Criteria) this;
        }

        public Criteria andMassifCenterIsNotNull() {
            addCriterion("massif_center is not null");
            return (Criteria) this;
        }

        public Criteria andMassifCenterEqualTo(String value) {
            addCriterion("massif_center =", value, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andMassifCenterNotEqualTo(String value) {
            addCriterion("massif_center <>", value, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andMassifCenterGreaterThan(String value) {
            addCriterion("massif_center >", value, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andMassifCenterGreaterThanOrEqualTo(String value) {
            addCriterion("massif_center >=", value, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andMassifCenterLessThan(String value) {
            addCriterion("massif_center <", value, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andMassifCenterLessThanOrEqualTo(String value) {
            addCriterion("massif_center <=", value, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andMassifCenterLike(String value) {
            addCriterion("massif_center like", value, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andMassifCenterNotLike(String value) {
            addCriterion("massif_center not like", value, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andMassifCenterIn(List<String> values) {
            addCriterion("massif_center in", values, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andMassifCenterNotIn(List<String> values) {
            addCriterion("massif_center not in", values, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andMassifCenterBetween(String value1, String value2) {
            addCriterion("massif_center between", value1, value2, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andMassifCenterNotBetween(String value1, String value2) {
            addCriterion("massif_center not between", value1, value2, "massifCenter");
            return (Criteria) this;
        }

        public Criteria andRegionSenseIsNull() {
            addCriterion("region_sense is null");
            return (Criteria) this;
        }

        public Criteria andRegionSenseIsNotNull() {
            addCriterion("region_sense is not null");
            return (Criteria) this;
        }

        public Criteria andRegionSenseEqualTo(Integer value) {
            addCriterion("region_sense =", value, "regionSense");
            return (Criteria) this;
        }

        public Criteria andRegionSenseNotEqualTo(Integer value) {
            addCriterion("region_sense <>", value, "regionSense");
            return (Criteria) this;
        }

        public Criteria andRegionSenseGreaterThan(Integer value) {
            addCriterion("region_sense >", value, "regionSense");
            return (Criteria) this;
        }

        public Criteria andRegionSenseGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_sense >=", value, "regionSense");
            return (Criteria) this;
        }

        public Criteria andRegionSenseLessThan(Integer value) {
            addCriterion("region_sense <", value, "regionSense");
            return (Criteria) this;
        }

        public Criteria andRegionSenseLessThanOrEqualTo(Integer value) {
            addCriterion("region_sense <=", value, "regionSense");
            return (Criteria) this;
        }

        public Criteria andRegionSenseIn(List<Integer> values) {
            addCriterion("region_sense in", values, "regionSense");
            return (Criteria) this;
        }

        public Criteria andRegionSenseNotIn(List<Integer> values) {
            addCriterion("region_sense not in", values, "regionSense");
            return (Criteria) this;
        }

        public Criteria andRegionSenseBetween(Integer value1, Integer value2) {
            addCriterion("region_sense between", value1, value2, "regionSense");
            return (Criteria) this;
        }

        public Criteria andRegionSenseNotBetween(Integer value1, Integer value2) {
            addCriterion("region_sense not between", value1, value2, "regionSense");
            return (Criteria) this;
        }

        public Criteria andRegionNumIsNull() {
            addCriterion("region_num is null");
            return (Criteria) this;
        }

        public Criteria andRegionNumIsNotNull() {
            addCriterion("region_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNumEqualTo(Integer value) {
            addCriterion("region_num =", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumNotEqualTo(Integer value) {
            addCriterion("region_num <>", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumGreaterThan(Integer value) {
            addCriterion("region_num >", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_num >=", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumLessThan(Integer value) {
            addCriterion("region_num <", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumLessThanOrEqualTo(Integer value) {
            addCriterion("region_num <=", value, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumIn(List<Integer> values) {
            addCriterion("region_num in", values, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumNotIn(List<Integer> values) {
            addCriterion("region_num not in", values, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumBetween(Integer value1, Integer value2) {
            addCriterion("region_num between", value1, value2, "regionNum");
            return (Criteria) this;
        }

        public Criteria andRegionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("region_num not between", value1, value2, "regionNum");
            return (Criteria) this;
        }

        public Criteria andPlanOneIsNull() {
            addCriterion("plan_one is null");
            return (Criteria) this;
        }

        public Criteria andPlanOneIsNotNull() {
            addCriterion("plan_one is not null");
            return (Criteria) this;
        }

        public Criteria andPlanOneEqualTo(String value) {
            addCriterion("plan_one =", value, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanOneNotEqualTo(String value) {
            addCriterion("plan_one <>", value, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanOneGreaterThan(String value) {
            addCriterion("plan_one >", value, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanOneGreaterThanOrEqualTo(String value) {
            addCriterion("plan_one >=", value, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanOneLessThan(String value) {
            addCriterion("plan_one <", value, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanOneLessThanOrEqualTo(String value) {
            addCriterion("plan_one <=", value, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanOneLike(String value) {
            addCriterion("plan_one like", value, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanOneNotLike(String value) {
            addCriterion("plan_one not like", value, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanOneIn(List<String> values) {
            addCriterion("plan_one in", values, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanOneNotIn(List<String> values) {
            addCriterion("plan_one not in", values, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanOneBetween(String value1, String value2) {
            addCriterion("plan_one between", value1, value2, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanOneNotBetween(String value1, String value2) {
            addCriterion("plan_one not between", value1, value2, "planOne");
            return (Criteria) this;
        }

        public Criteria andPlanTwoIsNull() {
            addCriterion("plan_two is null");
            return (Criteria) this;
        }

        public Criteria andPlanTwoIsNotNull() {
            addCriterion("plan_two is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTwoEqualTo(Integer value) {
            addCriterion("plan_two =", value, "planTwo");
            return (Criteria) this;
        }

        public Criteria andPlanTwoNotEqualTo(Integer value) {
            addCriterion("plan_two <>", value, "planTwo");
            return (Criteria) this;
        }

        public Criteria andPlanTwoGreaterThan(Integer value) {
            addCriterion("plan_two >", value, "planTwo");
            return (Criteria) this;
        }

        public Criteria andPlanTwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_two >=", value, "planTwo");
            return (Criteria) this;
        }

        public Criteria andPlanTwoLessThan(Integer value) {
            addCriterion("plan_two <", value, "planTwo");
            return (Criteria) this;
        }

        public Criteria andPlanTwoLessThanOrEqualTo(Integer value) {
            addCriterion("plan_two <=", value, "planTwo");
            return (Criteria) this;
        }

        public Criteria andPlanTwoIn(List<Integer> values) {
            addCriterion("plan_two in", values, "planTwo");
            return (Criteria) this;
        }

        public Criteria andPlanTwoNotIn(List<Integer> values) {
            addCriterion("plan_two not in", values, "planTwo");
            return (Criteria) this;
        }

        public Criteria andPlanTwoBetween(Integer value1, Integer value2) {
            addCriterion("plan_two between", value1, value2, "planTwo");
            return (Criteria) this;
        }

        public Criteria andPlanTwoNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_two not between", value1, value2, "planTwo");
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