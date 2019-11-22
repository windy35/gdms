package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class ZdjlinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZdjlinfoExample() {
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

        public Criteria andZdjlinfoidIsNull() {
            addCriterion("ZdjlInfoId is null");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidIsNotNull() {
            addCriterion("ZdjlInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidEqualTo(Integer value) {
            addCriterion("ZdjlInfoId =", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidNotEqualTo(Integer value) {
            addCriterion("ZdjlInfoId <>", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidGreaterThan(Integer value) {
            addCriterion("ZdjlInfoId >", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZdjlInfoId >=", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidLessThan(Integer value) {
            addCriterion("ZdjlInfoId <", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("ZdjlInfoId <=", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidIn(List<Integer> values) {
            addCriterion("ZdjlInfoId in", values, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidNotIn(List<Integer> values) {
            addCriterion("ZdjlInfoId not in", values, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidBetween(Integer value1, Integer value2) {
            addCriterion("ZdjlInfoId between", value1, value2, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZdjlInfoId not between", value1, value2, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andZdsjIsNull() {
            addCriterion("Zdsj is null");
            return (Criteria) this;
        }

        public Criteria andZdsjIsNotNull() {
            addCriterion("Zdsj is not null");
            return (Criteria) this;
        }

        public Criteria andZdsjEqualTo(String value) {
            addCriterion("Zdsj =", value, "zdsj");
            return (Criteria) this;
        }

        public Criteria andZdsjNotEqualTo(String value) {
            addCriterion("Zdsj <>", value, "zdsj");
            return (Criteria) this;
        }

        public Criteria andZdsjGreaterThan(String value) {
            addCriterion("Zdsj >", value, "zdsj");
            return (Criteria) this;
        }

        public Criteria andZdsjGreaterThanOrEqualTo(String value) {
            addCriterion("Zdsj >=", value, "zdsj");
            return (Criteria) this;
        }

        public Criteria andZdsjLessThan(String value) {
            addCriterion("Zdsj <", value, "zdsj");
            return (Criteria) this;
        }

        public Criteria andZdsjLessThanOrEqualTo(String value) {
            addCriterion("Zdsj <=", value, "zdsj");
            return (Criteria) this;
        }

        public Criteria andZdsjLike(String value) {
            addCriterion("Zdsj like", value, "zdsj");
            return (Criteria) this;
        }

        public Criteria andZdsjNotLike(String value) {
            addCriterion("Zdsj not like", value, "zdsj");
            return (Criteria) this;
        }

        public Criteria andZdsjIn(List<String> values) {
            addCriterion("Zdsj in", values, "zdsj");
            return (Criteria) this;
        }

        public Criteria andZdsjNotIn(List<String> values) {
            addCriterion("Zdsj not in", values, "zdsj");
            return (Criteria) this;
        }

        public Criteria andZdsjBetween(String value1, String value2) {
            addCriterion("Zdsj between", value1, value2, "zdsj");
            return (Criteria) this;
        }

        public Criteria andZdsjNotBetween(String value1, String value2) {
            addCriterion("Zdsj not between", value1, value2, "zdsj");
            return (Criteria) this;
        }

        public Criteria andFjnameIsNull() {
            addCriterion("FjName is null");
            return (Criteria) this;
        }

        public Criteria andFjnameIsNotNull() {
            addCriterion("FjName is not null");
            return (Criteria) this;
        }

        public Criteria andFjnameEqualTo(String value) {
            addCriterion("FjName =", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotEqualTo(String value) {
            addCriterion("FjName <>", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameGreaterThan(String value) {
            addCriterion("FjName >", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameGreaterThanOrEqualTo(String value) {
            addCriterion("FjName >=", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLessThan(String value) {
            addCriterion("FjName <", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLessThanOrEqualTo(String value) {
            addCriterion("FjName <=", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLike(String value) {
            addCriterion("FjName like", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotLike(String value) {
            addCriterion("FjName not like", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameIn(List<String> values) {
            addCriterion("FjName in", values, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotIn(List<String> values) {
            addCriterion("FjName not in", values, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameBetween(String value1, String value2) {
            addCriterion("FjName between", value1, value2, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotBetween(String value1, String value2) {
            addCriterion("FjName not between", value1, value2, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjpathIsNull() {
            addCriterion("FjPath is null");
            return (Criteria) this;
        }

        public Criteria andFjpathIsNotNull() {
            addCriterion("FjPath is not null");
            return (Criteria) this;
        }

        public Criteria andFjpathEqualTo(String value) {
            addCriterion("FjPath =", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotEqualTo(String value) {
            addCriterion("FjPath <>", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathGreaterThan(String value) {
            addCriterion("FjPath >", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathGreaterThanOrEqualTo(String value) {
            addCriterion("FjPath >=", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathLessThan(String value) {
            addCriterion("FjPath <", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathLessThanOrEqualTo(String value) {
            addCriterion("FjPath <=", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathLike(String value) {
            addCriterion("FjPath like", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotLike(String value) {
            addCriterion("FjPath not like", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathIn(List<String> values) {
            addCriterion("FjPath in", values, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotIn(List<String> values) {
            addCriterion("FjPath not in", values, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathBetween(String value1, String value2) {
            addCriterion("FjPath between", value1, value2, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotBetween(String value1, String value2) {
            addCriterion("FjPath not between", value1, value2, "fjpath");
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