package com.sybedu.syb.sso.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sybedu.syb.sso.entity.BuUser;
import com.sybedu.syb.sso.mapper.BuUserMapper;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Author sky
 * @Email <mailto:fengyexjtu@126.com>
 * @Date 2020/12/26 20:03
 * @Description
 **/
@Service("userDetailsService")
@Slf4j
public class UserDetailsServiceImpl implements
    org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Resource
    private BuUserMapper buUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        QueryWrapper<BuUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        BuUser buUser = buUserMapper.selectOne(wrapper);
//        String roles = buUser.getRoles();
//        String auth = buUser.getPermissions();
//        String all = roles.toUpperCase() + "," + auth.toLowerCase();
        String all = "USER,ADMIN,9,10,11";
        List<GrantedAuthority> authorities =
                AuthorityUtils.commaSeparatedStringToAuthorityList(all);
        User user =
            new User(buUser.getUsername(), passwordEncoder.encode(buUser.getPassword()), authorities);
        log.info("user = {}", user);
        return user;
    }
}
