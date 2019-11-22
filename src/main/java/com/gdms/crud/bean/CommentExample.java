package com.gdms.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("CommentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("CommentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("CommentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("CommentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("CommentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("CommentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("CommentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("CommentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("CommentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("CommentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentId not between", value1, value2, "commentid");
            return (Criteria) this;
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

        public Criteria andCommenttimeIsNull() {
            addCriterion("CommentTime is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("CommentTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(String value) {
            addCriterion("CommentTime =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(String value) {
            addCriterion("CommentTime <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(String value) {
            addCriterion("CommentTime >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("CommentTime >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(String value) {
            addCriterion("CommentTime <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(String value) {
            addCriterion("CommentTime <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLike(String value) {
            addCriterion("CommentTime like", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotLike(String value) {
            addCriterion("CommentTime not like", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<String> values) {
            addCriterion("CommentTime in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<String> values) {
            addCriterion("CommentTime not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(String value1, String value2) {
            addCriterion("CommentTime between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(String value1, String value2) {
            addCriterion("CommentTime not between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andRevieweridIsNull() {
            addCriterion("ReviewerId is null");
            return (Criteria) this;
        }

        public Criteria andRevieweridIsNotNull() {
            addCriterion("ReviewerId is not null");
            return (Criteria) this;
        }

        public Criteria andRevieweridEqualTo(String value) {
            addCriterion("ReviewerId =", value, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andRevieweridNotEqualTo(String value) {
            addCriterion("ReviewerId <>", value, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andRevieweridGreaterThan(String value) {
            addCriterion("ReviewerId >", value, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andRevieweridGreaterThanOrEqualTo(String value) {
            addCriterion("ReviewerId >=", value, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andRevieweridLessThan(String value) {
            addCriterion("ReviewerId <", value, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andRevieweridLessThanOrEqualTo(String value) {
            addCriterion("ReviewerId <=", value, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andRevieweridLike(String value) {
            addCriterion("ReviewerId like", value, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andRevieweridNotLike(String value) {
            addCriterion("ReviewerId not like", value, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andRevieweridIn(List<String> values) {
            addCriterion("ReviewerId in", values, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andRevieweridNotIn(List<String> values) {
            addCriterion("ReviewerId not in", values, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andRevieweridBetween(String value1, String value2) {
            addCriterion("ReviewerId between", value1, value2, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andRevieweridNotBetween(String value1, String value2) {
            addCriterion("ReviewerId not between", value1, value2, "reviewerid");
            return (Criteria) this;
        }

        public Criteria andAgreenumIsNull() {
            addCriterion("AgreeNum is null");
            return (Criteria) this;
        }

        public Criteria andAgreenumIsNotNull() {
            addCriterion("AgreeNum is not null");
            return (Criteria) this;
        }

        public Criteria andAgreenumEqualTo(Integer value) {
            addCriterion("AgreeNum =", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumNotEqualTo(Integer value) {
            addCriterion("AgreeNum <>", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumGreaterThan(Integer value) {
            addCriterion("AgreeNum >", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("AgreeNum >=", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumLessThan(Integer value) {
            addCriterion("AgreeNum <", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumLessThanOrEqualTo(Integer value) {
            addCriterion("AgreeNum <=", value, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumIn(List<Integer> values) {
            addCriterion("AgreeNum in", values, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumNotIn(List<Integer> values) {
            addCriterion("AgreeNum not in", values, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumBetween(Integer value1, Integer value2) {
            addCriterion("AgreeNum between", value1, value2, "agreenum");
            return (Criteria) this;
        }

        public Criteria andAgreenumNotBetween(Integer value1, Integer value2) {
            addCriterion("AgreeNum not between", value1, value2, "agreenum");
            return (Criteria) this;
        }

        public Criteria andDisagreenumIsNull() {
            addCriterion("DisagreeNum is null");
            return (Criteria) this;
        }

        public Criteria andDisagreenumIsNotNull() {
            addCriterion("DisagreeNum is not null");
            return (Criteria) this;
        }

        public Criteria andDisagreenumEqualTo(Integer value) {
            addCriterion("DisagreeNum =", value, "disagreenum");
            return (Criteria) this;
        }

        public Criteria andDisagreenumNotEqualTo(Integer value) {
            addCriterion("DisagreeNum <>", value, "disagreenum");
            return (Criteria) this;
        }

        public Criteria andDisagreenumGreaterThan(Integer value) {
            addCriterion("DisagreeNum >", value, "disagreenum");
            return (Criteria) this;
        }

        public Criteria andDisagreenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("DisagreeNum >=", value, "disagreenum");
            return (Criteria) this;
        }

        public Criteria andDisagreenumLessThan(Integer value) {
            addCriterion("DisagreeNum <", value, "disagreenum");
            return (Criteria) this;
        }

        public Criteria andDisagreenumLessThanOrEqualTo(Integer value) {
            addCriterion("DisagreeNum <=", value, "disagreenum");
            return (Criteria) this;
        }

        public Criteria andDisagreenumIn(List<Integer> values) {
            addCriterion("DisagreeNum in", values, "disagreenum");
            return (Criteria) this;
        }

        public Criteria andDisagreenumNotIn(List<Integer> values) {
            addCriterion("DisagreeNum not in", values, "disagreenum");
            return (Criteria) this;
        }

        public Criteria andDisagreenumBetween(Integer value1, Integer value2) {
            addCriterion("DisagreeNum between", value1, value2, "disagreenum");
            return (Criteria) this;
        }

        public Criteria andDisagreenumNotBetween(Integer value1, Integer value2) {
            addCriterion("DisagreeNum not between", value1, value2, "disagreenum");
            return (Criteria) this;
        }

        public Criteria andReviewersfIsNull() {
            addCriterion("ReviewerSF is null");
            return (Criteria) this;
        }

        public Criteria andReviewersfIsNotNull() {
            addCriterion("ReviewerSF is not null");
            return (Criteria) this;
        }

        public Criteria andReviewersfEqualTo(String value) {
            addCriterion("ReviewerSF =", value, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReviewersfNotEqualTo(String value) {
            addCriterion("ReviewerSF <>", value, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReviewersfGreaterThan(String value) {
            addCriterion("ReviewerSF >", value, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReviewersfGreaterThanOrEqualTo(String value) {
            addCriterion("ReviewerSF >=", value, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReviewersfLessThan(String value) {
            addCriterion("ReviewerSF <", value, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReviewersfLessThanOrEqualTo(String value) {
            addCriterion("ReviewerSF <=", value, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReviewersfLike(String value) {
            addCriterion("ReviewerSF like", value, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReviewersfNotLike(String value) {
            addCriterion("ReviewerSF not like", value, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReviewersfIn(List<String> values) {
            addCriterion("ReviewerSF in", values, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReviewersfNotIn(List<String> values) {
            addCriterion("ReviewerSF not in", values, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReviewersfBetween(String value1, String value2) {
            addCriterion("ReviewerSF between", value1, value2, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReviewersfNotBetween(String value1, String value2) {
            addCriterion("ReviewerSF not between", value1, value2, "reviewersf");
            return (Criteria) this;
        }

        public Criteria andReadstatusIsNull() {
            addCriterion("ReadStatus is null");
            return (Criteria) this;
        }

        public Criteria andReadstatusIsNotNull() {
            addCriterion("ReadStatus is not null");
            return (Criteria) this;
        }

        public Criteria andReadstatusEqualTo(Integer value) {
            addCriterion("ReadStatus =", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusNotEqualTo(Integer value) {
            addCriterion("ReadStatus <>", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusGreaterThan(Integer value) {
            addCriterion("ReadStatus >", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReadStatus >=", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusLessThan(Integer value) {
            addCriterion("ReadStatus <", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ReadStatus <=", value, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusIn(List<Integer> values) {
            addCriterion("ReadStatus in", values, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusNotIn(List<Integer> values) {
            addCriterion("ReadStatus not in", values, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusBetween(Integer value1, Integer value2) {
            addCriterion("ReadStatus between", value1, value2, "readstatus");
            return (Criteria) this;
        }

        public Criteria andReadstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ReadStatus not between", value1, value2, "readstatus");
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