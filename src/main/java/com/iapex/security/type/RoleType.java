package com.iapex.security.type;

/**
 * Created by iapex on 2017. 5. 11..
 */
public enum RoleType {

    ROLE_ADMIN,
    ROLE_USER;

    public static RoleType findByType(String type) {
        for(RoleType role: values()) {
            if(role.name().equals(type)) {
                return role;
            }
        }
        return null;
    }
}
