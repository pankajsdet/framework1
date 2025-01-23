import javax.xml.transform.stream.StreamSource;
import java.util.*;

class Test {


    public static void sort(){
        System.out.println("Sorting  \n");
        int[] numarr = {1, 2, 5, 6, 8, 99, 0, 5, 1, 0};
       Arrays.sort(numarr);
        char[] arr = {'a', 'b', 'e', 'd', 'f'};
        char temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }
   //     System.out.println();
        for(char a: arr){
            System.out.print( " "+a );
        }
        System.out.println();
    }


 void reverse(){
        int num =12345;
        String s="Pankaaj";
        char ch=s.charAt(5);
    System.out.println("char is: "+ch);
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        sb.reverse();
    System.out.println();
        System.out.println("Reverse : "+sb.toString());
   //-------------------------------------------------------

    Integer[] arr={1,2,3,4,5};
    Arrays.sort(arr, Collections.reverseOrder());
    System.out.println("Reverse Array: "+Arrays.toString(arr));

}

static void CharCount(){

        String str="aabbbcdeeffff";
    //String str = "aabbba";

    char ch=str.charAt(5);


    int count = 1;
    for (int i = 0; i <str.length(); i = i + count) {
        count = 1;
        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                count = count + 1;
            } else {
                System.out.println(str.charAt(i) + "" + count);
                break;
            }
        }


    }
    }


     static void CharC() {

         String s = "pankaj deshmukh";
         s = s.toLowerCase().replaceAll(" ", "");
         HashMap<Character, Integer> hm = new LinkedHashMap<>();
         for (char c : s.toCharArray()) {

             if (hm.containsKey(c)) {
                 hm.put(c, hm.get(c) + 1);
             } else {


                 hm.put(c, 1);
             }


         }
         System.out.println(hm);


         for (Character ch : hm.keySet()) {

             String ss ="";

             System.out.println(ss);
         }
     }







    public static void main(String[] args) {
       // sort();
// reverse();
        //CharCount();
        CharC();
      }}