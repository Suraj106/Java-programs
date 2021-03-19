class Flower{
String name;
String color;

void blooming(){
System.out.println(color + " " + name + " is blooming");
}
public static void main(String[] args){
Flower rose = new Flower();
rose.name = "Rose";
rose.color = "Red";
rose.blooming();
}
}