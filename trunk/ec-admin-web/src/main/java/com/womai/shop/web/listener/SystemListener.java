package com.womai.shop.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.womai.shop.services.TaskManager;
import com.womai.shop.manage.front.SystemManager;
import com.womai.shop.services.oscache.FrontCache;
import com.womai.shop.services.oscache.ManageCache;

import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


/**
 * 系统配置加载监听器
 *
 * @author huangf
 */
public class SystemListener implements ServletContextListener {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SystemListener.class);

    public void contextDestroyed(ServletContextEvent arg0) {

    }

    public void contextInitialized(ServletContextEvent arg0) {
        try {
            SystemManager.getInstance();

            WebApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(arg0.getServletContext());
            FrontCache frontCache = (FrontCache) app.getBean("frontCache");
            ManageCache manageCache = (ManageCache) app.getBean("manageCache");
            frontCache.loadAllCache();
            manageCache.loadAllCache();

            TaskManager taskManager = (TaskManager) app.getBean("taskManager");
            taskManager.start();
        } catch (Throwable e) {
//            e.printStackTrace();
            logger.error("System load faild!" + e.getMessage(),e);
            try {
                throw new Exception("系统初始化失败！");
            } catch (Exception e1) {
                logger.error(e1.getMessage(),e1);
//                e1.printStackTrace();
            }
        }
    }

}
