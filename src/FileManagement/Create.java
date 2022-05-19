package FileManagement;

import java.io.File;
import java.io.IOException;

public class Create {
    private static String path;
    public Create(String fileName){
        try {
            path = "G:\\Arquivos\\JG\\Aprendiz (BOSCH-SENAI)\\1DSM-BOSCH\\SENAI\\" +
                    "1-FPOO\\Java\\Trabalhos\\19-05-2022\\" +
                    "PJAVA-PFPOO(001)-LOG-19.05.2022-0000\\src\\Files\\"+fileName+".txt";
            File myObj = new File(path);
            if (myObj.createNewFile()) {
                System.out.println("Arquivo Criado: " + myObj.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Um erro ocorreu.");
            e.printStackTrace();
        }
    }

    public static String getPath() {
        return path;
    }
}
