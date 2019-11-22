package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andGraduationgradeidIsNull() {
            addCriterion("GraduationGradeId is null");
            return (Criteria) this;
        }

        public Criteria andGraduationgradeidIsNotNull() {
            addCriterion("GraduationGradeId is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationgradeidEqualTo(Integer value) {
            addCriterion("GraduationGradeId =", value, "graduationgradeid");
            return (Criteria) this;
        }

        public Criteria andGraduationgradeidNotEqualTo(Integer value) {
            addCriterion("GraduationGradeId <>", value, "graduationgradeid");
            return (Criteria) this;
        }

        public Criteria andGraduationgradeidGreaterThan(Integer value) {
            addCriterion("GraduationGradeId >", value, "graduationgradeid");
            return (Criteria) this;
        }

        public Criteria andGraduationgradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GraduationGradeId >=", value, "graduationgradeid");
            return (Criteria) this;
        }

        public Criteria andGraduationgradeidLessThan(Integer value) {
            addCriterion("GraduationGradeId <", value, "graduationgradeid");
            return (Criteria) this;
        }

        public Criteria andGraduationgradeidLessThanOrEqualTo(Integer value) {
            addCriterion("GraduationGradeId <=", value, "graduationgradeid");
            return (Criteria) this;
        }

        public Criteria andGraduationgradeidIn(List<Integer> values) {
            addCriterion("GraduationGradeId in", values, "graduationgradeid");
            return (Criteria) this;
        }

        public Criteria andGraduationgradeidNotIn(List<Integer> values) {
            addCriterion("GraduationGradeId not in", values, "graduationgradeid");
            return (Criteria) this;
        }

        public Criteria andGraduationgradeidBetween(Integer value1, Integer value2) {
            addCriterion("GraduationGradeId between", value1, value2, "graduationgradeid");
            return (Criteria) this;
        }

        public Criteria andGraduationgradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("GraduationGradeId not between", value1, value2, "graduationgradeid");
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

        public Criteria andClassidIsNull() {
            addCriterion("ClassId is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassId is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("ClassId =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("ClassId <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("ClassId >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassId >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("ClassId <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("ClassId <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("ClassId in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("ClassId not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("ClassId between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassId not between", value1, value2, "classid");
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

        public Criteria andInstrutoridIsNull() {
            addCriterion("InstrutorId is null");
            return (Criteria) this;
        }

        public Criteria andInstrutoridIsNotNull() {
            addCriterion("InstrutorId is not null");
            return (Criteria) this;
        }

        public Criteria andInstrutoridEqualTo(String value) {
            addCriterion("InstrutorId =", value, "instrutorid");
            return (Criteria) this;
        }

        public Criteria andInstrutoridNotEqualTo(String value) {
            addCriterion("InstrutorId <>", value, "instrutorid");
            return (Criteria) this;
        }

        public Criteria andInstrutoridGreaterThan(String value) {
            addCriterion("InstrutorId >", value, "instrutorid");
            return (Criteria) this;
        }

        public Criteria andInstrutoridGreaterThanOrEqualTo(String value) {
            addCriterion("InstrutorId >=", value, "instrutorid");
            return (Criteria) this;
        }

        public Criteria andInstrutoridLessThan(String value) {
            addCriterion("InstrutorId <", value, "instrutorid");
            return (Criteria) this;
        }

        public Criteria andInstrutoridLessThanOrEqualTo(String value) {
            addCriterion("InstrutorId <=", value, "instrutorid");
            return (Criteria) this;
        }

        public Criteria andInstrutoridLike(String value) {
            addCriterion("InstrutorId like", value, "instrutorid");
            return (Criteria) this;
        }

        public Criteria andInstrutoridNotLike(String value) {
            addCriterion("InstrutorId not like", value, "instrutorid");
            return (Criteria) this;
        }

        public Criteria andInstrutoridIn(List<String> values) {
            addCriterion("InstrutorId in", values, "instrutorid");
            return (Criteria) this;
        }

        public Criteria andInstrutoridNotIn(List<String> values) {
            addCriterion("InstrutorId not in", values, "instrutorid");
            return (Criteria) this;
        }

        public Criteria andInstrutoridBetween(String value1, String value2) {
            addCriterion("InstrutorId between", value1, value2, "instrutorid");
            return (Criteria) this;
        }

        public Criteria andInstrutoridNotBetween(String value1, String value2) {
            addCriterion("InstrutorId not between", value1, value2, "instrutorid");
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

        public Criteria andKtbgidIsNull() {
            addCriterion("KtbgId is null");
            return (Criteria) this;
        }

        public Criteria andKtbgidIsNotNull() {
            addCriterion("KtbgId is not null");
            return (Criteria) this;
        }

        public Criteria andKtbgidEqualTo(Integer value) {
            addCriterion("KtbgId =", value, "ktbgid");
            return (Criteria) this;
        }

        public Criteria andKtbgidNotEqualTo(Integer value) {
            addCriterion("KtbgId <>", value, "ktbgid");
            return (Criteria) this;
        }

        public Criteria andKtbgidGreaterThan(Integer value) {
            addCriterion("KtbgId >", value, "ktbgid");
            return (Criteria) this;
        }

        public Criteria andKtbgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("KtbgId >=", value, "ktbgid");
            return (Criteria) this;
        }

        public Criteria andKtbgidLessThan(Integer value) {
            addCriterion("KtbgId <", value, "ktbgid");
            return (Criteria) this;
        }

        public Criteria andKtbgidLessThanOrEqualTo(Integer value) {
            addCriterion("KtbgId <=", value, "ktbgid");
            return (Criteria) this;
        }

        public Criteria andKtbgidIn(List<Integer> values) {
            addCriterion("KtbgId in", values, "ktbgid");
            return (Criteria) this;
        }

        public Criteria andKtbgidNotIn(List<Integer> values) {
            addCriterion("KtbgId not in", values, "ktbgid");
            return (Criteria) this;
        }

        public Criteria andKtbgidBetween(Integer value1, Integer value2) {
            addCriterion("KtbgId between", value1, value2, "ktbgid");
            return (Criteria) this;
        }

        public Criteria andKtbgidNotBetween(Integer value1, Integer value2) {
            addCriterion("KtbgId not between", value1, value2, "ktbgid");
            return (Criteria) this;
        }

        public Criteria andZqjcbidIsNull() {
            addCriterion("ZqjcbId is null");
            return (Criteria) this;
        }

        public Criteria andZqjcbidIsNotNull() {
            addCriterion("ZqjcbId is not null");
            return (Criteria) this;
        }

        public Criteria andZqjcbidEqualTo(Integer value) {
            addCriterion("ZqjcbId =", value, "zqjcbid");
            return (Criteria) this;
        }

        public Criteria andZqjcbidNotEqualTo(Integer value) {
            addCriterion("ZqjcbId <>", value, "zqjcbid");
            return (Criteria) this;
        }

        public Criteria andZqjcbidGreaterThan(Integer value) {
            addCriterion("ZqjcbId >", value, "zqjcbid");
            return (Criteria) this;
        }

        public Criteria andZqjcbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZqjcbId >=", value, "zqjcbid");
            return (Criteria) this;
        }

        public Criteria andZqjcbidLessThan(Integer value) {
            addCriterion("ZqjcbId <", value, "zqjcbid");
            return (Criteria) this;
        }

        public Criteria andZqjcbidLessThanOrEqualTo(Integer value) {
            addCriterion("ZqjcbId <=", value, "zqjcbid");
            return (Criteria) this;
        }

        public Criteria andZqjcbidIn(List<Integer> values) {
            addCriterion("ZqjcbId in", values, "zqjcbid");
            return (Criteria) this;
        }

        public Criteria andZqjcbidNotIn(List<Integer> values) {
            addCriterion("ZqjcbId not in", values, "zqjcbid");
            return (Criteria) this;
        }

        public Criteria andZqjcbidBetween(Integer value1, Integer value2) {
            addCriterion("ZqjcbId between", value1, value2, "zqjcbid");
            return (Criteria) this;
        }

        public Criteria andZqjcbidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZqjcbId not between", value1, value2, "zqjcbid");
            return (Criteria) this;
        }

        public Criteria andZdjlidIsNull() {
            addCriterion("ZdjlId is null");
            return (Criteria) this;
        }

        public Criteria andZdjlidIsNotNull() {
            addCriterion("ZdjlId is not null");
            return (Criteria) this;
        }

        public Criteria andZdjlidEqualTo(Integer value) {
            addCriterion("ZdjlId =", value, "zdjlid");
            return (Criteria) this;
        }

        public Criteria andZdjlidNotEqualTo(Integer value) {
            addCriterion("ZdjlId <>", value, "zdjlid");
            return (Criteria) this;
        }

        public Criteria andZdjlidGreaterThan(Integer value) {
            addCriterion("ZdjlId >", value, "zdjlid");
            return (Criteria) this;
        }

        public Criteria andZdjlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZdjlId >=", value, "zdjlid");
            return (Criteria) this;
        }

        public Criteria andZdjlidLessThan(Integer value) {
            addCriterion("ZdjlId <", value, "zdjlid");
            return (Criteria) this;
        }

        public Criteria andZdjlidLessThanOrEqualTo(Integer value) {
            addCriterion("ZdjlId <=", value, "zdjlid");
            return (Criteria) this;
        }

        public Criteria andZdjlidIn(List<Integer> values) {
            addCriterion("ZdjlId in", values, "zdjlid");
            return (Criteria) this;
        }

        public Criteria andZdjlidNotIn(List<Integer> values) {
            addCriterion("ZdjlId not in", values, "zdjlid");
            return (Criteria) this;
        }

        public Criteria andZdjlidBetween(Integer value1, Integer value2) {
            addCriterion("ZdjlId between", value1, value2, "zdjlid");
            return (Criteria) this;
        }

        public Criteria andZdjlidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZdjlId not between", value1, value2, "zdjlid");
            return (Criteria) this;
        }

        public Criteria andBylwidIsNull() {
            addCriterion("BylwId is null");
            return (Criteria) this;
        }

        public Criteria andBylwidIsNotNull() {
            addCriterion("BylwId is not null");
            return (Criteria) this;
        }

        public Criteria andBylwidEqualTo(Integer value) {
            addCriterion("BylwId =", value, "bylwid");
            return (Criteria) this;
        }

        public Criteria andBylwidNotEqualTo(Integer value) {
            addCriterion("BylwId <>", value, "bylwid");
            return (Criteria) this;
        }

        public Criteria andBylwidGreaterThan(Integer value) {
            addCriterion("BylwId >", value, "bylwid");
            return (Criteria) this;
        }

        public Criteria andBylwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BylwId >=", value, "bylwid");
            return (Criteria) this;
        }

        public Criteria andBylwidLessThan(Integer value) {
            addCriterion("BylwId <", value, "bylwid");
            return (Criteria) this;
        }

        public Criteria andBylwidLessThanOrEqualTo(Integer value) {
            addCriterion("BylwId <=", value, "bylwid");
            return (Criteria) this;
        }

        public Criteria andBylwidIn(List<Integer> values) {
            addCriterion("BylwId in", values, "bylwid");
            return (Criteria) this;
        }

        public Criteria andBylwidNotIn(List<Integer> values) {
            addCriterion("BylwId not in", values, "bylwid");
            return (Criteria) this;
        }

        public Criteria andBylwidBetween(Integer value1, Integer value2) {
            addCriterion("BylwId between", value1, value2, "bylwid");
            return (Criteria) this;
        }

        public Criteria andBylwidNotBetween(Integer value1, Integer value2) {
            addCriterion("BylwId not between", value1, value2, "bylwid");
            return (Criteria) this;
        }

        public Criteria andDbpptidIsNull() {
            addCriterion("DbpptId is null");
            return (Criteria) this;
        }

        public Criteria andDbpptidIsNotNull() {
            addCriterion("DbpptId is not null");
            return (Criteria) this;
        }

        public Criteria andDbpptidEqualTo(Integer value) {
            addCriterion("DbpptId =", value, "dbpptid");
            return (Criteria) this;
        }

        public Criteria andDbpptidNotEqualTo(Integer value) {
            addCriterion("DbpptId <>", value, "dbpptid");
            return (Criteria) this;
        }

        public Criteria andDbpptidGreaterThan(Integer value) {
            addCriterion("DbpptId >", value, "dbpptid");
            return (Criteria) this;
        }

        public Criteria andDbpptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DbpptId >=", value, "dbpptid");
            return (Criteria) this;
        }

        public Criteria andDbpptidLessThan(Integer value) {
            addCriterion("DbpptId <", value, "dbpptid");
            return (Criteria) this;
        }

        public Criteria andDbpptidLessThanOrEqualTo(Integer value) {
            addCriterion("DbpptId <=", value, "dbpptid");
            return (Criteria) this;
        }

        public Criteria andDbpptidIn(List<Integer> values) {
            addCriterion("DbpptId in", values, "dbpptid");
            return (Criteria) this;
        }

        public Criteria andDbpptidNotIn(List<Integer> values) {
            addCriterion("DbpptId not in", values, "dbpptid");
            return (Criteria) this;
        }

        public Criteria andDbpptidBetween(Integer value1, Integer value2) {
            addCriterion("DbpptId between", value1, value2, "dbpptid");
            return (Criteria) this;
        }

        public Criteria andDbpptidNotBetween(Integer value1, Integer value2) {
            addCriterion("DbpptId not between", value1, value2, "dbpptid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidIsNull() {
            addCriterion("WwywhyjId is null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidIsNotNull() {
            addCriterion("WwywhyjId is not null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidEqualTo(Integer value) {
            addCriterion("WwywhyjId =", value, "wwywhyjid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidNotEqualTo(Integer value) {
            addCriterion("WwywhyjId <>", value, "wwywhyjid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidGreaterThan(Integer value) {
            addCriterion("WwywhyjId >", value, "wwywhyjid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WwywhyjId >=", value, "wwywhyjid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidLessThan(Integer value) {
            addCriterion("WwywhyjId <", value, "wwywhyjid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidLessThanOrEqualTo(Integer value) {
            addCriterion("WwywhyjId <=", value, "wwywhyjid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidIn(List<Integer> values) {
            addCriterion("WwywhyjId in", values, "wwywhyjid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidNotIn(List<Integer> values) {
            addCriterion("WwywhyjId not in", values, "wwywhyjid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidBetween(Integer value1, Integer value2) {
            addCriterion("WwywhyjId between", value1, value2, "wwywhyjid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjidNotBetween(Integer value1, Integer value2) {
            addCriterion("WwywhyjId not between", value1, value2, "wwywhyjid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidIsNull() {
            addCriterion("Graduationdesignresultid is null");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidIsNotNull() {
            addCriterion("Graduationdesignresultid is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidEqualTo(Integer value) {
            addCriterion("Graduationdesignresultid =", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidNotEqualTo(Integer value) {
            addCriterion("Graduationdesignresultid <>", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidGreaterThan(Integer value) {
            addCriterion("Graduationdesignresultid >", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Graduationdesignresultid >=", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidLessThan(Integer value) {
            addCriterion("Graduationdesignresultid <", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidLessThanOrEqualTo(Integer value) {
            addCriterion("Graduationdesignresultid <=", value, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidIn(List<Integer> values) {
            addCriterion("Graduationdesignresultid in", values, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidNotIn(List<Integer> values) {
            addCriterion("Graduationdesignresultid not in", values, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidBetween(Integer value1, Integer value2) {
            addCriterion("Graduationdesignresultid between", value1, value2, "graduationdesignresultid");
            return (Criteria) this;
        }

        public Criteria andGraduationdesignresultidNotBetween(Integer value1, Integer value2) {
            addCriterion("Graduationdesignresultid not between", value1, value2, "graduationdesignresultid");
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

        public Criteria andMajoridIsNull() {
            addCriterion("MajorId is null");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNotNull() {
            addCriterion("MajorId is not null");
            return (Criteria) this;
        }

        public Criteria andMajoridEqualTo(Integer value) {
            addCriterion("MajorId =", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotEqualTo(Integer value) {
            addCriterion("MajorId <>", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThan(Integer value) {
            addCriterion("MajorId >", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("MajorId >=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThan(Integer value) {
            addCriterion("MajorId <", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThanOrEqualTo(Integer value) {
            addCriterion("MajorId <=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridIn(List<Integer> values) {
            addCriterion("MajorId in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotIn(List<Integer> values) {
            addCriterion("MajorId not in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridBetween(Integer value1, Integer value2) {
            addCriterion("MajorId between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotBetween(Integer value1, Integer value2) {
            addCriterion("MajorId not between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNull() {
            addCriterion("Gradeid is null");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNotNull() {
            addCriterion("Gradeid is not null");
            return (Criteria) this;
        }

        public Criteria andGradeidEqualTo(Integer value) {
            addCriterion("Gradeid =", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotEqualTo(Integer value) {
            addCriterion("Gradeid <>", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThan(Integer value) {
            addCriterion("Gradeid >", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Gradeid >=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThan(Integer value) {
            addCriterion("Gradeid <", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThanOrEqualTo(Integer value) {
            addCriterion("Gradeid <=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidIn(List<Integer> values) {
            addCriterion("Gradeid in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotIn(List<Integer> values) {
            addCriterion("Gradeid not in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidBetween(Integer value1, Integer value2) {
            addCriterion("Gradeid between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("Gradeid not between", value1, value2, "gradeid");
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