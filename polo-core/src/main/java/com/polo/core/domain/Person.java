package com.polo.core.domain;

public class Person {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Person.id
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Person.name
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Person.age
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Person.sex
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    private String sex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Person.id
     *
     * @return the value of Person.id
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Person.id
     *
     * @param id the value for Person.id
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Person.name
     *
     * @return the value of Person.name
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Person.name
     *
     * @param name the value for Person.name
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Person.age
     *
     * @return the value of Person.age
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Person.age
     *
     * @param age the value for Person.age
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Person.sex
     *
     * @return the value of Person.sex
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Person.sex
     *
     * @param sex the value for Person.sex
     *
     * @mbggenerated Tue Dec 26 17:08:16 CST 2017
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}