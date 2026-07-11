public class BIT_GET {
    public static void main(String[] args){
        int n=2;//0101
        int i=2;
        int bitmask=1<<i;
        int new_number=bitmask & n;
        if (new_number==0){
            System.out.println("THE BIT WAS 0");
        }
        else{
            System.out.println("THE BIT WAS 1");
        }
    }
}
