package org.example;

public class Matriz {
    public void generarTriangulo(int tam){
        String[][] triangulo = new String[tam][tam];
        for (int i=0;i<triangulo.length;i++){
            for (int j=0;j<triangulo.length;j++){
                if (j<=i){
                    triangulo[i][j] = "* ";
                }else{
                    triangulo[i][j] = "";
                }
            }
        }

        for (int i=0;i<triangulo.length;i++){
            for (int j=0;j<triangulo.length;j++){
                System.out.print(triangulo[i][j]);
            }
            System.out.println();
        }
    }

    public void generarTrianguloInvertido(int tam){
        String[][] triangulo = new String[tam][tam];
        for (int i=0;i<triangulo.length;i++){
            for (int j=0;j<triangulo.length;j++){
                if (j>=i){
                    triangulo[i][j] = "* ";
                }else{
                    triangulo[i][j] = "  ";
                }
            }
        }

        for (int i=0;i<triangulo.length;i++){
            for (int j=0;j<triangulo.length;j++){
                System.out.print(triangulo[i][j]);
            }
            System.out.println();
        }
    }
}
