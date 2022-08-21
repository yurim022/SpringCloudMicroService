package filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


@Component
@Slf4j
public class ZuulLoggingFilter extends ZuulFilter {

    //    @Slf4j lombok run this statement automatically
    //    Logger logger = LoggerFactory.getLogger(ZuulLoggingFilter.class);
    @Override
    public boolean shouldFilter() {
        return true; //TRUE mean you use it as filter
    }

    @Override
    public Object run() throws ZuulException {
        log.info("********************* print logs: ");

        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        log.info("********************** " + request.getRequestURI() );
        return null;
    }


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

}
