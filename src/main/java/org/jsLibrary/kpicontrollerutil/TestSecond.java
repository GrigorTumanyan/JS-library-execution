package org.jsLibrary.kpicontrollerutil;

import org.graalvm.polyglot.Context;

import java.util.HashMap;
import java.util.Map;

public class TestSecond {
    public static void main(String[] args) {
        Map<String, String> options = new HashMap<>();
        options.put("js.commonjs-require", "true");
        options.put("js.commonjs-require-cwd", "C:\\Program Files\\graalvm-ce-java11-22.3.0\\languages\\nodejs\\npm\\node_modules");
//        options.put("js.commonjs-core-modules-replacements", "buffer:buffer/,path:path-browserify");

        Context cx = Context.newBuilder("js")
                .allowExperimentalOptions(true)
                .allowIO(true)
                .options(options)
                .build();
        cx.eval("js", "require('src/main/resources/hello1.js');");
    }

}
