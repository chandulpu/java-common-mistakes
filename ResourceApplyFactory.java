package javaprogramming.commonmistakes.redundantcode.templatemethod.resource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil.PU
 * @create 2024-10-16
 */
public class ResourceApplyFactory {

    private static final Map<String, IResourceApplyService> resourceApplyServiceMap= new HashMap<>(4);

    static {
        resourceApplyServiceMap.put("design", new DesignResourceApply());
        resourceApplyServiceMap.put("app", new AppDeployResourceApply());
    }
    public static IResourceApplyService getResourceApplyService(String resourceType) {
        return resourceApplyServiceMap.get(resourceType);
    }
    public static void main(String[] args) {
        IResourceApplyService app = getResourceApplyService("app");
        System.out.println(app.applyResource(null));
    }
}
