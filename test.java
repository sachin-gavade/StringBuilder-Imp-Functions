public class test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //Set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insert char at index 0
        sb.insert(0, 'S');
        System.out.println(sb);

        //Deleting S
        //Ending index is exclusive(not considered)
        sb.delete(0, 1);
        System.out.println(sb);

        //Appending(Adding elements at the end of the String) elements
        sb.append('y');
        System.out.println(sb);
    }
}