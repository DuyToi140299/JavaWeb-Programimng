/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson18;

/**
 *
 * @author Admin
 */
public class Questions {
    
    private int id;
    private String content;
    private String answera;
    private String answerb;
    private String answerc;
    private String answerd;
    private String correct;

    public Questions() {
    }

    public Questions(int id, String content, String answera, String answerb, String answerc, String answerd, String correct) {
        this.id = id;
        this.content = content;
        this.answera = answera;
        this.answerb = answerb;
        this.answerc = answerc;
        this.answerd = answerd;
        this.correct = correct;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswera() {
        return answera;
    }

    public void setAnswera(String answera) {
        this.answera = answera;
    }

    public String getAnswerb() {
        return answerb;
    }

    public void setAnswerb(String answerb) {
        this.answerb = answerb;
    }

    public String getAnswerc() {
        return answerc;
    }

    public void setAnswerc(String answerc) {
        this.answerc = answerc;
    }

    public String getAnswerd() {
        return answerd;
    }

    public void setAnswerd(String answerd) {
        this.answerd = answerd;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();
        strb.append(this.content);
        strb.append("\nA. "+this.answera);
        strb.append("\nB. "+this.answerb);
        strb.append("\nC. "+this.answerc);
        strb.append("\nD. "+this.answerd);
        
        return strb.toString();
    
    }
    
}
