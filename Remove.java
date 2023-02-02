import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        String fileDrectory="";
        File directory = new File(fileDrectory);
        List<String> vlists = new ArrayList<>();
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.getName().endsWith(".ppy")) {
                vlists.add(file.getName());
            }
        }
        System.out.print("Press 1 Scann  infected file");
        System.out.print("Press 2 Remove virues  ");
        System.out.print("Enter Operetion : ");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        if (Integer.valueOf(inputString) == 1) {
            if (vlists.size() > 0) {
                System.out.print(vlists.size() + " file are affected by virues \n ");
            }
            for (int i = 0; i < vlists.size(); i++) {
                System.out.print(vlists.get(i).toString() + "\n ");
                System.out.print("No virues is found");

            }

        } else if (Integer.valueOf(inputString) == 2) {
            // this metho used to remove extention file
            for (File file : files) {
                if (file.getName().endsWith(".ppy")) {
                    System.out.print(" \n  \n ");
                    String filename = file.getName().replace(".py.ppy", "");
                    Boolean isok = file.renameTo(new File(filename + ".py"));
                    if (isok == true) {
                        System.out.print("Successfully virues is Deleted");
                    }
                    ;
                }
            }
            System.out.print(" \n successfully virues is removed \n");

        }
        System.out.println("String read from console is : \n" + inputString);
    }

    public static String removeExtension(final String s) {
        return s != null && s.lastIndexOf(".") > 0 ? s.substring(0, s.lastIndexOf(".")) : s;
    }
}
