package master_list_iterator_autoboxing_arraylist_linkedlist_enums.enums;

public enum Topping {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice(){
        // return 0.5d;
        return switch(this){
            case BACON -> 1.5d;
            case CHEDDAR -> 1.0d;
            default -> 0.0d;
        };
    }
}
