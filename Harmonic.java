package arrays;

public class Harmonic {
    public static void main(String[] args) {
        int[]list=new int[]{45,5,55,8,74,12,9};
        double sum=0.0;
        double harmonic;

        for (int i = 0; i < list.length ; i++) {

            sum+=(1/(double) list[i]);

        }
        harmonic= list.length/sum;
        System.out.println("harmonic = " + harmonic);

        
    }
}
