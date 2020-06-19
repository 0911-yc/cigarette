package com.xr.smoke.entity;

import java.util.ArrayList;
import java.util.List;

public class PoliticsStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoliticsStatusExample() {
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

        public Criteria andChinamenberIsNull() {
            addCriterion("chinaMenber is null");
            return (Criteria) this;
        }

        public Criteria andChinamenberIsNotNull() {
            addCriterion("chinaMenber is not null");
            return (Criteria) this;
        }

        public Criteria andChinamenberEqualTo(String value) {
            addCriterion("chinaMenber =", value, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andChinamenberNotEqualTo(String value) {
            addCriterion("chinaMenber <>", value, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andChinamenberGreaterThan(String value) {
            addCriterion("chinaMenber >", value, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andChinamenberGreaterThanOrEqualTo(String value) {
            addCriterion("chinaMenber >=", value, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andChinamenberLessThan(String value) {
            addCriterion("chinaMenber <", value, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andChinamenberLessThanOrEqualTo(String value) {
            addCriterion("chinaMenber <=", value, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andChinamenberLike(String value) {
            addCriterion("chinaMenber like", value, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andChinamenberNotLike(String value) {
            addCriterion("chinaMenber not like", value, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andChinamenberIn(List<String> values) {
            addCriterion("chinaMenber in", values, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andChinamenberNotIn(List<String> values) {
            addCriterion("chinaMenber not in", values, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andChinamenberBetween(String value1, String value2) {
            addCriterion("chinaMenber between", value1, value2, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andChinamenberNotBetween(String value1, String value2) {
            addCriterion("chinaMenber not between", value1, value2, "chinamenber");
            return (Criteria) this;
        }

        public Criteria andProbationaryIsNull() {
            addCriterion("probationary is null");
            return (Criteria) this;
        }

        public Criteria andProbationaryIsNotNull() {
            addCriterion("probationary is not null");
            return (Criteria) this;
        }

        public Criteria andProbationaryEqualTo(String value) {
            addCriterion("probationary =", value, "probationary");
            return (Criteria) this;
        }

        public Criteria andProbationaryNotEqualTo(String value) {
            addCriterion("probationary <>", value, "probationary");
            return (Criteria) this;
        }

        public Criteria andProbationaryGreaterThan(String value) {
            addCriterion("probationary >", value, "probationary");
            return (Criteria) this;
        }

        public Criteria andProbationaryGreaterThanOrEqualTo(String value) {
            addCriterion("probationary >=", value, "probationary");
            return (Criteria) this;
        }

        public Criteria andProbationaryLessThan(String value) {
            addCriterion("probationary <", value, "probationary");
            return (Criteria) this;
        }

        public Criteria andProbationaryLessThanOrEqualTo(String value) {
            addCriterion("probationary <=", value, "probationary");
            return (Criteria) this;
        }

        public Criteria andProbationaryLike(String value) {
            addCriterion("probationary like", value, "probationary");
            return (Criteria) this;
        }

        public Criteria andProbationaryNotLike(String value) {
            addCriterion("probationary not like", value, "probationary");
            return (Criteria) this;
        }

        public Criteria andProbationaryIn(List<String> values) {
            addCriterion("probationary in", values, "probationary");
            return (Criteria) this;
        }

        public Criteria andProbationaryNotIn(List<String> values) {
            addCriterion("probationary not in", values, "probationary");
            return (Criteria) this;
        }

        public Criteria andProbationaryBetween(String value1, String value2) {
            addCriterion("probationary between", value1, value2, "probationary");
            return (Criteria) this;
        }

        public Criteria andProbationaryNotBetween(String value1, String value2) {
            addCriterion("probationary not between", value1, value2, "probationary");
            return (Criteria) this;
        }

        public Criteria andLeagueIsNull() {
            addCriterion("league is null");
            return (Criteria) this;
        }

        public Criteria andLeagueIsNotNull() {
            addCriterion("league is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueEqualTo(String value) {
            addCriterion("league =", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueNotEqualTo(String value) {
            addCriterion("league <>", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueGreaterThan(String value) {
            addCriterion("league >", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueGreaterThanOrEqualTo(String value) {
            addCriterion("league >=", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueLessThan(String value) {
            addCriterion("league <", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueLessThanOrEqualTo(String value) {
            addCriterion("league <=", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueLike(String value) {
            addCriterion("league like", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueNotLike(String value) {
            addCriterion("league not like", value, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueIn(List<String> values) {
            addCriterion("league in", values, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueNotIn(List<String> values) {
            addCriterion("league not in", values, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueBetween(String value1, String value2) {
            addCriterion("league between", value1, value2, "league");
            return (Criteria) this;
        }

        public Criteria andLeagueNotBetween(String value1, String value2) {
            addCriterion("league not between", value1, value2, "league");
            return (Criteria) this;
        }

        public Criteria andPatriotsIsNull() {
            addCriterion("patriots is null");
            return (Criteria) this;
        }

        public Criteria andPatriotsIsNotNull() {
            addCriterion("patriots is not null");
            return (Criteria) this;
        }

        public Criteria andPatriotsEqualTo(String value) {
            addCriterion("patriots =", value, "patriots");
            return (Criteria) this;
        }

        public Criteria andPatriotsNotEqualTo(String value) {
            addCriterion("patriots <>", value, "patriots");
            return (Criteria) this;
        }

        public Criteria andPatriotsGreaterThan(String value) {
            addCriterion("patriots >", value, "patriots");
            return (Criteria) this;
        }

        public Criteria andPatriotsGreaterThanOrEqualTo(String value) {
            addCriterion("patriots >=", value, "patriots");
            return (Criteria) this;
        }

        public Criteria andPatriotsLessThan(String value) {
            addCriterion("patriots <", value, "patriots");
            return (Criteria) this;
        }

        public Criteria andPatriotsLessThanOrEqualTo(String value) {
            addCriterion("patriots <=", value, "patriots");
            return (Criteria) this;
        }

        public Criteria andPatriotsLike(String value) {
            addCriterion("patriots like", value, "patriots");
            return (Criteria) this;
        }

        public Criteria andPatriotsNotLike(String value) {
            addCriterion("patriots not like", value, "patriots");
            return (Criteria) this;
        }

        public Criteria andPatriotsIn(List<String> values) {
            addCriterion("patriots in", values, "patriots");
            return (Criteria) this;
        }

        public Criteria andPatriotsNotIn(List<String> values) {
            addCriterion("patriots not in", values, "patriots");
            return (Criteria) this;
        }

        public Criteria andPatriotsBetween(String value1, String value2) {
            addCriterion("patriots between", value1, value2, "patriots");
            return (Criteria) this;
        }

        public Criteria andPatriotsNotBetween(String value1, String value2) {
            addCriterion("patriots not between", value1, value2, "patriots");
            return (Criteria) this;
        }

        public Criteria andMassessIsNull() {
            addCriterion("massess is null");
            return (Criteria) this;
        }

        public Criteria andMassessIsNotNull() {
            addCriterion("massess is not null");
            return (Criteria) this;
        }

        public Criteria andMassessEqualTo(String value) {
            addCriterion("massess =", value, "massess");
            return (Criteria) this;
        }

        public Criteria andMassessNotEqualTo(String value) {
            addCriterion("massess <>", value, "massess");
            return (Criteria) this;
        }

        public Criteria andMassessGreaterThan(String value) {
            addCriterion("massess >", value, "massess");
            return (Criteria) this;
        }

        public Criteria andMassessGreaterThanOrEqualTo(String value) {
            addCriterion("massess >=", value, "massess");
            return (Criteria) this;
        }

        public Criteria andMassessLessThan(String value) {
            addCriterion("massess <", value, "massess");
            return (Criteria) this;
        }

        public Criteria andMassessLessThanOrEqualTo(String value) {
            addCriterion("massess <=", value, "massess");
            return (Criteria) this;
        }

        public Criteria andMassessLike(String value) {
            addCriterion("massess like", value, "massess");
            return (Criteria) this;
        }

        public Criteria andMassessNotLike(String value) {
            addCriterion("massess not like", value, "massess");
            return (Criteria) this;
        }

        public Criteria andMassessIn(List<String> values) {
            addCriterion("massess in", values, "massess");
            return (Criteria) this;
        }

        public Criteria andMassessNotIn(List<String> values) {
            addCriterion("massess not in", values, "massess");
            return (Criteria) this;
        }

        public Criteria andMassessBetween(String value1, String value2) {
            addCriterion("massess between", value1, value2, "massess");
            return (Criteria) this;
        }

        public Criteria andMassessNotBetween(String value1, String value2) {
            addCriterion("massess not between", value1, value2, "massess");
            return (Criteria) this;
        }

        public Criteria andPartyIsNull() {
            addCriterion("party is null");
            return (Criteria) this;
        }

        public Criteria andPartyIsNotNull() {
            addCriterion("party is not null");
            return (Criteria) this;
        }

        public Criteria andPartyEqualTo(String value) {
            addCriterion("party =", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotEqualTo(String value) {
            addCriterion("party <>", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyGreaterThan(String value) {
            addCriterion("party >", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyGreaterThanOrEqualTo(String value) {
            addCriterion("party >=", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLessThan(String value) {
            addCriterion("party <", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLessThanOrEqualTo(String value) {
            addCriterion("party <=", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLike(String value) {
            addCriterion("party like", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotLike(String value) {
            addCriterion("party not like", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyIn(List<String> values) {
            addCriterion("party in", values, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotIn(List<String> values) {
            addCriterion("party not in", values, "party");
            return (Criteria) this;
        }

        public Criteria andPartyBetween(String value1, String value2) {
            addCriterion("party between", value1, value2, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotBetween(String value1, String value2) {
            addCriterion("party not between", value1, value2, "party");
            return (Criteria) this;
        }

        public Criteria andAllianceIsNull() {
            addCriterion("alliance is null");
            return (Criteria) this;
        }

        public Criteria andAllianceIsNotNull() {
            addCriterion("alliance is not null");
            return (Criteria) this;
        }

        public Criteria andAllianceEqualTo(String value) {
            addCriterion("alliance =", value, "alliance");
            return (Criteria) this;
        }

        public Criteria andAllianceNotEqualTo(String value) {
            addCriterion("alliance <>", value, "alliance");
            return (Criteria) this;
        }

        public Criteria andAllianceGreaterThan(String value) {
            addCriterion("alliance >", value, "alliance");
            return (Criteria) this;
        }

        public Criteria andAllianceGreaterThanOrEqualTo(String value) {
            addCriterion("alliance >=", value, "alliance");
            return (Criteria) this;
        }

        public Criteria andAllianceLessThan(String value) {
            addCriterion("alliance <", value, "alliance");
            return (Criteria) this;
        }

        public Criteria andAllianceLessThanOrEqualTo(String value) {
            addCriterion("alliance <=", value, "alliance");
            return (Criteria) this;
        }

        public Criteria andAllianceLike(String value) {
            addCriterion("alliance like", value, "alliance");
            return (Criteria) this;
        }

        public Criteria andAllianceNotLike(String value) {
            addCriterion("alliance not like", value, "alliance");
            return (Criteria) this;
        }

        public Criteria andAllianceIn(List<String> values) {
            addCriterion("alliance in", values, "alliance");
            return (Criteria) this;
        }

        public Criteria andAllianceNotIn(List<String> values) {
            addCriterion("alliance not in", values, "alliance");
            return (Criteria) this;
        }

        public Criteria andAllianceBetween(String value1, String value2) {
            addCriterion("alliance between", value1, value2, "alliance");
            return (Criteria) this;
        }

        public Criteria andAllianceNotBetween(String value1, String value2) {
            addCriterion("alliance not between", value1, value2, "alliance");
            return (Criteria) this;
        }

        public Criteria andMemberIsNull() {
            addCriterion("member is null");
            return (Criteria) this;
        }

        public Criteria andMemberIsNotNull() {
            addCriterion("member is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEqualTo(String value) {
            addCriterion("member =", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotEqualTo(String value) {
            addCriterion("member <>", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThan(String value) {
            addCriterion("member >", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThanOrEqualTo(String value) {
            addCriterion("member >=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThan(String value) {
            addCriterion("member <", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThanOrEqualTo(String value) {
            addCriterion("member <=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLike(String value) {
            addCriterion("member like", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotLike(String value) {
            addCriterion("member not like", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberIn(List<String> values) {
            addCriterion("member in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotIn(List<String> values) {
            addCriterion("member not in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberBetween(String value1, String value2) {
            addCriterion("member between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotBetween(String value1, String value2) {
            addCriterion("member not between", value1, value2, "member");
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