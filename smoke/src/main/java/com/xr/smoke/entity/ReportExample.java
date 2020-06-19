package com.xr.smoke.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andVisitidIsNull() {
            addCriterion("visitId is null");
            return (Criteria) this;
        }

        public Criteria andVisitidIsNotNull() {
            addCriterion("visitId is not null");
            return (Criteria) this;
        }

        public Criteria andVisitidEqualTo(Integer value) {
            addCriterion("visitId =", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidNotEqualTo(Integer value) {
            addCriterion("visitId <>", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidGreaterThan(Integer value) {
            addCriterion("visitId >", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitId >=", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidLessThan(Integer value) {
            addCriterion("visitId <", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidLessThanOrEqualTo(Integer value) {
            addCriterion("visitId <=", value, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidIn(List<Integer> values) {
            addCriterion("visitId in", values, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidNotIn(List<Integer> values) {
            addCriterion("visitId not in", values, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidBetween(Integer value1, Integer value2) {
            addCriterion("visitId between", value1, value2, "visitid");
            return (Criteria) this;
        }

        public Criteria andVisitidNotBetween(Integer value1, Integer value2) {
            addCriterion("visitId not between", value1, value2, "visitid");
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

        public Criteria andVisitorIsNull() {
            addCriterion("visitor is null");
            return (Criteria) this;
        }

        public Criteria andVisitorIsNotNull() {
            addCriterion("visitor is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorEqualTo(String value) {
            addCriterion("visitor =", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorNotEqualTo(String value) {
            addCriterion("visitor <>", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorGreaterThan(String value) {
            addCriterion("visitor >", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorGreaterThanOrEqualTo(String value) {
            addCriterion("visitor >=", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorLessThan(String value) {
            addCriterion("visitor <", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorLessThanOrEqualTo(String value) {
            addCriterion("visitor <=", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorLike(String value) {
            addCriterion("visitor like", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorNotLike(String value) {
            addCriterion("visitor not like", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorIn(List<String> values) {
            addCriterion("visitor in", values, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorNotIn(List<String> values) {
            addCriterion("visitor not in", values, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorBetween(String value1, String value2) {
            addCriterion("visitor between", value1, value2, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorNotBetween(String value1, String value2) {
            addCriterion("visitor not between", value1, value2, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentIsNull() {
            addCriterion("visitorDepartment is null");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentIsNotNull() {
            addCriterion("visitorDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentEqualTo(String value) {
            addCriterion("visitorDepartment =", value, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentNotEqualTo(String value) {
            addCriterion("visitorDepartment <>", value, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentGreaterThan(String value) {
            addCriterion("visitorDepartment >", value, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("visitorDepartment >=", value, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentLessThan(String value) {
            addCriterion("visitorDepartment <", value, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentLessThanOrEqualTo(String value) {
            addCriterion("visitorDepartment <=", value, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentLike(String value) {
            addCriterion("visitorDepartment like", value, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentNotLike(String value) {
            addCriterion("visitorDepartment not like", value, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentIn(List<String> values) {
            addCriterion("visitorDepartment in", values, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentNotIn(List<String> values) {
            addCriterion("visitorDepartment not in", values, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentBetween(String value1, String value2) {
            addCriterion("visitorDepartment between", value1, value2, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitordepartmentNotBetween(String value1, String value2) {
            addCriterion("visitorDepartment not between", value1, value2, "visitordepartment");
            return (Criteria) this;
        }

        public Criteria andVisitpostIsNull() {
            addCriterion("visitPost is null");
            return (Criteria) this;
        }

        public Criteria andVisitpostIsNotNull() {
            addCriterion("visitPost is not null");
            return (Criteria) this;
        }

        public Criteria andVisitpostEqualTo(String value) {
            addCriterion("visitPost =", value, "visitpost");
            return (Criteria) this;
        }

        public Criteria andVisitpostNotEqualTo(String value) {
            addCriterion("visitPost <>", value, "visitpost");
            return (Criteria) this;
        }

        public Criteria andVisitpostGreaterThan(String value) {
            addCriterion("visitPost >", value, "visitpost");
            return (Criteria) this;
        }

        public Criteria andVisitpostGreaterThanOrEqualTo(String value) {
            addCriterion("visitPost >=", value, "visitpost");
            return (Criteria) this;
        }

        public Criteria andVisitpostLessThan(String value) {
            addCriterion("visitPost <", value, "visitpost");
            return (Criteria) this;
        }

        public Criteria andVisitpostLessThanOrEqualTo(String value) {
            addCriterion("visitPost <=", value, "visitpost");
            return (Criteria) this;
        }

        public Criteria andVisitpostLike(String value) {
            addCriterion("visitPost like", value, "visitpost");
            return (Criteria) this;
        }

        public Criteria andVisitpostNotLike(String value) {
            addCriterion("visitPost not like", value, "visitpost");
            return (Criteria) this;
        }

        public Criteria andVisitpostIn(List<String> values) {
            addCriterion("visitPost in", values, "visitpost");
            return (Criteria) this;
        }

        public Criteria andVisitpostNotIn(List<String> values) {
            addCriterion("visitPost not in", values, "visitpost");
            return (Criteria) this;
        }

        public Criteria andVisitpostBetween(String value1, String value2) {
            addCriterion("visitPost between", value1, value2, "visitpost");
            return (Criteria) this;
        }

        public Criteria andVisitpostNotBetween(String value1, String value2) {
            addCriterion("visitPost not between", value1, value2, "visitpost");
            return (Criteria) this;
        }

        public Criteria andDefendantIsNull() {
            addCriterion("defendant is null");
            return (Criteria) this;
        }

        public Criteria andDefendantIsNotNull() {
            addCriterion("defendant is not null");
            return (Criteria) this;
        }

        public Criteria andDefendantEqualTo(String value) {
            addCriterion("defendant =", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantNotEqualTo(String value) {
            addCriterion("defendant <>", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantGreaterThan(String value) {
            addCriterion("defendant >", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantGreaterThanOrEqualTo(String value) {
            addCriterion("defendant >=", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantLessThan(String value) {
            addCriterion("defendant <", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantLessThanOrEqualTo(String value) {
            addCriterion("defendant <=", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantLike(String value) {
            addCriterion("defendant like", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantNotLike(String value) {
            addCriterion("defendant not like", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantIn(List<String> values) {
            addCriterion("defendant in", values, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantNotIn(List<String> values) {
            addCriterion("defendant not in", values, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantBetween(String value1, String value2) {
            addCriterion("defendant between", value1, value2, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantNotBetween(String value1, String value2) {
            addCriterion("defendant not between", value1, value2, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentIsNull() {
            addCriterion("defendantDepartment is null");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentIsNotNull() {
            addCriterion("defendantDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentEqualTo(String value) {
            addCriterion("defendantDepartment =", value, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentNotEqualTo(String value) {
            addCriterion("defendantDepartment <>", value, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentGreaterThan(String value) {
            addCriterion("defendantDepartment >", value, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("defendantDepartment >=", value, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentLessThan(String value) {
            addCriterion("defendantDepartment <", value, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentLessThanOrEqualTo(String value) {
            addCriterion("defendantDepartment <=", value, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentLike(String value) {
            addCriterion("defendantDepartment like", value, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentNotLike(String value) {
            addCriterion("defendantDepartment not like", value, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentIn(List<String> values) {
            addCriterion("defendantDepartment in", values, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentNotIn(List<String> values) {
            addCriterion("defendantDepartment not in", values, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentBetween(String value1, String value2) {
            addCriterion("defendantDepartment between", value1, value2, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantdepartmentNotBetween(String value1, String value2) {
            addCriterion("defendantDepartment not between", value1, value2, "defendantdepartment");
            return (Criteria) this;
        }

        public Criteria andDefendantpostIsNull() {
            addCriterion("defendantPost is null");
            return (Criteria) this;
        }

        public Criteria andDefendantpostIsNotNull() {
            addCriterion("defendantPost is not null");
            return (Criteria) this;
        }

        public Criteria andDefendantpostEqualTo(String value) {
            addCriterion("defendantPost =", value, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andDefendantpostNotEqualTo(String value) {
            addCriterion("defendantPost <>", value, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andDefendantpostGreaterThan(String value) {
            addCriterion("defendantPost >", value, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andDefendantpostGreaterThanOrEqualTo(String value) {
            addCriterion("defendantPost >=", value, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andDefendantpostLessThan(String value) {
            addCriterion("defendantPost <", value, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andDefendantpostLessThanOrEqualTo(String value) {
            addCriterion("defendantPost <=", value, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andDefendantpostLike(String value) {
            addCriterion("defendantPost like", value, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andDefendantpostNotLike(String value) {
            addCriterion("defendantPost not like", value, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andDefendantpostIn(List<String> values) {
            addCriterion("defendantPost in", values, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andDefendantpostNotIn(List<String> values) {
            addCriterion("defendantPost not in", values, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andDefendantpostBetween(String value1, String value2) {
            addCriterion("defendantPost between", value1, value2, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andDefendantpostNotBetween(String value1, String value2) {
            addCriterion("defendantPost not between", value1, value2, "defendantpost");
            return (Criteria) this;
        }

        public Criteria andVisitcontentIsNull() {
            addCriterion("visitContent is null");
            return (Criteria) this;
        }

        public Criteria andVisitcontentIsNotNull() {
            addCriterion("visitContent is not null");
            return (Criteria) this;
        }

        public Criteria andVisitcontentEqualTo(String value) {
            addCriterion("visitContent =", value, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitcontentNotEqualTo(String value) {
            addCriterion("visitContent <>", value, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitcontentGreaterThan(String value) {
            addCriterion("visitContent >", value, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitcontentGreaterThanOrEqualTo(String value) {
            addCriterion("visitContent >=", value, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitcontentLessThan(String value) {
            addCriterion("visitContent <", value, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitcontentLessThanOrEqualTo(String value) {
            addCriterion("visitContent <=", value, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitcontentLike(String value) {
            addCriterion("visitContent like", value, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitcontentNotLike(String value) {
            addCriterion("visitContent not like", value, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitcontentIn(List<String> values) {
            addCriterion("visitContent in", values, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitcontentNotIn(List<String> values) {
            addCriterion("visitContent not in", values, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitcontentBetween(String value1, String value2) {
            addCriterion("visitContent between", value1, value2, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitcontentNotBetween(String value1, String value2) {
            addCriterion("visitContent not between", value1, value2, "visitcontent");
            return (Criteria) this;
        }

        public Criteria andVisitdigestIsNull() {
            addCriterion("visitDigest is null");
            return (Criteria) this;
        }

        public Criteria andVisitdigestIsNotNull() {
            addCriterion("visitDigest is not null");
            return (Criteria) this;
        }

        public Criteria andVisitdigestEqualTo(String value) {
            addCriterion("visitDigest =", value, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andVisitdigestNotEqualTo(String value) {
            addCriterion("visitDigest <>", value, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andVisitdigestGreaterThan(String value) {
            addCriterion("visitDigest >", value, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andVisitdigestGreaterThanOrEqualTo(String value) {
            addCriterion("visitDigest >=", value, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andVisitdigestLessThan(String value) {
            addCriterion("visitDigest <", value, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andVisitdigestLessThanOrEqualTo(String value) {
            addCriterion("visitDigest <=", value, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andVisitdigestLike(String value) {
            addCriterion("visitDigest like", value, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andVisitdigestNotLike(String value) {
            addCriterion("visitDigest not like", value, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andVisitdigestIn(List<String> values) {
            addCriterion("visitDigest in", values, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andVisitdigestNotIn(List<String> values) {
            addCriterion("visitDigest not in", values, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andVisitdigestBetween(String value1, String value2) {
            addCriterion("visitDigest between", value1, value2, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andVisitdigestNotBetween(String value1, String value2) {
            addCriterion("visitDigest not between", value1, value2, "visitdigest");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionIsNull() {
            addCriterion("departmentOpinion is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionIsNotNull() {
            addCriterion("departmentOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionEqualTo(String value) {
            addCriterion("departmentOpinion =", value, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionNotEqualTo(String value) {
            addCriterion("departmentOpinion <>", value, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionGreaterThan(String value) {
            addCriterion("departmentOpinion >", value, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionGreaterThanOrEqualTo(String value) {
            addCriterion("departmentOpinion >=", value, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionLessThan(String value) {
            addCriterion("departmentOpinion <", value, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionLessThanOrEqualTo(String value) {
            addCriterion("departmentOpinion <=", value, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionLike(String value) {
            addCriterion("departmentOpinion like", value, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionNotLike(String value) {
            addCriterion("departmentOpinion not like", value, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionIn(List<String> values) {
            addCriterion("departmentOpinion in", values, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionNotIn(List<String> values) {
            addCriterion("departmentOpinion not in", values, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionBetween(String value1, String value2) {
            addCriterion("departmentOpinion between", value1, value2, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentopinionNotBetween(String value1, String value2) {
            addCriterion("departmentOpinion not between", value1, value2, "departmentopinion");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeIsNull() {
            addCriterion("signingcreationTime is null");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeIsNotNull() {
            addCriterion("signingcreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeEqualTo(Date value) {
            addCriterion("signingcreationTime =", value, "signingcreationtime");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeNotEqualTo(Date value) {
            addCriterion("signingcreationTime <>", value, "signingcreationtime");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeGreaterThan(Date value) {
            addCriterion("signingcreationTime >", value, "signingcreationtime");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signingcreationTime >=", value, "signingcreationtime");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeLessThan(Date value) {
            addCriterion("signingcreationTime <", value, "signingcreationtime");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("signingcreationTime <=", value, "signingcreationtime");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeIn(List<Date> values) {
            addCriterion("signingcreationTime in", values, "signingcreationtime");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeNotIn(List<Date> values) {
            addCriterion("signingcreationTime not in", values, "signingcreationtime");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeBetween(Date value1, Date value2) {
            addCriterion("signingcreationTime between", value1, value2, "signingcreationtime");
            return (Criteria) this;
        }

        public Criteria andSigningcreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("signingcreationTime not between", value1, value2, "signingcreationtime");
            return (Criteria) this;
        }

        public Criteria andGroupopinionIsNull() {
            addCriterion("groupOpinion is null");
            return (Criteria) this;
        }

        public Criteria andGroupopinionIsNotNull() {
            addCriterion("groupOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andGroupopinionEqualTo(String value) {
            addCriterion("groupOpinion =", value, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupopinionNotEqualTo(String value) {
            addCriterion("groupOpinion <>", value, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupopinionGreaterThan(String value) {
            addCriterion("groupOpinion >", value, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupopinionGreaterThanOrEqualTo(String value) {
            addCriterion("groupOpinion >=", value, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupopinionLessThan(String value) {
            addCriterion("groupOpinion <", value, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupopinionLessThanOrEqualTo(String value) {
            addCriterion("groupOpinion <=", value, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupopinionLike(String value) {
            addCriterion("groupOpinion like", value, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupopinionNotLike(String value) {
            addCriterion("groupOpinion not like", value, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupopinionIn(List<String> values) {
            addCriterion("groupOpinion in", values, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupopinionNotIn(List<String> values) {
            addCriterion("groupOpinion not in", values, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupopinionBetween(String value1, String value2) {
            addCriterion("groupOpinion between", value1, value2, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupopinionNotBetween(String value1, String value2) {
            addCriterion("groupOpinion not between", value1, value2, "groupopinion");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeIsNull() {
            addCriterion("groupSigningcreationTime is null");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeIsNotNull() {
            addCriterion("groupSigningcreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeEqualTo(Date value) {
            addCriterion("groupSigningcreationTime =", value, "groupsigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeNotEqualTo(Date value) {
            addCriterion("groupSigningcreationTime <>", value, "groupsigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeGreaterThan(Date value) {
            addCriterion("groupSigningcreationTime >", value, "groupsigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("groupSigningcreationTime >=", value, "groupsigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeLessThan(Date value) {
            addCriterion("groupSigningcreationTime <", value, "groupsigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("groupSigningcreationTime <=", value, "groupsigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeIn(List<Date> values) {
            addCriterion("groupSigningcreationTime in", values, "groupsigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeNotIn(List<Date> values) {
            addCriterion("groupSigningcreationTime not in", values, "groupsigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeBetween(Date value1, Date value2) {
            addCriterion("groupSigningcreationTime between", value1, value2, "groupsigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andGroupsigningcreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("groupSigningcreationTime not between", value1, value2, "groupsigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionIsNull() {
            addCriterion("leaderOpinion is null");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionIsNotNull() {
            addCriterion("leaderOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionEqualTo(String value) {
            addCriterion("leaderOpinion =", value, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionNotEqualTo(String value) {
            addCriterion("leaderOpinion <>", value, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionGreaterThan(String value) {
            addCriterion("leaderOpinion >", value, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionGreaterThanOrEqualTo(String value) {
            addCriterion("leaderOpinion >=", value, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionLessThan(String value) {
            addCriterion("leaderOpinion <", value, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionLessThanOrEqualTo(String value) {
            addCriterion("leaderOpinion <=", value, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionLike(String value) {
            addCriterion("leaderOpinion like", value, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionNotLike(String value) {
            addCriterion("leaderOpinion not like", value, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionIn(List<String> values) {
            addCriterion("leaderOpinion in", values, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionNotIn(List<String> values) {
            addCriterion("leaderOpinion not in", values, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionBetween(String value1, String value2) {
            addCriterion("leaderOpinion between", value1, value2, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeaderopinionNotBetween(String value1, String value2) {
            addCriterion("leaderOpinion not between", value1, value2, "leaderopinion");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeIsNull() {
            addCriterion("leaderSigningcreationTime is null");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeIsNotNull() {
            addCriterion("leaderSigningcreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeEqualTo(Date value) {
            addCriterion("leaderSigningcreationTime =", value, "leadersigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeNotEqualTo(Date value) {
            addCriterion("leaderSigningcreationTime <>", value, "leadersigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeGreaterThan(Date value) {
            addCriterion("leaderSigningcreationTime >", value, "leadersigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leaderSigningcreationTime >=", value, "leadersigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeLessThan(Date value) {
            addCriterion("leaderSigningcreationTime <", value, "leadersigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("leaderSigningcreationTime <=", value, "leadersigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeIn(List<Date> values) {
            addCriterion("leaderSigningcreationTime in", values, "leadersigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeNotIn(List<Date> values) {
            addCriterion("leaderSigningcreationTime not in", values, "leadersigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeBetween(Date value1, Date value2) {
            addCriterion("leaderSigningcreationTime between", value1, value2, "leadersigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andLeadersigningcreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("leaderSigningcreationTime not between", value1, value2, "leadersigningcreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultIsNull() {
            addCriterion("departmentReult is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultIsNotNull() {
            addCriterion("departmentReult is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultEqualTo(String value) {
            addCriterion("departmentReult =", value, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultNotEqualTo(String value) {
            addCriterion("departmentReult <>", value, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultGreaterThan(String value) {
            addCriterion("departmentReult >", value, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultGreaterThanOrEqualTo(String value) {
            addCriterion("departmentReult >=", value, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultLessThan(String value) {
            addCriterion("departmentReult <", value, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultLessThanOrEqualTo(String value) {
            addCriterion("departmentReult <=", value, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultLike(String value) {
            addCriterion("departmentReult like", value, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultNotLike(String value) {
            addCriterion("departmentReult not like", value, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultIn(List<String> values) {
            addCriterion("departmentReult in", values, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultNotIn(List<String> values) {
            addCriterion("departmentReult not in", values, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultBetween(String value1, String value2) {
            addCriterion("departmentReult between", value1, value2, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultNotBetween(String value1, String value2) {
            addCriterion("departmentReult not between", value1, value2, "departmentreult");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeIsNull() {
            addCriterion("departmentReultcreationTime is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeIsNotNull() {
            addCriterion("departmentReultcreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeEqualTo(Date value) {
            addCriterion("departmentReultcreationTime =", value, "departmentreultcreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeNotEqualTo(Date value) {
            addCriterion("departmentReultcreationTime <>", value, "departmentreultcreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeGreaterThan(Date value) {
            addCriterion("departmentReultcreationTime >", value, "departmentreultcreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("departmentReultcreationTime >=", value, "departmentreultcreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeLessThan(Date value) {
            addCriterion("departmentReultcreationTime <", value, "departmentreultcreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("departmentReultcreationTime <=", value, "departmentreultcreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeIn(List<Date> values) {
            addCriterion("departmentReultcreationTime in", values, "departmentreultcreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeNotIn(List<Date> values) {
            addCriterion("departmentReultcreationTime not in", values, "departmentreultcreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeBetween(Date value1, Date value2) {
            addCriterion("departmentReultcreationTime between", value1, value2, "departmentreultcreationtime");
            return (Criteria) this;
        }

        public Criteria andDepartmentreultcreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("departmentReultcreationTime not between", value1, value2, "departmentreultcreationtime");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeIsNull() {
            addCriterion("datecreationTime is null");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeIsNotNull() {
            addCriterion("datecreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeEqualTo(Date value) {
            addCriterion("datecreationTime =", value, "datecreationtime");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeNotEqualTo(Date value) {
            addCriterion("datecreationTime <>", value, "datecreationtime");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeGreaterThan(Date value) {
            addCriterion("datecreationTime >", value, "datecreationtime");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datecreationTime >=", value, "datecreationtime");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeLessThan(Date value) {
            addCriterion("datecreationTime <", value, "datecreationtime");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("datecreationTime <=", value, "datecreationtime");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeIn(List<Date> values) {
            addCriterion("datecreationTime in", values, "datecreationtime");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeNotIn(List<Date> values) {
            addCriterion("datecreationTime not in", values, "datecreationtime");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeBetween(Date value1, Date value2) {
            addCriterion("datecreationTime between", value1, value2, "datecreationtime");
            return (Criteria) this;
        }

        public Criteria andDatecreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("datecreationTime not between", value1, value2, "datecreationtime");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeIsNull() {
            addCriterion("foundcreationTime is null");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeIsNotNull() {
            addCriterion("foundcreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeEqualTo(Date value) {
            addCriterion("foundcreationTime =", value, "foundcreationtime");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeNotEqualTo(Date value) {
            addCriterion("foundcreationTime <>", value, "foundcreationtime");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeGreaterThan(Date value) {
            addCriterion("foundcreationTime >", value, "foundcreationtime");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("foundcreationTime >=", value, "foundcreationtime");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeLessThan(Date value) {
            addCriterion("foundcreationTime <", value, "foundcreationtime");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("foundcreationTime <=", value, "foundcreationtime");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeIn(List<Date> values) {
            addCriterion("foundcreationTime in", values, "foundcreationtime");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeNotIn(List<Date> values) {
            addCriterion("foundcreationTime not in", values, "foundcreationtime");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeBetween(Date value1, Date value2) {
            addCriterion("foundcreationTime between", value1, value2, "foundcreationtime");
            return (Criteria) this;
        }

        public Criteria andFoundcreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("foundcreationTime not between", value1, value2, "foundcreationtime");
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