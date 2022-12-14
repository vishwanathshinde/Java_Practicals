import java.io.*;

class A4
{
    public static void main(String[] args)
    {
        try
        {
            int linescnt=0, charscnt=0, wordscnt=0;
            int code=0;
            FileInputStream fis = new FileInputStream("sample.txt");
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String currentline = br.readLine();
            while(currentline != null)
            {
                linescnt++;
	            String[] words = currentline.split(" ");
 	            wordscnt=wordscnt + words.length;
 	            for(String word: words)
	            {
		            charscnt=charscnt + word.length();
  	            }	
	            currentline=br.readLine();
            }
            System.out.println("No. of characters : "+charscnt);
            System.out.println("No. of Words: "+wordscnt);
            System.out.println("No. of lines: "+linescnt);
            fis.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot find the specified file..");
        }
        catch(IOException i)
        {
            System.out.println("Cannot read file..");
        }
    }
}