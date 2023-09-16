class RaindropConverter {

    String convert(int number) {
        String result = "";
        if(number%3 == 0)
            result += "Pling";
        if(number%3 == 0)
            result += "Plang";
        if(number%3 == 0)
            result += "Plong";
        if(result !="")
            return result;
        return result += number;
    }

}
