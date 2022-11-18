package org.jsLibrary.kpicontrollerutil;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class KpiControllerRunner {


    public static void main(String[] args) {

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("ECMAScript");

        String controllerPath = "src/test/java/com/penske/products/fleetinsight/util/kpicontrollerutil/hello1.js";

        String envConfigPath = "src/test/java/com/penske/products/fleetinsight/util/kpicontrollerutil/envConfig.js";

        try {
            Reader controllerReader = new FileReader(new File(controllerPath));

            engine.eval(controllerReader);

            Invocable invocable = (Invocable) engine;

            invocable.invokeFunction("envConfigFile",999);

            //invocable.invokeFunction("getKPIs",999);

        } catch (FileNotFoundException | ScriptException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}