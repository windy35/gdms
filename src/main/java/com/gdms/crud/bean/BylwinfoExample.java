package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class BylwinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BylwinfoExample() {
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

        public Criteria andBylwinfoidIsNull() {
            addCriterion("BYLWInfoId is null");
            return (Criteria) this;
        }

        public Criteria andBylwinfoidIsNotNull() {
            addCriterion("BYLWInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andBylwinfoidEqualTo(Integer value) {
            addCriterion("BYLWInfoId =", value, "bylwinfoid");
            return (Criteria) this;
        }

        public Criteria andBylwinfoidNotEqualTo(Integer value) {
            addCriterion("BYLWInfoId <>", value, "bylwinfoid");
            return (Criteria) this;
        }

        public Criteria andBylwinfoidGreaterThan(Integer value) {
            addCriterion("BYLWInfoId >", value, "bylwinfoid");
            return (Criteria) this;
        }

        public Criteria andBylwinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BYLWInfoId >=", value, "bylwinfoid");
            return (Criteria) this;
        }

        public Criteria andBylwinfoidLessThan(Integer value) {
            addCriterion("BYLWInfoId <", value, "bylwinfoid");
            return (Criteria) this;
        }

        public Criteria andBylwinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("BYLWInfoId <=", value, "bylwinfoid");
            return (Criteria) this;
        }

        public Criteria andBylwinfoidIn(List<Integer> values) {
            addCriterion("BYLWInfoId in", values, "bylwinfoid");
            return (Criteria) this;
        }

        public Criteria andBylwinfoidNotIn(List<Integer> values) {
            addCriterion("BYLWInfoId not in", values, "bylwinfoid");
            return (Criteria) this;
        }

        public Criteria andBylwinfoidBetween(Integer value1, Integer value2) {
            addCriterion("BYLWInfoId between", value1, value2, "bylwinfoid");
            return (Criteria) this;
        }

        public Criteria andBylwinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("BYLWInfoId not between", value1, value2, "bylwinfoid");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameIsNull() {
            addCriterion("BYLWFJName is null");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameIsNotNull() {
            addCriterion("BYLWFJName is not null");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameEqualTo(String value) {
            addCriterion("BYLWFJName =", value, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameNotEqualTo(String value) {
            addCriterion("BYLWFJName <>", value, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameGreaterThan(String value) {
            addCriterion("BYLWFJName >", value, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameGreaterThanOrEqualTo(String value) {
            addCriterion("BYLWFJName >=", value, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameLessThan(String value) {
            addCriterion("BYLWFJName <", value, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameLessThanOrEqualTo(String value) {
            addCriterion("BYLWFJName <=", value, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameLike(String value) {
            addCriterion("BYLWFJName like", value, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameNotLike(String value) {
            addCriterion("BYLWFJName not like", value, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameIn(List<String> values) {
            addCriterion("BYLWFJName in", values, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameNotIn(List<String> values) {
            addCriterion("BYLWFJName not in", values, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameBetween(String value1, String value2) {
            addCriterion("BYLWFJName between", value1, value2, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjnameNotBetween(String value1, String value2) {
            addCriterion("BYLWFJName not between", value1, value2, "bylwfjname");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathIsNull() {
            addCriterion("BYLWFJPath is null");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathIsNotNull() {
            addCriterion("BYLWFJPath is not null");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathEqualTo(String value) {
            addCriterion("BYLWFJPath =", value, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathNotEqualTo(String value) {
            addCriterion("BYLWFJPath <>", value, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathGreaterThan(String value) {
            addCriterion("BYLWFJPath >", value, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathGreaterThanOrEqualTo(String value) {
            addCriterion("BYLWFJPath >=", value, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathLessThan(String value) {
            addCriterion("BYLWFJPath <", value, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathLessThanOrEqualTo(String value) {
            addCriterion("BYLWFJPath <=", value, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathLike(String value) {
            addCriterion("BYLWFJPath like", value, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathNotLike(String value) {
            addCriterion("BYLWFJPath not like", value, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathIn(List<String> values) {
            addCriterion("BYLWFJPath in", values, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathNotIn(List<String> values) {
            addCriterion("BYLWFJPath not in", values, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathBetween(String value1, String value2) {
            addCriterion("BYLWFJPath between", value1, value2, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andBylwfjpathNotBetween(String value1, String value2) {
            addCriterion("BYLWFJPath not between", value1, value2, "bylwfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjnameIsNull() {
            addCriterion("QTFJName is null");
            return (Criteria) this;
        }

        public Criteria andQtfjnameIsNotNull() {
            addCriterion("QTFJName is not null");
            return (Criteria) this;
        }

        public Criteria andQtfjnameEqualTo(String value) {
            addCriterion("QTFJName =", value, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjnameNotEqualTo(String value) {
            addCriterion("QTFJName <>", value, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjnameGreaterThan(String value) {
            addCriterion("QTFJName >", value, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjnameGreaterThanOrEqualTo(String value) {
            addCriterion("QTFJName >=", value, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjnameLessThan(String value) {
            addCriterion("QTFJName <", value, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjnameLessThanOrEqualTo(String value) {
            addCriterion("QTFJName <=", value, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjnameLike(String value) {
            addCriterion("QTFJName like", value, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjnameNotLike(String value) {
            addCriterion("QTFJName not like", value, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjnameIn(List<String> values) {
            addCriterion("QTFJName in", values, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjnameNotIn(List<String> values) {
            addCriterion("QTFJName not in", values, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjnameBetween(String value1, String value2) {
            addCriterion("QTFJName between", value1, value2, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjnameNotBetween(String value1, String value2) {
            addCriterion("QTFJName not between", value1, value2, "qtfjname");
            return (Criteria) this;
        }

        public Criteria andQtfjpathIsNull() {
            addCriterion("QTFJPath is null");
            return (Criteria) this;
        }

        public Criteria andQtfjpathIsNotNull() {
            addCriterion("QTFJPath is not null");
            return (Criteria) this;
        }

        public Criteria andQtfjpathEqualTo(String value) {
            addCriterion("QTFJPath =", value, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjpathNotEqualTo(String value) {
            addCriterion("QTFJPath <>", value, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjpathGreaterThan(String value) {
            addCriterion("QTFJPath >", value, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjpathGreaterThanOrEqualTo(String value) {
            addCriterion("QTFJPath >=", value, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjpathLessThan(String value) {
            addCriterion("QTFJPath <", value, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjpathLessThanOrEqualTo(String value) {
            addCriterion("QTFJPath <=", value, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjpathLike(String value) {
            addCriterion("QTFJPath like", value, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjpathNotLike(String value) {
            addCriterion("QTFJPath not like", value, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjpathIn(List<String> values) {
            addCriterion("QTFJPath in", values, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjpathNotIn(List<String> values) {
            addCriterion("QTFJPath not in", values, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjpathBetween(String value1, String value2) {
            addCriterion("QTFJPath between", value1, value2, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andQtfjpathNotBetween(String value1, String value2) {
            addCriterion("QTFJPath not between", value1, value2, "qtfjpath");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("UploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("UploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(String value) {
            addCriterion("UploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(String value) {
            addCriterion("UploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(String value) {
            addCriterion("UploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(String value) {
            addCriterion("UploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(String value) {
            addCriterion("UploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(String value) {
            addCriterion("UploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLike(String value) {
            addCriterion("UploadTime like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotLike(String value) {
            addCriterion("UploadTime not like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<String> values) {
            addCriterion("UploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<String> values) {
            addCriterion("UploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(String value1, String value2) {
            addCriterion("UploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(String value1, String value2) {
            addCriterion("UploadTime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeIsNull() {
            addCriterion("LastAlertTime is null");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeIsNotNull() {
            addCriterion("LastAlertTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeEqualTo(String value) {
            addCriterion("LastAlertTime =", value, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeNotEqualTo(String value) {
            addCriterion("LastAlertTime <>", value, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeGreaterThan(String value) {
            addCriterion("LastAlertTime >", value, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeGreaterThanOrEqualTo(String value) {
            addCriterion("LastAlertTime >=", value, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeLessThan(String value) {
            addCriterion("LastAlertTime <", value, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeLessThanOrEqualTo(String value) {
            addCriterion("LastAlertTime <=", value, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeLike(String value) {
            addCriterion("LastAlertTime like", value, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeNotLike(String value) {
            addCriterion("LastAlertTime not like", value, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeIn(List<String> values) {
            addCriterion("LastAlertTime in", values, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeNotIn(List<String> values) {
            addCriterion("LastAlertTime not in", values, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeBetween(String value1, String value2) {
            addCriterion("LastAlertTime between", value1, value2, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andLastalerttimeNotBetween(String value1, String value2) {
            addCriterion("LastAlertTime not between", value1, value2, "lastalerttime");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("StudentID is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("StudentID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(String value) {
            addCriterion("StudentID =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(String value) {
            addCriterion("StudentID <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(String value) {
            addCriterion("StudentID >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("StudentID >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(String value) {
            addCriterion("StudentID <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(String value) {
            addCriterion("StudentID <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLike(String value) {
            addCriterion("StudentID like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotLike(String value) {
            addCriterion("StudentID not like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<String> values) {
            addCriterion("StudentID in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<String> values) {
            addCriterion("StudentID not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(String value1, String value2) {
            addCriterion("StudentID between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(String value1, String value2) {
            addCriterion("StudentID not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidIsNull() {
            addCriterion("GraduationDesignID is null");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidIsNotNull() {
            addCriterion("GraduationDesignID is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidEqualTo(Integer value) {
            addCriterion("GraduationDesignID =", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidNotEqualTo(Integer value) {
            addCriterion("GraduationDesignID <>", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidGreaterThan(Integer value) {
            addCriterion("GraduationDesignID >", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GraduationDesignID >=", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidLessThan(Integer value) {
            addCriterion("GraduationDesignID <", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidLessThanOrEqualTo(Integer value) {
            addCriterion("GraduationDesignID <=", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidIn(List<Integer> values) {
            addCriterion("GraduationDesignID in", values, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidNotIn(List<Integer> values) {
            addCriterion("GraduationDesignID not in", values, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidBetween(Integer value1, Integer value2) {
            addCriterion("GraduationDesignID between", value1, value2, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidNotBetween(Integer value1, Integer value2) {
            addCriterion("GraduationDesignID not between", value1, value2, "graduationdesignid");
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