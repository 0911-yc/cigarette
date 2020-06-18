package com.xr.smoke.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostRiskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostRiskExample() {
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

        public Criteria andPostriskidIsNull() {
            addCriterion("postRiskid is null");
            return (Criteria) this;
        }

        public Criteria andPostriskidIsNotNull() {
            addCriterion("postRiskid is not null");
            return (Criteria) this;
        }

        public Criteria andPostriskidEqualTo(Integer value) {
            addCriterion("postRiskid =", value, "postriskid");
            return (Criteria) this;
        }

        public Criteria andPostriskidNotEqualTo(Integer value) {
            addCriterion("postRiskid <>", value, "postriskid");
            return (Criteria) this;
        }

        public Criteria andPostriskidGreaterThan(Integer value) {
            addCriterion("postRiskid >", value, "postriskid");
            return (Criteria) this;
        }

        public Criteria andPostriskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("postRiskid >=", value, "postriskid");
            return (Criteria) this;
        }

        public Criteria andPostriskidLessThan(Integer value) {
            addCriterion("postRiskid <", value, "postriskid");
            return (Criteria) this;
        }

        public Criteria andPostriskidLessThanOrEqualTo(Integer value) {
            addCriterion("postRiskid <=", value, "postriskid");
            return (Criteria) this;
        }

        public Criteria andPostriskidIn(List<Integer> values) {
            addCriterion("postRiskid in", values, "postriskid");
            return (Criteria) this;
        }

        public Criteria andPostriskidNotIn(List<Integer> values) {
            addCriterion("postRiskid not in", values, "postriskid");
            return (Criteria) this;
        }

        public Criteria andPostriskidBetween(Integer value1, Integer value2) {
            addCriterion("postRiskid between", value1, value2, "postriskid");
            return (Criteria) this;
        }

        public Criteria andPostriskidNotBetween(Integer value1, Integer value2) {
            addCriterion("postRiskid not between", value1, value2, "postriskid");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andPostidIsNull() {
            addCriterion("PostId is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("PostId is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(Integer value) {
            addCriterion("PostId =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(Integer value) {
            addCriterion("PostId <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(Integer value) {
            addCriterion("PostId >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PostId >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(Integer value) {
            addCriterion("PostId <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(Integer value) {
            addCriterion("PostId <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<Integer> values) {
            addCriterion("PostId in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<Integer> values) {
            addCriterion("PostId not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(Integer value1, Integer value2) {
            addCriterion("PostId between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("PostId not between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("project is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("project =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("project <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("project >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("project >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("project <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("project <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("project like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("project not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("project in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("project not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("project between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("project not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("describe not between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andMayoccurIsNull() {
            addCriterion("mayOccur is null");
            return (Criteria) this;
        }

        public Criteria andMayoccurIsNotNull() {
            addCriterion("mayOccur is not null");
            return (Criteria) this;
        }

        public Criteria andMayoccurEqualTo(String value) {
            addCriterion("mayOccur =", value, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andMayoccurNotEqualTo(String value) {
            addCriterion("mayOccur <>", value, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andMayoccurGreaterThan(String value) {
            addCriterion("mayOccur >", value, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andMayoccurGreaterThanOrEqualTo(String value) {
            addCriterion("mayOccur >=", value, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andMayoccurLessThan(String value) {
            addCriterion("mayOccur <", value, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andMayoccurLessThanOrEqualTo(String value) {
            addCriterion("mayOccur <=", value, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andMayoccurLike(String value) {
            addCriterion("mayOccur like", value, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andMayoccurNotLike(String value) {
            addCriterion("mayOccur not like", value, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andMayoccurIn(List<String> values) {
            addCriterion("mayOccur in", values, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andMayoccurNotIn(List<String> values) {
            addCriterion("mayOccur not in", values, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andMayoccurBetween(String value1, String value2) {
            addCriterion("mayOccur between", value1, value2, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andMayoccurNotBetween(String value1, String value2) {
            addCriterion("mayOccur not between", value1, value2, "mayoccur");
            return (Criteria) this;
        }

        public Criteria andConsequenceIsNull() {
            addCriterion("consequence is null");
            return (Criteria) this;
        }

        public Criteria andConsequenceIsNotNull() {
            addCriterion("consequence is not null");
            return (Criteria) this;
        }

        public Criteria andConsequenceEqualTo(String value) {
            addCriterion("consequence =", value, "consequence");
            return (Criteria) this;
        }

        public Criteria andConsequenceNotEqualTo(String value) {
            addCriterion("consequence <>", value, "consequence");
            return (Criteria) this;
        }

        public Criteria andConsequenceGreaterThan(String value) {
            addCriterion("consequence >", value, "consequence");
            return (Criteria) this;
        }

        public Criteria andConsequenceGreaterThanOrEqualTo(String value) {
            addCriterion("consequence >=", value, "consequence");
            return (Criteria) this;
        }

        public Criteria andConsequenceLessThan(String value) {
            addCriterion("consequence <", value, "consequence");
            return (Criteria) this;
        }

        public Criteria andConsequenceLessThanOrEqualTo(String value) {
            addCriterion("consequence <=", value, "consequence");
            return (Criteria) this;
        }

        public Criteria andConsequenceLike(String value) {
            addCriterion("consequence like", value, "consequence");
            return (Criteria) this;
        }

        public Criteria andConsequenceNotLike(String value) {
            addCriterion("consequence not like", value, "consequence");
            return (Criteria) this;
        }

        public Criteria andConsequenceIn(List<String> values) {
            addCriterion("consequence in", values, "consequence");
            return (Criteria) this;
        }

        public Criteria andConsequenceNotIn(List<String> values) {
            addCriterion("consequence not in", values, "consequence");
            return (Criteria) this;
        }

        public Criteria andConsequenceBetween(String value1, String value2) {
            addCriterion("consequence between", value1, value2, "consequence");
            return (Criteria) this;
        }

        public Criteria andConsequenceNotBetween(String value1, String value2) {
            addCriterion("consequence not between", value1, value2, "consequence");
            return (Criteria) this;
        }

        public Criteria andLeastvalueIsNull() {
            addCriterion("LeastValue is null");
            return (Criteria) this;
        }

        public Criteria andLeastvalueIsNotNull() {
            addCriterion("LeastValue is not null");
            return (Criteria) this;
        }

        public Criteria andLeastvalueEqualTo(String value) {
            addCriterion("LeastValue =", value, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andLeastvalueNotEqualTo(String value) {
            addCriterion("LeastValue <>", value, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andLeastvalueGreaterThan(String value) {
            addCriterion("LeastValue >", value, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andLeastvalueGreaterThanOrEqualTo(String value) {
            addCriterion("LeastValue >=", value, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andLeastvalueLessThan(String value) {
            addCriterion("LeastValue <", value, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andLeastvalueLessThanOrEqualTo(String value) {
            addCriterion("LeastValue <=", value, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andLeastvalueLike(String value) {
            addCriterion("LeastValue like", value, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andLeastvalueNotLike(String value) {
            addCriterion("LeastValue not like", value, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andLeastvalueIn(List<String> values) {
            addCriterion("LeastValue in", values, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andLeastvalueNotIn(List<String> values) {
            addCriterion("LeastValue not in", values, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andLeastvalueBetween(String value1, String value2) {
            addCriterion("LeastValue between", value1, value2, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andLeastvalueNotBetween(String value1, String value2) {
            addCriterion("LeastValue not between", value1, value2, "leastvalue");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseIsNull() {
            addCriterion("precautionaryMeasurse is null");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseIsNotNull() {
            addCriterion("precautionaryMeasurse is not null");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseEqualTo(String value) {
            addCriterion("precautionaryMeasurse =", value, "precautionarymeasurse");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseNotEqualTo(String value) {
            addCriterion("precautionaryMeasurse <>", value, "precautionarymeasurse");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseGreaterThan(String value) {
            addCriterion("precautionaryMeasurse >", value, "precautionarymeasurse");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseGreaterThanOrEqualTo(String value) {
            addCriterion("precautionaryMeasurse >=", value, "precautionarymeasurse");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseLessThan(String value) {
            addCriterion("precautionaryMeasurse <", value, "precautionarymeasurse");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseLessThanOrEqualTo(String value) {
            addCriterion("precautionaryMeasurse <=", value, "precautionarymeasurse");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseLike(String value) {
            addCriterion("precautionaryMeasurse like", value, "precautionarymeasurse");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseNotLike(String value) {
            addCriterion("precautionaryMeasurse not like", value, "precautionarymeasurse");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseIn(List<String> values) {
            addCriterion("precautionaryMeasurse in", values, "precautionarymeasurse");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseNotIn(List<String> values) {
            addCriterion("precautionaryMeasurse not in", values, "precautionarymeasurse");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseBetween(String value1, String value2) {
            addCriterion("precautionaryMeasurse between", value1, value2, "precautionarymeasurse");
            return (Criteria) this;
        }

        public Criteria andPrecautionarymeasurseNotBetween(String value1, String value2) {
            addCriterion("precautionaryMeasurse not between", value1, value2, "precautionarymeasurse");
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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