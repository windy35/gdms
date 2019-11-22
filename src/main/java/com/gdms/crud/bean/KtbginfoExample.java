package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class KtbginfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KtbginfoExample() {
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

        public Criteria andKtbginfoidIsNull() {
            addCriterion("KTBGInfoId is null");
            return (Criteria) this;
        }

        public Criteria andKtbginfoidIsNotNull() {
            addCriterion("KTBGInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andKtbginfoidEqualTo(Integer value) {
            addCriterion("KTBGInfoId =", value, "ktbginfoid");
            return (Criteria) this;
        }

        public Criteria andKtbginfoidNotEqualTo(Integer value) {
            addCriterion("KTBGInfoId <>", value, "ktbginfoid");
            return (Criteria) this;
        }

        public Criteria andKtbginfoidGreaterThan(Integer value) {
            addCriterion("KTBGInfoId >", value, "ktbginfoid");
            return (Criteria) this;
        }

        public Criteria andKtbginfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("KTBGInfoId >=", value, "ktbginfoid");
            return (Criteria) this;
        }

        public Criteria andKtbginfoidLessThan(Integer value) {
            addCriterion("KTBGInfoId <", value, "ktbginfoid");
            return (Criteria) this;
        }

        public Criteria andKtbginfoidLessThanOrEqualTo(Integer value) {
            addCriterion("KTBGInfoId <=", value, "ktbginfoid");
            return (Criteria) this;
        }

        public Criteria andKtbginfoidIn(List<Integer> values) {
            addCriterion("KTBGInfoId in", values, "ktbginfoid");
            return (Criteria) this;
        }

        public Criteria andKtbginfoidNotIn(List<Integer> values) {
            addCriterion("KTBGInfoId not in", values, "ktbginfoid");
            return (Criteria) this;
        }

        public Criteria andKtbginfoidBetween(Integer value1, Integer value2) {
            addCriterion("KTBGInfoId between", value1, value2, "ktbginfoid");
            return (Criteria) this;
        }

        public Criteria andKtbginfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("KTBGInfoId not between", value1, value2, "ktbginfoid");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameIsNull() {
            addCriterion("KTBGFJName is null");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameIsNotNull() {
            addCriterion("KTBGFJName is not null");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameEqualTo(String value) {
            addCriterion("KTBGFJName =", value, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameNotEqualTo(String value) {
            addCriterion("KTBGFJName <>", value, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameGreaterThan(String value) {
            addCriterion("KTBGFJName >", value, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameGreaterThanOrEqualTo(String value) {
            addCriterion("KTBGFJName >=", value, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameLessThan(String value) {
            addCriterion("KTBGFJName <", value, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameLessThanOrEqualTo(String value) {
            addCriterion("KTBGFJName <=", value, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameLike(String value) {
            addCriterion("KTBGFJName like", value, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameNotLike(String value) {
            addCriterion("KTBGFJName not like", value, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameIn(List<String> values) {
            addCriterion("KTBGFJName in", values, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameNotIn(List<String> values) {
            addCriterion("KTBGFJName not in", values, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameBetween(String value1, String value2) {
            addCriterion("KTBGFJName between", value1, value2, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgfjnameNotBetween(String value1, String value2) {
            addCriterion("KTBGFJName not between", value1, value2, "ktbgfjname");
            return (Criteria) this;
        }

        public Criteria andKtbgpathIsNull() {
            addCriterion("KTBGPath is null");
            return (Criteria) this;
        }

        public Criteria andKtbgpathIsNotNull() {
            addCriterion("KTBGPath is not null");
            return (Criteria) this;
        }

        public Criteria andKtbgpathEqualTo(String value) {
            addCriterion("KTBGPath =", value, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andKtbgpathNotEqualTo(String value) {
            addCriterion("KTBGPath <>", value, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andKtbgpathGreaterThan(String value) {
            addCriterion("KTBGPath >", value, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andKtbgpathGreaterThanOrEqualTo(String value) {
            addCriterion("KTBGPath >=", value, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andKtbgpathLessThan(String value) {
            addCriterion("KTBGPath <", value, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andKtbgpathLessThanOrEqualTo(String value) {
            addCriterion("KTBGPath <=", value, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andKtbgpathLike(String value) {
            addCriterion("KTBGPath like", value, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andKtbgpathNotLike(String value) {
            addCriterion("KTBGPath not like", value, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andKtbgpathIn(List<String> values) {
            addCriterion("KTBGPath in", values, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andKtbgpathNotIn(List<String> values) {
            addCriterion("KTBGPath not in", values, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andKtbgpathBetween(String value1, String value2) {
            addCriterion("KTBGPath between", value1, value2, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andKtbgpathNotBetween(String value1, String value2) {
            addCriterion("KTBGPath not between", value1, value2, "ktbgpath");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("StudentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("StudentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(String value) {
            addCriterion("StudentId =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(String value) {
            addCriterion("StudentId <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(String value) {
            addCriterion("StudentId >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("StudentId >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(String value) {
            addCriterion("StudentId <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(String value) {
            addCriterion("StudentId <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLike(String value) {
            addCriterion("StudentId like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotLike(String value) {
            addCriterion("StudentId not like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<String> values) {
            addCriterion("StudentId in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<String> values) {
            addCriterion("StudentId not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(String value1, String value2) {
            addCriterion("StudentId between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(String value1, String value2) {
            addCriterion("StudentId not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidIsNull() {
            addCriterion("GraduationDesignId is null");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidIsNotNull() {
            addCriterion("GraduationDesignId is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidEqualTo(Integer value) {
            addCriterion("GraduationDesignId =", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidNotEqualTo(Integer value) {
            addCriterion("GraduationDesignId <>", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidGreaterThan(Integer value) {
            addCriterion("GraduationDesignId >", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GraduationDesignId >=", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidLessThan(Integer value) {
            addCriterion("GraduationDesignId <", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidLessThanOrEqualTo(Integer value) {
            addCriterion("GraduationDesignId <=", value, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidIn(List<Integer> values) {
            addCriterion("GraduationDesignId in", values, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidNotIn(List<Integer> values) {
            addCriterion("GraduationDesignId not in", values, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidBetween(Integer value1, Integer value2) {
            addCriterion("GraduationDesignId between", value1, value2, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignidNotBetween(Integer value1, Integer value2) {
            addCriterion("GraduationDesignId not between", value1, value2, "graduationdesignid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidIsNull() {
            addCriterion("GraduationDesignResultId is null");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidIsNotNull() {
            addCriterion("GraduationDesignResultId is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidEqualTo(Integer value) {
            addCriterion("GraduationDesignResultId =", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidNotEqualTo(Integer value) {
            addCriterion("GraduationDesignResultId <>", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidGreaterThan(Integer value) {
            addCriterion("GraduationDesignResultId >", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GraduationDesignResultId >=", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidLessThan(Integer value) {
            addCriterion("GraduationDesignResultId <", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidLessThanOrEqualTo(Integer value) {
            addCriterion("GraduationDesignResultId <=", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidIn(List<Integer> values) {
            addCriterion("GraduationDesignResultId in", values, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidNotIn(List<Integer> values) {
            addCriterion("GraduationDesignResultId not in", values, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidBetween(Integer value1, Integer value2) {
            addCriterion("GraduationDesignResultId between", value1, value2, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidNotBetween(Integer value1, Integer value2) {
            addCriterion("GraduationDesignResultId not between", value1, value2, "graduationdesignresultid");
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