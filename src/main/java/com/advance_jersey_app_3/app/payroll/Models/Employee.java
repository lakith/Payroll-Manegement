package com.advance_jersey_app_3.app.payroll.Models;

public class Employee {

    private long  e_id;
    private String first_name;
    private String last_name;
    private int basic;
    private  int ot_pay;
    private long allowance_pay;
    private String address;
    private long tel_no;
    private String email;
    private boolean active;
    private String b_day;
    private String job_type;
    private String contact_person;
    private String join_date;


    public Employee(){}

    public Employee(String first_name, String last_name,
                    int basic, int ot_pay, long allowance_pay,
                    String address, long tel_no, String email,
                    boolean active, String b_day, String job_type,
                    String contact_person, String join_date) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.basic = basic;
        this.ot_pay = ot_pay;
        this.allowance_pay = allowance_pay;
        this.address = address;
        this.tel_no = tel_no;
        this.email = email;
        this.active = active;
        this.b_day = b_day;
        this.job_type = job_type;
        this.contact_person = contact_person;
        this.join_date = join_date;
    }

    public long getE_id() {
        return e_id;
    }

    public void setE_id(long e_id) {
        this.e_id = e_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public int getOt_pay() {
        return ot_pay;
    }

    public void setOt_pay(int ot_pay) {
        this.ot_pay = ot_pay;
    }

    public long getAllowance_pay() {
        return allowance_pay;
    }

    public void setAllowance_pay(long allowance_pay) {
        this.allowance_pay = allowance_pay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTel_no() {
        return tel_no;
    }

    public void setTel_no(long tel_no) {
        this.tel_no = tel_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getB_day() {
        return b_day;
    }

    public void setB_day(String b_day) {
        this.b_day = b_day;
    }

    public String getJob_type() {
        return job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type = job_type;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }
}
