package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class DbinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbinfoExample() {
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

        public Criteria andDbinfoidIsNull() {
            addCriterion("dbInfoid is null");
            return (Criteria) this;
        }

        public Criteria andDbinfoidIsNotNull() {
            addCriterion("dbInfoid is not null");
            return (Criteria) this;
        }

        public Criteria andDbinfoidEqualTo(Integer value) {
            addCriterion("dbInfoid =", value, "dbinfoid");
            return (Criteria) this;
        }

        public Criteria andDbinfoidNotEqualTo(Integer value) {
            addCriterion("dbInfoid <>", value, "dbinfoid");
            return (Criteria) this;
        }

        public Criteria andDbinfoidGreaterThan(Integer value) {
            addCriterion("dbInfoid >", value, "dbinfoid");
            return (Criteria) this;
        }

        public Criteria andDbinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbInfoid >=", value, "dbinfoid");
            return (Criteria) this;
        }

        public Criteria andDbinfoidLessThan(Integer value) {
            addCriterion("dbInfoid <", value, "dbinfoid");
            return (Criteria) this;
        }

        public Criteria andDbinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("dbInfoid <=", value, "dbinfoid");
            return (Criteria) this;
        }

        public Criteria andDbinfoidIn(List<Integer> values) {
            addCriterion("dbInfoid in", values, "dbinfoid");
            return (Criteria) this;
        }

        public Criteria andDbinfoidNotIn(List<Integer> values) {
            addCriterion("dbInfoid not in", values, "dbinfoid");
            return (Criteria) this;
        }

        public Criteria andDbinfoidBetween(Integer value1, Integer value2) {
            addCriterion("dbInfoid between", value1, value2, "dbinfoid");
            return (Criteria) this;
        }

        public Criteria andDbinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("dbInfoid not between", value1, value2, "dbinfoid");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("studentid is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentid is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(String value) {
            addCriterion("studentid =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(String value) {
            addCriterion("studentid <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(String value) {
            addCriterion("studentid >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("studentid >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(String value) {
            addCriterion("studentid <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(String value) {
            addCriterion("studentid <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLike(String value) {
            addCriterion("studentid like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotLike(String value) {
            addCriterion("studentid not like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<String> values) {
            addCriterion("studentid in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<String> values) {
            addCriterion("studentid not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(String value1, String value2) {
            addCriterion("studentid between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(String value1, String value2) {
            addCriterion("studentid not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andDbtimeIsNull() {
            addCriterion("dbtime is null");
            return (Criteria) this;
        }

        public Criteria andDbtimeIsNotNull() {
            addCriterion("dbtime is not null");
            return (Criteria) this;
        }

        public Criteria andDbtimeEqualTo(String value) {
            addCriterion("dbtime =", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeNotEqualTo(String value) {
            addCriterion("dbtime <>", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeGreaterThan(String value) {
            addCriterion("dbtime >", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeGreaterThanOrEqualTo(String value) {
            addCriterion("dbtime >=", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeLessThan(String value) {
            addCriterion("dbtime <", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeLessThanOrEqualTo(String value) {
            addCriterion("dbtime <=", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeLike(String value) {
            addCriterion("dbtime like", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeNotLike(String value) {
            addCriterion("dbtime not like", value, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeIn(List<String> values) {
            addCriterion("dbtime in", values, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeNotIn(List<String> values) {
            addCriterion("dbtime not in", values, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeBetween(String value1, String value2) {
            addCriterion("dbtime between", value1, value2, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbtimeNotBetween(String value1, String value2) {
            addCriterion("dbtime not between", value1, value2, "dbtime");
            return (Criteria) this;
        }

        public Criteria andDbplaceIsNull() {
            addCriterion("dbplace is null");
            return (Criteria) this;
        }

        public Criteria andDbplaceIsNotNull() {
            addCriterion("dbplace is not null");
            return (Criteria) this;
        }

        public Criteria andDbplaceEqualTo(String value) {
            addCriterion("dbplace =", value, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbplaceNotEqualTo(String value) {
            addCriterion("dbplace <>", value, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbplaceGreaterThan(String value) {
            addCriterion("dbplace >", value, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbplaceGreaterThanOrEqualTo(String value) {
            addCriterion("dbplace >=", value, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbplaceLessThan(String value) {
            addCriterion("dbplace <", value, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbplaceLessThanOrEqualTo(String value) {
            addCriterion("dbplace <=", value, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbplaceLike(String value) {
            addCriterion("dbplace like", value, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbplaceNotLike(String value) {
            addCriterion("dbplace not like", value, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbplaceIn(List<String> values) {
            addCriterion("dbplace in", values, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbplaceNotIn(List<String> values) {
            addCriterion("dbplace not in", values, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbplaceBetween(String value1, String value2) {
            addCriterion("dbplace between", value1, value2, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbplaceNotBetween(String value1, String value2) {
            addCriterion("dbplace not between", value1, value2, "dbplace");
            return (Criteria) this;
        }

        public Criteria andDbcjIsNull() {
            addCriterion("dbcj is null");
            return (Criteria) this;
        }

        public Criteria andDbcjIsNotNull() {
            addCriterion("dbcj is not null");
            return (Criteria) this;
        }

        public Criteria andDbcjEqualTo(Float value) {
            addCriterion("dbcj =", value, "dbcj");
            return (Criteria) this;
        }

        public Criteria andDbcjNotEqualTo(Float value) {
            addCriterion("dbcj <>", value, "dbcj");
            return (Criteria) this;
        }

        public Criteria andDbcjGreaterThan(Float value) {
            addCriterion("dbcj >", value, "dbcj");
            return (Criteria) this;
        }

        public Criteria andDbcjGreaterThanOrEqualTo(Float value) {
            addCriterion("dbcj >=", value, "dbcj");
            return (Criteria) this;
        }

        public Criteria andDbcjLessThan(Float value) {
            addCriterion("dbcj <", value, "dbcj");
            return (Criteria) this;
        }

        public Criteria andDbcjLessThanOrEqualTo(Float value) {
            addCriterion("dbcj <=", value, "dbcj");
            return (Criteria) this;
        }

        public Criteria andDbcjIn(List<Float> values) {
            addCriterion("dbcj in", values, "dbcj");
            return (Criteria) this;
        }

        public Criteria andDbcjNotIn(List<Float> values) {
            addCriterion("dbcj not in", values, "dbcj");
            return (Criteria) this;
        }

        public Criteria andDbcjBetween(Float value1, Float value2) {
            addCriterion("dbcj between", value1, value2, "dbcj");
            return (Criteria) this;
        }

        public Criteria andDbcjNotBetween(Float value1, Float value2) {
            addCriterion("dbcj not between", value1, value2, "dbcj");
            return (Criteria) this;
        }

        public Criteria andPwzzxxIsNull() {
            addCriterion("pwzzxx is null");
            return (Criteria) this;
        }

        public Criteria andPwzzxxIsNotNull() {
            addCriterion("pwzzxx is not null");
            return (Criteria) this;
        }

        public Criteria andPwzzxxEqualTo(String value) {
            addCriterion("pwzzxx =", value, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andPwzzxxNotEqualTo(String value) {
            addCriterion("pwzzxx <>", value, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andPwzzxxGreaterThan(String value) {
            addCriterion("pwzzxx >", value, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andPwzzxxGreaterThanOrEqualTo(String value) {
            addCriterion("pwzzxx >=", value, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andPwzzxxLessThan(String value) {
            addCriterion("pwzzxx <", value, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andPwzzxxLessThanOrEqualTo(String value) {
            addCriterion("pwzzxx <=", value, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andPwzzxxLike(String value) {
            addCriterion("pwzzxx like", value, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andPwzzxxNotLike(String value) {
            addCriterion("pwzzxx not like", value, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andPwzzxxIn(List<String> values) {
            addCriterion("pwzzxx in", values, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andPwzzxxNotIn(List<String> values) {
            addCriterion("pwzzxx not in", values, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andPwzzxxBetween(String value1, String value2) {
            addCriterion("pwzzxx between", value1, value2, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andPwzzxxNotBetween(String value1, String value2) {
            addCriterion("pwzzxx not between", value1, value2, "pwzzxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxIsNull() {
            addCriterion("drpwxx is null");
            return (Criteria) this;
        }

        public Criteria andDrpwxxIsNotNull() {
            addCriterion("drpwxx is not null");
            return (Criteria) this;
        }

        public Criteria andDrpwxxEqualTo(String value) {
            addCriterion("drpwxx =", value, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxNotEqualTo(String value) {
            addCriterion("drpwxx <>", value, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxGreaterThan(String value) {
            addCriterion("drpwxx >", value, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxGreaterThanOrEqualTo(String value) {
            addCriterion("drpwxx >=", value, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxLessThan(String value) {
            addCriterion("drpwxx <", value, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxLessThanOrEqualTo(String value) {
            addCriterion("drpwxx <=", value, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxLike(String value) {
            addCriterion("drpwxx like", value, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxNotLike(String value) {
            addCriterion("drpwxx not like", value, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxIn(List<String> values) {
            addCriterion("drpwxx in", values, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxNotIn(List<String> values) {
            addCriterion("drpwxx not in", values, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxBetween(String value1, String value2) {
            addCriterion("drpwxx between", value1, value2, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andDrpwxxNotBetween(String value1, String value2) {
            addCriterion("drpwxx not between", value1, value2, "drpwxx");
            return (Criteria) this;
        }

        public Criteria andMsxxIsNull() {
            addCriterion("msxx is null");
            return (Criteria) this;
        }

        public Criteria andMsxxIsNotNull() {
            addCriterion("msxx is not null");
            return (Criteria) this;
        }

        public Criteria andMsxxEqualTo(String value) {
            addCriterion("msxx =", value, "msxx");
            return (Criteria) this;
        }

        public Criteria andMsxxNotEqualTo(String value) {
            addCriterion("msxx <>", value, "msxx");
            return (Criteria) this;
        }

        public Criteria andMsxxGreaterThan(String value) {
            addCriterion("msxx >", value, "msxx");
            return (Criteria) this;
        }

        public Criteria andMsxxGreaterThanOrEqualTo(String value) {
            addCriterion("msxx >=", value, "msxx");
            return (Criteria) this;
        }

        public Criteria andMsxxLessThan(String value) {
            addCriterion("msxx <", value, "msxx");
            return (Criteria) this;
        }

        public Criteria andMsxxLessThanOrEqualTo(String value) {
            addCriterion("msxx <=", value, "msxx");
            return (Criteria) this;
        }

        public Criteria andMsxxLike(String value) {
            addCriterion("msxx like", value, "msxx");
            return (Criteria) this;
        }

        public Criteria andMsxxNotLike(String value) {
            addCriterion("msxx not like", value, "msxx");
            return (Criteria) this;
        }

        public Criteria andMsxxIn(List<String> values) {
            addCriterion("msxx in", values, "msxx");
            return (Criteria) this;
        }

        public Criteria andMsxxNotIn(List<String> values) {
            addCriterion("msxx not in", values, "msxx");
            return (Criteria) this;
        }

        public Criteria andMsxxBetween(String value1, String value2) {
            addCriterion("msxx between", value1, value2, "msxx");
            return (Criteria) this;
        }

        public Criteria andMsxxNotBetween(String value1, String value2) {
            addCriterion("msxx not between", value1, value2, "msxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxIsNull() {
            addCriterion("sypwxx is null");
            return (Criteria) this;
        }

        public Criteria andSypwxxIsNotNull() {
            addCriterion("sypwxx is not null");
            return (Criteria) this;
        }

        public Criteria andSypwxxEqualTo(String value) {
            addCriterion("sypwxx =", value, "sypwxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxNotEqualTo(String value) {
            addCriterion("sypwxx <>", value, "sypwxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxGreaterThan(String value) {
            addCriterion("sypwxx >", value, "sypwxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxGreaterThanOrEqualTo(String value) {
            addCriterion("sypwxx >=", value, "sypwxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxLessThan(String value) {
            addCriterion("sypwxx <", value, "sypwxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxLessThanOrEqualTo(String value) {
            addCriterion("sypwxx <=", value, "sypwxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxLike(String value) {
            addCriterion("sypwxx like", value, "sypwxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxNotLike(String value) {
            addCriterion("sypwxx not like", value, "sypwxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxIn(List<String> values) {
            addCriterion("sypwxx in", values, "sypwxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxNotIn(List<String> values) {
            addCriterion("sypwxx not in", values, "sypwxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxBetween(String value1, String value2) {
            addCriterion("sypwxx between", value1, value2, "sypwxx");
            return (Criteria) this;
        }

        public Criteria andSypwxxNotBetween(String value1, String value2) {
            addCriterion("sypwxx not between", value1, value2, "sypwxx");
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