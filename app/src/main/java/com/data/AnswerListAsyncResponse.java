package com.data;

import com.model.Question;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void  processFinished(ArrayList<Question> questionArrayList);
}
