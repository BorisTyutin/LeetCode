package by.tyutin.leet.code.text_formatter;


public class Format
{


    public static void main(String[] args)
    {;

        System.out.println(numberOfStrings(
                "Some text",
                120));
    }


    public static int numberOfStrings(String source, int stringWidth)
    {
        int startIndex = 0, stringCounter = 0, currentSymbol = stringWidth;
        while (currentSymbol <= source.length())
        {
            if (source.charAt(currentSymbol) != ' ')

            {
                while (source.charAt(currentSymbol) != ' ')
                {
                    currentSymbol--;
                }
            }
            else
            {
                System.out.println(source.substring(startIndex, ++currentSymbol));
                stringCounter++;
                startIndex = currentSymbol;
                currentSymbol += stringWidth;
            }
        }
        System.out.println(source.substring(startIndex));
        stringCounter++;
        return stringCounter;
    }
}
