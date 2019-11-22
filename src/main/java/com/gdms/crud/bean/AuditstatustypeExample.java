package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class AuditstatustypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuditstatustypeExample() {
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

        public Criteria andAuditstatusidIsNull() {
            addCriterion("AuditStatusID is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusidIsNotNull() {
            addCriterion("AuditStatusID is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusidEqualTo(Integer value) {
            addCriterion("AuditStatusID =", value, "auditstatusid");
            return (Criteria) this;
        }

        public Criteria andAuditstatusidNotEqualTo(Integer value) {
            addCriterion("AuditStatusID <>", value, "auditstatusid");
            return (Criteria) this;
        }

        public Criteria andAuditstatusidGreaterThan(Integer value) {
            addCriterion("AuditStatusID >", value, "auditstatusid");
            return (Criteria) this;
        }

        public Criteria andAuditstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AuditStatusID >=", value, "auditstatusid");
            return (Criteria) this;
        }

        public Criteria andAuditstatusidLessThan(Integer value) {
            addCriterion("AuditStatusID <", value, "auditstatusid");
            return (Criteria) this;
        }

        public Criteria andAuditstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("AuditStatusID <=", value, "auditstatusid");
            return (Criteria) this;
        }

        public Criteria andAuditstatusidIn(List<Integer> values) {
            addCriterion("AuditStatusID in", values, "auditstatusid");
            return (Criteria) this;
        }

        public Criteria andAuditstatusidNotIn(List<Integer> values) {
            addCriterion("AuditStatusID not in", values, "auditstatusid");
            return (Criteria) this;
        }

        public Criteria andAuditstatusidBetween(Integer value1, Integer value2) {
            addCriterion("AuditStatusID between", value1, value2, "auditstatusid");
            return (Criteria) this;
        }

        public Criteria andAuditstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("AuditStatusID not between", value1, value2, "auditstatusid");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameIsNull() {
            addCriterion("AuditStatusName is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameIsNotNull() {
            addCriterion("AuditStatusName is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameEqualTo(String value) {
            addCriterion("AuditStatusName =", value, "auditstatusname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameNotEqualTo(String value) {
            addCriterion("AuditStatusName <>", value, "auditstatusname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameGreaterThan(String value) {
            addCriterion("AuditStatusName >", value, "auditstatusname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameGreaterThanOrEqualTo(String value) {
            addCriterion("AuditStatusName >=", value, "auditstatusname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameLessThan(String value) {
            addCriterion("AuditStatusName <", value, "auditstatusname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameLessThanOrEqualTo(String value) {
            addCriterion("AuditStatusName <=", value, "auditstatusname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameLike(String value) {
            addCriterion("AuditStatusName like", value, "auditstatusname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameNotLike(String value) {
            addCriterion("AuditStatusName not like", value, "auditstatusname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameIn(List<String> values) {
            addCriterion("AuditStatusName in", values, "auditstatusname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameNotIn(List<String> values) {
            addCriterion("AuditStatusName not in", values, "auditstatusname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameBetween(String value1, String value2) {
            addCriterion("AuditStatusName between", value1, value2, "auditstatusname");
            return (Criteria) this;
        }

        public Criteria andAuditstatusnameNotBetween(String value1, String value2) {
            addCriterion("AuditStatusName not between", value1, value2, "auditstatusname");
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