package com.xn.candycrushletter;

public class CandyCrushLetter {
    public static void main(String[] args) {
        String str="abcccbad";
        StringBuffer str123=new StringBuffer("abcbad");
        System.out.println(eliminate(str));
        //System.out.println(str123.replace(2,3,"b"));
    }
    //Stage1
/*    public static String eliminate(String str){
        StringBuffer stringBuffer=new StringBuffer(str);
        int eliminate_num;
        for(int i=0;i<stringBuffer.length();i++){
            eliminate_num=count_num(stringBuffer,stringBuffer.charAt(i),i);
            if(eliminate_num>=3){
                while(eliminate_num>0){
                    stringBuffer.deleteCharAt(i);
                    eliminate_num--;
                }
                break;
            }
        }
        if(stringBuffer.length()==str.length()){
            return stringBuffer.toString();
        }else{
            return eliminate(stringBuffer.toString());
        }
    }*/
    //Stage2
    public static String eliminate(String str){
        StringBuffer stringBuffer=new StringBuffer(str);
        int eliminate_num;
        for(int i=0;i<stringBuffer.length();i++){
            eliminate_num=count_num(stringBuffer,stringBuffer.charAt(i),i);
            if(eliminate_num>=3){
                while(eliminate_num>1){
                    stringBuffer.deleteCharAt(i);
                    eliminate_num--;
                }
                if(stringBuffer.charAt(i)==97) stringBuffer.deleteCharAt(i);
                else stringBuffer.replace(i,i+1,String.valueOf((char)(stringBuffer.charAt(i)-1)));
                break;
            }
        }
        if(stringBuffer.length()==str.length()){
            return stringBuffer.toString();
        }else{
            return eliminate(stringBuffer.toString());
        }
    }
    public static Integer count_num(StringBuffer str,char s,int p){
        int length=str.length();
        int num=1;
        for(int i=p+1;i<length;i++){
            if(s==str.charAt(i)) num++;
            else break;
        }
        return num;
    }
}
