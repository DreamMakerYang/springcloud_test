package com.springcloud.manager.Filer;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class ManagerFiler extends ZuulFilter {
    //设置是在请求前（pre）执行过滤器还是请求后（post）
    @Override
    public String filterType() {
        return "pre";
    }

    //有多个过滤器时的执行顺序，数值越小越先执行
    @Override
    public int filterOrder() {
        return 0;
    }

    //设置该过滤器是否可用
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //具体逻辑，返回object即为放行（null也是object类型）
    @Override
    public Object run() throws ZuulException {
        //终止运行方法
//        RequestContext requestContext = RequestContext.getCurrentContext();
//        requestContext.setSendZuulResponse(false);

        System.out.println("进过了过滤器.....");
        return null;
    }
}
