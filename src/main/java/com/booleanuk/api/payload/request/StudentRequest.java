package com.booleanuk.api.payload.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {
    private String firstName;
    private String lastName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    private int courseId;
}
