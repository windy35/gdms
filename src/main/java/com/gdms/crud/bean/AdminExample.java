package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminidIsNull() {
            addCriterion("AdminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("AdminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(String value) {
            addCriterion("AdminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(String value) {
            addCriterion("AdminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(String value) {
            addCriterion("AdminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("AdminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(String value) {
            addCriterion("AdminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(String value) {
            addCriterion("AdminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLike(String value) {
            addCriterion("AdminId like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotLike(String value) {
            addCriterion("AdminId not like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<String> values) {
            addCriterion("AdminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<String> values) {
            addCriterion("AdminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(String value1, String value2) {
            addCriterion("AdminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(String value1, String value2) {
            addCriterion("AdminId not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("AdminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("AdminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("AdminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("AdminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("AdminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("AdminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("AdminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("AdminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("AdminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("AdminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("AdminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("AdminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("AdminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("AdminName not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeIsNull() {
            addCriterion("NowAccessTime is null");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeIsNotNull() {
            addCriterion("NowAccessTime is not null");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeEqualTo(String value) {
            addCriterion("NowAccessTime =", value, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeNotEqualTo(String value) {
            addCriterion("NowAccessTime <>", value, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeGreaterThan(String value) {
            addCriterion("NowAccessTime >", value, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeGreaterThanOrEqualTo(String value) {
            addCriterion("NowAccessTime >=", value, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeLessThan(String value) {
            addCriterion("NowAccessTime <", value, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeLessThanOrEqualTo(String value) {
            addCriterion("NowAccessTime <=", value, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeLike(String value) {
            addCriterion("NowAccessTime like", value, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeNotLike(String value) {
            addCriterion("NowAccessTime not like", value, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeIn(List<String> values) {
            addCriterion("NowAccessTime in", values, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeNotIn(List<String> values) {
            addCriterion("NowAccessTime not in", values, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeBetween(String value1, String value2) {
            addCriterion("NowAccessTime between", value1, value2, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andNowaccesstimeNotBetween(String value1, String value2) {
            addCriterion("NowAccessTime not between", value1, value2, "nowaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeIsNull() {
            addCriterion("LastAccessTime is null");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeIsNotNull() {
            addCriterion("LastAccessTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeEqualTo(String value) {
            addCriterion("LastAccessTime =", value, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeNotEqualTo(String value) {
            addCriterion("LastAccessTime <>", value, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeGreaterThan(String value) {
            addCriterion("LastAccessTime >", value, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeGreaterThanOrEqualTo(String value) {
            addCriterion("LastAccessTime >=", value, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeLessThan(String value) {
            addCriterion("LastAccessTime <", value, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeLessThanOrEqualTo(String value) {
            addCriterion("LastAccessTime <=", value, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeLike(String value) {
            addCriterion("LastAccessTime like", value, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeNotLike(String value) {
            addCriterion("LastAccessTime not like", value, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeIn(List<String> values) {
            addCriterion("LastAccessTime in", values, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeNotIn(List<String> values) {
            addCriterion("LastAccessTime not in", values, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeBetween(String value1, String value2) {
            addCriterion("LastAccessTime between", value1, value2, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andLastaccesstimeNotBetween(String value1, String value2) {
            addCriterion("LastAccessTime not between", value1, value2, "lastaccesstime");
            return (Criteria) this;
        }

        public Criteria andAccesscountIsNull() {
            addCriterion("AccessCount is null");
            return (Criteria) this;
        }

        public Criteria andAccesscountIsNotNull() {
            addCriterion("AccessCount is not null");
            return (Criteria) this;
        }

        public Criteria andAccesscountEqualTo(Integer value) {
            addCriterion("AccessCount =", value, "accesscount");
            return (Criteria) this;
        }

        public Criteria andAccesscountNotEqualTo(Integer value) {
            addCriterion("AccessCount <>", value, "accesscount");
            return (Criteria) this;
        }

        public Criteria andAccesscountGreaterThan(Integer value) {
            addCriterion("AccessCount >", value, "accesscount");
            return (Criteria) this;
        }

        public Criteria andAccesscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccessCount >=", value, "accesscount");
            return (Criteria) this;
        }

        public Criteria andAccesscountLessThan(Integer value) {
            addCriterion("AccessCount <", value, "accesscount");
            return (Criteria) this;
        }

        public Criteria andAccesscountLessThanOrEqualTo(Integer value) {
            addCriterion("AccessCount <=", value, "accesscount");
            return (Criteria) this;
        }

        public Criteria andAccesscountIn(List<Integer> values) {
            addCriterion("AccessCount in", values, "accesscount");
            return (Criteria) this;
        }

        public Criteria andAccesscountNotIn(List<Integer> values) {
            addCriterion("AccessCount not in", values, "accesscount");
            return (Criteria) this;
        }

        public Criteria andAccesscountBetween(Integer value1, Integer value2) {
            addCriterion("AccessCount between", value1, value2, "accesscount");
            return (Criteria) this;
        }

        public Criteria andAccesscountNotBetween(Integer value1, Integer value2) {
            addCriterion("AccessCount not between", value1, value2, "accesscount");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressIsNull() {
            addCriterion("NowAccessIPAddress is null");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressIsNotNull() {
            addCriterion("NowAccessIPAddress is not null");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressEqualTo(String value) {
            addCriterion("NowAccessIPAddress =", value, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressNotEqualTo(String value) {
            addCriterion("NowAccessIPAddress <>", value, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressGreaterThan(String value) {
            addCriterion("NowAccessIPAddress >", value, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressGreaterThanOrEqualTo(String value) {
            addCriterion("NowAccessIPAddress >=", value, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressLessThan(String value) {
            addCriterion("NowAccessIPAddress <", value, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressLessThanOrEqualTo(String value) {
            addCriterion("NowAccessIPAddress <=", value, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressLike(String value) {
            addCriterion("NowAccessIPAddress like", value, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressNotLike(String value) {
            addCriterion("NowAccessIPAddress not like", value, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressIn(List<String> values) {
            addCriterion("NowAccessIPAddress in", values, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressNotIn(List<String> values) {
            addCriterion("NowAccessIPAddress not in", values, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressBetween(String value1, String value2) {
            addCriterion("NowAccessIPAddress between", value1, value2, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andNowaccessipaddressNotBetween(String value1, String value2) {
            addCriterion("NowAccessIPAddress not between", value1, value2, "nowaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressIsNull() {
            addCriterion("LastAccessIPAddress is null");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressIsNotNull() {
            addCriterion("LastAccessIPAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressEqualTo(String value) {
            addCriterion("LastAccessIPAddress =", value, "lastaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressNotEqualTo(String value) {
            addCriterion("LastAccessIPAddress <>", value, "lastaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressGreaterThan(String value) {
            addCriterion("LastAccessIPAddress >", value, "lastaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressGreaterThanOrEqualTo(String value) {
            addCriterion("LastAccessIPAddress >=", value, "lastaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressLessThan(String value) {
            addCriterion("LastAccessIPAddress <", value, "lastaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressLessThanOrEqualTo(String value) {
            addCriterion("LastAccessIPAddress <=", value, "lastaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressLike(String value) {
            addCriterion("LastAccessIPAddress like", value, "lastaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressNotLike(String value) {
            addCriterion("LastAccessIPAddress not like", value, "lastaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressIn(List<String> values) {
            addCriterion("LastAccessIPAddress in", values, "lastaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressNotIn(List<String> values) {
            addCriterion("LastAccessIPAddress not in", values, "lastaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressBetween(String value1, String value2) {
            addCriterion("LastAccessIPAddress between", value1, value2, "lastaccessipaddress");
            return (Criteria) this;
        }

        public Criteria andLastaccessipaddressNotBetween(String value1, String value2) {
            addCriterion("LastAccessIPAddress not between", value1, value2, "lastaccessipaddress");
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