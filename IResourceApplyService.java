package javaprogramming.commonmistakes.redundantcode.templatemethod.resource;

public interface IResourceApplyService {

    Object applyResource(ResourceReq req);

    Object releaseResource(ResourceReq req);

    Object changeResource(ResourceReq req);

    Object queryResource(ResourceReq req);
}
