package it.school.hackathonmegacom.models.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_department")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Department {

    @Id
    @Column(name = "id" )
    Long id;

    @Column(name = "name" ,  nullable = false  )
    String name;

    @Column(name = "isActive")
    Boolean isActive;
}
