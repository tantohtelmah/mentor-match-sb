package com.kanyelings.telmah.mentormatchsb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @Builder
public class MentorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mentorId;

    @JsonProperty(value = "first_name")
    private String firstName;

    @JsonProperty(value = "second_name")
    private String secondName;

    @JsonProperty(value = "phone_number")
    private String phoneNumber;

    @JsonProperty(value = "department")
    private String department;

    @JsonProperty(value = "gender")
    private String gender;
}
