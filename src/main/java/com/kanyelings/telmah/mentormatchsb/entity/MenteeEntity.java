package com.kanyelings.telmah.mentormatchsb.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class MenteeEntity {
    @Id
    private Long menteeId;
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String gender;
    private String previousSchool;
}
