package com.xr.smoke.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoliticianTalkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoliticianTalkExample() {
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

        public Criteria andTalknameIsNull() {
            addCriterion("talkName is null");
            return (Criteria) this;
        }

        public Criteria andTalknameIsNotNull() {
            addCriterion("talkName is not null");
            return (Criteria) this;
        }

        public Criteria andTalknameEqualTo(String value) {
            addCriterion("talkName =", value, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalknameNotEqualTo(String value) {
            addCriterion("talkName <>", value, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalknameGreaterThan(String value) {
            addCriterion("talkName >", value, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalknameGreaterThanOrEqualTo(String value) {
            addCriterion("talkName >=", value, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalknameLessThan(String value) {
            addCriterion("talkName <", value, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalknameLessThanOrEqualTo(String value) {
            addCriterion("talkName <=", value, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalknameLike(String value) {
            addCriterion("talkName like", value, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalknameNotLike(String value) {
            addCriterion("talkName not like", value, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalknameIn(List<String> values) {
            addCriterion("talkName in", values, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalknameNotIn(List<String> values) {
            addCriterion("talkName not in", values, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalknameBetween(String value1, String value2) {
            addCriterion("talkName between", value1, value2, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalknameNotBetween(String value1, String value2) {
            addCriterion("talkName not between", value1, value2, "talkname");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentIsNull() {
            addCriterion("talkDempartment is null");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentIsNotNull() {
            addCriterion("talkDempartment is not null");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentEqualTo(String value) {
            addCriterion("talkDempartment =", value, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentNotEqualTo(String value) {
            addCriterion("talkDempartment <>", value, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentGreaterThan(String value) {
            addCriterion("talkDempartment >", value, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentGreaterThanOrEqualTo(String value) {
            addCriterion("talkDempartment >=", value, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentLessThan(String value) {
            addCriterion("talkDempartment <", value, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentLessThanOrEqualTo(String value) {
            addCriterion("talkDempartment <=", value, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentLike(String value) {
            addCriterion("talkDempartment like", value, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentNotLike(String value) {
            addCriterion("talkDempartment not like", value, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentIn(List<String> values) {
            addCriterion("talkDempartment in", values, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentNotIn(List<String> values) {
            addCriterion("talkDempartment not in", values, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentBetween(String value1, String value2) {
            addCriterion("talkDempartment between", value1, value2, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkdempartmentNotBetween(String value1, String value2) {
            addCriterion("talkDempartment not between", value1, value2, "talkdempartment");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusIsNull() {
            addCriterion("talkPoliticsStatus is null");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusIsNotNull() {
            addCriterion("talkPoliticsStatus is not null");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusEqualTo(Integer value) {
            addCriterion("talkPoliticsStatus =", value, "talkpoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusNotEqualTo(Integer value) {
            addCriterion("talkPoliticsStatus <>", value, "talkpoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusGreaterThan(Integer value) {
            addCriterion("talkPoliticsStatus >", value, "talkpoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("talkPoliticsStatus >=", value, "talkpoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusLessThan(Integer value) {
            addCriterion("talkPoliticsStatus <", value, "talkpoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusLessThanOrEqualTo(Integer value) {
            addCriterion("talkPoliticsStatus <=", value, "talkpoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusIn(List<Integer> values) {
            addCriterion("talkPoliticsStatus in", values, "talkpoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusNotIn(List<Integer> values) {
            addCriterion("talkPoliticsStatus not in", values, "talkpoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusBetween(Integer value1, Integer value2) {
            addCriterion("talkPoliticsStatus between", value1, value2, "talkpoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andTalkpoliticsstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("talkPoliticsStatus not between", value1, value2, "talkpoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andTalkdutyIsNull() {
            addCriterion("talkDuty is null");
            return (Criteria) this;
        }

        public Criteria andTalkdutyIsNotNull() {
            addCriterion("talkDuty is not null");
            return (Criteria) this;
        }

        public Criteria andTalkdutyEqualTo(String value) {
            addCriterion("talkDuty =", value, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalkdutyNotEqualTo(String value) {
            addCriterion("talkDuty <>", value, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalkdutyGreaterThan(String value) {
            addCriterion("talkDuty >", value, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalkdutyGreaterThanOrEqualTo(String value) {
            addCriterion("talkDuty >=", value, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalkdutyLessThan(String value) {
            addCriterion("talkDuty <", value, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalkdutyLessThanOrEqualTo(String value) {
            addCriterion("talkDuty <=", value, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalkdutyLike(String value) {
            addCriterion("talkDuty like", value, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalkdutyNotLike(String value) {
            addCriterion("talkDuty not like", value, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalkdutyIn(List<String> values) {
            addCriterion("talkDuty in", values, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalkdutyNotIn(List<String> values) {
            addCriterion("talkDuty not in", values, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalkdutyBetween(String value1, String value2) {
            addCriterion("talkDuty between", value1, value2, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalkdutyNotBetween(String value1, String value2) {
            addCriterion("talkDuty not between", value1, value2, "talkduty");
            return (Criteria) this;
        }

        public Criteria andTalktypeIsNull() {
            addCriterion("talkType is null");
            return (Criteria) this;
        }

        public Criteria andTalktypeIsNotNull() {
            addCriterion("talkType is not null");
            return (Criteria) this;
        }

        public Criteria andTalktypeEqualTo(String value) {
            addCriterion("talkType =", value, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalktypeNotEqualTo(String value) {
            addCriterion("talkType <>", value, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalktypeGreaterThan(String value) {
            addCriterion("talkType >", value, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalktypeGreaterThanOrEqualTo(String value) {
            addCriterion("talkType >=", value, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalktypeLessThan(String value) {
            addCriterion("talkType <", value, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalktypeLessThanOrEqualTo(String value) {
            addCriterion("talkType <=", value, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalktypeLike(String value) {
            addCriterion("talkType like", value, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalktypeNotLike(String value) {
            addCriterion("talkType not like", value, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalktypeIn(List<String> values) {
            addCriterion("talkType in", values, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalktypeNotIn(List<String> values) {
            addCriterion("talkType not in", values, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalktypeBetween(String value1, String value2) {
            addCriterion("talkType between", value1, value2, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalktypeNotBetween(String value1, String value2) {
            addCriterion("talkType not between", value1, value2, "talktype");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeIsNull() {
            addCriterion("talkcreationTime is null");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeIsNotNull() {
            addCriterion("talkcreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeEqualTo(Date value) {
            addCriterion("talkcreationTime =", value, "talkcreationtime");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeNotEqualTo(Date value) {
            addCriterion("talkcreationTime <>", value, "talkcreationtime");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeGreaterThan(Date value) {
            addCriterion("talkcreationTime >", value, "talkcreationtime");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("talkcreationTime >=", value, "talkcreationtime");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeLessThan(Date value) {
            addCriterion("talkcreationTime <", value, "talkcreationtime");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("talkcreationTime <=", value, "talkcreationtime");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeIn(List<Date> values) {
            addCriterion("talkcreationTime in", values, "talkcreationtime");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeNotIn(List<Date> values) {
            addCriterion("talkcreationTime not in", values, "talkcreationtime");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeBetween(Date value1, Date value2) {
            addCriterion("talkcreationTime between", value1, value2, "talkcreationtime");
            return (Criteria) this;
        }

        public Criteria andTalkcreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("talkcreationTime not between", value1, value2, "talkcreationtime");
            return (Criteria) this;
        }

        public Criteria andTalksiteIsNull() {
            addCriterion("talkSite is null");
            return (Criteria) this;
        }

        public Criteria andTalksiteIsNotNull() {
            addCriterion("talkSite is not null");
            return (Criteria) this;
        }

        public Criteria andTalksiteEqualTo(String value) {
            addCriterion("talkSite =", value, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalksiteNotEqualTo(String value) {
            addCriterion("talkSite <>", value, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalksiteGreaterThan(String value) {
            addCriterion("talkSite >", value, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalksiteGreaterThanOrEqualTo(String value) {
            addCriterion("talkSite >=", value, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalksiteLessThan(String value) {
            addCriterion("talkSite <", value, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalksiteLessThanOrEqualTo(String value) {
            addCriterion("talkSite <=", value, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalksiteLike(String value) {
            addCriterion("talkSite like", value, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalksiteNotLike(String value) {
            addCriterion("talkSite not like", value, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalksiteIn(List<String> values) {
            addCriterion("talkSite in", values, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalksiteNotIn(List<String> values) {
            addCriterion("talkSite not in", values, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalksiteBetween(String value1, String value2) {
            addCriterion("talkSite between", value1, value2, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalksiteNotBetween(String value1, String value2) {
            addCriterion("talkSite not between", value1, value2, "talksite");
            return (Criteria) this;
        }

        public Criteria andTalkpersonIsNull() {
            addCriterion("talkPerson is null");
            return (Criteria) this;
        }

        public Criteria andTalkpersonIsNotNull() {
            addCriterion("talkPerson is not null");
            return (Criteria) this;
        }

        public Criteria andTalkpersonEqualTo(String value) {
            addCriterion("talkPerson =", value, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkpersonNotEqualTo(String value) {
            addCriterion("talkPerson <>", value, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkpersonGreaterThan(String value) {
            addCriterion("talkPerson >", value, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkpersonGreaterThanOrEqualTo(String value) {
            addCriterion("talkPerson >=", value, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkpersonLessThan(String value) {
            addCriterion("talkPerson <", value, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkpersonLessThanOrEqualTo(String value) {
            addCriterion("talkPerson <=", value, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkpersonLike(String value) {
            addCriterion("talkPerson like", value, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkpersonNotLike(String value) {
            addCriterion("talkPerson not like", value, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkpersonIn(List<String> values) {
            addCriterion("talkPerson in", values, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkpersonNotIn(List<String> values) {
            addCriterion("talkPerson not in", values, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkpersonBetween(String value1, String value2) {
            addCriterion("talkPerson between", value1, value2, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkpersonNotBetween(String value1, String value2) {
            addCriterion("talkPerson not between", value1, value2, "talkperson");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineIsNull() {
            addCriterion("talkOutline is null");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineIsNotNull() {
            addCriterion("talkOutline is not null");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineEqualTo(String value) {
            addCriterion("talkOutline =", value, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineNotEqualTo(String value) {
            addCriterion("talkOutline <>", value, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineGreaterThan(String value) {
            addCriterion("talkOutline >", value, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineGreaterThanOrEqualTo(String value) {
            addCriterion("talkOutline >=", value, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineLessThan(String value) {
            addCriterion("talkOutline <", value, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineLessThanOrEqualTo(String value) {
            addCriterion("talkOutline <=", value, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineLike(String value) {
            addCriterion("talkOutline like", value, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineNotLike(String value) {
            addCriterion("talkOutline not like", value, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineIn(List<String> values) {
            addCriterion("talkOutline in", values, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineNotIn(List<String> values) {
            addCriterion("talkOutline not in", values, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineBetween(String value1, String value2) {
            addCriterion("talkOutline between", value1, value2, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkoutlineNotBetween(String value1, String value2) {
            addCriterion("talkOutline not between", value1, value2, "talkoutline");
            return (Criteria) this;
        }

        public Criteria andTalkcontentIsNull() {
            addCriterion("talkContent is null");
            return (Criteria) this;
        }

        public Criteria andTalkcontentIsNotNull() {
            addCriterion("talkContent is not null");
            return (Criteria) this;
        }

        public Criteria andTalkcontentEqualTo(String value) {
            addCriterion("talkContent =", value, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andTalkcontentNotEqualTo(String value) {
            addCriterion("talkContent <>", value, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andTalkcontentGreaterThan(String value) {
            addCriterion("talkContent >", value, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andTalkcontentGreaterThanOrEqualTo(String value) {
            addCriterion("talkContent >=", value, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andTalkcontentLessThan(String value) {
            addCriterion("talkContent <", value, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andTalkcontentLessThanOrEqualTo(String value) {
            addCriterion("talkContent <=", value, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andTalkcontentLike(String value) {
            addCriterion("talkContent like", value, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andTalkcontentNotLike(String value) {
            addCriterion("talkContent not like", value, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andTalkcontentIn(List<String> values) {
            addCriterion("talkContent in", values, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andTalkcontentNotIn(List<String> values) {
            addCriterion("talkContent not in", values, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andTalkcontentBetween(String value1, String value2) {
            addCriterion("talkContent between", value1, value2, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andTalkcontentNotBetween(String value1, String value2) {
            addCriterion("talkContent not between", value1, value2, "talkcontent");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeIsNull() {
            addCriterion("datacreationTime is null");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeIsNotNull() {
            addCriterion("datacreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeEqualTo(Date value) {
            addCriterion("datacreationTime =", value, "datacreationtime");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeNotEqualTo(Date value) {
            addCriterion("datacreationTime <>", value, "datacreationtime");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeGreaterThan(Date value) {
            addCriterion("datacreationTime >", value, "datacreationtime");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datacreationTime >=", value, "datacreationtime");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeLessThan(Date value) {
            addCriterion("datacreationTime <", value, "datacreationtime");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("datacreationTime <=", value, "datacreationtime");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeIn(List<Date> values) {
            addCriterion("datacreationTime in", values, "datacreationtime");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeNotIn(List<Date> values) {
            addCriterion("datacreationTime not in", values, "datacreationtime");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeBetween(Date value1, Date value2) {
            addCriterion("datacreationTime between", value1, value2, "datacreationtime");
            return (Criteria) this;
        }

        public Criteria andDatacreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("datacreationTime not between", value1, value2, "datacreationtime");
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