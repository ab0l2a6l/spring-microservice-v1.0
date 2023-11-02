package org.abolfazl.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "person")
@Entity(name = "person")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "personSeq", sequenceName = "person_seq", allocationSize = 1)
public class Person {
    @Id
    @GeneratedValue(generator = "personSeq")
    private long id;

    @Column(name = "name", columnDefinition = "varchar(20)")
    private String name;

    @Column(name = "family", columnDefinition = "varchar(20)")
    private String family;

}
