/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie1ex5;

import java.util.*;

/**
 *
 * @author apps
 */
public class serie1ex5 {
    // -------------- Question 1 ----------------
    public static boolean lettre(String lexem){
        for(int i=0;i<lexem.length();i++)
            if (!Character.isLetter(lexem.charAt(i)))
                return false;
            return true;
        }
    // -------------- Question 2 ----------------
    public static boolean lettrechiffre(String lexem){
        for(int i=0;i<lexem.length();i++)
            if (!Character.isLetterOrDigit(lexem.charAt(i)))
                return false;
            return true;
        }
    // -------------- Question 3 ----------------
    public static boolean id(String lexem){
        
        if (!Character.isLetter(lexem.charAt(0)))
            return false;
        
        for(int i=1;i<lexem.length();i++)
            if (!Character.isLetterOrDigit(lexem.charAt(i)))
                return false;
            return true;
        }
    // -------------- Question 4 ----------------
    public static boolean entier(String lexem){
        
        for(int i=0;i<lexem.length();i++)
            if (!Character.isDigit(lexem.charAt(i)))
                return false;
            return true;
        }
    // -------------- Question 5 ----------------
    public static boolean flaot(String lexem){
        String[] array = lexem.split("\\.");
        
        if(array.length ==2 )
            if (entier(array[0]) && entier(array[1]))
                return true;
            return false;
        }
    // -------------- Question 6 ----------------
    public static boolean op(String lexem){
        String[] arr = {"+","-","*","/"};
            for( int i=0;i<lexem.length();i++)
                if(arr[i].equals(lexem))
                    return true;
            return false;
        }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Veuillez saisir les valeur a verifier: \n");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String mots="";
        StringTokenizer mot=new StringTokenizer(text);
        while (mot.hasMoreTokens()) {
        mots=mot.nextToken();
        
        if (lettre(mots))
            System.out.println(mots + " :lettres");
        else if(id(mots))
                System.out.println(mots + " :id");
        else if(entier(mots))
            System.out.println(mots + " :Int");
        else if(lettrechiffre(mots))
             System.out.println(mots + " :lettres et chifre");
        else if (flaot(mots))
            System.out.println(mots + " :Float");
        else if (op(mots))
            System.out.println(mots + " :Operateur");
        else
            System.out.println(mots + " :incorect");
            }
        }
    }