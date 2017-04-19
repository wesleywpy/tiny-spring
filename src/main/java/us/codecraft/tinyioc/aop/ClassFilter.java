package us.codecraft.tinyioc.aop;

/**
 *
 * @author yihua.huang@dianping.com
 */
public interface ClassFilter {

    /**
     * 判断是否对某个对象进行拦截（用于筛选要代理的目标对象）
     */
    boolean matches(Class targetClass);
}
