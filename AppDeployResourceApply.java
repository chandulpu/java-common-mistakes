package javaprogramming.commonmistakes.redundantcode.templatemethod.resource;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil.PU
 * @create 2024-10-16
 */
@Service
public class AppDeployResourceApply extends AbstractResourceApply{
    @Override
    protected void processCloudInfo(ResourceReq req) {
        System.out.println("根据应用id获取云平台信息并组装到资源申请参数");
    }

    @Override
    protected void processResourceInfo(ResourceReq req) {
        System.out.println("新增虚机申请信息");
        System.out.println("新增高阶服务申请信息");
        System.out.println("新增资源申请信息");
    }

    @Override
    protected Object buildResult(ResourceReq req) {
        System.out.println("构造结果：key为图元id,value为资源id");
        Map<String,String> result = new HashMap<>();
        result.put("132323", "2123341");
        return result;
    }

}
