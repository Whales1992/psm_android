package com.example.wale.whalessupport.Utilities;

public class Requests {
    public static final String api = "http://127.0.0.1:8000/api/";

    private static final String studentsApi = "http://127.0.0.1:8000/api/student/";
    public static final String schoolsApi = "http://127.0.0.1:8000/api/school/";

    public static final String loginApi = studentsApi+"login";
    public static final String singUpApi = studentsApi+"signup";
    public static final String addSchoolsApi = schoolsApi+"add";
    public static final String updateSchoolsApi = schoolsApi+"update";
    public static final String getAllSchools = schoolsApi+"schools";
}