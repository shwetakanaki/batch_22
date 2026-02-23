public class co {
    // by defining the multiple constructor with same name by differing in the no of parameters 
// no of position and data type of the parameters 
public co (){
 System.out.println("constructor with empty parameter");
}

public co(int a){
 System.out.println("constructor with a "+a);
}
public co(float a, int c){
System.out.println("constructor with a "+a +" "+c);
}
public co(int c,int a){
System.out.println("constructor with a "+a +" "+c);
}

public static void main(String[] args) {
    new co();
    new co(2f,7);
    new co(4,8);
    new co(3);
    
}
    
}
