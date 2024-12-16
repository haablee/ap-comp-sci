/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = {5, 5, 7, 8, 8, 8, 3, 3};
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        
        int dupeCheck = 8;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == dupeCheck){
                System.out.print(i + ", ");
            }
        }
        
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1]){
                System.out.println("Consecutive at " + i + " and " + (i + 1));
            }
        }
        
	}
}