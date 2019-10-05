public class ReverseString{

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverseWord("abc"));
        System.out.println(new ReverseString().reverseSentence("Wow! It's done!"));
    }

    String reverseWord(String s) {
        StringBuffer str = new StringBuffer(s);
        return str.reverse().toString();
    }

    String reverseSentence(String s){
        String[] str = s.split(" ");
        String sentence = "";
        for(int i=0; i<str.length; i++){
            if(i!=0) {
                sentence = sentence + " " + reverseWord(str[i]);
            } else {
                sentence = sentence + reverseWord(str[i]);
            }
        }
        return sentence;
    }


}