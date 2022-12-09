package org.jsLibrary.kpicontrollerutil;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;

public class KpiControllerRunner {


    public static void main(String[] args) throws IOException {

        String path = "src/main/resources/j/test.js";

//
//       try (Context context = Context.newBuilder("js").allowIO(true).build()) {
//           context.eval(Source.newBuilder("js", new File(path)).build());
//       }

//
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("node");

        String controllerPath = "src/main/resources/j/test.js";

        String envConfigPath = "src/test/java/com/penske/products/fleetinsight/util/kpicontrollerutil/envConfig.js";

        try {
            Reader controllerReader = new FileReader(new File(controllerPath));

            engine.eval(controllerReader);

            Invocable invocable = (Invocable) engine;

            invocable.invokeFunction("envConfigFile",999);

//            invocable.invokeFunction("getKPIs",999);

        } catch (FileNotFoundException | ScriptException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}