package org.scoula.security.account.domain;

import java.util.Date;
import java.util.List;

public class MemberVO {
    private String username;
    private String password;
    private String email;
    private Date regDate;
    private Date updateDate;

    private List<AuthVO> authList;
}
