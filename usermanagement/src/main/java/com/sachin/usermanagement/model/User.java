package com.sachin.usermanagement.model;

public class User extends Object {
    private String name;
    private String email;
    private int age;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        if (user.name.equals(this.name) && user.email.equals(this.email) && user.age == this.age) {
            return true;
        }
        return false;
    }

    /*
    If equals is not overridden, then user will not be removed from Arraylist, when delete api is called, so equals is overridden here.
    In Java, when you call list.remove(object), the list searches for a match by calling equals()
    on every item. If you haven't written your own equals() method, Java uses the default version
    from the Object class, which only returns true if both variables point to the exact same memory
    address (reference equality).
     */
}
