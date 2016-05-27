package com.example;

import java.util.List;

/**
 * Created by lizhaoxuan on 16/5/27.
 */
public class OnceMethod {

    private int id;
    private String methodName;
    private List<String> methodParameters;

    OnceMethod(int id, String methodName, List<String> methodParameters) {
        this.id = id;
        this.methodName = methodName;
        this.methodParameters = methodParameters;
    }

    int getMethodParametersSize() {
        return methodParameters == null ? 0 : methodParameters.size();
    }

    int getId() {
        return id;
    }

    String getMethodName() {
        return methodName;
    }

    List<String> getMethodParameters() {
        return methodParameters;
    }

}
