class Main {
    public static void main(String[] args) {
       String str1 = "eating an apple";
       String str2 = "apple an eating";
       String[] arr1 = str1.split(" ");
       String[] arr2 = str2.split(" ");
       int j = arr2.length-1;
       for(int i = 0 ; i < arr1.length ; i++){
           if(!arr1[i].equals(arr2[j])){
               return false;
           }
       }
       return true;
    }
}
