package cordova-plugin-AltriaIperceptionSDK;

import com.iperceptions.iperceptionssdk.iPerceptionsSDK;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class AltriaiPerceptionSDK extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.init(message);
            //this.coolMethod(message, callbackContext);
            callbackContext.success();
           return true;
        }
        return false;
    }

    public static void init(String apiToken);

    //public static void triggerEvent(Hashtable<String, String> eventVariables, Activity context);

    // private void coolMethod(String message, CallbackContext callbackContext) {
    //     if (message != null && message.length() > 0) {
    //         callbackContext.success(message);
    //     } else {
    //         callbackContext.error("Expected one non-empty string argument.");
    //     }
    // }
}
