import java.util.List
import groovy.transform.Field

@Field final PROPERTY_DIR="vard/my.properties"
def initStage(parent,params){
    for (param in params) {
        String[] paramArray = param.split(":", 2)
        String key = paramArray[0]
        //if (paramArray.length == 2) {
            String value = paramArray[1]
            //println value
            parent.parameterMap.put(key.toString(), value.toString())
            println parent.parameterMap
        //} else if (paramArray.length == 1) {
           // parent.parameterMap.put(key.toString().trim(), "");
        
    }
}




