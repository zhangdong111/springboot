//package com.sybedu.gk211985.wechat.account.config.security.config;
//
//import com.fengye.security.demo.mapper.MyUserMapper;
//import com.fengye.security.demo.model.MyUser;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.ConfigAttribute;
//import org.springframework.security.access.SecurityConfig;
//import org.springframework.security.web.FilterInvocation;
//import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
//import org.springframework.stereotype.Component;
//
//import java.util.*;
//
//@Component
//@Slf4j
//public class MFilterInvocationSecurityMetadataSource
//        implements FilterInvocationSecurityMetadataSource {
//    // @Autowired
//    // public IRescAndRoleService iRescAndRoleService ;
//    // @Autowired
//    // private IUserService iUserService ;
//    @Autowired
//    private MyUserMapper myUserMapper;
//
//    private UrlMatcher urlMatcher = new AntUrlPathMatcher();
//    // 资源权限集合
//    private static Map<String, Collection<ConfigAttribute>> resourceMap = null;
//
//    public void loadResourceDefine() {
//        List<MyUser> users = myUserMapper.selectList(null);
//        log.info("users = " + users);
//        resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
//        //  //取得用户信息
//        //  List<User> userList = iUserService.query();
//        // //取得资源与角色列表
//        //  List<RescAndRole> resourceList = iRescAndRoleService.query();
//        //  System.out.println(resourceList);
//        //  for (RescAndRole resource : resourceList) {
//        //      Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
//        //      atts.add(new SecurityConfig(resource.getRoleName() ));
//        //      resourceMap.put(resource.getResString(), atts);
//        //  }
//
//        Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
//        atts.add(new SecurityConfig("ROLE_USER"));
//        resourceMap.put("/users/**", atts);
//    }
//
//    @Override
//    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
//        loadResourceDefine(); // 防止无法注入问题
//        // guess object is a URL.
//        String url = ((FilterInvocation) o).getRequestUrl();
//        Iterator<String> ite = resourceMap.keySet().iterator();
//        while (ite.hasNext()) {
//            String resURL = ite.next();
//            if (urlMatcher.pathMatchesUrl(resURL, url)) {
//                return resourceMap.get(resURL);
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public Collection<ConfigAttribute> getAllConfigAttributes() {
//        return null;
//    }
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return true;
//    }
//}
