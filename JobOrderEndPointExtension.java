package manifoldex.extensions.com.ptc.solutions.core.joborder.services.ProcessJobOrderEndPoint;

import com.ptc.solutions.core.joborder.services.ProcessJobOrderEndPoint;
//import com.ptc.solutions.core.process.services.ProcessRunningManager;
import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
//import org.json.JSONObject;


@Extension
public class JobOrderEndPointExtension {

    //private static final ProcessRunningManager processRunningManager = ProcessRunningManager.getInstance();
    //private static final JobOrderEndPoint jobOrderEndPoint = JobOrderEndPoint.getInstance();

    public static Object processImportJobOrder(@This ProcessJobOrderEndPoint jobOrderEndPoint,String jobOrderList) {
        var result = jobOrderEndPoint.ImportJobOrder_END(jobOrderList);
        //processRunningManager.ProcessQueue_PRC(false,"Configuration");
        System.out.println("processRunningManager ProcessQueue_PRC");
        return result;
    }


}
