package com.app.smm.m15firstapp;

/**
 * Created by Smm on 09/10/2017.
 */

public class Pregunta {
    private boolean answer;
    private int questionId;
    private int pistaId;
    private int inutiVar;
    //algo

    public Pregunta (boolean answer, int questionId, int pistaId, int intil){

        this.answer=answer;
        this.questionId=questionId;
        this.pistaId=pistaId;
        this.inutiVar=intil;
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

