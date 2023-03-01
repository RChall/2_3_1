package com.dmitrog.spring.myApp.entity;

import javax.persistence.*;

@Table(name = "users")
@Entity
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private String lastName;
        private String country;
        private int age;

        public User() {   }

        @Override
        public String toString() {
            return id + ") " + name + " " + lastName + ", " + country + ", " + age;
        }

        public User(String name, String lastName, String country, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.country = country;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

