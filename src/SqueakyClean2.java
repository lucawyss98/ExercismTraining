class SqueakyClean2 {

    static String clean(String identifier) {
        char[] chars = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < chars.length; i++){

            if(Character.isISOControl(chars[i])) {
                builder.append("CTRL");
                continue;
            }
            if(Character.isWhitespace(chars[i])) {
                builder.append('_');
                continue;
            }

            if(Character.compare(chars[i],'-') == 0){
                for(int j = i+1; j<chars.length ; j++){
                    if(Character.isLetter(chars[j])){
                        builder.append(Character.toUpperCase(chars[j]));
                        i = j;
                        break;
                    }
                }
                continue;
            }

            if(chars[i] >= 'α' && chars[i] <= 'ω'){
                continue;
            }
            if (Character.isLetter(chars[i])){
                builder.append(chars[i]);
            }

        }
        return builder.toString();
    }

}
