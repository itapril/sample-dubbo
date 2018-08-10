package com.itapril.sample.filter;


import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;

/**
 * @author itapril.
 * @create 2018/8/10 09:05.
 *
 * 创建   META-INF
 *          - dubbo
 *              - com.alibaba.dubbo.rpc.Filter
 *          时 一定要分开创建  先创建META-INF在在创建dubbo
 *
 * 备注: 在idea下创建的时候 直接 使用META-INF.dubbo以为 是两个目录  导致排查了很久
 */
public class AuthorityFilter implements com.alibaba.dubbo.rpc.Filter {


    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String clientIpAddr = RpcContext.getContext().getRemoteHost();
        System.out.println("the client ip addr is " + clientIpAddr);
//        if(clientIpAddr !=null && clientIpAddr.contains("10.10")){
//        自定义添加过滤规则
        if(clientIpAddr !=null){
            return invoker.invoke(invocation);
        }else{
            System.out.println("没有权限访问 ～～～");
            return new RpcResult();
        }
    }
}
