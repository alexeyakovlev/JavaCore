package Task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

//Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup
public class Backup {
    public static void backup(String srcDir) throws IOException {
        File sourceDir = new File(srcDir);
        File backupDir = new File("./backup");
        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        for (File file : sourceDir.listFiles()) {
            if (file.isFile()) {
                Path sourcePath = file.toPath();
                Path targetPath = Paths.get(backupDir.getAbsolutePath(), file.getName());
                Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }
}