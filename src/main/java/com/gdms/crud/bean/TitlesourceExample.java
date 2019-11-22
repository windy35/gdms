package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class TitlesourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TitlesourceExample() {
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

        public Criteria andTitlesourceidIsNull() {
            addCriterion("TitleSourceId is null");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidIsNotNull() {
            addCriterion("TitleSourceId is not null");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidEqualTo(Integer value) {
            addCriterion("TitleSourceId =", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidNotEqualTo(Integer value) {
            addCriterion("TitleSourceId <>", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidGreaterThan(Integer value) {
            addCriterion("TitleSourceId >", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TitleSourceId >=", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidLessThan(Integer value) {
            addCriterion("TitleSourceId <", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidLessThanOrEqualTo(Integer value) {
            addCriterion("TitleSourceId <=", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidIn(List<Integer> values) {
            addCriterion("TitleSourceId in", values, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidNotIn(List<Integer> values) {
            addCriterion("TitleSourceId not in", values, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidBetween(Integer value1, Integer value2) {
            addCriterion("TitleSourceId between", value1, value2, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("TitleSourceId not between", value1, value2, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameIsNull() {
            addCriterion("TitleSourceName is null");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameIsNotNull() {
            addCriterion("TitleSourceName is not null");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameEqualTo(String value) {
            addCriterion("TitleSourceName =", value, "titlesourcename");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameNotEqualTo(String value) {
            addCriterion("TitleSourceName <>", value, "titlesourcename");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameGreaterThan(String value) {
            addCriterion("TitleSourceName >", value, "titlesourcename");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("TitleSourceName >=", value, "titlesourcename");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameLessThan(String value) {
            addCriterion("TitleSourceName <", value, "titlesourcename");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameLessThanOrEqualTo(String value) {
            addCriterion("TitleSourceName <=", value, "titlesourcename");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameLike(String value) {
            addCriterion("TitleSourceName like", value, "titlesourcename");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameNotLike(String value) {
            addCriterion("TitleSourceName not like", value, "titlesourcename");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameIn(List<String> values) {
            addCriterion("TitleSourceName in", values, "titlesourcename");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameNotIn(List<String> values) {
            addCriterion("TitleSourceName not in", values, "titlesourcename");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameBetween(String value1, String value2) {
            addCriterion("TitleSourceName between", value1, value2, "titlesourcename");
            return (Criteria) this;
        }

        public Criteria andTitlesourcenameNotBetween(String value1, String value2) {
            addCriterion("TitleSourceName not between", value1, value2, "titlesourcename");
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