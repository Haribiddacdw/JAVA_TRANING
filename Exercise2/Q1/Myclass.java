package Q1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Myclass {
    public static void IOException() throws FileNotFoundException {
        FileReader fileReader = new FileReader("/Users/hariprasathv/Documents/JAVA/Exercise2/Q1/hari.txt");  
        BufferedReader br = new BufferedReader(fileReader);
        fileReader.close();
        br.readLine();
    }

    public static void main(String[] args) throws FileNotFoundException {
        
        IOException();
    }
}

// unhandled exeception type Ioexception because we cannot handled it here  
// we trying to read that file that file is already close so that why the IOEXCEPTION IS throw
//