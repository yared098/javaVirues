import java.io.File;

public class Virus {
    public static void main(String[] args) {
         String fileDrectory="";
        File directory = new File(fileDrectory);
        System.out.print("\n");
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.getName().endsWith(".py")) {
                System.out.print(" \n  \n ");
                Boolean isRenamed = file.renameTo(new File(file.getName() + ".ppy"));
                if (isRenamed) {
                    System.out.print(" successfully renamed");
                } else {

                    System.out.print(" \n  \n ");
                }

            } else {
                // System.out.print("no file is found \n");
            }
        }
    }
}