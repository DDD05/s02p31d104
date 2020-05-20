package com.help.back.backend.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class User {

    private int user_id;
    private String password;
    private String name;
    private String email;
    private String birthday;
    private String phone_number;



}
