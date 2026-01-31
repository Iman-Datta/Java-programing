class First {
    public static void main(String[] args) {
        int a, b;
        a=10;
        b=20;
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));

        if(a>b){
            System.out.println(a+" is greater than "+b);
        } else {
            System.out.println(b+" is greater than "+a);
        }

        for(int c=1;c<=10;c++){
            System.out.println("2 x "+c+" = "+(2*c));
        }

        int c = 1;
        do {
            System.out.println("3 x "+c+" = "+(3*c));
            c++;
        } while(c<=10);
    }
}