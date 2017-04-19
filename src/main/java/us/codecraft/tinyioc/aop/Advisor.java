package us.codecraft.tinyioc.aop;

import org.aopalliance.aop.Advice;

/**
 * 通知器对象
 * @author yihua.huang@dianping.com
 */
public interface Advisor {

    /**
     * 获取一个通知对象 Advice，用于实现 具体的方法拦截
     */
    Advice getAdvice();
}
