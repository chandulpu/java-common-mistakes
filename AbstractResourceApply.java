package javaprogramming.commonmistakes.redundantcode.templatemethod.resource;

/**
 * @author Neil.PU
 * @create 2024-10-16
 */
public abstract class AbstractResourceApply implements IResourceApplyService{

    @Override
    public Object applyResource(ResourceReq req){
        System.out.println("填充基本参数");

        processCloudInfo(req);

        processResourceInfo(req);

        System.out.println("调用cmdb申请资源接口");

        return buildResult(req);
    }

    @Override
    public Object releaseResource(ResourceReq req){
        System.out.println("填充基本参数");

        processCloudInfo(req);

        System.out.println("调用cmdb释放资源接口");

        return buildResult(req);
    }

    @Override
    public Object changeResource(ResourceReq req){
        System.out.println("填充基本参数");

        processCloudInfo(req);

        processResourceInfo(req);

        System.out.println("调用cmdb变更资源接口");

        return buildResult(req);
    }

    @Override
    public Object queryResource(ResourceReq req){
        System.out.println("填充基本参数");

        processCloudInfo(req);

        System.out.println("调用cmdb查询资源接口");

        return buildResult(req);
    }

    protected abstract void processCloudInfo(ResourceReq req);
    protected abstract void processResourceInfo(ResourceReq req);
    protected abstract Object buildResult(ResourceReq req);
}
