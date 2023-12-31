publci class Count_and_Say {
    public String countAndSay(int n) {
       String s = "1";
       for(int i=1;i<n;i++){ 
           s = countAndSayHelper(s);
       }
       return s;
    }
    public String countAndSayHelper(String s){
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0); 
        int count=1;
        for(int i=1;i<s.length();i++){
                 if(s.charAt(i)==prev){
                     count++; 
                 }
                 else{
                     sb.append(count);
                     sb.append(prev);
                     prev = s.charAt(i);
                     count=1;
                 }
        }
        sb.append(count);
        sb.append(prev); 
        return sb.toString();
    }
    pubic static void main(String[] args){
     int n = 4;
     String ans = countAndSay(n);
    System.out.println(ans);
  }
}