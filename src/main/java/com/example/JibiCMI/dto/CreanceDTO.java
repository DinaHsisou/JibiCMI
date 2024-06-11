package com.example.JibiCMI.dto;


import com.example.JibiCMI.model.Creance;
import com.example.JibiCMI.model.CreanceType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreanceDTO {

    private Long id;
    private String name;
    private CreanceType creancetype;
    private String formFieldsJSON; // JSON string representing the form fields

    public CreanceDTO(Creance creance) {
        this.id = creance.getId();
        this.name = creance.getName();
        this.creancetype = creance.getCreancetype();
        this.formFieldsJSON= creance.getFormFieldsJSON();
    }

}

