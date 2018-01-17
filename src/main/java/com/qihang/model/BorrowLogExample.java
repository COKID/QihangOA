package com.qihang.model;

import java.util.ArrayList;
import java.util.List;

public class BorrowLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowLogExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBorrowNameIsNull() {
            addCriterion("borrow_name is null");
            return (Criteria) this;
        }

        public Criteria andBorrowNameIsNotNull() {
            addCriterion("borrow_name is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowNameEqualTo(String value) {
            addCriterion("borrow_name =", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameNotEqualTo(String value) {
            addCriterion("borrow_name <>", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameGreaterThan(String value) {
            addCriterion("borrow_name >", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_name >=", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameLessThan(String value) {
            addCriterion("borrow_name <", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameLessThanOrEqualTo(String value) {
            addCriterion("borrow_name <=", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameLike(String value) {
            addCriterion("borrow_name like", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameNotLike(String value) {
            addCriterion("borrow_name not like", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameIn(List<String> values) {
            addCriterion("borrow_name in", values, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameNotIn(List<String> values) {
            addCriterion("borrow_name not in", values, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameBetween(String value1, String value2) {
            addCriterion("borrow_name between", value1, value2, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameNotBetween(String value1, String value2) {
            addCriterion("borrow_name not between", value1, value2, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIsNull() {
            addCriterion("borrow_user is null");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIsNotNull() {
            addCriterion("borrow_user is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowUserEqualTo(String value) {
            addCriterion("borrow_user =", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserNotEqualTo(String value) {
            addCriterion("borrow_user <>", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserGreaterThan(String value) {
            addCriterion("borrow_user >", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_user >=", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserLessThan(String value) {
            addCriterion("borrow_user <", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserLessThanOrEqualTo(String value) {
            addCriterion("borrow_user <=", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserLike(String value) {
            addCriterion("borrow_user like", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserNotLike(String value) {
            addCriterion("borrow_user not like", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIn(List<String> values) {
            addCriterion("borrow_user in", values, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserNotIn(List<String> values) {
            addCriterion("borrow_user not in", values, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserBetween(String value1, String value2) {
            addCriterion("borrow_user between", value1, value2, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserNotBetween(String value1, String value2) {
            addCriterion("borrow_user not between", value1, value2, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIsNull() {
            addCriterion("borrow_date is null");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIsNotNull() {
            addCriterion("borrow_date is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowDateEqualTo(String value) {
            addCriterion("borrow_date =", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotEqualTo(String value) {
            addCriterion("borrow_date <>", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateGreaterThan(String value) {
            addCriterion("borrow_date >", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_date >=", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateLessThan(String value) {
            addCriterion("borrow_date <", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateLessThanOrEqualTo(String value) {
            addCriterion("borrow_date <=", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateLike(String value) {
            addCriterion("borrow_date like", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotLike(String value) {
            addCriterion("borrow_date not like", value, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateIn(List<String> values) {
            addCriterion("borrow_date in", values, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotIn(List<String> values) {
            addCriterion("borrow_date not in", values, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateBetween(String value1, String value2) {
            addCriterion("borrow_date between", value1, value2, "borrowDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDateNotBetween(String value1, String value2) {
            addCriterion("borrow_date not between", value1, value2, "borrowDate");
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