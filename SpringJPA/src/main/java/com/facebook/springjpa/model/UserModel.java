package com.facebook.springjpa.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserModel {
    Long id;
    String name;
    String email;
}
