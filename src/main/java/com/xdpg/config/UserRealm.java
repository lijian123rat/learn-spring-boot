package com.xdpg.config;

import com.xdpg.pojo.User;
import com.xdpg.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

//自定义的UserRealm
public class UserRealm  extends AuthorizingRealm {
    @Autowired
    UserService userService;
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("Shiro 正在授权~");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Subject subject = SecurityUtils.getSubject();
        User currentUser = (User) subject.getPrincipal();//取用户对象
        //这里应该从数据库中读取当前用户拥有那些菜单权限
        info.addStringPermission("user:list");//设置用户权限 如：user:add 通过数据库的权限数据进行设置
        return info;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("Shiro 正在认证~");
        UsernamePasswordToken userToken = (UsernamePasswordToken) authenticationToken;
        User user = userService.getUserByUserName(userToken.getUsername());
        if(user == null){
            return null;//抛出异常，用户名称不存在
        }
        //这里可以MD5加密，或MD5盐值加密
        return new SimpleAuthenticationInfo(user,user.getPassWord(),getName());
    }
}
