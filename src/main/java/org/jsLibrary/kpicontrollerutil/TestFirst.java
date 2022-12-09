package org.jsLibrary.kpicontrollerutil;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.io.File;
import java.io.IOException;

public class TestFirst {
    public static void main(String[] args) throws IOException {
        try (Context context = Context.newBuilder("js").option("js.ecmascript-version", "2020").allowIO(true).build()) {

            context.eval(Source.newBuilder("js", new File("src/main/resources/hello1.js")).mimeType("application/javascript+module").build());
//            Value jsFunction = context.eval("js", "", +
//                    "(function myJavaScriptFunction(parameter) {        \n" +
//                    "console.log('[JS] Hello, ' + parameter + '!');     \n" +
//                    "return parameter.toUpperCase();                    \n" +
//                    "})                                                 \n");
//            Value result = jsFunction.execute("JavaScript");
//            if (result.isString()){
//                System.out.println("[Java] result: " + result.asString());
//            }else {
//                System.out.println("[Java] unexpected result type returned from Javascript");
//            }

//            context.eval(Source.newBuilder("js", new File("src/main/resources/j/hello1.js")).build());
        }
    }
}