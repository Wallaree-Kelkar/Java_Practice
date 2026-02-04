public class IntoM {
    /* Adapt Try This 1-2 so that it prints a conversion table of inches to meters. Display 12 feet  
of conversions, inch by inch. Output a blank line every 12 inches. (One meter equals 
approximately 39.37 inches.)*/ 
public static void main(String args[]){
double in,m;
System.out.println("Inches       Meters");
for(in=1; in<=100; in++){
    m = in/39.37;
    System.out.println(in+ "    "+ m);
    if(in%12==0) System.out.println();
}
}
}
