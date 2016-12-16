/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Andreas
 */
public class SaveLoad {
    
    static FileReader fr = null;
    static BufferedReader br = null;
    
    public static String loadFile(String path) throws FileNotFoundException, IOException
    {
        System.out.println("Got request to load file: "+path);
        fr = new FileReader(path);
        br = new BufferedReader(fr);
        
        String currentLine;
        String fullText = "";
        
        while((currentLine = br.readLine()) != null)
        {
            fullText += currentLine + "\n";
        }
        
        br.close();
        fr.close();
        
        
        return fullText;
    }
    
    public static void saveFile(String path, String content)
    {
        
    }
}
