package com.example.wale.whalessupport.Utilities.Api.Models;

import com.google.gson.Gson;

public class Login {

    /**
     * status : 1
     * message : Success
     * data : {"id":6,"student_id":91177339,"full_name":"Wale Whales","school_id":32,"department_id":324,"courses_id":"99","level_id":500,"semester_id":2,"matric_number":"P/ND/3210073","phone":"09057458888","date_of_birth":"1992-04-29","email":"kola.victor@yahoo.com","password":"eyJpdiI6IlJ1cXYzWXRUVWhrQlVWblwvXC9lbEtEUT09IiwidmFsdWUiOiJWNmRaeUNzYmJHN1dwejBjbGxvZ2N3PT0iLCJtYWMiOiJkNGY2MjA5NzM5MDI2NGVkOWM5MGMyZGY0OWZmNDQ4OTIyZmY0YmY3M2NhMmY3MTA1ZTQ3MDU2ZDg2ZjZmYWJhIn0=","token_id":4747776,"avatar":"users/default.png","created_at":"2018-11-30 00:47:02","updated_at":"2018-11-30 00:47:02","deleted_at":null}
     */

    private int status;
    private String message;
    private DataBean data;

    public static Login objectFromData(String str) {

        return new Gson().fromJson(str, Login.class);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 6
         * student_id : 91177339
         * full_name : Wale Whales
         * school_id : 32
         * department_id : 324
         * courses_id : 99
         * level_id : 500
         * semester_id : 2
         * matric_number : P/ND/3210073
         * phone : 09057458888
         * date_of_birth : 1992-04-29
         * email : kola.victor@yahoo.com
         * password : eyJpdiI6IlJ1cXYzWXRUVWhrQlVWblwvXC9lbEtEUT09IiwidmFsdWUiOiJWNmRaeUNzYmJHN1dwejBjbGxvZ2N3PT0iLCJtYWMiOiJkNGY2MjA5NzM5MDI2NGVkOWM5MGMyZGY0OWZmNDQ4OTIyZmY0YmY3M2NhMmY3MTA1ZTQ3MDU2ZDg2ZjZmYWJhIn0=
         * token_id : 4747776
         * avatar : users/default.png
         * created_at : 2018-11-30 00:47:02
         * updated_at : 2018-11-30 00:47:02
         * deleted_at : null
         */

        private int id;
        private int student_id;
        private String full_name;
        private int school_id;
        private int department_id;
        private String courses_id;
        private int level_id;
        private int semester_id;
        private String matric_number;
        private String phone;
        private String date_of_birth;
        private String email;
        private String password;
        private int token_id;
        private String avatar;
        private String created_at;
        private String updated_at;
        private Object deleted_at;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getStudent_id() {
            return student_id;
        }

        public void setStudent_id(int student_id) {
            this.student_id = student_id;
        }

        public String getFull_name() {
            return full_name;
        }

        public void setFull_name(String full_name) {
            this.full_name = full_name;
        }

        public int getSchool_id() {
            return school_id;
        }

        public void setSchool_id(int school_id) {
            this.school_id = school_id;
        }

        public int getDepartment_id() {
            return department_id;
        }

        public void setDepartment_id(int department_id) {
            this.department_id = department_id;
        }

        public String getCourses_id() {
            return courses_id;
        }

        public void setCourses_id(String courses_id) {
            this.courses_id = courses_id;
        }

        public int getLevel_id() {
            return level_id;
        }

        public void setLevel_id(int level_id) {
            this.level_id = level_id;
        }

        public int getSemester_id() {
            return semester_id;
        }

        public void setSemester_id(int semester_id) {
            this.semester_id = semester_id;
        }

        public String getMatric_number() {
            return matric_number;
        }

        public void setMatric_number(String matric_number) {
            this.matric_number = matric_number;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getDate_of_birth() {
            return date_of_birth;
        }

        public void setDate_of_birth(String date_of_birth) {
            this.date_of_birth = date_of_birth;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getToken_id() {
            return token_id;
        }

        public void setToken_id(int token_id) {
            this.token_id = token_id;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }
    }
}
