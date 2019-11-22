package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class ZqjcinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZqjcinfoExample() {
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

        public Criteria andZqjcinfoidIsNull() {
            addCriterion("ZQJCInfoId is null");
            return (Criteria) this;
        }

        public Criteria andZqjcinfoidIsNotNull() {
            addCriterion("ZQJCInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andZqjcinfoidEqualTo(Integer value) {
            addCriterion("ZQJCInfoId =", value, "zqjcinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcinfoidNotEqualTo(Integer value) {
            addCriterion("ZQJCInfoId <>", value, "zqjcinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcinfoidGreaterThan(Integer value) {
            addCriterion("ZQJCInfoId >", value, "zqjcinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZQJCInfoId >=", value, "zqjcinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcinfoidLessThan(Integer value) {
            addCriterion("ZQJCInfoId <", value, "zqjcinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("ZQJCInfoId <=", value, "zqjcinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcinfoidIn(List<Integer> values) {
            addCriterion("ZQJCInfoId in", values, "zqjcinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcinfoidNotIn(List<Integer> values) {
            addCriterion("ZQJCInfoId not in", values, "zqjcinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcinfoidBetween(Integer value1, Integer value2) {
            addCriterion("ZQJCInfoId between", value1, value2, "zqjcinfoid");
            return (Criteria) this;
        }

        public Criteria andZqjcinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZQJCInfoId not between", value1, value2, "zqjcinfoid");
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

        public Criteria andXtbhIsNull() {
            addCriterion("XTBH is null");
            return (Criteria) this;
        }

        public Criteria andXtbhIsNotNull() {
            addCriterion("XTBH is not null");
            return (Criteria) this;
        }

        public Criteria andXtbhEqualTo(String value) {
            addCriterion("XTBH =", value, "xtbh");
            return (Criteria) this;
        }

        public Criteria andXtbhNotEqualTo(String value) {
            addCriterion("XTBH <>", value, "xtbh");
            return (Criteria) this;
        }

        public Criteria andXtbhGreaterThan(String value) {
            addCriterion("XTBH >", value, "xtbh");
            return (Criteria) this;
        }

        public Criteria andXtbhGreaterThanOrEqualTo(String value) {
            addCriterion("XTBH >=", value, "xtbh");
            return (Criteria) this;
        }

        public Criteria andXtbhLessThan(String value) {
            addCriterion("XTBH <", value, "xtbh");
            return (Criteria) this;
        }

        public Criteria andXtbhLessThanOrEqualTo(String value) {
            addCriterion("XTBH <=", value, "xtbh");
            return (Criteria) this;
        }

        public Criteria andXtbhLike(String value) {
            addCriterion("XTBH like", value, "xtbh");
            return (Criteria) this;
        }

        public Criteria andXtbhNotLike(String value) {
            addCriterion("XTBH not like", value, "xtbh");
            return (Criteria) this;
        }

        public Criteria andXtbhIn(List<String> values) {
            addCriterion("XTBH in", values, "xtbh");
            return (Criteria) this;
        }

        public Criteria andXtbhNotIn(List<String> values) {
            addCriterion("XTBH not in", values, "xtbh");
            return (Criteria) this;
        }

        public Criteria andXtbhBetween(String value1, String value2) {
            addCriterion("XTBH between", value1, value2, "xtbh");
            return (Criteria) this;
        }

        public Criteria andXtbhNotBetween(String value1, String value2) {
            addCriterion("XTBH not between", value1, value2, "xtbh");
            return (Criteria) this;
        }

        public Criteria andSfyrytIsNull() {
            addCriterion("SFYRYT is null");
            return (Criteria) this;
        }

        public Criteria andSfyrytIsNotNull() {
            addCriterion("SFYRYT is not null");
            return (Criteria) this;
        }

        public Criteria andSfyrytEqualTo(String value) {
            addCriterion("SFYRYT =", value, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfyrytNotEqualTo(String value) {
            addCriterion("SFYRYT <>", value, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfyrytGreaterThan(String value) {
            addCriterion("SFYRYT >", value, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfyrytGreaterThanOrEqualTo(String value) {
            addCriterion("SFYRYT >=", value, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfyrytLessThan(String value) {
            addCriterion("SFYRYT <", value, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfyrytLessThanOrEqualTo(String value) {
            addCriterion("SFYRYT <=", value, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfyrytLike(String value) {
            addCriterion("SFYRYT like", value, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfyrytNotLike(String value) {
            addCriterion("SFYRYT not like", value, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfyrytIn(List<String> values) {
            addCriterion("SFYRYT in", values, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfyrytNotIn(List<String> values) {
            addCriterion("SFYRYT not in", values, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfyrytBetween(String value1, String value2) {
            addCriterion("SFYRYT between", value1, value2, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfyrytNotBetween(String value1, String value2) {
            addCriterion("SFYRYT not between", value1, value2, "sfyryt");
            return (Criteria) this;
        }

        public Criteria andSfktbgIsNull() {
            addCriterion("SFKTBG is null");
            return (Criteria) this;
        }

        public Criteria andSfktbgIsNotNull() {
            addCriterion("SFKTBG is not null");
            return (Criteria) this;
        }

        public Criteria andSfktbgEqualTo(String value) {
            addCriterion("SFKTBG =", value, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfktbgNotEqualTo(String value) {
            addCriterion("SFKTBG <>", value, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfktbgGreaterThan(String value) {
            addCriterion("SFKTBG >", value, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfktbgGreaterThanOrEqualTo(String value) {
            addCriterion("SFKTBG >=", value, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfktbgLessThan(String value) {
            addCriterion("SFKTBG <", value, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfktbgLessThanOrEqualTo(String value) {
            addCriterion("SFKTBG <=", value, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfktbgLike(String value) {
            addCriterion("SFKTBG like", value, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfktbgNotLike(String value) {
            addCriterion("SFKTBG not like", value, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfktbgIn(List<String> values) {
            addCriterion("SFKTBG in", values, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfktbgNotIn(List<String> values) {
            addCriterion("SFKTBG not in", values, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfktbgBetween(String value1, String value2) {
            addCriterion("SFKTBG between", value1, value2, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfktbgNotBetween(String value1, String value2) {
            addCriterion("SFKTBG not between", value1, value2, "sfktbg");
            return (Criteria) this;
        }

        public Criteria andSfwxzsIsNull() {
            addCriterion("SFWXZS is null");
            return (Criteria) this;
        }

        public Criteria andSfwxzsIsNotNull() {
            addCriterion("SFWXZS is not null");
            return (Criteria) this;
        }

        public Criteria andSfwxzsEqualTo(String value) {
            addCriterion("SFWXZS =", value, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andSfwxzsNotEqualTo(String value) {
            addCriterion("SFWXZS <>", value, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andSfwxzsGreaterThan(String value) {
            addCriterion("SFWXZS >", value, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andSfwxzsGreaterThanOrEqualTo(String value) {
            addCriterion("SFWXZS >=", value, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andSfwxzsLessThan(String value) {
            addCriterion("SFWXZS <", value, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andSfwxzsLessThanOrEqualTo(String value) {
            addCriterion("SFWXZS <=", value, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andSfwxzsLike(String value) {
            addCriterion("SFWXZS like", value, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andSfwxzsNotLike(String value) {
            addCriterion("SFWXZS not like", value, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andSfwxzsIn(List<String> values) {
            addCriterion("SFWXZS in", values, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andSfwxzsNotIn(List<String> values) {
            addCriterion("SFWXZS not in", values, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andSfwxzsBetween(String value1, String value2) {
            addCriterion("SFWXZS between", value1, value2, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andSfwxzsNotBetween(String value1, String value2) {
            addCriterion("SFWXZS not between", value1, value2, "sfwxzs");
            return (Criteria) this;
        }

        public Criteria andJdqkIsNull() {
            addCriterion("JDQK is null");
            return (Criteria) this;
        }

        public Criteria andJdqkIsNotNull() {
            addCriterion("JDQK is not null");
            return (Criteria) this;
        }

        public Criteria andJdqkEqualTo(String value) {
            addCriterion("JDQK =", value, "jdqk");
            return (Criteria) this;
        }

        public Criteria andJdqkNotEqualTo(String value) {
            addCriterion("JDQK <>", value, "jdqk");
            return (Criteria) this;
        }

        public Criteria andJdqkGreaterThan(String value) {
            addCriterion("JDQK >", value, "jdqk");
            return (Criteria) this;
        }

        public Criteria andJdqkGreaterThanOrEqualTo(String value) {
            addCriterion("JDQK >=", value, "jdqk");
            return (Criteria) this;
        }

        public Criteria andJdqkLessThan(String value) {
            addCriterion("JDQK <", value, "jdqk");
            return (Criteria) this;
        }

        public Criteria andJdqkLessThanOrEqualTo(String value) {
            addCriterion("JDQK <=", value, "jdqk");
            return (Criteria) this;
        }

        public Criteria andJdqkLike(String value) {
            addCriterion("JDQK like", value, "jdqk");
            return (Criteria) this;
        }

        public Criteria andJdqkNotLike(String value) {
            addCriterion("JDQK not like", value, "jdqk");
            return (Criteria) this;
        }

        public Criteria andJdqkIn(List<String> values) {
            addCriterion("JDQK in", values, "jdqk");
            return (Criteria) this;
        }

        public Criteria andJdqkNotIn(List<String> values) {
            addCriterion("JDQK not in", values, "jdqk");
            return (Criteria) this;
        }

        public Criteria andJdqkBetween(String value1, String value2) {
            addCriterion("JDQK between", value1, value2, "jdqk");
            return (Criteria) this;
        }

        public Criteria andJdqkNotBetween(String value1, String value2) {
            addCriterion("JDQK not between", value1, value2, "jdqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkIsNull() {
            addCriterion("GZZTQK is null");
            return (Criteria) this;
        }

        public Criteria andGzztqkIsNotNull() {
            addCriterion("GZZTQK is not null");
            return (Criteria) this;
        }

        public Criteria andGzztqkEqualTo(String value) {
            addCriterion("GZZTQK =", value, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkNotEqualTo(String value) {
            addCriterion("GZZTQK <>", value, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkGreaterThan(String value) {
            addCriterion("GZZTQK >", value, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkGreaterThanOrEqualTo(String value) {
            addCriterion("GZZTQK >=", value, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkLessThan(String value) {
            addCriterion("GZZTQK <", value, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkLessThanOrEqualTo(String value) {
            addCriterion("GZZTQK <=", value, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkLike(String value) {
            addCriterion("GZZTQK like", value, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkNotLike(String value) {
            addCriterion("GZZTQK not like", value, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkIn(List<String> values) {
            addCriterion("GZZTQK in", values, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkNotIn(List<String> values) {
            addCriterion("GZZTQK not in", values, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkBetween(String value1, String value2) {
            addCriterion("GZZTQK between", value1, value2, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andGzztqkNotBetween(String value1, String value2) {
            addCriterion("GZZTQK not between", value1, value2, "gzztqk");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlIsNull() {
            addCriterion("CYWXZLNL is null");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlIsNotNull() {
            addCriterion("CYWXZLNL is not null");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlEqualTo(String value) {
            addCriterion("CYWXZLNL =", value, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlNotEqualTo(String value) {
            addCriterion("CYWXZLNL <>", value, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlGreaterThan(String value) {
            addCriterion("CYWXZLNL >", value, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlGreaterThanOrEqualTo(String value) {
            addCriterion("CYWXZLNL >=", value, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlLessThan(String value) {
            addCriterion("CYWXZLNL <", value, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlLessThanOrEqualTo(String value) {
            addCriterion("CYWXZLNL <=", value, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlLike(String value) {
            addCriterion("CYWXZLNL like", value, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlNotLike(String value) {
            addCriterion("CYWXZLNL not like", value, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlIn(List<String> values) {
            addCriterion("CYWXZLNL in", values, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlNotIn(List<String> values) {
            addCriterion("CYWXZLNL not in", values, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlBetween(String value1, String value2) {
            addCriterion("CYWXZLNL between", value1, value2, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andCywxzlnlNotBetween(String value1, String value2) {
            addCriterion("CYWXZLNL not between", value1, value2, "cywxzlnl");
            return (Criteria) this;
        }

        public Criteria andZqzlpjIsNull() {
            addCriterion("ZQZLPJ is null");
            return (Criteria) this;
        }

        public Criteria andZqzlpjIsNotNull() {
            addCriterion("ZQZLPJ is not null");
            return (Criteria) this;
        }

        public Criteria andZqzlpjEqualTo(String value) {
            addCriterion("ZQZLPJ =", value, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andZqzlpjNotEqualTo(String value) {
            addCriterion("ZQZLPJ <>", value, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andZqzlpjGreaterThan(String value) {
            addCriterion("ZQZLPJ >", value, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andZqzlpjGreaterThanOrEqualTo(String value) {
            addCriterion("ZQZLPJ >=", value, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andZqzlpjLessThan(String value) {
            addCriterion("ZQZLPJ <", value, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andZqzlpjLessThanOrEqualTo(String value) {
            addCriterion("ZQZLPJ <=", value, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andZqzlpjLike(String value) {
            addCriterion("ZQZLPJ like", value, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andZqzlpjNotLike(String value) {
            addCriterion("ZQZLPJ not like", value, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andZqzlpjIn(List<String> values) {
            addCriterion("ZQZLPJ in", values, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andZqzlpjNotIn(List<String> values) {
            addCriterion("ZQZLPJ not in", values, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andZqzlpjBetween(String value1, String value2) {
            addCriterion("ZQZLPJ between", value1, value2, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andZqzlpjNotBetween(String value1, String value2) {
            addCriterion("ZQZLPJ not between", value1, value2, "zqzlpj");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzIsNull() {
            addCriterion("BYLWNRTZ is null");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzIsNotNull() {
            addCriterion("BYLWNRTZ is not null");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzEqualTo(String value) {
            addCriterion("BYLWNRTZ =", value, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzNotEqualTo(String value) {
            addCriterion("BYLWNRTZ <>", value, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzGreaterThan(String value) {
            addCriterion("BYLWNRTZ >", value, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzGreaterThanOrEqualTo(String value) {
            addCriterion("BYLWNRTZ >=", value, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzLessThan(String value) {
            addCriterion("BYLWNRTZ <", value, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzLessThanOrEqualTo(String value) {
            addCriterion("BYLWNRTZ <=", value, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzLike(String value) {
            addCriterion("BYLWNRTZ like", value, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzNotLike(String value) {
            addCriterion("BYLWNRTZ not like", value, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzIn(List<String> values) {
            addCriterion("BYLWNRTZ in", values, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzNotIn(List<String> values) {
            addCriterion("BYLWNRTZ not in", values, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzBetween(String value1, String value2) {
            addCriterion("BYLWNRTZ between", value1, value2, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andBylwnrtzNotBetween(String value1, String value2) {
            addCriterion("BYLWNRTZ not between", value1, value2, "bylwnrtz");
            return (Criteria) this;
        }

        public Criteria andZdcsIsNull() {
            addCriterion("ZDCS is null");
            return (Criteria) this;
        }

        public Criteria andZdcsIsNotNull() {
            addCriterion("ZDCS is not null");
            return (Criteria) this;
        }

        public Criteria andZdcsEqualTo(String value) {
            addCriterion("ZDCS =", value, "zdcs");
            return (Criteria) this;
        }

        public Criteria andZdcsNotEqualTo(String value) {
            addCriterion("ZDCS <>", value, "zdcs");
            return (Criteria) this;
        }

        public Criteria andZdcsGreaterThan(String value) {
            addCriterion("ZDCS >", value, "zdcs");
            return (Criteria) this;
        }

        public Criteria andZdcsGreaterThanOrEqualTo(String value) {
            addCriterion("ZDCS >=", value, "zdcs");
            return (Criteria) this;
        }

        public Criteria andZdcsLessThan(String value) {
            addCriterion("ZDCS <", value, "zdcs");
            return (Criteria) this;
        }

        public Criteria andZdcsLessThanOrEqualTo(String value) {
            addCriterion("ZDCS <=", value, "zdcs");
            return (Criteria) this;
        }

        public Criteria andZdcsLike(String value) {
            addCriterion("ZDCS like", value, "zdcs");
            return (Criteria) this;
        }

        public Criteria andZdcsNotLike(String value) {
            addCriterion("ZDCS not like", value, "zdcs");
            return (Criteria) this;
        }

        public Criteria andZdcsIn(List<String> values) {
            addCriterion("ZDCS in", values, "zdcs");
            return (Criteria) this;
        }

        public Criteria andZdcsNotIn(List<String> values) {
            addCriterion("ZDCS not in", values, "zdcs");
            return (Criteria) this;
        }

        public Criteria andZdcsBetween(String value1, String value2) {
            addCriterion("ZDCS between", value1, value2, "zdcs");
            return (Criteria) this;
        }

        public Criteria andZdcsNotBetween(String value1, String value2) {
            addCriterion("ZDCS not between", value1, value2, "zdcs");
            return (Criteria) this;
        }

        public Criteria andAqwcIsNull() {
            addCriterion("AQWC is null");
            return (Criteria) this;
        }

        public Criteria andAqwcIsNotNull() {
            addCriterion("AQWC is not null");
            return (Criteria) this;
        }

        public Criteria andAqwcEqualTo(String value) {
            addCriterion("AQWC =", value, "aqwc");
            return (Criteria) this;
        }

        public Criteria andAqwcNotEqualTo(String value) {
            addCriterion("AQWC <>", value, "aqwc");
            return (Criteria) this;
        }

        public Criteria andAqwcGreaterThan(String value) {
            addCriterion("AQWC >", value, "aqwc");
            return (Criteria) this;
        }

        public Criteria andAqwcGreaterThanOrEqualTo(String value) {
            addCriterion("AQWC >=", value, "aqwc");
            return (Criteria) this;
        }

        public Criteria andAqwcLessThan(String value) {
            addCriterion("AQWC <", value, "aqwc");
            return (Criteria) this;
        }

        public Criteria andAqwcLessThanOrEqualTo(String value) {
            addCriterion("AQWC <=", value, "aqwc");
            return (Criteria) this;
        }

        public Criteria andAqwcLike(String value) {
            addCriterion("AQWC like", value, "aqwc");
            return (Criteria) this;
        }

        public Criteria andAqwcNotLike(String value) {
            addCriterion("AQWC not like", value, "aqwc");
            return (Criteria) this;
        }

        public Criteria andAqwcIn(List<String> values) {
            addCriterion("AQWC in", values, "aqwc");
            return (Criteria) this;
        }

        public Criteria andAqwcNotIn(List<String> values) {
            addCriterion("AQWC not in", values, "aqwc");
            return (Criteria) this;
        }

        public Criteria andAqwcBetween(String value1, String value2) {
            addCriterion("AQWC between", value1, value2, "aqwc");
            return (Criteria) this;
        }

        public Criteria andAqwcNotBetween(String value1, String value2) {
            addCriterion("AQWC not between", value1, value2, "aqwc");
            return (Criteria) this;
        }

        public Criteria andYsclIsNull() {
            addCriterion("YSCL is null");
            return (Criteria) this;
        }

        public Criteria andYsclIsNotNull() {
            addCriterion("YSCL is not null");
            return (Criteria) this;
        }

        public Criteria andYsclEqualTo(String value) {
            addCriterion("YSCL =", value, "yscl");
            return (Criteria) this;
        }

        public Criteria andYsclNotEqualTo(String value) {
            addCriterion("YSCL <>", value, "yscl");
            return (Criteria) this;
        }

        public Criteria andYsclGreaterThan(String value) {
            addCriterion("YSCL >", value, "yscl");
            return (Criteria) this;
        }

        public Criteria andYsclGreaterThanOrEqualTo(String value) {
            addCriterion("YSCL >=", value, "yscl");
            return (Criteria) this;
        }

        public Criteria andYsclLessThan(String value) {
            addCriterion("YSCL <", value, "yscl");
            return (Criteria) this;
        }

        public Criteria andYsclLessThanOrEqualTo(String value) {
            addCriterion("YSCL <=", value, "yscl");
            return (Criteria) this;
        }

        public Criteria andYsclLike(String value) {
            addCriterion("YSCL like", value, "yscl");
            return (Criteria) this;
        }

        public Criteria andYsclNotLike(String value) {
            addCriterion("YSCL not like", value, "yscl");
            return (Criteria) this;
        }

        public Criteria andYsclIn(List<String> values) {
            addCriterion("YSCL in", values, "yscl");
            return (Criteria) this;
        }

        public Criteria andYsclNotIn(List<String> values) {
            addCriterion("YSCL not in", values, "yscl");
            return (Criteria) this;
        }

        public Criteria andYsclBetween(String value1, String value2) {
            addCriterion("YSCL between", value1, value2, "yscl");
            return (Criteria) this;
        }

        public Criteria andYsclNotBetween(String value1, String value2) {
            addCriterion("YSCL not between", value1, value2, "yscl");
            return (Criteria) this;
        }

        public Criteria andFjnameIsNull() {
            addCriterion("FJName is null");
            return (Criteria) this;
        }

        public Criteria andFjnameIsNotNull() {
            addCriterion("FJName is not null");
            return (Criteria) this;
        }

        public Criteria andFjnameEqualTo(String value) {
            addCriterion("FJName =", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotEqualTo(String value) {
            addCriterion("FJName <>", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameGreaterThan(String value) {
            addCriterion("FJName >", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameGreaterThanOrEqualTo(String value) {
            addCriterion("FJName >=", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLessThan(String value) {
            addCriterion("FJName <", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLessThanOrEqualTo(String value) {
            addCriterion("FJName <=", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLike(String value) {
            addCriterion("FJName like", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotLike(String value) {
            addCriterion("FJName not like", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameIn(List<String> values) {
            addCriterion("FJName in", values, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotIn(List<String> values) {
            addCriterion("FJName not in", values, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameBetween(String value1, String value2) {
            addCriterion("FJName between", value1, value2, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotBetween(String value1, String value2) {
            addCriterion("FJName not between", value1, value2, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjpathIsNull() {
            addCriterion("FJPath is null");
            return (Criteria) this;
        }

        public Criteria andFjpathIsNotNull() {
            addCriterion("FJPath is not null");
            return (Criteria) this;
        }

        public Criteria andFjpathEqualTo(String value) {
            addCriterion("FJPath =", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotEqualTo(String value) {
            addCriterion("FJPath <>", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathGreaterThan(String value) {
            addCriterion("FJPath >", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathGreaterThanOrEqualTo(String value) {
            addCriterion("FJPath >=", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathLessThan(String value) {
            addCriterion("FJPath <", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathLessThanOrEqualTo(String value) {
            addCriterion("FJPath <=", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathLike(String value) {
            addCriterion("FJPath like", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotLike(String value) {
            addCriterion("FJPath not like", value, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathIn(List<String> values) {
            addCriterion("FJPath in", values, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotIn(List<String> values) {
            addCriterion("FJPath not in", values, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathBetween(String value1, String value2) {
            addCriterion("FJPath between", value1, value2, "fjpath");
            return (Criteria) this;
        }

        public Criteria andFjpathNotBetween(String value1, String value2) {
            addCriterion("FJPath not between", value1, value2, "fjpath");
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