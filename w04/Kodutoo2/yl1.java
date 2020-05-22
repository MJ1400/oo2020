
public class yl1 {
    public static void main(String[] args) {
        String paragraphOriginal = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        String paragraph = paragraphOriginal.toLowerCase();
        char charA = 'a';
        char charB = 'b';
        char charC = 'c';
        char charD = 'd';

        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        int counterUnique = 0;

        for (int i = 0; i < paragraph.length(); i++) {
            if (paragraph.charAt(i) == charA) {
                counterA++;
            } else if (paragraph.charAt(i) == charB) {
                counterB++;
            } else if (paragraph.charAt(i) == charC) {
                counterC++;
            } else if (paragraph.charAt(i) == charD) {
                counterD++;
            } else if (paragraph.charAt(i) == ',' || paragraph.charAt(i) == '.') {
                counterUnique++;
            }
        }
        System.out.print("A: " + counterA + " B: " + counterB + " C: " + counterC + " D: " + counterD + " Tähemärke: "
                + counterUnique);
    }
}
