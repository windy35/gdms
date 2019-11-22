package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacheridIsNull() {
            addCriterion("TeacherId is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("TeacherId is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("TeacherId =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("TeacherId <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("TeacherId >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherId >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("TeacherId <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("TeacherId <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("TeacherId like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("TeacherId not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("TeacherId in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("TeacherId not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("TeacherId between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("TeacherId not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("Gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("Gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("Age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("Age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("Age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("Age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("Age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("Age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("Age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("Age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("Age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("Age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("Age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("DepartmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DepartmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("DepartmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("DepartmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("DepartmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DepartmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("DepartmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("DepartmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("DepartmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("DepartmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("DepartmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("DepartmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeIsNull() {
            addCriterion("PoliticalLandscape is null");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeIsNotNull() {
            addCriterion("PoliticalLandscape is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeEqualTo(String value) {
            addCriterion("PoliticalLandscape =", value, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeNotEqualTo(String value) {
            addCriterion("PoliticalLandscape <>", value, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeGreaterThan(String value) {
            addCriterion("PoliticalLandscape >", value, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeGreaterThanOrEqualTo(String value) {
            addCriterion("PoliticalLandscape >=", value, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeLessThan(String value) {
            addCriterion("PoliticalLandscape <", value, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeLessThanOrEqualTo(String value) {
            addCriterion("PoliticalLandscape <=", value, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeLike(String value) {
            addCriterion("PoliticalLandscape like", value, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeNotLike(String value) {
            addCriterion("PoliticalLandscape not like", value, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeIn(List<String> values) {
            addCriterion("PoliticalLandscape in", values, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeNotIn(List<String> values) {
            addCriterion("PoliticalLandscape not in", values, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeBetween(String value1, String value2) {
            addCriterion("PoliticalLandscape between", value1, value2, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPoliticallandscapeNotBetween(String value1, String value2) {
            addCriterion("PoliticalLandscape not between", value1, value2, "politicallandscape");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleIsNull() {
            addCriterion("PositionalTitle is null");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleIsNotNull() {
            addCriterion("PositionalTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleEqualTo(String value) {
            addCriterion("PositionalTitle =", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleNotEqualTo(String value) {
            addCriterion("PositionalTitle <>", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleGreaterThan(String value) {
            addCriterion("PositionalTitle >", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleGreaterThanOrEqualTo(String value) {
            addCriterion("PositionalTitle >=", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleLessThan(String value) {
            addCriterion("PositionalTitle <", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleLessThanOrEqualTo(String value) {
            addCriterion("PositionalTitle <=", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleLike(String value) {
            addCriterion("PositionalTitle like", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleNotLike(String value) {
            addCriterion("PositionalTitle not like", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleIn(List<String> values) {
            addCriterion("PositionalTitle in", values, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleNotIn(List<String> values) {
            addCriterion("PositionalTitle not in", values, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleBetween(String value1, String value2) {
            addCriterion("PositionalTitle between", value1, value2, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleNotBetween(String value1, String value2) {
            addCriterion("PositionalTitle not between", value1, value2, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionallevelIsNull() {
            addCriterion("PositionalLevel is null");
            return (Criteria) this;
        }

        public Criteria andPositionallevelIsNotNull() {
            addCriterion("PositionalLevel is not null");
            return (Criteria) this;
        }

        public Criteria andPositionallevelEqualTo(String value) {
            addCriterion("PositionalLevel =", value, "positionallevel");
            return (Criteria) this;
        }

        public Criteria andPositionallevelNotEqualTo(String value) {
            addCriterion("PositionalLevel <>", value, "positionallevel");
            return (Criteria) this;
        }

        public Criteria andPositionallevelGreaterThan(String value) {
            addCriterion("PositionalLevel >", value, "positionallevel");
            return (Criteria) this;
        }

        public Criteria andPositionallevelGreaterThanOrEqualTo(String value) {
            addCriterion("PositionalLevel >=", value, "positionallevel");
            return (Criteria) this;
        }

        public Criteria andPositionallevelLessThan(String value) {
            addCriterion("PositionalLevel <", value, "positionallevel");
            return (Criteria) this;
        }

        public Criteria andPositionallevelLessThanOrEqualTo(String value) {
            addCriterion("PositionalLevel <=", value, "positionallevel");
            return (Criteria) this;
        }

        public Criteria andPositionallevelLike(String value) {
            addCriterion("PositionalLevel like", value, "positionallevel");
            return (Criteria) this;
        }

        public Criteria andPositionallevelNotLike(String value) {
            addCriterion("PositionalLevel not like", value, "positionallevel");
            return (Criteria) this;
        }

        public Criteria andPositionallevelIn(List<String> values) {
            addCriterion("PositionalLevel in", values, "positionallevel");
            return (Criteria) this;
        }

        public Criteria andPositionallevelNotIn(List<String> values) {
            addCriterion("PositionalLevel not in", values, "positionallevel");
            return (Criteria) this;
        }

        public Criteria andPositionallevelBetween(String value1, String value2) {
            addCriterion("PositionalLevel between", value1, value2, "positionallevel");
            return (Criteria) this;
        }

        public Criteria andPositionallevelNotBetween(String value1, String value2) {
            addCriterion("PositionalLevel not between", value1, value2, "positionallevel");
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

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("WeChat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("WeChat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("WeChat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("WeChat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("WeChat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("WeChat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("WeChat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("WeChat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("WeChat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("WeChat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("WeChat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("WeChat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("WeChat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("WeChat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andPhotoPathIsNull() {
            addCriterion("Photo_path is null");
            return (Criteria) this;
        }

        public Criteria andPhotoPathIsNotNull() {
            addCriterion("Photo_path is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoPathEqualTo(String value) {
            addCriterion("Photo_path =", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathNotEqualTo(String value) {
            addCriterion("Photo_path <>", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathGreaterThan(String value) {
            addCriterion("Photo_path >", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathGreaterThanOrEqualTo(String value) {
            addCriterion("Photo_path >=", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathLessThan(String value) {
            addCriterion("Photo_path <", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathLessThanOrEqualTo(String value) {
            addCriterion("Photo_path <=", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathLike(String value) {
            addCriterion("Photo_path like", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathNotLike(String value) {
            addCriterion("Photo_path not like", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathIn(List<String> values) {
            addCriterion("Photo_path in", values, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathNotIn(List<String> values) {
            addCriterion("Photo_path not in", values, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathBetween(String value1, String value2) {
            addCriterion("Photo_path between", value1, value2, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathNotBetween(String value1, String value2) {
            addCriterion("Photo_path not between", value1, value2, "photoPath");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("Birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("Birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("Birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("Birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("Birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("Birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("Birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("Birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("Birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("Birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("Birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("Birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("Birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IdCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IdCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IdCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IdCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IdCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IdCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IdCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IdCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IdCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IdCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IdCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IdCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IdCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IdCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignIsNull() {
            addCriterion("P_leaderId_sign is null");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignIsNotNull() {
            addCriterion("P_leaderId_sign is not null");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignEqualTo(Boolean value) {
            addCriterion("P_leaderId_sign =", value, "pLeaderidSign");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignNotEqualTo(Boolean value) {
            addCriterion("P_leaderId_sign <>", value, "pLeaderidSign");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignGreaterThan(Boolean value) {
            addCriterion("P_leaderId_sign >", value, "pLeaderidSign");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignGreaterThanOrEqualTo(Boolean value) {
            addCriterion("P_leaderId_sign >=", value, "pLeaderidSign");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignLessThan(Boolean value) {
            addCriterion("P_leaderId_sign <", value, "pLeaderidSign");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignLessThanOrEqualTo(Boolean value) {
            addCriterion("P_leaderId_sign <=", value, "pLeaderidSign");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignIn(List<Boolean> values) {
            addCriterion("P_leaderId_sign in", values, "pLeaderidSign");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignNotIn(List<Boolean> values) {
            addCriterion("P_leaderId_sign not in", values, "pLeaderidSign");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignBetween(Boolean value1, Boolean value2) {
            addCriterion("P_leaderId_sign between", value1, value2, "pLeaderidSign");
            return (Criteria) this;
        }

        public Criteria andPLeaderidSignNotBetween(Boolean value1, Boolean value2) {
            addCriterion("P_leaderId_sign not between", value1, value2, "pLeaderidSign");
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

        public Criteria andChoosexnsignIsNull() {
            addCriterion("ChooseXNSign is null");
            return (Criteria) this;
        }

        public Criteria andChoosexnsignIsNotNull() {
            addCriterion("ChooseXNSign is not null");
            return (Criteria) this;
        }

        public Criteria andChoosexnsignEqualTo(Boolean value) {
            addCriterion("ChooseXNSign =", value, "choosexnsign");
            return (Criteria) this;
        }

        public Criteria andChoosexnsignNotEqualTo(Boolean value) {
            addCriterion("ChooseXNSign <>", value, "choosexnsign");
            return (Criteria) this;
        }

        public Criteria andChoosexnsignGreaterThan(Boolean value) {
            addCriterion("ChooseXNSign >", value, "choosexnsign");
            return (Criteria) this;
        }

        public Criteria andChoosexnsignGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ChooseXNSign >=", value, "choosexnsign");
            return (Criteria) this;
        }

        public Criteria andChoosexnsignLessThan(Boolean value) {
            addCriterion("ChooseXNSign <", value, "choosexnsign");
            return (Criteria) this;
        }

        public Criteria andChoosexnsignLessThanOrEqualTo(Boolean value) {
            addCriterion("ChooseXNSign <=", value, "choosexnsign");
            return (Criteria) this;
        }

        public Criteria andChoosexnsignIn(List<Boolean> values) {
            addCriterion("ChooseXNSign in", values, "choosexnsign");
            return (Criteria) this;
        }

        public Criteria andChoosexnsignNotIn(List<Boolean> values) {
            addCriterion("ChooseXNSign not in", values, "choosexnsign");
            return (Criteria) this;
        }

        public Criteria andChoosexnsignBetween(Boolean value1, Boolean value2) {
            addCriterion("ChooseXNSign between", value1, value2, "choosexnsign");
            return (Criteria) this;
        }

        public Criteria andChoosexnsignNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ChooseXNSign not between", value1, value2, "choosexnsign");
            return (Criteria) this;
        }

        public Criteria andFzzybhIsNull() {
            addCriterion("FZZYBH is null");
            return (Criteria) this;
        }

        public Criteria andFzzybhIsNotNull() {
            addCriterion("FZZYBH is not null");
            return (Criteria) this;
        }

        public Criteria andFzzybhEqualTo(Integer value) {
            addCriterion("FZZYBH =", value, "fzzybh");
            return (Criteria) this;
        }

        public Criteria andFzzybhNotEqualTo(Integer value) {
            addCriterion("FZZYBH <>", value, "fzzybh");
            return (Criteria) this;
        }

        public Criteria andFzzybhGreaterThan(Integer value) {
            addCriterion("FZZYBH >", value, "fzzybh");
            return (Criteria) this;
        }

        public Criteria andFzzybhGreaterThanOrEqualTo(Integer value) {
            addCriterion("FZZYBH >=", value, "fzzybh");
            return (Criteria) this;
        }

        public Criteria andFzzybhLessThan(Integer value) {
            addCriterion("FZZYBH <", value, "fzzybh");
            return (Criteria) this;
        }

        public Criteria andFzzybhLessThanOrEqualTo(Integer value) {
            addCriterion("FZZYBH <=", value, "fzzybh");
            return (Criteria) this;
        }

        public Criteria andFzzybhIn(List<Integer> values) {
            addCriterion("FZZYBH in", values, "fzzybh");
            return (Criteria) this;
        }

        public Criteria andFzzybhNotIn(List<Integer> values) {
            addCriterion("FZZYBH not in", values, "fzzybh");
            return (Criteria) this;
        }

        public Criteria andFzzybhBetween(Integer value1, Integer value2) {
            addCriterion("FZZYBH between", value1, value2, "fzzybh");
            return (Criteria) this;
        }

        public Criteria andFzzybhNotBetween(Integer value1, Integer value2) {
            addCriterion("FZZYBH not between", value1, value2, "fzzybh");
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