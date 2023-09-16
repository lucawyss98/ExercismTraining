class SqueakyClean {

    private static String toTransform;
    static String clean(String identifier) {
        toTransform = identifier;
        String s = identifier.replaceAll(" ","_");
        s = s.replaceAll("\\\\", " CTRL");

        String result = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(c) || Character.compare(c,'_')== 0 || Character.compare(c, '-') == 0){
                if(Character.compare(c, '-') == 0){
                    result += SqueakyClean.getNextLetter(i);
                    i++;
                }else{
                    result += s.charAt(i);
                }
            }
        }
        return result;


    }

    private static char getNextLetter(int pos){
        for (int i =pos; i <toTransform.length(); i++){
            if(Character.isLetter(toTransform.charAt(i))){
                return Character.toUpperCase(toTransform.charAt(i));
            }
        }
        char c = 'o';
        return c;
    }
}
