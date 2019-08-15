package SetUp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Repository
{
    private FileInputStream fileInputStream;
    private String ProjectPath = System.getProperty("user.dir");
    private String PropertiesFileLocation = ProjectPath + "\\src\\main\\resources\\repository.properties";
    private Properties properties = new Properties();

    public String EnvironmentProperties(String property)
    {
        try
        {
            fileInputStream = new FileInputStream(PropertiesFileLocation);
            properties.load(fileInputStream);
            property = properties.getProperty(property);
        }
        catch(IOException io)
        {
            io.printStackTrace();
        }
        return property;
    }
}
