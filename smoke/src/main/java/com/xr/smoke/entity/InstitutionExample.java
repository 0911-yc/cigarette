package com.xr.smoke.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstitutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstitutionExample() {
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(String value) {
            addCriterion("departmentID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(String value) {
            addCriterion("departmentID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(String value) {
            addCriterion("departmentID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("departmentID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(String value) {
            addCriterion("departmentID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(String value) {
            addCriterion("departmentID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLike(String value) {
            addCriterion("departmentID like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotLike(String value) {
            addCriterion("departmentID not like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<String> values) {
            addCriterion("departmentID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<String> values) {
            addCriterion("departmentID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(String value1, String value2) {
            addCriterion("departmentID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(String value1, String value2) {
            addCriterion("departmentID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentName is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentName =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentName <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentName >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentName >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentName <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentName <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentName like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentName not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentName in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentName not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentName between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentName not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadIsNull() {
            addCriterion("departmentHead is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadIsNotNull() {
            addCriterion("departmentHead is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadEqualTo(String value) {
            addCriterion("departmentHead =", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadNotEqualTo(String value) {
            addCriterion("departmentHead <>", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadGreaterThan(String value) {
            addCriterion("departmentHead >", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadGreaterThanOrEqualTo(String value) {
            addCriterion("departmentHead >=", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadLessThan(String value) {
            addCriterion("departmentHead <", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadLessThanOrEqualTo(String value) {
            addCriterion("departmentHead <=", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadLike(String value) {
            addCriterion("departmentHead like", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadNotLike(String value) {
            addCriterion("departmentHead not like", value, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadIn(List<String> values) {
            addCriterion("departmentHead in", values, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadNotIn(List<String> values) {
            addCriterion("departmentHead not in", values, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadBetween(String value1, String value2) {
            addCriterion("departmentHead between", value1, value2, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDepartmentheadNotBetween(String value1, String value2) {
            addCriterion("departmentHead not between", value1, value2, "departmenthead");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementIsNull() {
            addCriterion("divisionalManagement is null");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementIsNotNull() {
            addCriterion("divisionalManagement is not null");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementEqualTo(String value) {
            addCriterion("divisionalManagement =", value, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementNotEqualTo(String value) {
            addCriterion("divisionalManagement <>", value, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementGreaterThan(String value) {
            addCriterion("divisionalManagement >", value, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementGreaterThanOrEqualTo(String value) {
            addCriterion("divisionalManagement >=", value, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementLessThan(String value) {
            addCriterion("divisionalManagement <", value, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementLessThanOrEqualTo(String value) {
            addCriterion("divisionalManagement <=", value, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementLike(String value) {
            addCriterion("divisionalManagement like", value, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementNotLike(String value) {
            addCriterion("divisionalManagement not like", value, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementIn(List<String> values) {
            addCriterion("divisionalManagement in", values, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementNotIn(List<String> values) {
            addCriterion("divisionalManagement not in", values, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementBetween(String value1, String value2) {
            addCriterion("divisionalManagement between", value1, value2, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andDivisionalmanagementNotBetween(String value1, String value2) {
            addCriterion("divisionalManagement not between", value1, value2, "divisionalmanagement");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("creationTime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("creationTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("creationTime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("creationTime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("creationTime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creationTime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("creationTime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("creationTime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("creationTime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("creationTime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("creationTime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("creationTime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCurrentidIsNull() {
            addCriterion("currentId is null");
            return (Criteria) this;
        }

        public Criteria andCurrentidIsNotNull() {
            addCriterion("currentId is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentidEqualTo(Integer value) {
            addCriterion("currentId =", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidNotEqualTo(Integer value) {
            addCriterion("currentId <>", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidGreaterThan(Integer value) {
            addCriterion("currentId >", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("currentId >=", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidLessThan(Integer value) {
            addCriterion("currentId <", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidLessThanOrEqualTo(Integer value) {
            addCriterion("currentId <=", value, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidIn(List<Integer> values) {
            addCriterion("currentId in", values, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidNotIn(List<Integer> values) {
            addCriterion("currentId not in", values, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidBetween(Integer value1, Integer value2) {
            addCriterion("currentId between", value1, value2, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentidNotBetween(Integer value1, Integer value2) {
            addCriterion("currentId not between", value1, value2, "currentid");
            return (Criteria) this;
        }

        public Criteria andCurrentnameIsNull() {
            addCriterion("currentName is null");
            return (Criteria) this;
        }

        public Criteria andCurrentnameIsNotNull() {
            addCriterion("currentName is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentnameEqualTo(String value) {
            addCriterion("currentName =", value, "currentname");
            return (Criteria) this;
        }

        public Criteria andCurrentnameNotEqualTo(String value) {
            addCriterion("currentName <>", value, "currentname");
            return (Criteria) this;
        }

        public Criteria andCurrentnameGreaterThan(String value) {
            addCriterion("currentName >", value, "currentname");
            return (Criteria) this;
        }

        public Criteria andCurrentnameGreaterThanOrEqualTo(String value) {
            addCriterion("currentName >=", value, "currentname");
            return (Criteria) this;
        }

        public Criteria andCurrentnameLessThan(String value) {
            addCriterion("currentName <", value, "currentname");
            return (Criteria) this;
        }

        public Criteria andCurrentnameLessThanOrEqualTo(String value) {
            addCriterion("currentName <=", value, "currentname");
            return (Criteria) this;
        }

        public Criteria andCurrentnameLike(String value) {
            addCriterion("currentName like", value, "currentname");
            return (Criteria) this;
        }

        public Criteria andCurrentnameNotLike(String value) {
            addCriterion("currentName not like", value, "currentname");
            return (Criteria) this;
        }

        public Criteria andCurrentnameIn(List<String> values) {
            addCriterion("currentName in", values, "currentname");
            return (Criteria) this;
        }

        public Criteria andCurrentnameNotIn(List<String> values) {
            addCriterion("currentName not in", values, "currentname");
            return (Criteria) this;
        }

        public Criteria andCurrentnameBetween(String value1, String value2) {
            addCriterion("currentName between", value1, value2, "currentname");
            return (Criteria) this;
        }

        public Criteria andCurrentnameNotBetween(String value1, String value2) {
            addCriterion("currentName not between", value1, value2, "currentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateIsNull() {
            addCriterion("departmentState is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateIsNotNull() {
            addCriterion("departmentState is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateEqualTo(Integer value) {
            addCriterion("departmentState =", value, "departmentstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateNotEqualTo(Integer value) {
            addCriterion("departmentState <>", value, "departmentstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateGreaterThan(Integer value) {
            addCriterion("departmentState >", value, "departmentstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentState >=", value, "departmentstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateLessThan(Integer value) {
            addCriterion("departmentState <", value, "departmentstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateLessThanOrEqualTo(Integer value) {
            addCriterion("departmentState <=", value, "departmentstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateIn(List<Integer> values) {
            addCriterion("departmentState in", values, "departmentstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateNotIn(List<Integer> values) {
            addCriterion("departmentState not in", values, "departmentstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateBetween(Integer value1, Integer value2) {
            addCriterion("departmentState between", value1, value2, "departmentstate");
            return (Criteria) this;
        }

        public Criteria andDepartmentstateNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentState not between", value1, value2, "departmentstate");
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