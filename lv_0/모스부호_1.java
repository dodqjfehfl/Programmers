public class 모스부호_1 {
    public char decodeMorse(String morse) {
        switch (morse) {
            case ".-":
                return 'a';
            case "-...":
                return 'b';
            case "-.-.":
                return 'c';
            case "-..":
                return 'd';
            case ".":
                return 'e';
            case "..-.":
                return 'f';
            case "--.":
                return 'g';
            case "....":
                return 'h';
            case "..":
                return 'i';
            case ".---":
                return 'j';
            case "-.-":
                return 'k';
            case ".-..":
                return 'l';
            case "--":
                return 'm';
            case "-.":
                return 'n';
            case "---":
                return 'o';
            case ".--.":
                return 'p';
            case "--.-":
                return 'q';
            case ".-.":
                return 'r';
            case "...":
                return 's';
            case "-":
                return 't';
            case "..-":
                return 'u';
            case "...-":
                return 'v';
            case ".--":
                return 'w';
            case "-..-":
                return 'x';
            case "-.--":
                return 'y';
            case "--..":
                return 'z';
        }
        return 0;
    }

    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        char c = '0';
        String morse = "";
        /*
        '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
        '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
        '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
        '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
        '-.--':'y','--..':'z'
         */

        for (int i = 0; i < letter.length(); i++) {
            c = letter.charAt(i);

            if (c == ' ') {
                // 모스부호 찾기
                morse = temp.toString();
                temp = new StringBuilder();
                answer.append(decodeMorse(morse));

            } else {
                temp.append(c);
            }
        }

        morse = temp.toString();
        temp = new StringBuilder();
        answer.append(decodeMorse(morse));

        return answer.toString();
    }
}
