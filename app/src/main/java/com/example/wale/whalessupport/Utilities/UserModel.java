package com.example.wale.whalessupport.Utilities;

import java.util.Date;

class UserModel {

    private int uid;
    private String full_name, school_id, courses_id, department_id, level_id, semester_id,
            matric_number, phone, avatar, email, token_id;
    private Date date_of_birth;

    public UserModel(int uid, String full_name, String school_id, String courses_id, String department_id,
                     String level_id, String semester_id, String matric_number, String phone, String avatar,
                     Date date_of_birth, String email, String token_id) {
        this.uid = uid;
        this.full_name = full_name;
        this.school_id = school_id;
        this.courses_id = courses_id;
        this.department_id = department_id;
        this.level_id = level_id;
        this.semester_id = semester_id;
        this.matric_number = matric_number;
        this.phone = phone;
        this.avatar = avatar;
        this.date_of_birth = date_of_birth;
        this.email = email;
        this.token_id = token_id;
    }
}
