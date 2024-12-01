package leituraeescritadearquivos.xml;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) throws IOException {
        Properties sites = new Properties();

        try(FileInputStream fileInputStream = new FileInputStream("./input/sites.xml")){
            sites.loadFromXML(fileInputStream);
        }catch (IOException fileNotFoundException){
            throw new IOException("Erro ao ler aquivio XML");
        }

        System.out.println(sites.getProperty("1"));
        System.out.println(sites.getProperty("2"));
        System.out.println(sites.getProperty("3"));
    }
}
