public class ajedrez {
    public static void main(String[] args) {

        String negra = "##";
        String blanca = "  ";



        for(int i=0; i < 8; i++ )
        {
            for(int j=0; j<4; j++)
            {
                if(i % 2 == 0){
                
                    System.out.print(blanca);
                    System.out.print(negra);
                }else{
                    System.out.print(negra);
                    System.out.print(blanca);
                }
            }
            System.out.println("");
        }

    }
}
