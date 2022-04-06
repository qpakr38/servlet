package hello.servlet.web.froncontroller.v4;

import java.util.Map;

public interface ControllerV4 {

    /**
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String,String> paramMap,Map<String,Object> model);
}
