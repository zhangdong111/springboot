package com.sybedu.syb.sso.service.impl;

import com.sybedu.syb.sso.entity.po.UserPo;
import com.sybedu.syb.sso.mapper.UserMapper;
import com.sybedu.syb.sso.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Rexxer
 * @since 2021-08-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserPo> implements UserService {

}
