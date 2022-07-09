public class Main {
    public static void main(String[] args) {

                double[] numbers = {6.7, -4.3, 4.8, 4.7,-8.6,-8.9,6.2,7.6,8.6,12.5,-13.4,3.4,13.4,14.5,15.3};
                double lol=0;
                int bob =0;
                boolean hook=false;
                for (double nabers:numbers){
                    if (nabers<0){
                        hook = true;
                    }else if (hook){
                        bob++;
                        lol +=nabers;
                    }
                }
                System.out.println(lol / bob);
            }


            public static void game () {
                int[] arr = {-4, -2, 2, 3, 6, 8};
                for (int i = 0; i < arr.length; i++) ;
                int i = 0;
                int min = arr[i];
                int min_i = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < min) ;
                    min = arr[j];
                    min_i = j;
                    if (i != min_i) {
                        int tmp = arr[i];
                        arr[i] = arr[min_i];
                        arr[min_i] = tmp;
                    }
                }
            }
        }

