package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class LyhdtitleinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LyhdtitleinfoExample() {
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

        public Criteria andLyhdtitleinfoidIsNull() {
            addCriterion("LyhdtitleInfoId is null");
            return (Criteria) this;
        }

        public Criteria andLyhdtitleinfoidIsNotNull() {
            addCriterion("LyhdtitleInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andLyhdtitleinfoidEqualTo(Integer value) {
            addCriterion("LyhdtitleInfoId =", value, "lyhdtitleinfoid");
            return (Criteria) this;
        }

        public Criteria andLyhdtitleinfoidNotEqualTo(Integer value) {
            addCriterion("LyhdtitleInfoId <>", value, "lyhdtitleinfoid");
            return (Criteria) this;
        }

        public Criteria andLyhdtitleinfoidGreaterThan(Integer value) {
            addCriterion("LyhdtitleInfoId >", value, "lyhdtitleinfoid");
            return (Criteria) this;
        }

        public Criteria andLyhdtitleinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LyhdtitleInfoId >=", value, "lyhdtitleinfoid");
            return (Criteria) this;
        }

        public Criteria andLyhdtitleinfoidLessThan(Integer value) {
            addCriterion("LyhdtitleInfoId <", value, "lyhdtitleinfoid");
            return (Criteria) this;
        }

        public Criteria andLyhdtitleinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("LyhdtitleInfoId <=", value, "lyhdtitleinfoid");
            return (Criteria) this;
        }

        public Criteria andLyhdtitleinfoidIn(List<Integer> values) {
            addCriterion("LyhdtitleInfoId in", values, "lyhdtitleinfoid");
            return (Criteria) this;
        }

        public Criteria andLyhdtitleinfoidNotIn(List<Integer> values) {
            addCriterion("LyhdtitleInfoId not in", values, "lyhdtitleinfoid");
            return (Criteria) this;
        }

        public Criteria andLyhdtitleinfoidBetween(Integer value1, Integer value2) {
            addCriterion("LyhdtitleInfoId between", value1, value2, "lyhdtitleinfoid");
            return (Criteria) this;
        }

        public Criteria andLyhdtitleinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("LyhdtitleInfoId not between", value1, value2, "lyhdtitleinfoid");
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

        public Criteria andSubmittimeIsNull() {
            addCriterion("SubmitTime is null");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIsNotNull() {
            addCriterion("SubmitTime is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittimeEqualTo(String value) {
            addCriterion("SubmitTime =", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotEqualTo(String value) {
            addCriterion("SubmitTime <>", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeGreaterThan(String value) {
            addCriterion("SubmitTime >", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeGreaterThanOrEqualTo(String value) {
            addCriterion("SubmitTime >=", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLessThan(String value) {
            addCriterion("SubmitTime <", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLessThanOrEqualTo(String value) {
            addCriterion("SubmitTime <=", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLike(String value) {
            addCriterion("SubmitTime like", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotLike(String value) {
            addCriterion("SubmitTime not like", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIn(List<String> values) {
            addCriterion("SubmitTime in", values, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotIn(List<String> values) {
            addCriterion("SubmitTime not in", values, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeBetween(String value1, String value2) {
            addCriterion("SubmitTime between", value1, value2, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotBetween(String value1, String value2) {
            addCriterion("SubmitTime not between", value1, value2, "submittime");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("TypeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("TypeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("TypeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("TypeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("TypeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TypeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("TypeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("TypeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("TypeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("TypeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("TypeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("TypeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andInstructoridIsNull() {
            addCriterion("InstructorId is null");
            return (Criteria) this;
        }

        public Criteria andInstructoridIsNotNull() {
            addCriterion("InstructorId is not null");
            return (Criteria) this;
        }

        public Criteria andInstructoridEqualTo(String value) {
            addCriterion("InstructorId =", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridNotEqualTo(String value) {
            addCriterion("InstructorId <>", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridGreaterThan(String value) {
            addCriterion("InstructorId >", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridGreaterThanOrEqualTo(String value) {
            addCriterion("InstructorId >=", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridLessThan(String value) {
            addCriterion("InstructorId <", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridLessThanOrEqualTo(String value) {
            addCriterion("InstructorId <=", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridLike(String value) {
            addCriterion("InstructorId like", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridNotLike(String value) {
            addCriterion("InstructorId not like", value, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridIn(List<String> values) {
            addCriterion("InstructorId in", values, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridNotIn(List<String> values) {
            addCriterion("InstructorId not in", values, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridBetween(String value1, String value2) {
            addCriterion("InstructorId between", value1, value2, "instructorid");
            return (Criteria) this;
        }

        public Criteria andInstructoridNotBetween(String value1, String value2) {
            addCriterion("InstructorId not between", value1, value2, "instructorid");
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