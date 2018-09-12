package com.mobitant.bestfood.model;


import com.google.gson.annotations.SerializedName;

public class User {
//응답받는 json객체값이 순서대로 저장되는건지??
    public String name;
    private String email;
    private String password;
    private String created_at;
    private String newPassword;
    private String token;
    @SerializedName("nickname") public String nickname;
    public int seq;
    public String phone;
    public String sextype;
    public String birthday;
    @SerializedName("member_icon_filename") public String memberIconFilename;
    @SerializedName("reg_date") public String regDate;

    public String toString() {
        return "User{" +
                "seq=" + seq +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", sextype='" + sextype + '\'' +
                ", birthday='" + birthday + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
    public void setSextype(String sex){ this.sextype = sex;}
    public void setBirthday(String birth){ this.birthday = birth;}
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setNickName(String nickname){this.nickname = nickname;}
}