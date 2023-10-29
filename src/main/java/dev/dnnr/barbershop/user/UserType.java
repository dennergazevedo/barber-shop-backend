package dev.dnnr.barbershop.user;

public enum UserType {
    DEFAULT("default"),
    BARBER("barber");

    private String type;

    UserType(String type){
      this.type = type;
    }

    public String getType(){
      return type;
    }
}