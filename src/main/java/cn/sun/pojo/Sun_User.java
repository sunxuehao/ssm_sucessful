package cn.sun.pojo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;

public class Sun_User {
    private Integer id;
    @NotBlank(message = "Name不能为空")
    private String name;
    @Length(min = 3,max = 6,message = "密码长度在3~16位之间")
    private String password;
    @Range(min = 0,max = 150,message = "年龄必须在0~150岁之间")
    private Integer age;

    public Sun_User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
