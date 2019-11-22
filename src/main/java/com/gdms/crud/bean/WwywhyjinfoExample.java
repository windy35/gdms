package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class WwywhyjinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WwywhyjinfoExample() {
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

        public Criteria andWwywyyjidIsNull() {
            addCriterion("WWYWYYJID is null");
            return (Criteria) this;
        }

        public Criteria andWwywyyjidIsNotNull() {
            addCriterion("WWYWYYJID is not null");
            return (Criteria) this;
        }

        public Criteria andWwywyyjidEqualTo(Integer value) {
            addCriterion("WWYWYYJID =", value, "wwywyyjid");
            return (Criteria) this;
        }

        public Criteria andWwywyyjidNotEqualTo(Integer value) {
            addCriterion("WWYWYYJID <>", value, "wwywyyjid");
            return (Criteria) this;
        }

        public Criteria andWwywyyjidGreaterThan(Integer value) {
            addCriterion("WWYWYYJID >", value, "wwywyyjid");
            return (Criteria) this;
        }

        public Criteria andWwywyyjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WWYWYYJID >=", value, "wwywyyjid");
            return (Criteria) this;
        }

        public Criteria andWwywyyjidLessThan(Integer value) {
            addCriterion("WWYWYYJID <", value, "wwywyyjid");
            return (Criteria) this;
        }

        public Criteria andWwywyyjidLessThanOrEqualTo(Integer value) {
            addCriterion("WWYWYYJID <=", value, "wwywyyjid");
            return (Criteria) this;
        }

        public Criteria andWwywyyjidIn(List<Integer> values) {
            addCriterion("WWYWYYJID in", values, "wwywyyjid");
            return (Criteria) this;
        }

        public Criteria andWwywyyjidNotIn(List<Integer> values) {
            addCriterion("WWYWYYJID not in", values, "wwywyyjid");
            return (Criteria) this;
        }

        public Criteria andWwywyyjidBetween(Integer value1, Integer value2) {
            addCriterion("WWYWYYJID between", value1, value2, "wwywyyjid");
            return (Criteria) this;
        }

        public Criteria andWwywyyjidNotBetween(Integer value1, Integer value2) {
            addCriterion("WWYWYYJID not between", value1, value2, "wwywyyjid");
            return (Criteria) this;
        }

        public Criteria andWwfjnameIsNull() {
            addCriterion("WWFJName is null");
            return (Criteria) this;
        }

        public Criteria andWwfjnameIsNotNull() {
            addCriterion("WWFJName is not null");
            return (Criteria) this;
        }

        public Criteria andWwfjnameEqualTo(String value) {
            addCriterion("WWFJName =", value, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjnameNotEqualTo(String value) {
            addCriterion("WWFJName <>", value, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjnameGreaterThan(String value) {
            addCriterion("WWFJName >", value, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjnameGreaterThanOrEqualTo(String value) {
            addCriterion("WWFJName >=", value, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjnameLessThan(String value) {
            addCriterion("WWFJName <", value, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjnameLessThanOrEqualTo(String value) {
            addCriterion("WWFJName <=", value, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjnameLike(String value) {
            addCriterion("WWFJName like", value, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjnameNotLike(String value) {
            addCriterion("WWFJName not like", value, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjnameIn(List<String> values) {
            addCriterion("WWFJName in", values, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjnameNotIn(List<String> values) {
            addCriterion("WWFJName not in", values, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjnameBetween(String value1, String value2) {
            addCriterion("WWFJName between", value1, value2, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjnameNotBetween(String value1, String value2) {
            addCriterion("WWFJName not between", value1, value2, "wwfjname");
            return (Criteria) this;
        }

        public Criteria andWwfjpathIsNull() {
            addCriterion("WWFJPath is null");
            return (Criteria) this;
        }

        public Criteria andWwfjpathIsNotNull() {
            addCriterion("WWFJPath is not null");
            return (Criteria) this;
        }

        public Criteria andWwfjpathEqualTo(String value) {
            addCriterion("WWFJPath =", value, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andWwfjpathNotEqualTo(String value) {
            addCriterion("WWFJPath <>", value, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andWwfjpathGreaterThan(String value) {
            addCriterion("WWFJPath >", value, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andWwfjpathGreaterThanOrEqualTo(String value) {
            addCriterion("WWFJPath >=", value, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andWwfjpathLessThan(String value) {
            addCriterion("WWFJPath <", value, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andWwfjpathLessThanOrEqualTo(String value) {
            addCriterion("WWFJPath <=", value, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andWwfjpathLike(String value) {
            addCriterion("WWFJPath like", value, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andWwfjpathNotLike(String value) {
            addCriterion("WWFJPath not like", value, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andWwfjpathIn(List<String> values) {
            addCriterion("WWFJPath in", values, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andWwfjpathNotIn(List<String> values) {
            addCriterion("WWFJPath not in", values, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andWwfjpathBetween(String value1, String value2) {
            addCriterion("WWFJPath between", value1, value2, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andWwfjpathNotBetween(String value1, String value2) {
            addCriterion("WWFJPath not between", value1, value2, "wwfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjnameIsNull() {
            addCriterion("YWFJName is null");
            return (Criteria) this;
        }

        public Criteria andYwfjnameIsNotNull() {
            addCriterion("YWFJName is not null");
            return (Criteria) this;
        }

        public Criteria andYwfjnameEqualTo(String value) {
            addCriterion("YWFJName =", value, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjnameNotEqualTo(String value) {
            addCriterion("YWFJName <>", value, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjnameGreaterThan(String value) {
            addCriterion("YWFJName >", value, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjnameGreaterThanOrEqualTo(String value) {
            addCriterion("YWFJName >=", value, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjnameLessThan(String value) {
            addCriterion("YWFJName <", value, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjnameLessThanOrEqualTo(String value) {
            addCriterion("YWFJName <=", value, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjnameLike(String value) {
            addCriterion("YWFJName like", value, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjnameNotLike(String value) {
            addCriterion("YWFJName not like", value, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjnameIn(List<String> values) {
            addCriterion("YWFJName in", values, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjnameNotIn(List<String> values) {
            addCriterion("YWFJName not in", values, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjnameBetween(String value1, String value2) {
            addCriterion("YWFJName between", value1, value2, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjnameNotBetween(String value1, String value2) {
            addCriterion("YWFJName not between", value1, value2, "ywfjname");
            return (Criteria) this;
        }

        public Criteria andYwfjpathIsNull() {
            addCriterion("YWFJPath is null");
            return (Criteria) this;
        }

        public Criteria andYwfjpathIsNotNull() {
            addCriterion("YWFJPath is not null");
            return (Criteria) this;
        }

        public Criteria andYwfjpathEqualTo(String value) {
            addCriterion("YWFJPath =", value, "ywfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjpathNotEqualTo(String value) {
            addCriterion("YWFJPath <>", value, "ywfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjpathGreaterThan(String value) {
            addCriterion("YWFJPath >", value, "ywfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjpathGreaterThanOrEqualTo(String value) {
            addCriterion("YWFJPath >=", value, "ywfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjpathLessThan(String value) {
            addCriterion("YWFJPath <", value, "ywfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjpathLessThanOrEqualTo(String value) {
            addCriterion("YWFJPath <=", value, "ywfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjpathLike(String value) {
            addCriterion("YWFJPath like", value, "ywfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjpathNotLike(String value) {
            addCriterion("YWFJPath not like", value, "ywfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjpathIn(List<String> values) {
            addCriterion("YWFJPath in", values, "ywfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjpathNotIn(List<String> values) {
            addCriterion("YWFJPath not in", values, "ywfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjpathBetween(String value1, String value2) {
            addCriterion("YWFJPath between", value1, value2, "ywfjpath");
            return (Criteria) this;
        }

        public Criteria andYwfjpathNotBetween(String value1, String value2) {
            addCriterion("YWFJPath not between", value1, value2, "ywfjpath");
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