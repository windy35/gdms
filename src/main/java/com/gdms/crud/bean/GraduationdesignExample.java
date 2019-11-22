package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class GraduationdesignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GraduationdesignExample() {
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

        public Criteria andCurrentstudentcountIsNull() {
            addCriterion("CurrentStudentCount is null");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentcountIsNotNull() {
            addCriterion("CurrentStudentCount is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentcountEqualTo(Integer value) {
            addCriterion("CurrentStudentCount =", value, "currentstudentcount");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentcountNotEqualTo(Integer value) {
            addCriterion("CurrentStudentCount <>", value, "currentstudentcount");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentcountGreaterThan(Integer value) {
            addCriterion("CurrentStudentCount >", value, "currentstudentcount");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CurrentStudentCount >=", value, "currentstudentcount");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentcountLessThan(Integer value) {
            addCriterion("CurrentStudentCount <", value, "currentstudentcount");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentcountLessThanOrEqualTo(Integer value) {
            addCriterion("CurrentStudentCount <=", value, "currentstudentcount");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentcountIn(List<Integer> values) {
            addCriterion("CurrentStudentCount in", values, "currentstudentcount");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentcountNotIn(List<Integer> values) {
            addCriterion("CurrentStudentCount not in", values, "currentstudentcount");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentcountBetween(Integer value1, Integer value2) {
            addCriterion("CurrentStudentCount between", value1, value2, "currentstudentcount");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentcountNotBetween(Integer value1, Integer value2) {
            addCriterion("CurrentStudentCount not between", value1, value2, "currentstudentcount");
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

        public Criteria andTopicselectionmodeIsNull() {
            addCriterion("TopicSelectionMode is null");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeIsNotNull() {
            addCriterion("TopicSelectionMode is not null");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeEqualTo(String value) {
            addCriterion("TopicSelectionMode =", value, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeNotEqualTo(String value) {
            addCriterion("TopicSelectionMode <>", value, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeGreaterThan(String value) {
            addCriterion("TopicSelectionMode >", value, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeGreaterThanOrEqualTo(String value) {
            addCriterion("TopicSelectionMode >=", value, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeLessThan(String value) {
            addCriterion("TopicSelectionMode <", value, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeLessThanOrEqualTo(String value) {
            addCriterion("TopicSelectionMode <=", value, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeLike(String value) {
            addCriterion("TopicSelectionMode like", value, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeNotLike(String value) {
            addCriterion("TopicSelectionMode not like", value, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeIn(List<String> values) {
            addCriterion("TopicSelectionMode in", values, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeNotIn(List<String> values) {
            addCriterion("TopicSelectionMode not in", values, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeBetween(String value1, String value2) {
            addCriterion("TopicSelectionMode between", value1, value2, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andTopicselectionmodeNotBetween(String value1, String value2) {
            addCriterion("TopicSelectionMode not between", value1, value2, "topicselectionmode");
            return (Criteria) this;
        }

        public Criteria andWorkloadIsNull() {
            addCriterion("Workload is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadIsNotNull() {
            addCriterion("Workload is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadEqualTo(String value) {
            addCriterion("Workload =", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotEqualTo(String value) {
            addCriterion("Workload <>", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadGreaterThan(String value) {
            addCriterion("Workload >", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadGreaterThanOrEqualTo(String value) {
            addCriterion("Workload >=", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLessThan(String value) {
            addCriterion("Workload <", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLessThanOrEqualTo(String value) {
            addCriterion("Workload <=", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLike(String value) {
            addCriterion("Workload like", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotLike(String value) {
            addCriterion("Workload not like", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadIn(List<String> values) {
            addCriterion("Workload in", values, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotIn(List<String> values) {
            addCriterion("Workload not in", values, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadBetween(String value1, String value2) {
            addCriterion("Workload between", value1, value2, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotBetween(String value1, String value2) {
            addCriterion("Workload not between", value1, value2, "workload");
            return (Criteria) this;
        }

        public Criteria andComplexityIsNull() {
            addCriterion("Complexity is null");
            return (Criteria) this;
        }

        public Criteria andComplexityIsNotNull() {
            addCriterion("Complexity is not null");
            return (Criteria) this;
        }

        public Criteria andComplexityEqualTo(String value) {
            addCriterion("Complexity =", value, "complexity");
            return (Criteria) this;
        }

        public Criteria andComplexityNotEqualTo(String value) {
            addCriterion("Complexity <>", value, "complexity");
            return (Criteria) this;
        }

        public Criteria andComplexityGreaterThan(String value) {
            addCriterion("Complexity >", value, "complexity");
            return (Criteria) this;
        }

        public Criteria andComplexityGreaterThanOrEqualTo(String value) {
            addCriterion("Complexity >=", value, "complexity");
            return (Criteria) this;
        }

        public Criteria andComplexityLessThan(String value) {
            addCriterion("Complexity <", value, "complexity");
            return (Criteria) this;
        }

        public Criteria andComplexityLessThanOrEqualTo(String value) {
            addCriterion("Complexity <=", value, "complexity");
            return (Criteria) this;
        }

        public Criteria andComplexityLike(String value) {
            addCriterion("Complexity like", value, "complexity");
            return (Criteria) this;
        }

        public Criteria andComplexityNotLike(String value) {
            addCriterion("Complexity not like", value, "complexity");
            return (Criteria) this;
        }

        public Criteria andComplexityIn(List<String> values) {
            addCriterion("Complexity in", values, "complexity");
            return (Criteria) this;
        }

        public Criteria andComplexityNotIn(List<String> values) {
            addCriterion("Complexity not in", values, "complexity");
            return (Criteria) this;
        }

        public Criteria andComplexityBetween(String value1, String value2) {
            addCriterion("Complexity between", value1, value2, "complexity");
            return (Criteria) this;
        }

        public Criteria andComplexityNotBetween(String value1, String value2) {
            addCriterion("Complexity not between", value1, value2, "complexity");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountIsNull() {
            addCriterion("RequireStudentCount is null");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountIsNotNull() {
            addCriterion("RequireStudentCount is not null");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountEqualTo(Integer value) {
            addCriterion("RequireStudentCount =", value, "requirestudentcount");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountNotEqualTo(Integer value) {
            addCriterion("RequireStudentCount <>", value, "requirestudentcount");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountGreaterThan(Integer value) {
            addCriterion("RequireStudentCount >", value, "requirestudentcount");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("RequireStudentCount >=", value, "requirestudentcount");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountLessThan(Integer value) {
            addCriterion("RequireStudentCount <", value, "requirestudentcount");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountLessThanOrEqualTo(Integer value) {
            addCriterion("RequireStudentCount <=", value, "requirestudentcount");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountIn(List<Integer> values) {
            addCriterion("RequireStudentCount in", values, "requirestudentcount");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountNotIn(List<Integer> values) {
            addCriterion("RequireStudentCount not in", values, "requirestudentcount");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountBetween(Integer value1, Integer value2) {
            addCriterion("RequireStudentCount between", value1, value2, "requirestudentcount");
            return (Criteria) this;
        }

        public Criteria andRequirestudentcountNotBetween(Integer value1, Integer value2) {
            addCriterion("RequireStudentCount not between", value1, value2, "requirestudentcount");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalIsNull() {
            addCriterion("OptionalProfessional is null");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalIsNotNull() {
            addCriterion("OptionalProfessional is not null");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalEqualTo(String value) {
            addCriterion("OptionalProfessional =", value, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalNotEqualTo(String value) {
            addCriterion("OptionalProfessional <>", value, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalGreaterThan(String value) {
            addCriterion("OptionalProfessional >", value, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalGreaterThanOrEqualTo(String value) {
            addCriterion("OptionalProfessional >=", value, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalLessThan(String value) {
            addCriterion("OptionalProfessional <", value, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalLessThanOrEqualTo(String value) {
            addCriterion("OptionalProfessional <=", value, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalLike(String value) {
            addCriterion("OptionalProfessional like", value, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalNotLike(String value) {
            addCriterion("OptionalProfessional not like", value, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalIn(List<String> values) {
            addCriterion("OptionalProfessional in", values, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalNotIn(List<String> values) {
            addCriterion("OptionalProfessional not in", values, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalBetween(String value1, String value2) {
            addCriterion("OptionalProfessional between", value1, value2, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andOptionalprofessionalNotBetween(String value1, String value2) {
            addCriterion("OptionalProfessional not between", value1, value2, "optionalprofessional");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationIsNull() {
            addCriterion("SubjectAffiliation is null");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationIsNotNull() {
            addCriterion("SubjectAffiliation is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationEqualTo(String value) {
            addCriterion("SubjectAffiliation =", value, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationNotEqualTo(String value) {
            addCriterion("SubjectAffiliation <>", value, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationGreaterThan(String value) {
            addCriterion("SubjectAffiliation >", value, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationGreaterThanOrEqualTo(String value) {
            addCriterion("SubjectAffiliation >=", value, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationLessThan(String value) {
            addCriterion("SubjectAffiliation <", value, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationLessThanOrEqualTo(String value) {
            addCriterion("SubjectAffiliation <=", value, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationLike(String value) {
            addCriterion("SubjectAffiliation like", value, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationNotLike(String value) {
            addCriterion("SubjectAffiliation not like", value, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationIn(List<String> values) {
            addCriterion("SubjectAffiliation in", values, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationNotIn(List<String> values) {
            addCriterion("SubjectAffiliation not in", values, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationBetween(String value1, String value2) {
            addCriterion("SubjectAffiliation between", value1, value2, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andSubjectaffiliationNotBetween(String value1, String value2) {
            addCriterion("SubjectAffiliation not between", value1, value2, "subjectaffiliation");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeIsNull() {
            addCriterion("DeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeIsNotNull() {
            addCriterion("DeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeEqualTo(String value) {
            addCriterion("DeclareTime =", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeNotEqualTo(String value) {
            addCriterion("DeclareTime <>", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeGreaterThan(String value) {
            addCriterion("DeclareTime >", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("DeclareTime >=", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeLessThan(String value) {
            addCriterion("DeclareTime <", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("DeclareTime <=", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeLike(String value) {
            addCriterion("DeclareTime like", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeNotLike(String value) {
            addCriterion("DeclareTime not like", value, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeIn(List<String> values) {
            addCriterion("DeclareTime in", values, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeNotIn(List<String> values) {
            addCriterion("DeclareTime not in", values, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeBetween(String value1, String value2) {
            addCriterion("DeclareTime between", value1, value2, "declaretime");
            return (Criteria) this;
        }

        public Criteria andDeclaretimeNotBetween(String value1, String value2) {
            addCriterion("DeclareTime not between", value1, value2, "declaretime");
            return (Criteria) this;
        }

        public Criteria andInstructornameIsNull() {
            addCriterion("InstructorName is null");
            return (Criteria) this;
        }

        public Criteria andInstructornameIsNotNull() {
            addCriterion("InstructorName is not null");
            return (Criteria) this;
        }

        public Criteria andInstructornameEqualTo(String value) {
            addCriterion("InstructorName =", value, "instructorname");
            return (Criteria) this;
        }

        public Criteria andInstructornameNotEqualTo(String value) {
            addCriterion("InstructorName <>", value, "instructorname");
            return (Criteria) this;
        }

        public Criteria andInstructornameGreaterThan(String value) {
            addCriterion("InstructorName >", value, "instructorname");
            return (Criteria) this;
        }

        public Criteria andInstructornameGreaterThanOrEqualTo(String value) {
            addCriterion("InstructorName >=", value, "instructorname");
            return (Criteria) this;
        }

        public Criteria andInstructornameLessThan(String value) {
            addCriterion("InstructorName <", value, "instructorname");
            return (Criteria) this;
        }

        public Criteria andInstructornameLessThanOrEqualTo(String value) {
            addCriterion("InstructorName <=", value, "instructorname");
            return (Criteria) this;
        }

        public Criteria andInstructornameLike(String value) {
            addCriterion("InstructorName like", value, "instructorname");
            return (Criteria) this;
        }

        public Criteria andInstructornameNotLike(String value) {
            addCriterion("InstructorName not like", value, "instructorname");
            return (Criteria) this;
        }

        public Criteria andInstructornameIn(List<String> values) {
            addCriterion("InstructorName in", values, "instructorname");
            return (Criteria) this;
        }

        public Criteria andInstructornameNotIn(List<String> values) {
            addCriterion("InstructorName not in", values, "instructorname");
            return (Criteria) this;
        }

        public Criteria andInstructornameBetween(String value1, String value2) {
            addCriterion("InstructorName between", value1, value2, "instructorname");
            return (Criteria) this;
        }

        public Criteria andInstructornameNotBetween(String value1, String value2) {
            addCriterion("InstructorName not between", value1, value2, "instructorname");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoIsNull() {
            addCriterion("DeclareStudentNo is null");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoIsNotNull() {
            addCriterion("DeclareStudentNo is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoEqualTo(String value) {
            addCriterion("DeclareStudentNo =", value, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoNotEqualTo(String value) {
            addCriterion("DeclareStudentNo <>", value, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoGreaterThan(String value) {
            addCriterion("DeclareStudentNo >", value, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoGreaterThanOrEqualTo(String value) {
            addCriterion("DeclareStudentNo >=", value, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoLessThan(String value) {
            addCriterion("DeclareStudentNo <", value, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoLessThanOrEqualTo(String value) {
            addCriterion("DeclareStudentNo <=", value, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoLike(String value) {
            addCriterion("DeclareStudentNo like", value, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoNotLike(String value) {
            addCriterion("DeclareStudentNo not like", value, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoIn(List<String> values) {
            addCriterion("DeclareStudentNo in", values, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoNotIn(List<String> values) {
            addCriterion("DeclareStudentNo not in", values, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoBetween(String value1, String value2) {
            addCriterion("DeclareStudentNo between", value1, value2, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andDeclarestudentnoNotBetween(String value1, String value2) {
            addCriterion("DeclareStudentNo not between", value1, value2, "declarestudentno");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidIsNull() {
            addCriterion("BSXTAuditStatusId is null");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidIsNotNull() {
            addCriterion("BSXTAuditStatusId is not null");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidEqualTo(Integer value) {
            addCriterion("BSXTAuditStatusId =", value, "bsxtauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidNotEqualTo(Integer value) {
            addCriterion("BSXTAuditStatusId <>", value, "bsxtauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidGreaterThan(Integer value) {
            addCriterion("BSXTAuditStatusId >", value, "bsxtauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BSXTAuditStatusId >=", value, "bsxtauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidLessThan(Integer value) {
            addCriterion("BSXTAuditStatusId <", value, "bsxtauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("BSXTAuditStatusId <=", value, "bsxtauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidIn(List<Integer> values) {
            addCriterion("BSXTAuditStatusId in", values, "bsxtauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidNotIn(List<Integer> values) {
            addCriterion("BSXTAuditStatusId not in", values, "bsxtauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidBetween(Integer value1, Integer value2) {
            addCriterion("BSXTAuditStatusId between", value1, value2, "bsxtauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBsxtauditstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("BSXTAuditStatusId not between", value1, value2, "bsxtauditstatusid");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionIsNull() {
            addCriterion("BSXTInstructorOpinion is null");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionIsNotNull() {
            addCriterion("BSXTInstructorOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionEqualTo(String value) {
            addCriterion("BSXTInstructorOpinion =", value, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionNotEqualTo(String value) {
            addCriterion("BSXTInstructorOpinion <>", value, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionGreaterThan(String value) {
            addCriterion("BSXTInstructorOpinion >", value, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionGreaterThanOrEqualTo(String value) {
            addCriterion("BSXTInstructorOpinion >=", value, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionLessThan(String value) {
            addCriterion("BSXTInstructorOpinion <", value, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionLessThanOrEqualTo(String value) {
            addCriterion("BSXTInstructorOpinion <=", value, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionLike(String value) {
            addCriterion("BSXTInstructorOpinion like", value, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionNotLike(String value) {
            addCriterion("BSXTInstructorOpinion not like", value, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionIn(List<String> values) {
            addCriterion("BSXTInstructorOpinion in", values, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionNotIn(List<String> values) {
            addCriterion("BSXTInstructorOpinion not in", values, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionBetween(String value1, String value2) {
            addCriterion("BSXTInstructorOpinion between", value1, value2, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructoropinionNotBetween(String value1, String value2) {
            addCriterion("BSXTInstructorOpinion not between", value1, value2, "bsxtinstructoropinion");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeIsNull() {
            addCriterion("BSXTInstructorDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeIsNotNull() {
            addCriterion("BSXTInstructorDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeEqualTo(String value) {
            addCriterion("BSXTInstructorDeclareTime =", value, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeNotEqualTo(String value) {
            addCriterion("BSXTInstructorDeclareTime <>", value, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeGreaterThan(String value) {
            addCriterion("BSXTInstructorDeclareTime >", value, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("BSXTInstructorDeclareTime >=", value, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeLessThan(String value) {
            addCriterion("BSXTInstructorDeclareTime <", value, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("BSXTInstructorDeclareTime <=", value, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeLike(String value) {
            addCriterion("BSXTInstructorDeclareTime like", value, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeNotLike(String value) {
            addCriterion("BSXTInstructorDeclareTime not like", value, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeIn(List<String> values) {
            addCriterion("BSXTInstructorDeclareTime in", values, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeNotIn(List<String> values) {
            addCriterion("BSXTInstructorDeclareTime not in", values, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeBetween(String value1, String value2) {
            addCriterion("BSXTInstructorDeclareTime between", value1, value2, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructordeclaretimeNotBetween(String value1, String value2) {
            addCriterion("BSXTInstructorDeclareTime not between", value1, value2, "bsxtinstructordeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrIsNull() {
            addCriterion("BSXTInstructorSHR is null");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrIsNotNull() {
            addCriterion("BSXTInstructorSHR is not null");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrEqualTo(String value) {
            addCriterion("BSXTInstructorSHR =", value, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrNotEqualTo(String value) {
            addCriterion("BSXTInstructorSHR <>", value, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrGreaterThan(String value) {
            addCriterion("BSXTInstructorSHR >", value, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrGreaterThanOrEqualTo(String value) {
            addCriterion("BSXTInstructorSHR >=", value, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrLessThan(String value) {
            addCriterion("BSXTInstructorSHR <", value, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrLessThanOrEqualTo(String value) {
            addCriterion("BSXTInstructorSHR <=", value, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrLike(String value) {
            addCriterion("BSXTInstructorSHR like", value, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrNotLike(String value) {
            addCriterion("BSXTInstructorSHR not like", value, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrIn(List<String> values) {
            addCriterion("BSXTInstructorSHR in", values, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrNotIn(List<String> values) {
            addCriterion("BSXTInstructorSHR not in", values, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrBetween(String value1, String value2) {
            addCriterion("BSXTInstructorSHR between", value1, value2, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtinstructorshrNotBetween(String value1, String value2) {
            addCriterion("BSXTInstructorSHR not between", value1, value2, "bsxtinstructorshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionIsNull() {
            addCriterion("BSXTExpertOpinion is null");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionIsNotNull() {
            addCriterion("BSXTExpertOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionEqualTo(String value) {
            addCriterion("BSXTExpertOpinion =", value, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionNotEqualTo(String value) {
            addCriterion("BSXTExpertOpinion <>", value, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionGreaterThan(String value) {
            addCriterion("BSXTExpertOpinion >", value, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionGreaterThanOrEqualTo(String value) {
            addCriterion("BSXTExpertOpinion >=", value, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionLessThan(String value) {
            addCriterion("BSXTExpertOpinion <", value, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionLessThanOrEqualTo(String value) {
            addCriterion("BSXTExpertOpinion <=", value, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionLike(String value) {
            addCriterion("BSXTExpertOpinion like", value, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionNotLike(String value) {
            addCriterion("BSXTExpertOpinion not like", value, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionIn(List<String> values) {
            addCriterion("BSXTExpertOpinion in", values, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionNotIn(List<String> values) {
            addCriterion("BSXTExpertOpinion not in", values, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionBetween(String value1, String value2) {
            addCriterion("BSXTExpertOpinion between", value1, value2, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertopinionNotBetween(String value1, String value2) {
            addCriterion("BSXTExpertOpinion not between", value1, value2, "bsxtexpertopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionIsNull() {
            addCriterion("BSXTExpertDetailOpinion is null");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionIsNotNull() {
            addCriterion("BSXTExpertDetailOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionEqualTo(String value) {
            addCriterion("BSXTExpertDetailOpinion =", value, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionNotEqualTo(String value) {
            addCriterion("BSXTExpertDetailOpinion <>", value, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionGreaterThan(String value) {
            addCriterion("BSXTExpertDetailOpinion >", value, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionGreaterThanOrEqualTo(String value) {
            addCriterion("BSXTExpertDetailOpinion >=", value, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionLessThan(String value) {
            addCriterion("BSXTExpertDetailOpinion <", value, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionLessThanOrEqualTo(String value) {
            addCriterion("BSXTExpertDetailOpinion <=", value, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionLike(String value) {
            addCriterion("BSXTExpertDetailOpinion like", value, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionNotLike(String value) {
            addCriterion("BSXTExpertDetailOpinion not like", value, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionIn(List<String> values) {
            addCriterion("BSXTExpertDetailOpinion in", values, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionNotIn(List<String> values) {
            addCriterion("BSXTExpertDetailOpinion not in", values, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionBetween(String value1, String value2) {
            addCriterion("BSXTExpertDetailOpinion between", value1, value2, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdetailopinionNotBetween(String value1, String value2) {
            addCriterion("BSXTExpertDetailOpinion not between", value1, value2, "bsxtexpertdetailopinion");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeIsNull() {
            addCriterion("BSXTExpertDeclareTime is null");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeIsNotNull() {
            addCriterion("BSXTExpertDeclareTime is not null");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeEqualTo(String value) {
            addCriterion("BSXTExpertDeclareTime =", value, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeNotEqualTo(String value) {
            addCriterion("BSXTExpertDeclareTime <>", value, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeGreaterThan(String value) {
            addCriterion("BSXTExpertDeclareTime >", value, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeGreaterThanOrEqualTo(String value) {
            addCriterion("BSXTExpertDeclareTime >=", value, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeLessThan(String value) {
            addCriterion("BSXTExpertDeclareTime <", value, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeLessThanOrEqualTo(String value) {
            addCriterion("BSXTExpertDeclareTime <=", value, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeLike(String value) {
            addCriterion("BSXTExpertDeclareTime like", value, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeNotLike(String value) {
            addCriterion("BSXTExpertDeclareTime not like", value, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeIn(List<String> values) {
            addCriterion("BSXTExpertDeclareTime in", values, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeNotIn(List<String> values) {
            addCriterion("BSXTExpertDeclareTime not in", values, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeBetween(String value1, String value2) {
            addCriterion("BSXTExpertDeclareTime between", value1, value2, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertdeclaretimeNotBetween(String value1, String value2) {
            addCriterion("BSXTExpertDeclareTime not between", value1, value2, "bsxtexpertdeclaretime");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrIsNull() {
            addCriterion("BSXTExpertSHR is null");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrIsNotNull() {
            addCriterion("BSXTExpertSHR is not null");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrEqualTo(String value) {
            addCriterion("BSXTExpertSHR =", value, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrNotEqualTo(String value) {
            addCriterion("BSXTExpertSHR <>", value, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrGreaterThan(String value) {
            addCriterion("BSXTExpertSHR >", value, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrGreaterThanOrEqualTo(String value) {
            addCriterion("BSXTExpertSHR >=", value, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrLessThan(String value) {
            addCriterion("BSXTExpertSHR <", value, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrLessThanOrEqualTo(String value) {
            addCriterion("BSXTExpertSHR <=", value, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrLike(String value) {
            addCriterion("BSXTExpertSHR like", value, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrNotLike(String value) {
            addCriterion("BSXTExpertSHR not like", value, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrIn(List<String> values) {
            addCriterion("BSXTExpertSHR in", values, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrNotIn(List<String> values) {
            addCriterion("BSXTExpertSHR not in", values, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrBetween(String value1, String value2) {
            addCriterion("BSXTExpertSHR between", value1, value2, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andBsxtexpertshrNotBetween(String value1, String value2) {
            addCriterion("BSXTExpertSHR not between", value1, value2, "bsxtexpertshr");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidIsNull() {
            addCriterion("ChooseStudentId is null");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidIsNotNull() {
            addCriterion("ChooseStudentId is not null");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidEqualTo(String value) {
            addCriterion("ChooseStudentId =", value, "choosestudentid");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidNotEqualTo(String value) {
            addCriterion("ChooseStudentId <>", value, "choosestudentid");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidGreaterThan(String value) {
            addCriterion("ChooseStudentId >", value, "choosestudentid");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidGreaterThanOrEqualTo(String value) {
            addCriterion("ChooseStudentId >=", value, "choosestudentid");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidLessThan(String value) {
            addCriterion("ChooseStudentId <", value, "choosestudentid");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidLessThanOrEqualTo(String value) {
            addCriterion("ChooseStudentId <=", value, "choosestudentid");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidLike(String value) {
            addCriterion("ChooseStudentId like", value, "choosestudentid");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidNotLike(String value) {
            addCriterion("ChooseStudentId not like", value, "choosestudentid");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidIn(List<String> values) {
            addCriterion("ChooseStudentId in", values, "choosestudentid");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidNotIn(List<String> values) {
            addCriterion("ChooseStudentId not in", values, "choosestudentid");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidBetween(String value1, String value2) {
            addCriterion("ChooseStudentId between", value1, value2, "choosestudentid");
            return (Criteria) this;
        }

        public Criteria andChoosestudentidNotBetween(String value1, String value2) {
            addCriterion("ChooseStudentId not between", value1, value2, "choosestudentid");
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