package com.ms.email.msemail.dtos;

import lombok.Data;
import org.springframework.context.annotation.ComponentScan;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
@ComponentScan({ "com.yourpkg.*" })
@Data
public class EmailDto {

    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
