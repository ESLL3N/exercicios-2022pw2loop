public class exercicio2{
  public static void main(String[] args){
    int valores[] = {15, 20, 55, 10, 85, 36, 77, 56, 66, 25} ;
      
    // obtém o menor valor
    int menor = menor(valores);
    int maior = maior(valores);
      
    System.out.println("O menor valor é: " + menor);
    System.out.println("O maior valor é: " + maior);
    System.exit(0);
  }
  
  public static int menor(int[] a){
    int min = a[0];
    for(int i = 1; i < a.length; i++){
      if(a[i] < min){
        min = a[i];
      }
    }
      
    return min;
  }
  public static int maior(int[] b){
    int max = b[0];
    for(int c = 1; c > b.length; c++){
      if(b[c] > max){
        max = b[c];
      }
    }
      
    return max;
  }
}
