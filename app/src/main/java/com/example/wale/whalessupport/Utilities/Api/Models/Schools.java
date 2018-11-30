package com.example.wale.whalessupport.Utilities.Api.Models;

import com.google.gson.Gson;

import java.util.List;

public class Schools {

    /**
     * status : 1
     * message : Success
     * data : [{"id":8,"school_id":48495496,"name":"Whales Corp Institution","type":"public","aka":"WCI","address":"Nigeria","location":"Earth","created_at":"2018-11-03 14:35:33","updated_at":"2018-11-03 13:35:33","deleted_at":null},{"id":9,"school_id":35111008,"name":"Whales Corp Institution","type":"private","aka":"WCI","address":"Nigeria","location":"Earth","created_at":"2018-11-03 13:17:56","updated_at":"2018-11-03 13:17:56","deleted_at":null}]
     */

    private int status;
    private String message;
    private List<DataBean> data;

    public static Schools objectFromData(String str) {

        return new Gson().fromJson(str, Schools.class);
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 8
         * school_id : 48495496
         * name : Whales Corp Institution
         * type : public
         * aka : WCI
         * address : Nigeria
         * location : Earth
         * created_at : 2018-11-03 14:35:33
         * updated_at : 2018-11-03 13:35:33
         * deleted_at : null
         */

        private int id;
        private int school_id;
        private String name;
        private String type;
        private String aka;
        private String address;
        private String location;
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

        public int getSchool_id() {
            return school_id;
        }

        public void setSchool_id(int school_id) {
            this.school_id = school_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAka() {
            return aka;
        }

        public void setAka(String aka) {
            this.aka = aka;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
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
