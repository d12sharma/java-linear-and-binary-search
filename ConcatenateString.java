public class ConcatenateString {
    public static void main(String[] args) {

        String[] words = {"Hello", " ", "World", "!", " Welcome", " to", " Java."};


        String result = concatenateStrings(words);


        System.out.println("Concatenated String: " + result);
    }

    public static String concatenateStrings(String[] strings) {

        StringBuffer sb = new StringBuffer();


        for (String str : strings) {
            sb.append(str);
        }

        // Convert StringBuffer to String and return
        return sb.toString();
    }
}
