package miscelleneous;

/**
 * 
 *  @author Abdulmalik Alzeer, 219211258@psu.edu.sa
 */
//Changes
public class JenkinsWithGit {
    public static void main(String[] args) {
        //code to print Unicode characters
        int charPerLine=0;
        for (int i = 33; i < 256; i++, charPerLine++) {
            System.out.print((char)i+((charPerLine%10==0)?"\n":"\t"));
            System.out.print();
        }
    }
}
