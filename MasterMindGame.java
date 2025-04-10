package MasterMind;

import java.util.Scanner;

public class MasterMindGame {
    public static final String ENCERTAT_3 = "000";  
    public static final String ENCERTAT_5 = "00000"; 

    private CodeGenerator generadorCodigo;
    private Player jugador;
    private RobotPlayer robot;
    private Feedback feedback;
    private String codigoSecreto;
    private boolean esTurnoRobot;

    public MasterMindGame(Player jugador, RobotPlayer robot) {
        generadorCodigo = new CodeGenerator();
        this.jugador = jugador;
        this.robot = robot;
        feedback = new Feedback();
        codigoSecreto = generadorCodigo.generarCodigo(jugador.getLongitudCodigo());
        esTurnoRobot = false;
    }

    public void iniciar() {
        boolean ganado = false;

        while (!ganado) {
            if (!esTurnoRobot) {
                String intento = jugador.hacerIntento();
                String respuesta = feedback.obtenerRetroalimentacion(codigoSecreto, intento);
                System.out.println("Respuesta del jugador: " + respuesta);

                if (respuesta.equals(String.valueOf(Feedback.TOTALMENTE_CORRECTO).repeat(jugador.getLongitudCodigo()))) {
                    System.out.println("¡Has ganado!");
                    ganado = true;
                } else {
                    System.out.println("Turno del Robot...");
                    esTurnoRobot = true;
                }
            } else {
                String intentoRobot = robot.hacerIntento();
                String retroalimentacionRobot = feedback.obtenerRetroalimentacion(codigoSecreto, intentoRobot);
                System.out.println("Robot ha generado: " + intentoRobot);
                System.out.println("Respuesta del Robot: " + retroalimentacionRobot);

                if (retroalimentacionRobot.equals(String.valueOf(Feedback.TOTALMENTE_CORRECTO).repeat(robot.getLongitudCodigo()))) {
                    System.out.println("¡El Robot ha ganado!");
                    ganado = true;
                } else {
                    robot.actualizarIntento(retroalimentacionRobot);
                    esTurnoRobot = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Selecciona el tipo de jugador (1: Adulto, 2: Niño): ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        Player jugador;
        RobotPlayer robot;
        if (opcion == 1) {
            jugador = new AdultHumanPlayer();
            robot = new RobotPlayer(5);
        } else {
            jugador = new ChildHumanPlayer();
            robot = new RobotPlayer(3);
        }

        MasterMindGame juego = new MasterMindGame(jugador, robot);
        juego.iniciar();
        scanner.close();
    }
}