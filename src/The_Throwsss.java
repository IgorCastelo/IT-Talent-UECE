public class The_Throwsss {

    float notas_f(float[] notas) throws IllegalArgumentException {
            float media=0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 10) {
                throw new IllegalArgumentException();
            }
             media+=notas[i];
        }
        return media/notas.length;

    }

    public static void main(String[] args) {
     float notas [] = {10f,11f,7f,6f,5f};
     try{
        float s = new The_Throwsss().notas_f(notas);
         System.out.println("A sua média é: "+s);
     }catch(IllegalArgumentException e){
         System.out.println("Nota  invalido!");
     }
    }
}