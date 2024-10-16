package javaprogramming.commonmistakes.redundantcode.templatemethod.resource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil.PU
 * @create 2024-10-16
 */
public class DesignResourceApply extends AbstractResourceApply {
    @Override
    protected void processCloudInfo(ResourceReq req) {
        System.out.println("联调设计");
        System.out.println("根据方案id获取云平台信息并组装到资源申请参数");
    }

    @Override
    protected void processResourceInfo(ResourceReq req) {
        System.out.println("新增虚机申请信息");
        System.out.println("新增资源申请信息");
    }

    @Override
    protected Object buildResult(ResourceReq req) {
        System.out.println("构造结果：key为方案id,value为资源id");
        Map<String, String> result = new HashMap<>();
        result.put("132323", "2123341");
        return result;
    }
}