package com.xr.smoke.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmployeeidIsNull() {
            addCriterion("employeeId is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("employeeId is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(Integer value) {
            addCriterion("employeeId =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(Integer value) {
            addCriterion("employeeId <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(Integer value) {
            addCriterion("employeeId >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeeId >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(Integer value) {
            addCriterion("employeeId <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(Integer value) {
            addCriterion("employeeId <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<Integer> values) {
            addCriterion("employeeId in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<Integer> values) {
            addCriterion("employeeId not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(Integer value1, Integer value2) {
            addCriterion("employeeId between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(Integer value1, Integer value2) {
            addCriterion("employeeId not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNull() {
            addCriterion("employeeName is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNotNull() {
            addCriterion("employeeName is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameEqualTo(String value) {
            addCriterion("employeeName =", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotEqualTo(String value) {
            addCriterion("employeeName <>", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThan(String value) {
            addCriterion("employeeName >", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThanOrEqualTo(String value) {
            addCriterion("employeeName >=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThan(String value) {
            addCriterion("employeeName <", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThanOrEqualTo(String value) {
            addCriterion("employeeName <=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLike(String value) {
            addCriterion("employeeName like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotLike(String value) {
            addCriterion("employeeName not like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIn(List<String> values) {
            addCriterion("employeeName in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotIn(List<String> values) {
            addCriterion("employeeName not in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameBetween(String value1, String value2) {
            addCriterion("employeeName between", value1, value2, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotBetween(String value1, String value2) {
            addCriterion("employeeName not between", value1, value2, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeesexIsNull() {
            addCriterion("employeeSex is null");
            return (Criteria) this;
        }

        public Criteria andEmployeesexIsNotNull() {
            addCriterion("employeeSex is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeesexEqualTo(String value) {
            addCriterion("employeeSex =", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexNotEqualTo(String value) {
            addCriterion("employeeSex <>", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexGreaterThan(String value) {
            addCriterion("employeeSex >", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexGreaterThanOrEqualTo(String value) {
            addCriterion("employeeSex >=", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexLessThan(String value) {
            addCriterion("employeeSex <", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexLessThanOrEqualTo(String value) {
            addCriterion("employeeSex <=", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexLike(String value) {
            addCriterion("employeeSex like", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexNotLike(String value) {
            addCriterion("employeeSex not like", value, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexIn(List<String> values) {
            addCriterion("employeeSex in", values, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexNotIn(List<String> values) {
            addCriterion("employeeSex not in", values, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexBetween(String value1, String value2) {
            addCriterion("employeeSex between", value1, value2, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeesexNotBetween(String value1, String value2) {
            addCriterion("employeeSex not between", value1, value2, "employeesex");
            return (Criteria) this;
        }

        public Criteria andEmployeeageIsNull() {
            addCriterion("employeeAge is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeageIsNotNull() {
            addCriterion("employeeAge is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeageEqualTo(Integer value) {
            addCriterion("employeeAge =", value, "employeeage");
            return (Criteria) this;
        }

        public Criteria andEmployeeageNotEqualTo(Integer value) {
            addCriterion("employeeAge <>", value, "employeeage");
            return (Criteria) this;
        }

        public Criteria andEmployeeageGreaterThan(Integer value) {
            addCriterion("employeeAge >", value, "employeeage");
            return (Criteria) this;
        }

        public Criteria andEmployeeageGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeeAge >=", value, "employeeage");
            return (Criteria) this;
        }

        public Criteria andEmployeeageLessThan(Integer value) {
            addCriterion("employeeAge <", value, "employeeage");
            return (Criteria) this;
        }

        public Criteria andEmployeeageLessThanOrEqualTo(Integer value) {
            addCriterion("employeeAge <=", value, "employeeage");
            return (Criteria) this;
        }

        public Criteria andEmployeeageIn(List<Integer> values) {
            addCriterion("employeeAge in", values, "employeeage");
            return (Criteria) this;
        }

        public Criteria andEmployeeageNotIn(List<Integer> values) {
            addCriterion("employeeAge not in", values, "employeeage");
            return (Criteria) this;
        }

        public Criteria andEmployeeageBetween(Integer value1, Integer value2) {
            addCriterion("employeeAge between", value1, value2, "employeeage");
            return (Criteria) this;
        }

        public Criteria andEmployeeageNotBetween(Integer value1, Integer value2) {
            addCriterion("employeeAge not between", value1, value2, "employeeage");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Integer value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Integer value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Integer value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Integer value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Integer value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Integer> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Integer> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Integer value1, Integer value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusIsNull() {
            addCriterion("politicsStatus is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusIsNotNull() {
            addCriterion("politicsStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusEqualTo(Integer value) {
            addCriterion("politicsStatus =", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusNotEqualTo(Integer value) {
            addCriterion("politicsStatus <>", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusGreaterThan(Integer value) {
            addCriterion("politicsStatus >", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("politicsStatus >=", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusLessThan(Integer value) {
            addCriterion("politicsStatus <", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusLessThanOrEqualTo(Integer value) {
            addCriterion("politicsStatus <=", value, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusIn(List<Integer> values) {
            addCriterion("politicsStatus in", values, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusNotIn(List<Integer> values) {
            addCriterion("politicsStatus not in", values, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusBetween(Integer value1, Integer value2) {
            addCriterion("politicsStatus between", value1, value2, "politicsstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("politicsStatus not between", value1, value2, "politicsstatus");
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("Account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("Account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("Account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("Account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("Account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("Account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("Account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("Account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("Account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("Account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("Account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("Account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("Account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("Account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPostidIsNull() {
            addCriterion("postId is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("postId is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(Integer value) {
            addCriterion("postId =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(Integer value) {
            addCriterion("postId <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(Integer value) {
            addCriterion("postId >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("postId >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(Integer value) {
            addCriterion("postId <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(Integer value) {
            addCriterion("postId <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<Integer> values) {
            addCriterion("postId in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<Integer> values) {
            addCriterion("postId not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(Integer value1, Integer value2) {
            addCriterion("postId between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("postId not between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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

        public Criteria andEmployeestatusIsNull() {
            addCriterion("employeeStatus is null");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusIsNotNull() {
            addCriterion("employeeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusEqualTo(Integer value) {
            addCriterion("employeeStatus =", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusNotEqualTo(Integer value) {
            addCriterion("employeeStatus <>", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusGreaterThan(Integer value) {
            addCriterion("employeeStatus >", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeeStatus >=", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusLessThan(Integer value) {
            addCriterion("employeeStatus <", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusLessThanOrEqualTo(Integer value) {
            addCriterion("employeeStatus <=", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusIn(List<Integer> values) {
            addCriterion("employeeStatus in", values, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusNotIn(List<Integer> values) {
            addCriterion("employeeStatus not in", values, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusBetween(Integer value1, Integer value2) {
            addCriterion("employeeStatus between", value1, value2, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("employeeStatus not between", value1, value2, "employeestatus");
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