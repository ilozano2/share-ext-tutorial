package com.ixxus.training;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.extensions.surf.RequestContext;
import org.springframework.extensions.surf.extensibility.impl.DefaultSubComponentEvaluator;

public class BlogDemoEvaluator  extends DefaultSubComponentEvaluator
{
    private Logger LOGGER = LoggerFactory.getLogger(BlogDemoEvaluator.class);

    public BlogDemoEvaluator() {
        LOGGER.error("Creating blogdemoevaluator");
    }

    public boolean evaluate(RequestContext context, Map<String, String> params)
    {
        LOGGER.debug("blog demo Entering evaluate...");
        boolean result;
        String site = context.getUriTokens().get( "site" );
        if (site ==  null )
        {
            site = context.getParameter( "site" );
        }
        String targetSite = context.getParameter("site");
        result = (site !=  null && site.equals( targetSite));

        LOGGER.error("Result: " + result);
        return result;
    }
}