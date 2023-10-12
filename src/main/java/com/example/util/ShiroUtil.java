package com.example.util;

import com.example.shiro.AccountProfile;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;

public class ShiroUtil {
    public static AccountProfile getprofile(){
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
