public class controles_de_flujo {
    public static void main(String[] args) throws Exception {

        int i;

        for(i=0;i<=5;i++){
            System.out.println(i);
            if(i == 3){
                break;
            }
            System.out.println(i);
        }

        for(i=0;i<=5;i++){
            System.out.println(i);
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}