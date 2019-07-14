package com.air.filter;

import com.air.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter("/*")
public class OpenSessionInView implements Filter {

    @Override
    public void init(FilterConfig filterconfig) throws ServletException {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain filterchain)
            throws IOException, ServletException {
        SqlSession session = MyBatisUtil.getSession();
        try {
            filterchain.doFilter(servletrequest, servletresponse);
            session.commit();
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        } finally {
            MyBatisUtil.closeSession();
        }
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

}
