 public class Main  {
    public static void main(String [] args){

        String poly=args[1];
        double racine=Double.parseDouble(args[0]);

        double a,b,c,d,x1,x2,delta;
        poly=poly.toLowerCase();
        String[]p1=poly.split("xxx");
        String[]p2=p1[1].split("xx");
        String[]p3=p2[1].split("x");
        if(p1[0].equals("") || p1[0].equals("+"))p1[0]="1";
        else if(p1[0].equals("-"))p1[0]="-1";
        if(p2[0].equals("") || p2[0].equals("+"))p2[0]="1";
        else if(p2[0].equals("-"))p2[0]="-1";
        if(p3[0].equals("") || p3[0].equals("+"))p3[0]="1";
        else if(p3[0].equals("-"))p3[0]="-1";
        a=Double.parseDouble(p1[0]);
        b=Double.parseDouble(p2[0]);
        c=Double.parseDouble(p3[0]);
        d=Double.parseDouble(p3[1]);
        Double vRacine = a*Math.pow(racine,3)+b*Math.pow(racine,2)+c*racine+d;
        if(vRacine == 0){
            b=b+(a*racine);
            c=c+(b*racine);
            delta=(Math.pow(b,2))-(4*a*c);
            if(delta>0){
                x1=(-b-Math.sqrt(delta))/(2*a);
                x2=(-b+Math.sqrt(delta))/(2*a);
                System.out.print("Les solutions sont x : "+x1+" et x : "+x2);
            }
            else if (delta==0){
                x1=-b/2*a;
                System.out.print("L'autre solution est x : "+x1);
            }
            else System.out.print("L'equation "+poly+" n'admet pas de solutions");
        }else
            System.out.print(racine+" n'est pas une racine de l'equation "+poly);


    }
}