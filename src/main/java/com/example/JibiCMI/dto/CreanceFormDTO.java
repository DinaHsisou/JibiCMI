package com.example.JibiCMI.dto;


import com.example.JibiCMI.model.CreanceType;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreanceFormDTO {

    private Long id;
    private String name;
    private CreanceType creancetype;
    private String formFieldsJSON; // JSON string representing the form fields
    private String creancierName;
    private String creancierLogo;

}