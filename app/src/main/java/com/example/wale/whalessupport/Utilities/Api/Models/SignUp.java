package com.example.wale.whalessupport.Utilities.Api.Models;

import com.google.gson.Gson;

public class SignUp {

    /**
     * status : 1
     * message : Successfully Registered
     * data : {"student_id":91177339,"full_name":"Wale Whales","school_id":"32","courses_id":"99","department_id":"324","level_id":"500","semester_id":"2","matric_number":"P/ND/3210073","phone":"09057458888","date_of_birth":{"date":"1992-04-29 00:00:00.000000","timezone_type":3,"timezone":"UTC"},"email":"kola.victor@yahoo.com","password":"eyJpdiI6IlJ1cXYzWXRUVWhrQlVWblwvXC9lbEtEUT09IiwidmFsdWUiOiJWNmRaeUNzYmJHN1dwejBjbGxvZ2N3PT0iLCJtYWMiOiJkNGY2MjA5NzM5MDI2NGVkOWM5MGMyZGY0OWZmNDQ4OTIyZmY0YmY3M2NhMmY3MTA1ZTQ3MDU2ZDg2ZjZmYWJhIn0=","token_id":4747776,"updated_at":"2018-11-30 00:47:02","created_at":"2018-11-30 00:47:02","id":6}
     */

    private int status;
    private String message;
    private DataBean data;

    public static SignUp objectFromData(String str) {

        return new Gson().fromJson(str, SignUp.class);
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
         * student_id : 91177339
         * full_name : Wale Whales
         * school_id : 32
         * courses_id : 99
         * department_id : 324
         * level_id : 500
         * semester_id : 2
         * matric_number : P/ND/3210073
         * phone : 09057458888
         * date_of_birth : {"date":"1992-04-29 00:00:00.000000","timezone_type":3,"timezone":"UTC"}
         * email : kola.victor@yahoo.com
         * password : eyJpdiI6IlJ1cXYzWXRUVWhrQlVWblwvXC9lbEtEUT09IiwidmFsdWUiOiJWNmRaeUNzYmJHN1dwejBjbGxvZ2N3PT0iLCJtYWMiOiJkNGY2MjA5NzM5MDI2NGVkOWM5MGMyZGY0OWZmNDQ4OTIyZmY0YmY3M2NhMmY3MTA1ZTQ3MDU2ZDg2ZjZmYWJhIn0=
         * token_id : 4747776
         * updated_at : 2018-11-30 00:47:02
         * created_at : 2018-11-30 00:47:02
         * id : 6
         */

        private int student_id;
        private String full_name;
        private String school_id;
        private String courses_id;
        private String department_id;
        private String level_id;
        private String semester_id;
        private String matric_number;
        private String phone;
        private DateOfBirthBean date_of_birth;
        private String email;
        private String password;
        private int token_id;
        private String updated_at;
        private String created_at;
        private int id;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
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

        public String getSchool_id() {
            return school_id;
        }

        public void setSchool_id(String school_id) {
            this.school_id = school_id;
        }

        public String getCourses_id() {
            return courses_id;
        }

        public void setCourses_id(String courses_id) {
            this.courses_id = courses_id;
        }

        public String getDepartment_id() {
            return department_id;
        }

        public void setDepartment_id(String department_id) {
            this.department_id = department_id;
        }

        public String getLevel_id() {
            return level_id;
        }

        public void setLevel_id(String level_id) {
            this.level_id = level_id;
        }

        public String getSemester_id() {
            return semester_id;
        }

        public void setSemester_id(String semester_id) {
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

        public DateOfBirthBean getDate_of_birth() {
            return date_of_birth;
        }

        public void setDate_of_birth(DateOfBirthBean date_of_birth) {
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

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public static class DateOfBirthBean {
            /**
             * date : 1992-04-29 00:00:00.000000
             * timezone_type : 3
             * timezone : UTC
             */

            private String date;
            private int timezone_type;
            private String timezone;

            public static DateOfBirthBean objectFromData(String str) {

                return new Gson().fromJson(str, DateOfBirthBean.class);
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getTimezone_type() {
                return timezone_type;
            }

            public void setTimezone_type(int timezone_type) {
                this.timezone_type = timezone_type;
            }

            public String getTimezone() {
                return timezone;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }
        }
    }
}
