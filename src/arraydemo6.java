public class arraydemo6 {
    public static void main(String[] args) {
        int [] sho={10,20,30,4,5,6,7,80};
        for (int i = 0; i < sho.length; i++) {
            System.out.println(sho[i]);

        }
        int sum=0;
        for (int i = 0; i < sho.length; i++) {
            if(sho[i]%2==0){
            sum=sum+sho[i];}


        }
        System.out.println(sum*2);
    }
}
