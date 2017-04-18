
public class Main {

    
    public static void main(String[] args) {
        
        int A [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Buscando el 7");
        for (int i = 0; i < A.length; i++){
            
            System.out.println();
            
            if (A[i] == 7){
                
                System.out.print("Encontrado: " + A[i]);
                
            }else{
                System.out.print("No encontrado");
                
            }
            
        }
        
    }
    
}
