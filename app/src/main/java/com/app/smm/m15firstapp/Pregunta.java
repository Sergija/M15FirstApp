package com.app.smm.m15firstapp;

/**
 * Created by Smm on 09/10/2017.
 */

public class Pregunta {
    private boolean answer;
    private int questionId;
    private int pistaId;
    //algo

    public Pregunta (boolean answer, int questionId, int pistaId){

        this.answer=answer;
        this.questionId=questionId;
        this.pistaId=pistaId;
    }

    public boolean isAnswer() {
        return answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public int getPistaId() {
        return pistaId;
    }
}

