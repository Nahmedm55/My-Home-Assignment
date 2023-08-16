public class Reverse_process {
    public static  String  ProcessReverse(String Sentence){
        String[] Words = Sentence.split(" ");
        for (int i=0; i< Words.length; i++){
            if(Words[i].length()>=5){
                Words[i]= PlainDorm(Words[i]);
            }
        }
        String Reversedstring="";
        for(String SingleWord : Words){
            Reversedstring = Reversedstring +SingleWord+ " ";
        }

        return Reversedstring.substring(0, Reversedstring.length() - 1);
    }
    public static  String PlainDorm(String T){
        int y = T.length();
        String  Z =" ";
        for(int i=y-1; i>=0 ; i--){
            Z += T.charAt(i);
        }
        return Z;
    }
}
