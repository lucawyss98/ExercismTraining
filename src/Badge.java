class Badge {
    String space = " - ";
    String owner = "OWNER";
    public String print(Integer id, String name, String department) {

        if(id == null && department == null){
            return name + space + owner;
        }
        if (id == null){
            return name + space + department.toUpperCase();
        }
        if (department == null){
            return idFormatter(id) + space + name + space + owner;
        }
        return idFormatter(id) + space + name + space + department.toUpperCase();
    }
    private String idFormatter(Integer id){
        return "[" + id + "]";
    }

}
