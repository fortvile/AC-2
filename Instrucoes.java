/*@author: Rafael Pereira Vilefort
 * Matrícula: 740026
 */

import java.util.*;

public class Instrucoes{

    public static boolean isFim(String entrada){
        return(entrada.length() == 4 && entrada.charAt(0) == 'f' && entrada.charAt(1) == 'i' && entrada.charAt(2) == 'm' && entrada.charAt(3) == '.');
    }

    public static String nAeB(String X, String Y){
        String result = "";

        if(X == "10"){
            X = "A";
        }
        else if(X == "11"){
            X = "B";
        }
        else if(X == "12"){
            X = "C";
        }
        else if(X == "13"){
            X = "D";
        }
        else if(X == "14"){
            X = "E";
        }
        else if(X == "15"){
            X = "F";
        }

        if(Y == "10"){
            Y = "A";
        }
        else if(Y == "11"){
            Y = "B";
        }
        else if(Y == "12"){
            Y = "C";
        }
        else if(Y == "13"){
            Y = "D";
        }
        else if(Y == "14"){
            Y = "E";
        }
        else if(Y == "15"){
            Y = "F";
        }

        result = X + "4" + Y;
        return result;

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String X = "0", Y = "0" , W = "0";
        String entrada;
        int i = 0;

        String[] entradas = new String[30000];

        /* 
        entrada = scan.nextLine();

        while(isFim(entrada) == false){
            entrada = scan.nextLine();
            entradas[i] = entrada;
            i++;
        }
        i--;
        */
        entrada = scan.nextLine();

        do{
            entrada = scan.nextLine();
            entradas[i] = entrada;
            i++;
        }while(isFim(entrada) == false);
        i--;

        String aux;
        for(int j = 0 ; j < i; j++){
            //System.out.println(entradas[j]);
            if(entradas[j].charAt(0) == 'X'){
                aux = entradas[j].substring(2, entradas[j].length()-1);
                X = aux;
                if(X.contentEquals("10")){
                    X = "A";
                }
                else if(X.contentEquals("11")){
                    X = "B";
                }
                else if(X.contentEquals("12")){
                    X = "C";
                }
                else if(X.contentEquals("13")){
                    X = "D";
                }
                else if(X.contentEquals("14")){
                    X = "E";
                }
                else if(X.contentEquals("15")){
                    X = "F";
                }
                //System.out.println(X);
            }
            if(entradas[j].charAt(0) == 'Y'){
                aux = entradas[j].substring(2, entradas[j].length()-1);
                Y = aux;
                if(Y.contentEquals("10")){
                    Y = "A";
                }
                else if(Y.contentEquals("11")){
                    Y = "B";
                }
                else if(Y.contentEquals("12")){
                    Y = "C";
                }
                else if(Y.contentEquals("13")){
                    Y = "D";
                }
                else if(Y.contentEquals("14")){
                    Y = "E";
                }
                else if(Y.contentEquals("15")){
                    Y = "F";
                }
               //System.out.println(Y);
            }
            if(entradas[j].charAt(0) == 'W'){
                aux = entradas[j].substring(2, entradas[j].length()-1);
                W = aux;
                if(W.contentEquals("An")){
                    W = "0";
                }
                else if(W.contentEquals("Bn")){
                    W = "1";
                }
                else if (W.contentEquals("umL")){
                    W = "2";
                }
                else if(W.contentEquals("zeroL")){
                    W = "3";
                }
                else if(W.contentEquals("nAeB")){
                    W = "4";
                }
                else if(W.contentEquals("nAoB")){
                    W = "5";
                }
                else if(W.contentEquals("AxB")){
                    W = "6";
                }
                else if(W.contentEquals("AeBn")){
                    W = "7";
                }
                else if(W.contentEquals("AnoB")){
                    W = "8";
                }
                else if(W.contentEquals("nAxB")){
                    W = "9";
                }
                else if(W.contentEquals("AoB")){
                    W = "A";
                }
                else if(W.contentEquals("AeB")){
                    W = "B";
                }
                else if(W.contentEquals("AneB")){
                    W = "C";
                }
                else if(W.contentEquals("AoBn")){
                    W = "D";
                }
                else if(W.contentEquals("copiaB")){
                    W = "E";
                }
                else if(W.contentEquals("copiaA")){
                    W = "F";
                }
                
                System.out.println(X + Y + W);
            }
        }

        scan.close();
    }
}
