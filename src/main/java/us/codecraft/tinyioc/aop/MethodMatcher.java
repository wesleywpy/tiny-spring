package us.codecraft.tinyioc.aop;

import java.lang.reflect.Method;

/**
 * @author yihua.huang@dianping.com
 */
public interface MethodMatcher {

    /**
     * 判断是否对某个方法进行拦截（用于在代理对象中对不同的方法进行不同的操作）
     */
    boolean matches(Method method, Class targetClass);
}
