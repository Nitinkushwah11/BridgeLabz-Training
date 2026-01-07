package com.campusconnect;

class Faculty extends Person {

    public Faculty(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void printDetails() {
        System.out.println("Faculty: " + name + " | Email: " + email);
    }
}
