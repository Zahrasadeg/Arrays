public class arraydemo3 {
    public static void main(String[] args) {
        //array a b c d e f
      /*  char [] letters={'a','b','c','d','e','f'};
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);

        }*/

        char [] letters={'s','a','y','b','n','c','t','d','a','e','x'};
        for(int i=0;i<letters.length;i++){
            if(i%2==0){
                System.out.print(letters[i]);
            }
        }
    }
}
