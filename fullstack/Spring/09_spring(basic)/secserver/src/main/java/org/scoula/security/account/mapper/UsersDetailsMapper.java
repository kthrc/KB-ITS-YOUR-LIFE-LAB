package org.scoula.security.account.mapper;

import org.scoula.security.account.domain.MemberVO;

public interface UsersDetailsMapper {
    public MemberVO get(String username);
}
