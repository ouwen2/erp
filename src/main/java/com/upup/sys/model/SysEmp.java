package com.upup.sys.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ToString
public class SysEmp {
    private Integer uuid;

    private String username;

    private String pwd;

    private String salt;

    private String name;

    private Integer gender;

    private String email;

    private String tele;

    private String address;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private Integer depuuid;

    private String display;

    private Boolean isPassword;

    public SysEmp(Integer uuid, String username, String pwd, String salt, String name, Integer gender, String email, String tele, String address, Date birthday, Integer depuuid, String display, Boolean isPassword) {
        this.uuid = uuid;
        this.username = username;
        this.pwd = pwd;
        this.salt = salt;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.tele = tele;
        this.address = address;
        this.birthday = birthday;
        this.depuuid = depuuid;
        this.display = display;
        this.isPassword = isPassword;
    }

    public SysEmp() {
        super();
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getDepuuid() {
        return depuuid;
    }

    public void setDepuuid(Integer depuuid) {
        this.depuuid = depuuid;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Boolean getIsPassword() {
        return isPassword;
    }

    public void setIsPassword(Boolean isPassword) {
        this.isPassword = isPassword;
    }
}