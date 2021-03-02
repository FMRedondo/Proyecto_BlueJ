public class DadosApp{
public static void main(String[] args) {
    
        dados  dados= new dados();
        do {
            dados.cambiaturno();
            dados.tirar_dados();
            dados.comprobar_puntos();
        } while(dados.tirada != 'Q');
    
        System.out.println("----------------------------------------------------------------");
        System.out.println("Los puntos de ORDENADOR son " + dados.puntos_ordenador + " y los puntos del JUGADOR es " + dados.puntos_humano);
        if(dados.puntos_humano > dados.puntos_ordenador)
            System.out.println("GANA EL JUGADOR, POR LO QUE LA PELEA CON LA MAQUINA A FUNCIONADO, TE PONGO UN 9, POR QUE EL 10 NO LO PONGO");
        else if (dados.puntos_humano < dados.puntos_ordenador)
            System.out.println("GANA LA MAQUINILLA, NA, NO ERES TECNICO, A 1º DE SMR");
        else
            System.out.println("PORRAS LA MAQUINA IGUALA AL JUGADOR, ESTO NO FUNCIONARIA, ESTA CASI QUE BIEN.. EN CASA SE ENTIENDE???");
        System.out.println("----------------------------------------------------------------");
    
        
    }
}