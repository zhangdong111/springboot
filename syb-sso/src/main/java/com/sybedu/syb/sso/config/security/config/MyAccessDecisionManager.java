//package com.sybedu.gk211985.wechat.account.config.security.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.access.AccessDecisionManager;
//import org.springframework.security.access.AccessDeniedException;
//import org.springframework.security.access.ConfigAttribute;
//import org.springframework.security.authentication.InsufficientAuthenticationException;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//
//import java.util.Collection;
//import java.util.Iterator;
//
///** @Author sky @Email <mailto:fengyexjtu@126.com> @Date 2020/12/29 17:39 @Description */
//@Slf4j
//public class MyAccessDecisionManager implements AccessDecisionManager {
//    /* (non-Javadoc)
//     * @see org.springframework.security.access.AccessDecisionManager#decide(org.springframework.security.core.Authentication, java.lang.Object, java.util.Collection)
//     * 该方法决定该权限是否有权限访问该资源，其实object就是一个资源的地址，authentication是当前用户的
//     * 对应权限，如果没登陆就为游客，登陆了就是该用户对应的权限
//     */
//    @Override
//    public void decide(
//            Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes)
//            throws AccessDeniedException, InsufficientAuthenticationException {
//        if (configAttributes == null) {
//            return;
//        }
//        log.info("当前请求的url=" + object.toString()); // object is a URL.
//        // 所请求的资源拥有的权限(一个资源对多个权限)
//        Iterator<ConfigAttribute> iterator = configAttributes.iterator();
//        while (iterator.hasNext()) {
//            ConfigAttribute configAttribute = iterator.next();
//            // 访问所请求资源所需要的权限
//            String needPermission = configAttribute.getAttribute();
//            log.info("访问" + object.toString() + "需要的权限是：" + needPermission);
//            // 用户所拥有的权限authentication
//            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
//            for (GrantedAuthority ga : authorities) {
//                if (needPermission.equals(ga.getAuthority())) {
//                    return;
//                }
//            }
//        }
//        // 没有权限
//        throw new AccessDeniedException(" 没有权限访问！ ");
//    }
//
//    @Override
//    public boolean supports(ConfigAttribute attribute) {
//        // TODO Auto-generated method stub
//        return true;
//    }
//
//    @Override
//    public boolean supports(Class<?> clazz) {
//        // TODO Auto-generated method stub
//        return true;
//    }
//}
