import java.util.Scanner;
public class dados {
 public static int puntos_ordenador,
        puntos_humano,
        dadoUno,
        dadoDos,
        dadoTres,
        premio;
public  String turno;
    
public static char tirada;
        
        
    public dados(){
        puntos_ordenador = 0;
        puntos_humano = 0;
        dadoUno= 0;
        dadoDos= 0;
        dadoTres= 0;
        premio= 0;
        tirada = 'A';
        turno = "HUMANO";
    };
    


    public void cambiaturno() {
        if(turno == "HUMANO") {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Es tu turno, pulsa enter para tirar los datos o Q para terminar");
            System.out.println("---------------------------------------------------------------");
            puntos_humano += premio;
            turno = "ORDENADOR";
        }

        else if(turno == "ORDENADOR") {
            System.out.println("-------------------------");
            System.out.println("Es el turno del ordenador");
            System.out.println("--------------------------");
            puntos_ordenador += premio;
            turno = "HUMANO";
        }
        
    }
    
    
    public void tirar_dados(){
        
        if(turno == "HUMANO") {
            
            dadoUno = (int)(Math. random()*6+1);
            System.out.println(dadoUno);
            
            dadoDos = (int)(Math. random()*6+1);
            System.out.println(dadoDos);
            
            dadoTres = (int)(Math. random()*6+1);
            System.out.println(dadoTres);
        
        
        }
        
        else if (turno == "ORDENADOR") {
            
            Scanner sc = new Scanner(System.in);
            tirada = sc.next().charAt(0);
            
            dadoUno = (int)(Math. random()*6+1);
            System.out.println(dadoUno);
            
            dadoDos = (int)(Math. random()*6+1);
            System.out.println(dadoDos);
            
            dadoTres = (int)(Math. random()*6+1);
            System.out.println(dadoTres);
            
        }
        
    };
    
    public void comprobar_puntos() {
        
        if(dadoUno == dadoDos || dadoUno == dadoTres) {
            if(turno == "HUMANO")
                puntos_humano += 10;
            
            if(turno == "ORDENADOR")
                puntos_ordenador += 10;
        }
        
        else if(dadoUno == dadoDos && dadoUno == dadoTres) {
            System.out.println("---------------");
            System.out.println("Al puto Lobby");
            System.out.println("---------------");
            tirada = 'Q';
        }
        
        else if(dadoUno == 2 && dadoDos == 2 && dadoTres == 2){
            System.out.println("ohhh 2 2 2, migueeee, has visto eso???");
        }
        
        else if(dadoUno == 6){
            if(turno == "HUMANO")
                puntos_humano += 6;
            
            if(turno == "ORDENADOR")
                puntos_ordenador += 6;
            
        }
        
        else{
            if(turno == "HUMANO")
                puntos_humano += 20;
            
            if(turno == "ORDENADOR")
                puntos_ordenador += 20;
        }
}
}
    
    