public class Key {

    public static char charToSymbol(char input)
    {
        char answer = ' ';
        switch(input)
        {
            default:
                break;
            case 'a':
                answer = '#';
                break;
            case 'b':
                answer = '$';
                break;
            case 'c':
                answer = '%';
                break;
            case 'd':
                answer = '*';
                break;
            case 'e':
                answer = '@';
                break;
            case 'f':
                answer = '!';
                break;
            case 'g':
                answer = '^';
                break;
            case 'h':
                answer = '+';
                break;
            case 'i':
                answer = '\\';
                break;
            case 'j':
                answer = '|';
                break;
            case 'k':
                answer = '/';
                break;
            case 'l':
                answer = '?';
                break;
            case 'm':
                answer = '-';
                break;
            case 'n':
                answer = '=';
                break;
            case 'o':
                answer = '`';
                break;
            case 'p':
                answer = '~';
                break;
            case 'q':
                answer = '<';
                break;
            case 'r':
                answer = '>';
                break;
            case 's':
                answer = ';';
                break;
            case 't':
                answer = ':';
                break;
            case 'u':
                answer = '\'';
                break;
            case 'v':
                answer = '\"';
                break;
            case 'w':
                answer = '[';
                break;
            case 'x':
                answer = ']';
                break;
            case 'y':
                answer = '{';
                break;
            case 'z':
                answer = '}';
                break;
        }

        return answer;
    }
    public static char symbolToChar(char input)
    {
        char answer = ' ';
        switch(input)
        {
            default:
                break;
            case '#':
                answer = 'a';
                break;
            case '$':
                answer = 'b';
                break;
            case '%':
                answer = 'c';
                break;
            case '*':
                answer = 'd';
                break;
            case '@':
                answer = 'e';
                break;
            case '!':
                answer = 'f';
                break;
            case '^':
                answer = 'g';
                break;
            case '+':
                answer = 'h';
                break;
            case '\\':
                answer = 'i';
                break;
            case '|':
                answer = 'j';
                break;
            case '/':
                answer = 'k';
                break;
            case '?':
                answer = 'l';
                break;
            case '-':
                answer = 'm';
                break;
            case '=':
                answer = 'n';
                break;
            case '`':
                answer = 'o';
                break;
            case '~':
                answer = 'p';
                break;
            case '<':
                answer = 'q';
                break;
            case '>':
                answer = 'r';
                break;
            case ';':
                answer = 's';
                break;
            case ':':
                answer = 't';
                break;
            case '\'':
                answer = 'u';
                break;
            case '\"':
                answer = 'v';
                break;
            case '[':
                answer = 'w';
                break;
            case ']':
                answer = 'x';
                break;
            case '{':
                answer = 'y';
                break;
            case '}':
                answer = 'z';
                break;
        }
        return answer;
    }

    /*
A   #
B   $
C   %
D   *
E   @
F   !
G   ^
H   +
I   \
J   |
K   /
L   ?
M   -
N   =
O   `
P   ~
Q   <
R   >
S   ;
T   :
U   '
V   "
W   [
X   ]
Y   {
Z   }
 */
}

