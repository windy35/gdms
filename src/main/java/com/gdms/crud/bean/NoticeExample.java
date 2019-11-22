package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNoticeidIsNull() {
            addCriterion("NoticeId is null");
            return (Criteria) this;
        }

        public Criteria andNoticeidIsNotNull() {
            addCriterion("NoticeId is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeidEqualTo(Integer value) {
            addCriterion("NoticeId =", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotEqualTo(Integer value) {
            addCriterion("NoticeId <>", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidGreaterThan(Integer value) {
            addCriterion("NoticeId >", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NoticeId >=", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidLessThan(Integer value) {
            addCriterion("NoticeId <", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidLessThanOrEqualTo(Integer value) {
            addCriterion("NoticeId <=", value, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidIn(List<Integer> values) {
            addCriterion("NoticeId in", values, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotIn(List<Integer> values) {
            addCriterion("NoticeId not in", values, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidBetween(Integer value1, Integer value2) {
            addCriterion("NoticeId between", value1, value2, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticeidNotBetween(Integer value1, Integer value2) {
            addCriterion("NoticeId not between", value1, value2, "noticeid");
            return (Criteria) this;
        }

        public Criteria andNoticetitleIsNull() {
            addCriterion("NoticeTitle is null");
            return (Criteria) this;
        }

        public Criteria andNoticetitleIsNotNull() {
            addCriterion("NoticeTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNoticetitleEqualTo(String value) {
            addCriterion("NoticeTitle =", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleNotEqualTo(String value) {
            addCriterion("NoticeTitle <>", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleGreaterThan(String value) {
            addCriterion("NoticeTitle >", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleGreaterThanOrEqualTo(String value) {
            addCriterion("NoticeTitle >=", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleLessThan(String value) {
            addCriterion("NoticeTitle <", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleLessThanOrEqualTo(String value) {
            addCriterion("NoticeTitle <=", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleLike(String value) {
            addCriterion("NoticeTitle like", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleNotLike(String value) {
            addCriterion("NoticeTitle not like", value, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleIn(List<String> values) {
            addCriterion("NoticeTitle in", values, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleNotIn(List<String> values) {
            addCriterion("NoticeTitle not in", values, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleBetween(String value1, String value2) {
            addCriterion("NoticeTitle between", value1, value2, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNoticetitleNotBetween(String value1, String value2) {
            addCriterion("NoticeTitle not between", value1, value2, "noticetitle");
            return (Criteria) this;
        }

        public Criteria andNotifierIsNull() {
            addCriterion("Notifier is null");
            return (Criteria) this;
        }

        public Criteria andNotifierIsNotNull() {
            addCriterion("Notifier is not null");
            return (Criteria) this;
        }

        public Criteria andNotifierEqualTo(String value) {
            addCriterion("Notifier =", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierNotEqualTo(String value) {
            addCriterion("Notifier <>", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierGreaterThan(String value) {
            addCriterion("Notifier >", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierGreaterThanOrEqualTo(String value) {
            addCriterion("Notifier >=", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierLessThan(String value) {
            addCriterion("Notifier <", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierLessThanOrEqualTo(String value) {
            addCriterion("Notifier <=", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierLike(String value) {
            addCriterion("Notifier like", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierNotLike(String value) {
            addCriterion("Notifier not like", value, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierIn(List<String> values) {
            addCriterion("Notifier in", values, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierNotIn(List<String> values) {
            addCriterion("Notifier not in", values, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierBetween(String value1, String value2) {
            addCriterion("Notifier between", value1, value2, "notifier");
            return (Criteria) this;
        }

        public Criteria andNotifierNotBetween(String value1, String value2) {
            addCriterion("Notifier not between", value1, value2, "notifier");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeIsNull() {
            addCriterion("DeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeIsNotNull() {
            addCriterion("DeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeEqualTo(String value) {
            addCriterion("DeclareTime =", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeNotEqualTo(String value) {
            addCriterion("DeclareTime <>", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeGreaterThan(String value) {
            addCriterion("DeclareTime >", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("DeclareTime >=", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeLessThan(String value) {
            addCriterion("DeclareTime <", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("DeclareTime <=", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeLike(String value) {
            addCriterion("DeclareTime like", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeNotLike(String value) {
            addCriterion("DeclareTime not like", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeIn(List<String> values) {
            addCriterion("DeclareTime in", values, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeNotIn(List<String> values) {
            addCriterion("DeclareTime not in", values, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeBetween(String value1, String value2) {
            addCriterion("DeclareTime between", value1, value2, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeNotBetween(String value1, String value2) {
            addCriterion("DeclareTime not between", value1, value2, "declaretime");
            return (Criteria) this;
        }

        public Criteria andFjnameIsNull() {
            addCriterion("FJName is null");
            return (Criteria) this;
        }

        public Criteria andFjnameIsNotNull() {
            addCriterion("FJName is not null");
            return (Criteria) this;
        }

        public Criteria andFjnameEqualTo(String value) {
            addCriterion("FJName =", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotEqualTo(String value) {
            addCriterion("FJName <>", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameGreaterThan(String value) {
            addCriterion("FJName >", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameGreaterThanOrEqualTo(String value) {
            addCriterion("FJName >=", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLessThan(String value) {
            addCriterion("FJName <", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLessThanOrEqualTo(String value) {
            addCriterion("FJName <=", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLike(String value) {
            addCriterion("FJName like", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotLike(String value) {
            addCriterion("FJName not like", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameIn(List<String> values) {
            addCriterion("FJName in", values, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotIn(List<String> values) {
            addCriterion("FJName not in", values, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameBetween(String value1, String value2) {
            addCriterion("FJName between", value1, value2, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotBetween(String value1, String value2) {
            addCriterion("FJName not between", value1, value2, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjpathIsNull() {
            addCriterion("FJPath is null");
            return (Criteria) this;
        }

        public Criteria andFjpathIsNotNull() {
            addCriterion("FJPath is not null");
            return (Criteria) this;
        }

        public Criteria andFjpathEqualTo(String value) {
            addCriterion("FJPath =", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotEqualTo(String value) {
            addCriterion("FJPath <>", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathGreaterThan(String value) {
            addCriterion("FJPath >", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathGreaterThanOrEqualTo(String value) {
            addCriterion("FJPath >=", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathLessThan(String value) {
            addCriterion("FJPath <", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathLessThanOrEqualTo(String value) {
            addCriterion("FJPath <=", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathLike(String value) {
            addCriterion("FJPath like", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotLike(String value) {
            addCriterion("FJPath not like", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathIn(List<String> values) {
            addCriterion("FJPath in", values, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotIn(List<String> values) {
            addCriterion("FJPath not in", values, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathBetween(String value1, String value2) {
            addCriterion("FJPath between", value1, value2, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotBetween(String value1, String value2) {
            addCriterion("FJPath not between", value1, value2, "fjpath");
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