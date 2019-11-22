package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class GraduationdesignresultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GraduationdesignresultExample() {
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

        public Criteria andChoosetimeIsNull() {
            addCriterion("ChooseTime is null");
            return (Criteria) this;
        }

        public Criteria andChoosetimeIsNotNull() {
            addCriterion("ChooseTime is not null");
            return (Criteria) this;
        }

        public Criteria andChoosetimeEqualTo(String value) {
            addCriterion("ChooseTime =", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeNotEqualTo(String value) {
            addCriterion("ChooseTime <>", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeGreaterThan(String value) {
            addCriterion("ChooseTime >", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ChooseTime >=", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeLessThan(String value) {
            addCriterion("ChooseTime <", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeLessThanOrEqualTo(String value) {
            addCriterion("ChooseTime <=", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeLike(String value) {
            addCriterion("ChooseTime like", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeNotLike(String value) {
            addCriterion("ChooseTime not like", value, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeIn(List<String> values) {
            addCriterion("ChooseTime in", values, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeNotIn(List<String> values) {
            addCriterion("ChooseTime not in", values, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeBetween(String value1, String value2) {
            addCriterion("ChooseTime between", value1, value2, "choosetime");
            return (Criteria) this;
        }

        public Criteria andChoosetimeNotBetween(String value1, String value2) {
            addCriterion("ChooseTime not between", value1, value2, "choosetime");
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

        public Criteria andTitlesourceidIsNull() {
            addCriterion("TitleSourceId is null");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidIsNotNull() {
            addCriterion("TitleSourceId is not null");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidEqualTo(Integer value) {
            addCriterion("TitleSourceId =", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidNotEqualTo(Integer value) {
            addCriterion("TitleSourceId <>", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidGreaterThan(Integer value) {
            addCriterion("TitleSourceId >", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TitleSourceId >=", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidLessThan(Integer value) {
            addCriterion("TitleSourceId <", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidLessThanOrEqualTo(Integer value) {
            addCriterion("TitleSourceId <=", value, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidIn(List<Integer> values) {
            addCriterion("TitleSourceId in", values, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidNotIn(List<Integer> values) {
            addCriterion("TitleSourceId not in", values, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidBetween(Integer value1, Integer value2) {
            addCriterion("TitleSourceId between", value1, value2, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andTitlesourceidNotBetween(Integer value1, Integer value2) {
            addCriterion("TitleSourceId not between", value1, value2, "titlesourceid");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidIsNull() {
            addCriterion("KTBGAuditStatusId is null");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidIsNotNull() {
            addCriterion("KTBGAuditStatusId is not null");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidEqualTo(Integer value) {
            addCriterion("KTBGAuditStatusId =", value, "ktbgauditstatusid");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidNotEqualTo(Integer value) {
            addCriterion("KTBGAuditStatusId <>", value, "ktbgauditstatusid");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidGreaterThan(Integer value) {
            addCriterion("KTBGAuditStatusId >", value, "ktbgauditstatusid");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("KTBGAuditStatusId >=", value, "ktbgauditstatusid");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidLessThan(Integer value) {
            addCriterion("KTBGAuditStatusId <", value, "ktbgauditstatusid");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("KTBGAuditStatusId <=", value, "ktbgauditstatusid");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidIn(List<Integer> values) {
            addCriterion("KTBGAuditStatusId in", values, "ktbgauditstatusid");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidNotIn(List<Integer> values) {
            addCriterion("KTBGAuditStatusId not in", values, "ktbgauditstatusid");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidBetween(Integer value1, Integer value2) {
            addCriterion("KTBGAuditStatusId between", value1, value2, "ktbgauditstatusid");
            return (Criteria) this;
        }

        public Criteria andKtbgauditstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("KTBGAuditStatusId not between", value1, value2, "ktbgauditstatusid");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionIsNull() {
            addCriterion("KTBGInstructorOpinion is null");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionIsNotNull() {
            addCriterion("KTBGInstructorOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionEqualTo(String value) {
            addCriterion("KTBGInstructorOpinion =", value, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionNotEqualTo(String value) {
            addCriterion("KTBGInstructorOpinion <>", value, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionGreaterThan(String value) {
            addCriterion("KTBGInstructorOpinion >", value, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionGreaterThanOrEqualTo(String value) {
            addCriterion("KTBGInstructorOpinion >=", value, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionLessThan(String value) {
            addCriterion("KTBGInstructorOpinion <", value, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionLessThanOrEqualTo(String value) {
            addCriterion("KTBGInstructorOpinion <=", value, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionLike(String value) {
            addCriterion("KTBGInstructorOpinion like", value, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionNotLike(String value) {
            addCriterion("KTBGInstructorOpinion not like", value, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionIn(List<String> values) {
            addCriterion("KTBGInstructorOpinion in", values, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionNotIn(List<String> values) {
            addCriterion("KTBGInstructorOpinion not in", values, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionBetween(String value1, String value2) {
            addCriterion("KTBGInstructorOpinion between", value1, value2, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructoropinionNotBetween(String value1, String value2) {
            addCriterion("KTBGInstructorOpinion not between", value1, value2, "ktbginstructoropinion");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeIsNull() {
            addCriterion("KTBGInstructorDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeIsNotNull() {
            addCriterion("KTBGInstructorDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeEqualTo(String value) {
            addCriterion("KTBGInstructorDeclareTime =", value, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeNotEqualTo(String value) {
            addCriterion("KTBGInstructorDeclareTime <>", value, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeGreaterThan(String value) {
            addCriterion("KTBGInstructorDeclareTime >", value, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("KTBGInstructorDeclareTime >=", value, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeLessThan(String value) {
            addCriterion("KTBGInstructorDeclareTime <", value, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("KTBGInstructorDeclareTime <=", value, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeLike(String value) {
            addCriterion("KTBGInstructorDeclareTime like", value, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeNotLike(String value) {
            addCriterion("KTBGInstructorDeclareTime not like", value, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeIn(List<String> values) {
            addCriterion("KTBGInstructorDeclareTime in", values, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeNotIn(List<String> values) {
            addCriterion("KTBGInstructorDeclareTime not in", values, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeBetween(String value1, String value2) {
            addCriterion("KTBGInstructorDeclareTime between", value1, value2, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructordeclaretimeNotBetween(String value1, String value2) {
            addCriterion("KTBGInstructorDeclareTime not between", value1, value2, "ktbginstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrIsNull() {
            addCriterion("KTBGInstructorSHR is null");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrIsNotNull() {
            addCriterion("KTBGInstructorSHR is not null");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrEqualTo(String value) {
            addCriterion("KTBGInstructorSHR =", value, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrNotEqualTo(String value) {
            addCriterion("KTBGInstructorSHR <>", value, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrGreaterThan(String value) {
            addCriterion("KTBGInstructorSHR >", value, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrGreaterThanOrEqualTo(String value) {
            addCriterion("KTBGInstructorSHR >=", value, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrLessThan(String value) {
            addCriterion("KTBGInstructorSHR <", value, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrLessThanOrEqualTo(String value) {
            addCriterion("KTBGInstructorSHR <=", value, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrLike(String value) {
            addCriterion("KTBGInstructorSHR like", value, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrNotLike(String value) {
            addCriterion("KTBGInstructorSHR not like", value, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrIn(List<String> values) {
            addCriterion("KTBGInstructorSHR in", values, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrNotIn(List<String> values) {
            addCriterion("KTBGInstructorSHR not in", values, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrBetween(String value1, String value2) {
            addCriterion("KTBGInstructorSHR between", value1, value2, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbginstructorshrNotBetween(String value1, String value2) {
            addCriterion("KTBGInstructorSHR not between", value1, value2, "ktbginstructorshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionIsNull() {
            addCriterion("KTBGExpertOpinion is null");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionIsNotNull() {
            addCriterion("KTBGExpertOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionEqualTo(String value) {
            addCriterion("KTBGExpertOpinion =", value, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionNotEqualTo(String value) {
            addCriterion("KTBGExpertOpinion <>", value, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionGreaterThan(String value) {
            addCriterion("KTBGExpertOpinion >", value, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionGreaterThanOrEqualTo(String value) {
            addCriterion("KTBGExpertOpinion >=", value, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionLessThan(String value) {
            addCriterion("KTBGExpertOpinion <", value, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionLessThanOrEqualTo(String value) {
            addCriterion("KTBGExpertOpinion <=", value, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionLike(String value) {
            addCriterion("KTBGExpertOpinion like", value, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionNotLike(String value) {
            addCriterion("KTBGExpertOpinion not like", value, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionIn(List<String> values) {
            addCriterion("KTBGExpertOpinion in", values, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionNotIn(List<String> values) {
            addCriterion("KTBGExpertOpinion not in", values, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionBetween(String value1, String value2) {
            addCriterion("KTBGExpertOpinion between", value1, value2, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertopinionNotBetween(String value1, String value2) {
            addCriterion("KTBGExpertOpinion not between", value1, value2, "ktbgexpertopinion");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeIsNull() {
            addCriterion("KTBGExpertDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeIsNotNull() {
            addCriterion("KTBGExpertDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeEqualTo(String value) {
            addCriterion("KTBGExpertDeclareTime =", value, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeNotEqualTo(String value) {
            addCriterion("KTBGExpertDeclareTime <>", value, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeGreaterThan(String value) {
            addCriterion("KTBGExpertDeclareTime >", value, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("KTBGExpertDeclareTime >=", value, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeLessThan(String value) {
            addCriterion("KTBGExpertDeclareTime <", value, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("KTBGExpertDeclareTime <=", value, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeLike(String value) {
            addCriterion("KTBGExpertDeclareTime like", value, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeNotLike(String value) {
            addCriterion("KTBGExpertDeclareTime not like", value, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeIn(List<String> values) {
            addCriterion("KTBGExpertDeclareTime in", values, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeNotIn(List<String> values) {
            addCriterion("KTBGExpertDeclareTime not in", values, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeBetween(String value1, String value2) {
            addCriterion("KTBGExpertDeclareTime between", value1, value2, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertdeclaretimeNotBetween(String value1, String value2) {
            addCriterion("KTBGExpertDeclareTime not between", value1, value2, "ktbgexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrIsNull() {
            addCriterion("KTBGExpertSHR is null");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrIsNotNull() {
            addCriterion("KTBGExpertSHR is not null");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrEqualTo(String value) {
            addCriterion("KTBGExpertSHR =", value, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrNotEqualTo(String value) {
            addCriterion("KTBGExpertSHR <>", value, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrGreaterThan(String value) {
            addCriterion("KTBGExpertSHR >", value, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrGreaterThanOrEqualTo(String value) {
            addCriterion("KTBGExpertSHR >=", value, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrLessThan(String value) {
            addCriterion("KTBGExpertSHR <", value, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrLessThanOrEqualTo(String value) {
            addCriterion("KTBGExpertSHR <=", value, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrLike(String value) {
            addCriterion("KTBGExpertSHR like", value, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrNotLike(String value) {
            addCriterion("KTBGExpertSHR not like", value, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrIn(List<String> values) {
            addCriterion("KTBGExpertSHR in", values, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrNotIn(List<String> values) {
            addCriterion("KTBGExpertSHR not in", values, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrBetween(String value1, String value2) {
            addCriterion("KTBGExpertSHR between", value1, value2, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andKtbgexpertshrNotBetween(String value1, String value2) {
            addCriterion("KTBGExpertSHR not between", value1, value2, "ktbgexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidIsNull() {
            addCriterion("ZQJCBAuditStatusId is null");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidIsNotNull() {
            addCriterion("ZQJCBAuditStatusId is not null");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidEqualTo(Integer value) {
            addCriterion("ZQJCBAuditStatusId =", value, "zqjcbauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidNotEqualTo(Integer value) {
            addCriterion("ZQJCBAuditStatusId <>", value, "zqjcbauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidGreaterThan(Integer value) {
            addCriterion("ZQJCBAuditStatusId >", value, "zqjcbauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZQJCBAuditStatusId >=", value, "zqjcbauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidLessThan(Integer value) {
            addCriterion("ZQJCBAuditStatusId <", value, "zqjcbauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("ZQJCBAuditStatusId <=", value, "zqjcbauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidIn(List<Integer> values) {
            addCriterion("ZQJCBAuditStatusId in", values, "zqjcbauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidNotIn(List<Integer> values) {
            addCriterion("ZQJCBAuditStatusId not in", values, "zqjcbauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidBetween(Integer value1, Integer value2) {
            addCriterion("ZQJCBAuditStatusId between", value1, value2, "zqjcbauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZqjcbauditstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZQJCBAuditStatusId not between", value1, value2, "zqjcbauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionIsNull() {
            addCriterion("ZQJCBInstructorOpinion is null");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionIsNotNull() {
            addCriterion("ZQJCBInstructorOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionEqualTo(String value) {
            addCriterion("ZQJCBInstructorOpinion =", value, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionNotEqualTo(String value) {
            addCriterion("ZQJCBInstructorOpinion <>", value, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionGreaterThan(String value) {
            addCriterion("ZQJCBInstructorOpinion >", value, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionGreaterThanOrEqualTo(String value) {
            addCriterion("ZQJCBInstructorOpinion >=", value, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionLessThan(String value) {
            addCriterion("ZQJCBInstructorOpinion <", value, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionLessThanOrEqualTo(String value) {
            addCriterion("ZQJCBInstructorOpinion <=", value, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionLike(String value) {
            addCriterion("ZQJCBInstructorOpinion like", value, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionNotLike(String value) {
            addCriterion("ZQJCBInstructorOpinion not like", value, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionIn(List<String> values) {
            addCriterion("ZQJCBInstructorOpinion in", values, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionNotIn(List<String> values) {
            addCriterion("ZQJCBInstructorOpinion not in", values, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionBetween(String value1, String value2) {
            addCriterion("ZQJCBInstructorOpinion between", value1, value2, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructoropinionNotBetween(String value1, String value2) {
            addCriterion("ZQJCBInstructorOpinion not between", value1, value2, "zqjcbinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeIsNull() {
            addCriterion("ZQJCBInstructorDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeIsNotNull() {
            addCriterion("ZQJCBInstructorDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeEqualTo(String value) {
            addCriterion("ZQJCBInstructorDeclareTime =", value, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeNotEqualTo(String value) {
            addCriterion("ZQJCBInstructorDeclareTime <>", value, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeGreaterThan(String value) {
            addCriterion("ZQJCBInstructorDeclareTime >", value, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("ZQJCBInstructorDeclareTime >=", value, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeLessThan(String value) {
            addCriterion("ZQJCBInstructorDeclareTime <", value, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("ZQJCBInstructorDeclareTime <=", value, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeLike(String value) {
            addCriterion("ZQJCBInstructorDeclareTime like", value, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeNotLike(String value) {
            addCriterion("ZQJCBInstructorDeclareTime not like", value, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeIn(List<String> values) {
            addCriterion("ZQJCBInstructorDeclareTime in", values, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeNotIn(List<String> values) {
            addCriterion("ZQJCBInstructorDeclareTime not in", values, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeBetween(String value1, String value2) {
            addCriterion("ZQJCBInstructorDeclareTime between", value1, value2, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructordeclaretimeNotBetween(String value1, String value2) {
            addCriterion("ZQJCBInstructorDeclareTime not between", value1, value2, "zqjcbinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrIsNull() {
            addCriterion("ZQJCBInstructorSHR is null");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrIsNotNull() {
            addCriterion("ZQJCBInstructorSHR is not null");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrEqualTo(String value) {
            addCriterion("ZQJCBInstructorSHR =", value, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrNotEqualTo(String value) {
            addCriterion("ZQJCBInstructorSHR <>", value, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrGreaterThan(String value) {
            addCriterion("ZQJCBInstructorSHR >", value, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrGreaterThanOrEqualTo(String value) {
            addCriterion("ZQJCBInstructorSHR >=", value, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrLessThan(String value) {
            addCriterion("ZQJCBInstructorSHR <", value, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrLessThanOrEqualTo(String value) {
            addCriterion("ZQJCBInstructorSHR <=", value, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrLike(String value) {
            addCriterion("ZQJCBInstructorSHR like", value, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrNotLike(String value) {
            addCriterion("ZQJCBInstructorSHR not like", value, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrIn(List<String> values) {
            addCriterion("ZQJCBInstructorSHR in", values, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrNotIn(List<String> values) {
            addCriterion("ZQJCBInstructorSHR not in", values, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrBetween(String value1, String value2) {
            addCriterion("ZQJCBInstructorSHR between", value1, value2, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbinstructorshrNotBetween(String value1, String value2) {
            addCriterion("ZQJCBInstructorSHR not between", value1, value2, "zqjcbinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionIsNull() {
            addCriterion("ZQJCBExpertOpinion is null");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionIsNotNull() {
            addCriterion("ZQJCBExpertOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionEqualTo(String value) {
            addCriterion("ZQJCBExpertOpinion =", value, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionNotEqualTo(String value) {
            addCriterion("ZQJCBExpertOpinion <>", value, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionGreaterThan(String value) {
            addCriterion("ZQJCBExpertOpinion >", value, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionGreaterThanOrEqualTo(String value) {
            addCriterion("ZQJCBExpertOpinion >=", value, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionLessThan(String value) {
            addCriterion("ZQJCBExpertOpinion <", value, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionLessThanOrEqualTo(String value) {
            addCriterion("ZQJCBExpertOpinion <=", value, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionLike(String value) {
            addCriterion("ZQJCBExpertOpinion like", value, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionNotLike(String value) {
            addCriterion("ZQJCBExpertOpinion not like", value, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionIn(List<String> values) {
            addCriterion("ZQJCBExpertOpinion in", values, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionNotIn(List<String> values) {
            addCriterion("ZQJCBExpertOpinion not in", values, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionBetween(String value1, String value2) {
            addCriterion("ZQJCBExpertOpinion between", value1, value2, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertopinionNotBetween(String value1, String value2) {
            addCriterion("ZQJCBExpertOpinion not between", value1, value2, "zqjcbexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeIsNull() {
            addCriterion("ZQJCBExpertDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeIsNotNull() {
            addCriterion("ZQJCBExpertDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeEqualTo(String value) {
            addCriterion("ZQJCBExpertDeclareTime =", value, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeNotEqualTo(String value) {
            addCriterion("ZQJCBExpertDeclareTime <>", value, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeGreaterThan(String value) {
            addCriterion("ZQJCBExpertDeclareTime >", value, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("ZQJCBExpertDeclareTime >=", value, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeLessThan(String value) {
            addCriterion("ZQJCBExpertDeclareTime <", value, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("ZQJCBExpertDeclareTime <=", value, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeLike(String value) {
            addCriterion("ZQJCBExpertDeclareTime like", value, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeNotLike(String value) {
            addCriterion("ZQJCBExpertDeclareTime not like", value, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeIn(List<String> values) {
            addCriterion("ZQJCBExpertDeclareTime in", values, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeNotIn(List<String> values) {
            addCriterion("ZQJCBExpertDeclareTime not in", values, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeBetween(String value1, String value2) {
            addCriterion("ZQJCBExpertDeclareTime between", value1, value2, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertdeclaretimeNotBetween(String value1, String value2) {
            addCriterion("ZQJCBExpertDeclareTime not between", value1, value2, "zqjcbexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrIsNull() {
            addCriterion("ZQJCBExpertSHR is null");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrIsNotNull() {
            addCriterion("ZQJCBExpertSHR is not null");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrEqualTo(String value) {
            addCriterion("ZQJCBExpertSHR =", value, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrNotEqualTo(String value) {
            addCriterion("ZQJCBExpertSHR <>", value, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrGreaterThan(String value) {
            addCriterion("ZQJCBExpertSHR >", value, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrGreaterThanOrEqualTo(String value) {
            addCriterion("ZQJCBExpertSHR >=", value, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrLessThan(String value) {
            addCriterion("ZQJCBExpertSHR <", value, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrLessThanOrEqualTo(String value) {
            addCriterion("ZQJCBExpertSHR <=", value, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrLike(String value) {
            addCriterion("ZQJCBExpertSHR like", value, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrNotLike(String value) {
            addCriterion("ZQJCBExpertSHR not like", value, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrIn(List<String> values) {
            addCriterion("ZQJCBExpertSHR in", values, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrNotIn(List<String> values) {
            addCriterion("ZQJCBExpertSHR not in", values, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrBetween(String value1, String value2) {
            addCriterion("ZQJCBExpertSHR between", value1, value2, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andZqjcbexpertshrNotBetween(String value1, String value2) {
            addCriterion("ZQJCBExpertSHR not between", value1, value2, "zqjcbexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidIsNull() {
            addCriterion("BYLWAuditStatusId is null");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidIsNotNull() {
            addCriterion("BYLWAuditStatusId is not null");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidEqualTo(Integer value) {
            addCriterion("BYLWAuditStatusId =", value, "bylwauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidNotEqualTo(Integer value) {
            addCriterion("BYLWAuditStatusId <>", value, "bylwauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidGreaterThan(Integer value) {
            addCriterion("BYLWAuditStatusId >", value, "bylwauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BYLWAuditStatusId >=", value, "bylwauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidLessThan(Integer value) {
            addCriterion("BYLWAuditStatusId <", value, "bylwauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("BYLWAuditStatusId <=", value, "bylwauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidIn(List<Integer> values) {
            addCriterion("BYLWAuditStatusId in", values, "bylwauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidNotIn(List<Integer> values) {
            addCriterion("BYLWAuditStatusId not in", values, "bylwauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidBetween(Integer value1, Integer value2) {
            addCriterion("BYLWAuditStatusId between", value1, value2, "bylwauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBylwauditstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("BYLWAuditStatusId not between", value1, value2, "bylwauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionIsNull() {
            addCriterion("BYLWInstructorOpinion is null");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionIsNotNull() {
            addCriterion("BYLWInstructorOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionEqualTo(String value) {
            addCriterion("BYLWInstructorOpinion =", value, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionNotEqualTo(String value) {
            addCriterion("BYLWInstructorOpinion <>", value, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionGreaterThan(String value) {
            addCriterion("BYLWInstructorOpinion >", value, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionGreaterThanOrEqualTo(String value) {
            addCriterion("BYLWInstructorOpinion >=", value, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionLessThan(String value) {
            addCriterion("BYLWInstructorOpinion <", value, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionLessThanOrEqualTo(String value) {
            addCriterion("BYLWInstructorOpinion <=", value, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionLike(String value) {
            addCriterion("BYLWInstructorOpinion like", value, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionNotLike(String value) {
            addCriterion("BYLWInstructorOpinion not like", value, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionIn(List<String> values) {
            addCriterion("BYLWInstructorOpinion in", values, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionNotIn(List<String> values) {
            addCriterion("BYLWInstructorOpinion not in", values, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionBetween(String value1, String value2) {
            addCriterion("BYLWInstructorOpinion between", value1, value2, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructoropinionNotBetween(String value1, String value2) {
            addCriterion("BYLWInstructorOpinion not between", value1, value2, "bylwinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeIsNull() {
            addCriterion("BYLWInstructorDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeIsNotNull() {
            addCriterion("BYLWInstructorDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeEqualTo(String value) {
            addCriterion("BYLWInstructorDeclareTime =", value, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeNotEqualTo(String value) {
            addCriterion("BYLWInstructorDeclareTime <>", value, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeGreaterThan(String value) {
            addCriterion("BYLWInstructorDeclareTime >", value, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("BYLWInstructorDeclareTime >=", value, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeLessThan(String value) {
            addCriterion("BYLWInstructorDeclareTime <", value, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("BYLWInstructorDeclareTime <=", value, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeLike(String value) {
            addCriterion("BYLWInstructorDeclareTime like", value, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeNotLike(String value) {
            addCriterion("BYLWInstructorDeclareTime not like", value, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeIn(List<String> values) {
            addCriterion("BYLWInstructorDeclareTime in", values, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeNotIn(List<String> values) {
            addCriterion("BYLWInstructorDeclareTime not in", values, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeBetween(String value1, String value2) {
            addCriterion("BYLWInstructorDeclareTime between", value1, value2, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructordeclaretimeNotBetween(String value1, String value2) {
            addCriterion("BYLWInstructorDeclareTime not between", value1, value2, "bylwinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrIsNull() {
            addCriterion("BYLWInstructorSHR is null");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrIsNotNull() {
            addCriterion("BYLWInstructorSHR is not null");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrEqualTo(String value) {
            addCriterion("BYLWInstructorSHR =", value, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrNotEqualTo(String value) {
            addCriterion("BYLWInstructorSHR <>", value, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrGreaterThan(String value) {
            addCriterion("BYLWInstructorSHR >", value, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrGreaterThanOrEqualTo(String value) {
            addCriterion("BYLWInstructorSHR >=", value, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrLessThan(String value) {
            addCriterion("BYLWInstructorSHR <", value, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrLessThanOrEqualTo(String value) {
            addCriterion("BYLWInstructorSHR <=", value, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrLike(String value) {
            addCriterion("BYLWInstructorSHR like", value, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrNotLike(String value) {
            addCriterion("BYLWInstructorSHR not like", value, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrIn(List<String> values) {
            addCriterion("BYLWInstructorSHR in", values, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrNotIn(List<String> values) {
            addCriterion("BYLWInstructorSHR not in", values, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrBetween(String value1, String value2) {
            addCriterion("BYLWInstructorSHR between", value1, value2, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwinstructorshrNotBetween(String value1, String value2) {
            addCriterion("BYLWInstructorSHR not between", value1, value2, "bylwinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionIsNull() {
            addCriterion("BYLWExpertOpinion is null");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionIsNotNull() {
            addCriterion("BYLWExpertOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionEqualTo(String value) {
            addCriterion("BYLWExpertOpinion =", value, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionNotEqualTo(String value) {
            addCriterion("BYLWExpertOpinion <>", value, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionGreaterThan(String value) {
            addCriterion("BYLWExpertOpinion >", value, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionGreaterThanOrEqualTo(String value) {
            addCriterion("BYLWExpertOpinion >=", value, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionLessThan(String value) {
            addCriterion("BYLWExpertOpinion <", value, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionLessThanOrEqualTo(String value) {
            addCriterion("BYLWExpertOpinion <=", value, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionLike(String value) {
            addCriterion("BYLWExpertOpinion like", value, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionNotLike(String value) {
            addCriterion("BYLWExpertOpinion not like", value, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionIn(List<String> values) {
            addCriterion("BYLWExpertOpinion in", values, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionNotIn(List<String> values) {
            addCriterion("BYLWExpertOpinion not in", values, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionBetween(String value1, String value2) {
            addCriterion("BYLWExpertOpinion between", value1, value2, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertopinionNotBetween(String value1, String value2) {
            addCriterion("BYLWExpertOpinion not between", value1, value2, "bylwexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeIsNull() {
            addCriterion("BYLWExpertDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeIsNotNull() {
            addCriterion("BYLWExpertDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeEqualTo(String value) {
            addCriterion("BYLWExpertDeclareTime =", value, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeNotEqualTo(String value) {
            addCriterion("BYLWExpertDeclareTime <>", value, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeGreaterThan(String value) {
            addCriterion("BYLWExpertDeclareTime >", value, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("BYLWExpertDeclareTime >=", value, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeLessThan(String value) {
            addCriterion("BYLWExpertDeclareTime <", value, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("BYLWExpertDeclareTime <=", value, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeLike(String value) {
            addCriterion("BYLWExpertDeclareTime like", value, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeNotLike(String value) {
            addCriterion("BYLWExpertDeclareTime not like", value, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeIn(List<String> values) {
            addCriterion("BYLWExpertDeclareTime in", values, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeNotIn(List<String> values) {
            addCriterion("BYLWExpertDeclareTime not in", values, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeBetween(String value1, String value2) {
            addCriterion("BYLWExpertDeclareTime between", value1, value2, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertdeclaretimeNotBetween(String value1, String value2) {
            addCriterion("BYLWExpertDeclareTime not between", value1, value2, "bylwexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrIsNull() {
            addCriterion("BYLWExpertSHR is null");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrIsNotNull() {
            addCriterion("BYLWExpertSHR is not null");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrEqualTo(String value) {
            addCriterion("BYLWExpertSHR =", value, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrNotEqualTo(String value) {
            addCriterion("BYLWExpertSHR <>", value, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrGreaterThan(String value) {
            addCriterion("BYLWExpertSHR >", value, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrGreaterThanOrEqualTo(String value) {
            addCriterion("BYLWExpertSHR >=", value, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrLessThan(String value) {
            addCriterion("BYLWExpertSHR <", value, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrLessThanOrEqualTo(String value) {
            addCriterion("BYLWExpertSHR <=", value, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrLike(String value) {
            addCriterion("BYLWExpertSHR like", value, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrNotLike(String value) {
            addCriterion("BYLWExpertSHR not like", value, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrIn(List<String> values) {
            addCriterion("BYLWExpertSHR in", values, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrNotIn(List<String> values) {
            addCriterion("BYLWExpertSHR not in", values, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrBetween(String value1, String value2) {
            addCriterion("BYLWExpertSHR between", value1, value2, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andBylwexpertshrNotBetween(String value1, String value2) {
            addCriterion("BYLWExpertSHR not between", value1, value2, "bylwexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidIsNull() {
            addCriterion("DBPPTAuditStatusId is null");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidIsNotNull() {
            addCriterion("DBPPTAuditStatusId is not null");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidEqualTo(Integer value) {
            addCriterion("DBPPTAuditStatusId =", value, "dbpptauditstatusid");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidNotEqualTo(Integer value) {
            addCriterion("DBPPTAuditStatusId <>", value, "dbpptauditstatusid");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidGreaterThan(Integer value) {
            addCriterion("DBPPTAuditStatusId >", value, "dbpptauditstatusid");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DBPPTAuditStatusId >=", value, "dbpptauditstatusid");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidLessThan(Integer value) {
            addCriterion("DBPPTAuditStatusId <", value, "dbpptauditstatusid");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("DBPPTAuditStatusId <=", value, "dbpptauditstatusid");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidIn(List<Integer> values) {
            addCriterion("DBPPTAuditStatusId in", values, "dbpptauditstatusid");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidNotIn(List<Integer> values) {
            addCriterion("DBPPTAuditStatusId not in", values, "dbpptauditstatusid");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidBetween(Integer value1, Integer value2) {
            addCriterion("DBPPTAuditStatusId between", value1, value2, "dbpptauditstatusid");
            return (Criteria) this;
        }

        public Criteria andDbpptauditstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("DBPPTAuditStatusId not between", value1, value2, "dbpptauditstatusid");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionIsNull() {
            addCriterion("DBPPTInstructorOpinion is null");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionIsNotNull() {
            addCriterion("DBPPTInstructorOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionEqualTo(String value) {
            addCriterion("DBPPTInstructorOpinion =", value, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionNotEqualTo(String value) {
            addCriterion("DBPPTInstructorOpinion <>", value, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionGreaterThan(String value) {
            addCriterion("DBPPTInstructorOpinion >", value, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionGreaterThanOrEqualTo(String value) {
            addCriterion("DBPPTInstructorOpinion >=", value, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionLessThan(String value) {
            addCriterion("DBPPTInstructorOpinion <", value, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionLessThanOrEqualTo(String value) {
            addCriterion("DBPPTInstructorOpinion <=", value, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionLike(String value) {
            addCriterion("DBPPTInstructorOpinion like", value, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionNotLike(String value) {
            addCriterion("DBPPTInstructorOpinion not like", value, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionIn(List<String> values) {
            addCriterion("DBPPTInstructorOpinion in", values, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionNotIn(List<String> values) {
            addCriterion("DBPPTInstructorOpinion not in", values, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionBetween(String value1, String value2) {
            addCriterion("DBPPTInstructorOpinion between", value1, value2, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructoropinionNotBetween(String value1, String value2) {
            addCriterion("DBPPTInstructorOpinion not between", value1, value2, "dbpptinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeIsNull() {
            addCriterion("DBPPTInstructorDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeIsNotNull() {
            addCriterion("DBPPTInstructorDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeEqualTo(String value) {
            addCriterion("DBPPTInstructorDeclareTime =", value, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeNotEqualTo(String value) {
            addCriterion("DBPPTInstructorDeclareTime <>", value, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeGreaterThan(String value) {
            addCriterion("DBPPTInstructorDeclareTime >", value, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("DBPPTInstructorDeclareTime >=", value, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeLessThan(String value) {
            addCriterion("DBPPTInstructorDeclareTime <", value, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("DBPPTInstructorDeclareTime <=", value, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeLike(String value) {
            addCriterion("DBPPTInstructorDeclareTime like", value, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeNotLike(String value) {
            addCriterion("DBPPTInstructorDeclareTime not like", value, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeIn(List<String> values) {
            addCriterion("DBPPTInstructorDeclareTime in", values, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeNotIn(List<String> values) {
            addCriterion("DBPPTInstructorDeclareTime not in", values, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeBetween(String value1, String value2) {
            addCriterion("DBPPTInstructorDeclareTime between", value1, value2, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructordeclaretimeNotBetween(String value1, String value2) {
            addCriterion("DBPPTInstructorDeclareTime not between", value1, value2, "dbpptinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrIsNull() {
            addCriterion("DBPPTInstructorSHR is null");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrIsNotNull() {
            addCriterion("DBPPTInstructorSHR is not null");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrEqualTo(String value) {
            addCriterion("DBPPTInstructorSHR =", value, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrNotEqualTo(String value) {
            addCriterion("DBPPTInstructorSHR <>", value, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrGreaterThan(String value) {
            addCriterion("DBPPTInstructorSHR >", value, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrGreaterThanOrEqualTo(String value) {
            addCriterion("DBPPTInstructorSHR >=", value, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrLessThan(String value) {
            addCriterion("DBPPTInstructorSHR <", value, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrLessThanOrEqualTo(String value) {
            addCriterion("DBPPTInstructorSHR <=", value, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrLike(String value) {
            addCriterion("DBPPTInstructorSHR like", value, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrNotLike(String value) {
            addCriterion("DBPPTInstructorSHR not like", value, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrIn(List<String> values) {
            addCriterion("DBPPTInstructorSHR in", values, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrNotIn(List<String> values) {
            addCriterion("DBPPTInstructorSHR not in", values, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrBetween(String value1, String value2) {
            addCriterion("DBPPTInstructorSHR between", value1, value2, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptinstructorshrNotBetween(String value1, String value2) {
            addCriterion("DBPPTInstructorSHR not between", value1, value2, "dbpptinstructorshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionIsNull() {
            addCriterion("DBPPTExpertOpinion is null");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionIsNotNull() {
            addCriterion("DBPPTExpertOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionEqualTo(String value) {
            addCriterion("DBPPTExpertOpinion =", value, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionNotEqualTo(String value) {
            addCriterion("DBPPTExpertOpinion <>", value, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionGreaterThan(String value) {
            addCriterion("DBPPTExpertOpinion >", value, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionGreaterThanOrEqualTo(String value) {
            addCriterion("DBPPTExpertOpinion >=", value, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionLessThan(String value) {
            addCriterion("DBPPTExpertOpinion <", value, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionLessThanOrEqualTo(String value) {
            addCriterion("DBPPTExpertOpinion <=", value, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionLike(String value) {
            addCriterion("DBPPTExpertOpinion like", value, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionNotLike(String value) {
            addCriterion("DBPPTExpertOpinion not like", value, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionIn(List<String> values) {
            addCriterion("DBPPTExpertOpinion in", values, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionNotIn(List<String> values) {
            addCriterion("DBPPTExpertOpinion not in", values, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionBetween(String value1, String value2) {
            addCriterion("DBPPTExpertOpinion between", value1, value2, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertopinionNotBetween(String value1, String value2) {
            addCriterion("DBPPTExpertOpinion not between", value1, value2, "dbpptexpertopinion");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeIsNull() {
            addCriterion("DBPPTExpertDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeIsNotNull() {
            addCriterion("DBPPTExpertDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeEqualTo(String value) {
            addCriterion("DBPPTExpertDeclareTime =", value, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeNotEqualTo(String value) {
            addCriterion("DBPPTExpertDeclareTime <>", value, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeGreaterThan(String value) {
            addCriterion("DBPPTExpertDeclareTime >", value, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("DBPPTExpertDeclareTime >=", value, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeLessThan(String value) {
            addCriterion("DBPPTExpertDeclareTime <", value, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("DBPPTExpertDeclareTime <=", value, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeLike(String value) {
            addCriterion("DBPPTExpertDeclareTime like", value, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeNotLike(String value) {
            addCriterion("DBPPTExpertDeclareTime not like", value, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeIn(List<String> values) {
            addCriterion("DBPPTExpertDeclareTime in", values, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeNotIn(List<String> values) {
            addCriterion("DBPPTExpertDeclareTime not in", values, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeBetween(String value1, String value2) {
            addCriterion("DBPPTExpertDeclareTime between", value1, value2, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertdeclaretimeNotBetween(String value1, String value2) {
            addCriterion("DBPPTExpertDeclareTime not between", value1, value2, "dbpptexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrIsNull() {
            addCriterion("DBPPTExpertSHR is null");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrIsNotNull() {
            addCriterion("DBPPTExpertSHR is not null");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrEqualTo(String value) {
            addCriterion("DBPPTExpertSHR =", value, "dbpptexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrNotEqualTo(String value) {
            addCriterion("DBPPTExpertSHR <>", value, "dbpptexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrGreaterThan(String value) {
            addCriterion("DBPPTExpertSHR >", value, "dbpptexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrGreaterThanOrEqualTo(String value) {
            addCriterion("DBPPTExpertSHR >=", value, "dbpptexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrLessThan(String value) {
            addCriterion("DBPPTExpertSHR <", value, "dbpptexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrLessThanOrEqualTo(String value) {
            addCriterion("DBPPTExpertSHR <=", value, "dbpptexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrLike(String value) {
            addCriterion("DBPPTExpertSHR like", value, "dbpptexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrNotLike(String value) {
            addCriterion("DBPPTExpertSHR not like", value, "dbpptexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrIn(List<String> values) {
            addCriterion("DBPPTExpertSHR in", values, "dbpptexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrNotIn(List<String> values) {
            addCriterion("DBPPTExpertSHR not in", values, "dbpptexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrBetween(String value1, String value2) {
            addCriterion("DBPPTExpertSHR between", value1, value2, "dbpptexpertshr");
            return (Criteria) this;
        }

        public Criteria andDbpptexpertshrNotBetween(String value1, String value2) {
            addCriterion("DBPPTExpertSHR not between", value1, value2, "dbpptexpertshr");
            return (Criteria) this;
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

        public Criteria andZqjcbinfoidIsNull() {
            addCriterion("ZQJCBInfoId is null");
            return (Criteria) this;
        }

        public Criteria andZqjcbinfoidIsNotNull() {
            addCriterion("ZQJCBInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andZqjcbinfoidEqualTo(Integer value) {
            addCriterion("ZQJCBInfoId =", value, "zqjcbinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcbinfoidNotEqualTo(Integer value) {
            addCriterion("ZQJCBInfoId <>", value, "zqjcbinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcbinfoidGreaterThan(Integer value) {
            addCriterion("ZQJCBInfoId >", value, "zqjcbinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcbinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZQJCBInfoId >=", value, "zqjcbinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcbinfoidLessThan(Integer value) {
            addCriterion("ZQJCBInfoId <", value, "zqjcbinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcbinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("ZQJCBInfoId <=", value, "zqjcbinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcbinfoidIn(List<Integer> values) {
            addCriterion("ZQJCBInfoId in", values, "zqjcbinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcbinfoidNotIn(List<Integer> values) {
            addCriterion("ZQJCBInfoId not in", values, "zqjcbinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcbinfoidBetween(Integer value1, Integer value2) {
            addCriterion("ZQJCBInfoId between", value1, value2, "zqjcbinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcbinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZQJCBInfoId not between", value1, value2, "zqjcbinfoid");
            return (Criteria) this;
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

        public Criteria andDbpptinfoidIsNull() {
            addCriterion("DBPPTInfoId is null");
            return (Criteria) this;
        }

        public Criteria andDbpptinfoidIsNotNull() {
            addCriterion("DBPPTInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andDbpptinfoidEqualTo(Integer value) {
            addCriterion("DBPPTInfoId =", value, "dbpptinfoid");
            return (Criteria) this;
        }

        public Criteria andDbpptinfoidNotEqualTo(Integer value) {
            addCriterion("DBPPTInfoId <>", value, "dbpptinfoid");
            return (Criteria) this;
        }

        public Criteria andDbpptinfoidGreaterThan(Integer value) {
            addCriterion("DBPPTInfoId >", value, "dbpptinfoid");
            return (Criteria) this;
        }

        public Criteria andDbpptinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DBPPTInfoId >=", value, "dbpptinfoid");
            return (Criteria) this;
        }

        public Criteria andDbpptinfoidLessThan(Integer value) {
            addCriterion("DBPPTInfoId <", value, "dbpptinfoid");
            return (Criteria) this;
        }

        public Criteria andDbpptinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("DBPPTInfoId <=", value, "dbpptinfoid");
            return (Criteria) this;
        }

        public Criteria andDbpptinfoidIn(List<Integer> values) {
            addCriterion("DBPPTInfoId in", values, "dbpptinfoid");
            return (Criteria) this;
        }

        public Criteria andDbpptinfoidNotIn(List<Integer> values) {
            addCriterion("DBPPTInfoId not in", values, "dbpptinfoid");
            return (Criteria) this;
        }

        public Criteria andDbpptinfoidBetween(Integer value1, Integer value2) {
            addCriterion("DBPPTInfoId between", value1, value2, "dbpptinfoid");
            return (Criteria) this;
        }

        public Criteria andDbpptinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("DBPPTInfoId not between", value1, value2, "dbpptinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidIsNull() {
            addCriterion("ZDJLInfoId is null");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidIsNotNull() {
            addCriterion("ZDJLInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidEqualTo(Integer value) {
            addCriterion("ZDJLInfoId =", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidNotEqualTo(Integer value) {
            addCriterion("ZDJLInfoId <>", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidGreaterThan(Integer value) {
            addCriterion("ZDJLInfoId >", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZDJLInfoId >=", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidLessThan(Integer value) {
            addCriterion("ZDJLInfoId <", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("ZDJLInfoId <=", value, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidIn(List<Integer> values) {
            addCriterion("ZDJLInfoId in", values, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidNotIn(List<Integer> values) {
            addCriterion("ZDJLInfoId not in", values, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidBetween(Integer value1, Integer value2) {
            addCriterion("ZDJLInfoId between", value1, value2, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZDJLInfoId not between", value1, value2, "zdjlinfoid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidIsNull() {
            addCriterion("WWYWHYJInfoId is null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidIsNotNull() {
            addCriterion("WWYWHYJInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidEqualTo(Integer value) {
            addCriterion("WWYWHYJInfoId =", value, "wwywhyjinfoid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidNotEqualTo(Integer value) {
            addCriterion("WWYWHYJInfoId <>", value, "wwywhyjinfoid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidGreaterThan(Integer value) {
            addCriterion("WWYWHYJInfoId >", value, "wwywhyjinfoid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WWYWHYJInfoId >=", value, "wwywhyjinfoid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidLessThan(Integer value) {
            addCriterion("WWYWHYJInfoId <", value, "wwywhyjinfoid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("WWYWHYJInfoId <=", value, "wwywhyjinfoid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidIn(List<Integer> values) {
            addCriterion("WWYWHYJInfoId in", values, "wwywhyjinfoid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidNotIn(List<Integer> values) {
            addCriterion("WWYWHYJInfoId not in", values, "wwywhyjinfoid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidBetween(Integer value1, Integer value2) {
            addCriterion("WWYWHYJInfoId between", value1, value2, "wwywhyjinfoid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("WWYWHYJInfoId not between", value1, value2, "wwywhyjinfoid");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidIsNull() {
            addCriterion("ZDJLAuditStatusId is null");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidIsNotNull() {
            addCriterion("ZDJLAuditStatusId is not null");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidEqualTo(Integer value) {
            addCriterion("ZDJLAuditStatusId =", value, "zdjlauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidNotEqualTo(Integer value) {
            addCriterion("ZDJLAuditStatusId <>", value, "zdjlauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidGreaterThan(Integer value) {
            addCriterion("ZDJLAuditStatusId >", value, "zdjlauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZDJLAuditStatusId >=", value, "zdjlauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidLessThan(Integer value) {
            addCriterion("ZDJLAuditStatusId <", value, "zdjlauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("ZDJLAuditStatusId <=", value, "zdjlauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidIn(List<Integer> values) {
            addCriterion("ZDJLAuditStatusId in", values, "zdjlauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidNotIn(List<Integer> values) {
            addCriterion("ZDJLAuditStatusId not in", values, "zdjlauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidBetween(Integer value1, Integer value2) {
            addCriterion("ZDJLAuditStatusId between", value1, value2, "zdjlauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZdjlauditstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZDJLAuditStatusId not between", value1, value2, "zdjlauditstatusid");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionIsNull() {
            addCriterion("ZDJLInstructorOpinion is null");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionIsNotNull() {
            addCriterion("ZDJLInstructorOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionEqualTo(String value) {
            addCriterion("ZDJLInstructorOpinion =", value, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionNotEqualTo(String value) {
            addCriterion("ZDJLInstructorOpinion <>", value, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionGreaterThan(String value) {
            addCriterion("ZDJLInstructorOpinion >", value, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionGreaterThanOrEqualTo(String value) {
            addCriterion("ZDJLInstructorOpinion >=", value, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionLessThan(String value) {
            addCriterion("ZDJLInstructorOpinion <", value, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionLessThanOrEqualTo(String value) {
            addCriterion("ZDJLInstructorOpinion <=", value, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionLike(String value) {
            addCriterion("ZDJLInstructorOpinion like", value, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionNotLike(String value) {
            addCriterion("ZDJLInstructorOpinion not like", value, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionIn(List<String> values) {
            addCriterion("ZDJLInstructorOpinion in", values, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionNotIn(List<String> values) {
            addCriterion("ZDJLInstructorOpinion not in", values, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionBetween(String value1, String value2) {
            addCriterion("ZDJLInstructorOpinion between", value1, value2, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructoropinionNotBetween(String value1, String value2) {
            addCriterion("ZDJLInstructorOpinion not between", value1, value2, "zdjlinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeIsNull() {
            addCriterion("ZDJLInstructorDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeIsNotNull() {
            addCriterion("ZDJLInstructorDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeEqualTo(String value) {
            addCriterion("ZDJLInstructorDeclareTime =", value, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeNotEqualTo(String value) {
            addCriterion("ZDJLInstructorDeclareTime <>", value, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeGreaterThan(String value) {
            addCriterion("ZDJLInstructorDeclareTime >", value, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("ZDJLInstructorDeclareTime >=", value, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeLessThan(String value) {
            addCriterion("ZDJLInstructorDeclareTime <", value, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("ZDJLInstructorDeclareTime <=", value, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeLike(String value) {
            addCriterion("ZDJLInstructorDeclareTime like", value, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeNotLike(String value) {
            addCriterion("ZDJLInstructorDeclareTime not like", value, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeIn(List<String> values) {
            addCriterion("ZDJLInstructorDeclareTime in", values, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeNotIn(List<String> values) {
            addCriterion("ZDJLInstructorDeclareTime not in", values, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeBetween(String value1, String value2) {
            addCriterion("ZDJLInstructorDeclareTime between", value1, value2, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructordeclaretimeNotBetween(String value1, String value2) {
            addCriterion("ZDJLInstructorDeclareTime not between", value1, value2, "zdjlinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrIsNull() {
            addCriterion("ZDJLInstructorSHR is null");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrIsNotNull() {
            addCriterion("ZDJLInstructorSHR is not null");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrEqualTo(String value) {
            addCriterion("ZDJLInstructorSHR =", value, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrNotEqualTo(String value) {
            addCriterion("ZDJLInstructorSHR <>", value, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrGreaterThan(String value) {
            addCriterion("ZDJLInstructorSHR >", value, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrGreaterThanOrEqualTo(String value) {
            addCriterion("ZDJLInstructorSHR >=", value, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrLessThan(String value) {
            addCriterion("ZDJLInstructorSHR <", value, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrLessThanOrEqualTo(String value) {
            addCriterion("ZDJLInstructorSHR <=", value, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrLike(String value) {
            addCriterion("ZDJLInstructorSHR like", value, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrNotLike(String value) {
            addCriterion("ZDJLInstructorSHR not like", value, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrIn(List<String> values) {
            addCriterion("ZDJLInstructorSHR in", values, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrNotIn(List<String> values) {
            addCriterion("ZDJLInstructorSHR not in", values, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrBetween(String value1, String value2) {
            addCriterion("ZDJLInstructorSHR between", value1, value2, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlinstructorshrNotBetween(String value1, String value2) {
            addCriterion("ZDJLInstructorSHR not between", value1, value2, "zdjlinstructorshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionIsNull() {
            addCriterion("ZDJLExpertOpinion is null");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionIsNotNull() {
            addCriterion("ZDJLExpertOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionEqualTo(String value) {
            addCriterion("ZDJLExpertOpinion =", value, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionNotEqualTo(String value) {
            addCriterion("ZDJLExpertOpinion <>", value, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionGreaterThan(String value) {
            addCriterion("ZDJLExpertOpinion >", value, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionGreaterThanOrEqualTo(String value) {
            addCriterion("ZDJLExpertOpinion >=", value, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionLessThan(String value) {
            addCriterion("ZDJLExpertOpinion <", value, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionLessThanOrEqualTo(String value) {
            addCriterion("ZDJLExpertOpinion <=", value, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionLike(String value) {
            addCriterion("ZDJLExpertOpinion like", value, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionNotLike(String value) {
            addCriterion("ZDJLExpertOpinion not like", value, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionIn(List<String> values) {
            addCriterion("ZDJLExpertOpinion in", values, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionNotIn(List<String> values) {
            addCriterion("ZDJLExpertOpinion not in", values, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionBetween(String value1, String value2) {
            addCriterion("ZDJLExpertOpinion between", value1, value2, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertopinionNotBetween(String value1, String value2) {
            addCriterion("ZDJLExpertOpinion not between", value1, value2, "zdjlexpertopinion");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeIsNull() {
            addCriterion("ZDJLExpertDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeIsNotNull() {
            addCriterion("ZDJLExpertDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeEqualTo(String value) {
            addCriterion("ZDJLExpertDeclareTime =", value, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeNotEqualTo(String value) {
            addCriterion("ZDJLExpertDeclareTime <>", value, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeGreaterThan(String value) {
            addCriterion("ZDJLExpertDeclareTime >", value, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("ZDJLExpertDeclareTime >=", value, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeLessThan(String value) {
            addCriterion("ZDJLExpertDeclareTime <", value, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("ZDJLExpertDeclareTime <=", value, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeLike(String value) {
            addCriterion("ZDJLExpertDeclareTime like", value, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeNotLike(String value) {
            addCriterion("ZDJLExpertDeclareTime not like", value, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeIn(List<String> values) {
            addCriterion("ZDJLExpertDeclareTime in", values, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeNotIn(List<String> values) {
            addCriterion("ZDJLExpertDeclareTime not in", values, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeBetween(String value1, String value2) {
            addCriterion("ZDJLExpertDeclareTime between", value1, value2, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertdeclaretimeNotBetween(String value1, String value2) {
            addCriterion("ZDJLExpertDeclareTime not between", value1, value2, "zdjlexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrIsNull() {
            addCriterion("ZDJLExpertSHR is null");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrIsNotNull() {
            addCriterion("ZDJLExpertSHR is not null");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrEqualTo(String value) {
            addCriterion("ZDJLExpertSHR =", value, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrNotEqualTo(String value) {
            addCriterion("ZDJLExpertSHR <>", value, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrGreaterThan(String value) {
            addCriterion("ZDJLExpertSHR >", value, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrGreaterThanOrEqualTo(String value) {
            addCriterion("ZDJLExpertSHR >=", value, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrLessThan(String value) {
            addCriterion("ZDJLExpertSHR <", value, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrLessThanOrEqualTo(String value) {
            addCriterion("ZDJLExpertSHR <=", value, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrLike(String value) {
            addCriterion("ZDJLExpertSHR like", value, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrNotLike(String value) {
            addCriterion("ZDJLExpertSHR not like", value, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrIn(List<String> values) {
            addCriterion("ZDJLExpertSHR in", values, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrNotIn(List<String> values) {
            addCriterion("ZDJLExpertSHR not in", values, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrBetween(String value1, String value2) {
            addCriterion("ZDJLExpertSHR between", value1, value2, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andZdjlexpertshrNotBetween(String value1, String value2) {
            addCriterion("ZDJLExpertSHR not between", value1, value2, "zdjlexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidIsNull() {
            addCriterion("WWYWHYJAuditStatusId is null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidIsNotNull() {
            addCriterion("WWYWHYJAuditStatusId is not null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidEqualTo(Integer value) {
            addCriterion("WWYWHYJAuditStatusId =", value, "wwywhyjauditstatusid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidNotEqualTo(Integer value) {
            addCriterion("WWYWHYJAuditStatusId <>", value, "wwywhyjauditstatusid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidGreaterThan(Integer value) {
            addCriterion("WWYWHYJAuditStatusId >", value, "wwywhyjauditstatusid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WWYWHYJAuditStatusId >=", value, "wwywhyjauditstatusid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidLessThan(Integer value) {
            addCriterion("WWYWHYJAuditStatusId <", value, "wwywhyjauditstatusid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("WWYWHYJAuditStatusId <=", value, "wwywhyjauditstatusid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidIn(List<Integer> values) {
            addCriterion("WWYWHYJAuditStatusId in", values, "wwywhyjauditstatusid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidNotIn(List<Integer> values) {
            addCriterion("WWYWHYJAuditStatusId not in", values, "wwywhyjauditstatusid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidBetween(Integer value1, Integer value2) {
            addCriterion("WWYWHYJAuditStatusId between", value1, value2, "wwywhyjauditstatusid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjauditstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("WWYWHYJAuditStatusId not between", value1, value2, "wwywhyjauditstatusid");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionIsNull() {
            addCriterion("WWYWHYJInstructorOpinion is null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionIsNotNull() {
            addCriterion("WWYWHYJInstructorOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionEqualTo(String value) {
            addCriterion("WWYWHYJInstructorOpinion =", value, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionNotEqualTo(String value) {
            addCriterion("WWYWHYJInstructorOpinion <>", value, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionGreaterThan(String value) {
            addCriterion("WWYWHYJInstructorOpinion >", value, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionGreaterThanOrEqualTo(String value) {
            addCriterion("WWYWHYJInstructorOpinion >=", value, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionLessThan(String value) {
            addCriterion("WWYWHYJInstructorOpinion <", value, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionLessThanOrEqualTo(String value) {
            addCriterion("WWYWHYJInstructorOpinion <=", value, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionLike(String value) {
            addCriterion("WWYWHYJInstructorOpinion like", value, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionNotLike(String value) {
            addCriterion("WWYWHYJInstructorOpinion not like", value, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionIn(List<String> values) {
            addCriterion("WWYWHYJInstructorOpinion in", values, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionNotIn(List<String> values) {
            addCriterion("WWYWHYJInstructorOpinion not in", values, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionBetween(String value1, String value2) {
            addCriterion("WWYWHYJInstructorOpinion between", value1, value2, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructoropinionNotBetween(String value1, String value2) {
            addCriterion("WWYWHYJInstructorOpinion not between", value1, value2, "wwywhyjinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeIsNull() {
            addCriterion("WWYWHYJInstructorDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeIsNotNull() {
            addCriterion("WWYWHYJInstructorDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeEqualTo(String value) {
            addCriterion("WWYWHYJInstructorDeclareTime =", value, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeNotEqualTo(String value) {
            addCriterion("WWYWHYJInstructorDeclareTime <>", value, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeGreaterThan(String value) {
            addCriterion("WWYWHYJInstructorDeclareTime >", value, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("WWYWHYJInstructorDeclareTime >=", value, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeLessThan(String value) {
            addCriterion("WWYWHYJInstructorDeclareTime <", value, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("WWYWHYJInstructorDeclareTime <=", value, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeLike(String value) {
            addCriterion("WWYWHYJInstructorDeclareTime like", value, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeNotLike(String value) {
            addCriterion("WWYWHYJInstructorDeclareTime not like", value, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeIn(List<String> values) {
            addCriterion("WWYWHYJInstructorDeclareTime in", values, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeNotIn(List<String> values) {
            addCriterion("WWYWHYJInstructorDeclareTime not in", values, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeBetween(String value1, String value2) {
            addCriterion("WWYWHYJInstructorDeclareTime between", value1, value2, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructordeclaretimeNotBetween(String value1, String value2) {
            addCriterion("WWYWHYJInstructorDeclareTime not between", value1, value2, "wwywhyjinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrIsNull() {
            addCriterion("WWYWHYJInstructorSHR is null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrIsNotNull() {
            addCriterion("WWYWHYJInstructorSHR is not null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrEqualTo(String value) {
            addCriterion("WWYWHYJInstructorSHR =", value, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrNotEqualTo(String value) {
            addCriterion("WWYWHYJInstructorSHR <>", value, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrGreaterThan(String value) {
            addCriterion("WWYWHYJInstructorSHR >", value, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrGreaterThanOrEqualTo(String value) {
            addCriterion("WWYWHYJInstructorSHR >=", value, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrLessThan(String value) {
            addCriterion("WWYWHYJInstructorSHR <", value, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrLessThanOrEqualTo(String value) {
            addCriterion("WWYWHYJInstructorSHR <=", value, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrLike(String value) {
            addCriterion("WWYWHYJInstructorSHR like", value, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrNotLike(String value) {
            addCriterion("WWYWHYJInstructorSHR not like", value, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrIn(List<String> values) {
            addCriterion("WWYWHYJInstructorSHR in", values, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrNotIn(List<String> values) {
            addCriterion("WWYWHYJInstructorSHR not in", values, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrBetween(String value1, String value2) {
            addCriterion("WWYWHYJInstructorSHR between", value1, value2, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjinstructorshrNotBetween(String value1, String value2) {
            addCriterion("WWYWHYJInstructorSHR not between", value1, value2, "wwywhyjinstructorshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionIsNull() {
            addCriterion("WWYWHYJExpertOpinion is null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionIsNotNull() {
            addCriterion("WWYWHYJExpertOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionEqualTo(String value) {
            addCriterion("WWYWHYJExpertOpinion =", value, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionNotEqualTo(String value) {
            addCriterion("WWYWHYJExpertOpinion <>", value, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionGreaterThan(String value) {
            addCriterion("WWYWHYJExpertOpinion >", value, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionGreaterThanOrEqualTo(String value) {
            addCriterion("WWYWHYJExpertOpinion >=", value, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionLessThan(String value) {
            addCriterion("WWYWHYJExpertOpinion <", value, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionLessThanOrEqualTo(String value) {
            addCriterion("WWYWHYJExpertOpinion <=", value, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionLike(String value) {
            addCriterion("WWYWHYJExpertOpinion like", value, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionNotLike(String value) {
            addCriterion("WWYWHYJExpertOpinion not like", value, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionIn(List<String> values) {
            addCriterion("WWYWHYJExpertOpinion in", values, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionNotIn(List<String> values) {
            addCriterion("WWYWHYJExpertOpinion not in", values, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionBetween(String value1, String value2) {
            addCriterion("WWYWHYJExpertOpinion between", value1, value2, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertopinionNotBetween(String value1, String value2) {
            addCriterion("WWYWHYJExpertOpinion not between", value1, value2, "wwywhyjexpertopinion");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeIsNull() {
            addCriterion("WWYWHYJExpertDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeIsNotNull() {
            addCriterion("WWYWHYJExpertDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeEqualTo(String value) {
            addCriterion("WWYWHYJExpertDeclareTime =", value, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeNotEqualTo(String value) {
            addCriterion("WWYWHYJExpertDeclareTime <>", value, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeGreaterThan(String value) {
            addCriterion("WWYWHYJExpertDeclareTime >", value, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("WWYWHYJExpertDeclareTime >=", value, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeLessThan(String value) {
            addCriterion("WWYWHYJExpertDeclareTime <", value, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("WWYWHYJExpertDeclareTime <=", value, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeLike(String value) {
            addCriterion("WWYWHYJExpertDeclareTime like", value, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeNotLike(String value) {
            addCriterion("WWYWHYJExpertDeclareTime not like", value, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeIn(List<String> values) {
            addCriterion("WWYWHYJExpertDeclareTime in", values, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeNotIn(List<String> values) {
            addCriterion("WWYWHYJExpertDeclareTime not in", values, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeBetween(String value1, String value2) {
            addCriterion("WWYWHYJExpertDeclareTime between", value1, value2, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertdeclaretimeNotBetween(String value1, String value2) {
            addCriterion("WWYWHYJExpertDeclareTime not between", value1, value2, "wwywhyjexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrIsNull() {
            addCriterion("WWYWHYJExpertSHR is null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrIsNotNull() {
            addCriterion("WWYWHYJExpertSHR is not null");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrEqualTo(String value) {
            addCriterion("WWYWHYJExpertSHR =", value, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrNotEqualTo(String value) {
            addCriterion("WWYWHYJExpertSHR <>", value, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrGreaterThan(String value) {
            addCriterion("WWYWHYJExpertSHR >", value, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrGreaterThanOrEqualTo(String value) {
            addCriterion("WWYWHYJExpertSHR >=", value, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrLessThan(String value) {
            addCriterion("WWYWHYJExpertSHR <", value, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrLessThanOrEqualTo(String value) {
            addCriterion("WWYWHYJExpertSHR <=", value, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrLike(String value) {
            addCriterion("WWYWHYJExpertSHR like", value, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrNotLike(String value) {
            addCriterion("WWYWHYJExpertSHR not like", value, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrIn(List<String> values) {
            addCriterion("WWYWHYJExpertSHR in", values, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrNotIn(List<String> values) {
            addCriterion("WWYWHYJExpertSHR not in", values, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrBetween(String value1, String value2) {
            addCriterion("WWYWHYJExpertSHR between", value1, value2, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andWwywhyjexpertshrNotBetween(String value1, String value2) {
            addCriterion("WWYWHYJExpertSHR not between", value1, value2, "wwywhyjexpertshr");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignIsNull() {
            addCriterion("Teacher_Declare_sign is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignIsNotNull() {
            addCriterion("Teacher_Declare_sign is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignEqualTo(Boolean value) {
            addCriterion("Teacher_Declare_sign =", value, "teacherDeclareSign");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignNotEqualTo(Boolean value) {
            addCriterion("Teacher_Declare_sign <>", value, "teacherDeclareSign");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignGreaterThan(Boolean value) {
            addCriterion("Teacher_Declare_sign >", value, "teacherDeclareSign");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Teacher_Declare_sign >=", value, "teacherDeclareSign");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignLessThan(Boolean value) {
            addCriterion("Teacher_Declare_sign <", value, "teacherDeclareSign");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignLessThanOrEqualTo(Boolean value) {
            addCriterion("Teacher_Declare_sign <=", value, "teacherDeclareSign");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignIn(List<Boolean> values) {
            addCriterion("Teacher_Declare_sign in", values, "teacherDeclareSign");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignNotIn(List<Boolean> values) {
            addCriterion("Teacher_Declare_sign not in", values, "teacherDeclareSign");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignBetween(Boolean value1, Boolean value2) {
            addCriterion("Teacher_Declare_sign between", value1, value2, "teacherDeclareSign");
            return (Criteria) this;
        }

        public Criteria andTeacherDeclareSignNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Teacher_Declare_sign not between", value1, value2, "teacherDeclareSign");
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