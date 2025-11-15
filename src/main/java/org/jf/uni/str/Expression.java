package org.jf.uni.str;

public class Expression {
    private String content;

    public Expression(String content) {
        this.content = content;
    }

    public void ruleOne(){
        if (this.content.endsWith("I")){
            this.content += "U";
        }
    }

    public void ruleTwo() {
        this.content += this.content.substring(1);
    }

    public void ruleThree(){
        this.content = this.content.replaceAll("III", "U");
    }

    public void ruleFour(){
        this.content = this.content.replaceAll("UU", "U");
    }

    @Override
    public String toString() {
        return content;
    }

    public static void main(String[] args) {
        // "MIIUIIU" is not reduce-able to MIIU because we always end up with repeated "IIU" or "II".
        Expression e = new Expression("MII");//wants:MUIIU
        e.ruleOne();
        System.out.println(e);
        e.ruleTwo();
        System.out.println(e);
//        e.ruleThree();
//        System.out.println(e);

    }
}
