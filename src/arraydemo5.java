public class arraydemo5 {
    public static void main(String[] args) {
        int [] nums={45,44,33,20,10};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);


        }int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0){
            sum=sum+nums[i];}

        }System.out.println(sum);

    }
}
