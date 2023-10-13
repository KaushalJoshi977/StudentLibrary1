package com.example.StudentLib.Modals;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "contact",unique = true)
    private String contact;

    //Name of variable of the Parent Entity that you have written in
    // child class foreign key attr.
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
    private Card card;

}
