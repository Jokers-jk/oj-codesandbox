package com.joker.codesandbox;


import com.joker.codesandbox.model.ExecuteCodeRequest;
import com.joker.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {

    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
