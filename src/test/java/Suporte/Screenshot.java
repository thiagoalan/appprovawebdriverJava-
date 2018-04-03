package Suporte;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshot {
    public static void tirar(WebDriver nav, String arquivo){
        File screenshot = ((TakesScreenshot)nav).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(screenshot, new File(arquivo));
        }
        catch (Exception e){
            System.out.print("Tivemos problemas para gravar evidência na pasta" + e.getMessage());
        }
    }
}
