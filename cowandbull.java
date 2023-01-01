class Solution {
    public String getHint(String secret, String guess) {
        int bull=0,cow=0;
        int bull1[]=new int[10];
        int cow1[]=new int[10];
        for(int i=0;i<secret.length();i++){
           char ch=secret.charAt(i);
           char ch1=guess.charAt(i);
           if(ch==ch1){
               bull++;
           }
           else{
               bull1[ch-'0']++;
               cow1[ch1-'0']++;
           }
        }
           for(int i=0;i<10;i++){
            cow+=Math.min(bull1[i],cow1[i]);
           }
           return bull+"A"+cow+"B";
    }
}
