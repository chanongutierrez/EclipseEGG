package miProjectPseint;
import java.util.Scanner;

import java.util.Random;
import javax.swing.JOptionPane;


public class Botellas {
    public static void main(String[] args) {
    	

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String user, pass;
		
        int i, pesoBotellas,botellas, valorBotellas, saldo, saldoF, acepta2;
        int menu2;
        i = 0;
        saldo = 0;
        saldoF = 0;

        do {
            user=JOptionPane.showInputDialog(null,"ingrese su usario");
            pass=JOptionPane.showInputDialog(null,"ingrese su clave");
            i++;
            if (user.equals("Luciano") && pass.equals("1234")) {
               JOptionPane.showMessageDialog(null,"ususario autentificado");
            } else {
            	JOptionPane.showMessageDialog(null,"Clave incorrecta");
            }
        } while (i < 3 && !(user.equals("Luciano") && pass.equals("1234")));

        if (i >= 3) {
        	JOptionPane.showMessageDialog(null,"clave bloqueada");
        }

        if (user.equals("Luciano") && pass.equals("1234")) {
            do {
               
            	Object[] menu={"1- ingresar botellas","2-consultar saldo","3-salir"};
            	
                menu2 = JOptionPane.showOptionDialog(null, "Seleccione una Opcion","reciclado de botellas",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, menu,menu[0]);
                saldo = 0;
                switch (menu2) {
                    case 0:
                       
                        botellas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de botellas"));
                        for (i = 1; i <= botellas; i++) {
                            pesoBotellas = rand.nextInt(2901) + 100;
                            if (pesoBotellas <= 500) {
                                valorBotellas = 50;
                            } else if (pesoBotellas > 500 && pesoBotellas <= 1500) {
                                valorBotellas = 125;
                            } else {
                                valorBotellas = 200;
                            }
                            saldo += valorBotellas;
                            JOptionPane.showMessageDialog(null,"botella " + i + " con peso " + pesoBotellas + "gr valor $" + valorBotellas);
                        }
                        JOptionPane.showMessageDialog(null,"el saldo va a aumentar en: $" + saldo);
                        Object[] acepta={"1-si","2-no"};
                        acepta2 = JOptionPane.showOptionDialog(null, "acepta el valor ofrecido?","reciclado de botellas",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, acepta,acepta[0]);
                        if (acepta2==0) {
                            saldoF += saldo;
                            JOptionPane.showMessageDialog(null,"finalizando operacion.....");
                            JOptionPane.showMessageDialog(null,"Saldo actualizado");
                                } else if (acepta2==1) {
                                	JOptionPane.showMessageDialog(null,"Devolviendo material");
                                } else {
                                	JOptionPane.showMessageDialog(null,"opcion incorrecta");
                                }
                                break;
                            case 1:
                            	JOptionPane.showMessageDialog(null,"Su saldo actual es: $" + saldoF);
                                break;
                            case 2:
                            	JOptionPane.showMessageDialog(null,"Saliendo del programa");
                                break;
                            default:
                            	JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                                break;
                                }
                       } while (menu2!=2);
             } sc.close();        
            }
    
        }

