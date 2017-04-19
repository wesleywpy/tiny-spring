package us.codecraft.tinyioc.aop;

/**
 * 切点对象
 * @author yihua.huang@dianping.com
 */
public interface Pointcut {

    /**
     * 获取ClassFilter用于筛选要代理的目标对象
     */
    ClassFilter getClassFilter();

    /**
     * 获取MethodMatcher用于在代理对象中对不同的方法进行不同的操作
     */
    MethodMatcher getMethodMatcher();

}
