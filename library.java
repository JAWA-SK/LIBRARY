
import java.util.*;
import java.time.*;
public class library {
    static Scanner sc=new Scanner(System.in);
    static int h,id=1000,jj,usid=100,poo=0;
    static String h1="";
    static ArrayList<String>l=new ArrayList<>();//username
    static ArrayList<String>l1=new ArrayList<>();//password
    //---------------------------------------------------------//
    static ArrayList<String>l2=new ArrayList<>();//BOOK
    static ArrayList<String>l3=new ArrayList<>();//type
    static ArrayList<String>l4=new ArrayList<>();//count
    static ArrayList<Integer>l8=new ArrayList<>();//BOOKid
    static ArrayList<String>l11=new ArrayList<>();//BOOKprice
    //--------------------------------------------------------//
    static ArrayList<String>b=new ArrayList<>();//addtocard
    static ArrayList<String>b1=new ArrayList<>();//userid
    //---------------------------------------------------------//
    static ArrayList<String>l5=new ArrayList<>();//username
   static ArrayList<String>l6=new ArrayList<>();//userpin
    static ArrayList<Integer>l7=new ArrayList<>();//userid
    //------------------------------------------------------------//
    static ArrayList<String>l9=new ArrayList<>();//useracc
    static ArrayList<String>l10=new ArrayList<>();//boroowdate
    static ArrayList<String>l12=new ArrayList<>();//duedate
    //------------------------------------------------------------//


    
     public static void main(String[] args)throws Exception {
        l2.add("he");
        l3.add("fff");
        l4.add("55");
        l8.add(1000);
        l9.add("1500");
        l11.add("1500");
        l7.add(100);
         welcome();
        
    }
    public static void welcome()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\tWELCOME TO THE LIBRARY");
        System.out.println();
        System.out.println("1.ADMIN");
        System.out.println("2.BORROWER");
        System.out.println("3.EXIT");
        System.out.println();
        System.out.println("ENTER THE CHOICE");
        h=sc.nextInt();
        home();
    }
    public static void home()
    {
        if(h<1||h>3)
        welcome();
        else
        switch(h)
        {
            case 1: admin();
            case 2: user();
            case 3: welcome();

        }
    }
    public static void admin()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\tWELCOME ADMIN");
        System.out.println();
        System.out.println("1.ENTER YOUR NAME");
        h1=sc.next();
        System.out.println();
        System.out.println("ENTER YOUR ID");
        String h2=sc.next();
        if(h1.contains("JAWA")&&h2.contains("10")||l.contains(h1)&&l1.contains(h2))
        {
            admin1();
        }
        else{
            System.out.println();
            System.out.println("\t\tYOUR  DETAILS ARE NOT REGISTERED!!!");
            System.out.println();
            sc.nextLine();
            System.out.println();
            System.out.println("====PRESS ENTER TO CONTINUE====");
	        sc.nextLine();
	        String s=sc.nextLine();
	        if(s.equals(""))
            welcome();
        }
    }
    public static void admin1()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\t!!!  HELLO "+h1+"  !!!");
        System.out.println();
        System.out.println("1.ADD ADMIN");
        System.out.println("2.ADD BOOK");
        System.out.println("3.VIEW BOOKS");
        System.out.println("4.DELETE BOOK");
        System.out.println("5.EDIT STOCKS");
        System.out.println("6.VIEW SOLD BOOKS");
        System.out.println("7.EXIT");
        String h3=sc.next();
        if(h3.equals("1"))
        addadmin();
        else if(h3.equals("2"))
        addbook();
        else if(h3.equals("3"))
        view();
        else if(h3.equals("4"))
        delete();
        else if(h3.equals("5"))
        edit();
        else if(h3.equals("6"))
        soldout();
        else
        welcome();
    }
    public static void addadmin()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("ENTER THE ADMIN NAME");
        String h4=sc.next();
        System.out.println("ENTER THE ID");
        String h5=sc.next();
        System.out.println("RE-ENTER THE ID");
        String h6=sc.next();
        if(h5.equals(h6))
        {
            l.add(h4);
            l1.add(h6);
            System.out.println("\t\tADMIN ADDED SUCCESSFULLY");
        }
        else{
            System.out.println("ID DOESN'T MATCH");
            
        }
        System.out.println();
            System.out.println("====PRESS ENTER TO CONTINUE====");
	        sc.nextLine();
	        String s=sc.nextLine();
	        if(s.equals(""))
            admin1();
    }
    public static void user()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\tWELCOME");
        System.out.println();
        System.out.println("1.LOGIN");
        System.out.println("2.SIGN UP");
        System.out.println("3.EXIT");
        System.out.println();
        int o=sc.nextInt();
        if(o==1)
        {
            loginuser();
        }
        else if(o==2)
        {
            signupuser();
        }
        else
        {
            welcome();
        }


    }
    public static void addbook()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("ENTER THE BOOK NAME");
        String j =sc.next();
        System.out.println();
        System.out.println("ENTER THE BOOK TYPE");
        System.out.println();
        System.out.println("1.PHYSICS");
        System.out.println("2.COMICS");
        System.out.println("3.AUTO-BIOGRAPHY");
        int j1=sc.nextInt();
        System.out.println();
        System.out.println("ENTER THE BOOK QUANTITY");
        String j2=sc.next();
        System.out.println();
        System.out.println("ENTER THE BOOK PRICE");
        String lll=sc.next();
        if(j1==1)
        {
        l2.add(j);
        l3.add("PHYSICS");
        l4.add(j2);
        l8.add(id);
        l11.add(lll);
        id++;
        }
        else if(j1==2)
        {
        l2.add(j);
        l3.add("COMICS");
        l4.add(j2);
        l8.add(id);
        l11.add(lll);
        id++;
        }
        else if(j1==3){
        l2.add(j);
        l3.add("AUTO-BIO");
        l4.add(j2);
        l8.add(id);
        l11.add(lll);
        id++;
        }
        else{
        System.out.println("ENTER THE CORRECT TYPE");
    }
        System.out.println();
        System.out.println("====PRESS ENTER TO CONTINUE====");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals(""))
        admin1();
    }
    public static void view()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if(l2.size()<1)
        {
            System.out.println("NOTHING TO DISPLAY");
        }
        else{
            System.out.println("BOOK NAME ||  BOOK TYPE   ||  BOOK QAUNTITY  ||   BOOK PRICE ");
        for(int i=0;i<l2.size();i++){
        System.out.println(   l2.get(i)+"           "+l3.get(i)+"          "+l4.get(i)+"                      "+l11.get(i));
        }
    }
System.out.println();
System.out.println("====PRESS ENTER TO CONTINUE====");
sc.nextLine();
String s=sc.nextLine();
if(s.equals(""))
admin1();
}
public static void delete()
{
    System.out.print("\033[H\033[2J");
        System.out.flush();
    System.out.println("\t\tENTER THE BOOK ID TO BE DELETED ");
    System.out.println();
    for(int i=0;i<l8.size();i++){
    System.out.println("BOOK ID IS : "+l8.get(i)+"||"+" BOOK NAME IS : "+l2.get(i)+"||"+" BOOK TYPE IS : "+l3.get(i));
}
 int k=sc.nextInt();
 int y=l8.indexOf(k);
 l2.remove(y);
 l3.remove(y);
 l4.remove(y);
 l8.remove(y);
 System.out.println();
 System.out.println("SUCCESFULLY DELETED");
System.out.println();
System.out.println("====PRESS ENTER TO CONTINUE====");
sc.nextLine();
String s=sc.nextLine();
if(s.equals(""))
admin1();
}
public static void edit()
{
    System.out.print("\033[H\033[2J");
        System.out.flush();
    System.out.println("\t\tWELCOME ADMIN");
    System.out.println();
    for(int i=0;i<l8.size();i++){
        System.out.println("BOOK ID IS : "+l8.get(i)+"||"+" BOOK NAME IS : "+l2.get(i)+"||"+"BOOK QUANTITY : "+l4.get(i)+"||"+"BOOK TYPE : "+l3.get(i)+"||"+"BOOK PRICE : "+l11.get(i));
    }
    System.out.println();
    System.out.println("1.CHANGE THE BOOK NAME");
    System.out.println("2.CHANGE THE BOOK COUNT");
    System.out.println("3.CHANGE THE BOOK TYPE");
    System.out.println("4.CHANGE THE BOOK PRICE");
    System.out.println("5.EXIT");
    jj=sc.nextInt();
    if(jj==1){
    edit1();
}
    else if(jj==2){
    edit1();}
    else if(jj==3){
        edit1();}
        else if(jj==4){
            edit1();}
        else
        admin();
}
public static void edit1()
{  String edn;
    System.out.println("ENTER THE BOOK ID TO BE EDITED");
    int ed=sc.nextInt();
    int kk=l8.indexOf(ed);
    System.out.println();
    if(jj==1){
    System.out.println("ENTER THE NEW NAME");
    edn=sc.next();
    l2.set(kk,edn);
    }
    else if(jj==2){
        System.out.println("ENTER THE NEW COUNT");
        edn=sc.next();
        l4.set(kk,edn);
        }
        else if(jj==3)
        {
            System.out.println("ENTER THE NEW TYPE");
            edn=sc.next();
            l3.set(kk,edn);
        }
        else if(jj==4)
        {
            System.out.println("ENTER THE NEW PRICE");
            edn=sc.next();
            l11.set(kk,edn);
        }
    System.out.println();
    System.out.println("SUCCESFULLY UPDATED");
    System.out.println();
    System.out.println("====PRESS ENTER TO CONTINUE====");
    sc.nextLine();
    String s=sc.nextLine();
    if(s.equals(""))
    admin1();
}
    static String p;
    public static void loginuser()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("ENTER THE NAME");
        p=sc.next();
        System.out.println("ENTER THE PIN");
        String p1=sc.next();
        System.out.println();
        if(l5.contains(p)&&l6.contains(p1)||p.equals("J")&&p1.equals("10"))
        {
            if(l2.size()<1)
            {
                System.out.println("NOTHING TO DISPLAY");
            }
            else{
                for(int i=0;i<l8.size();i++){
                    System.out.println("BOOK ID IS : "+l8.get(i)+"||"+" BOOK NAME IS : "+l2.get(i)+"||"+"BOOK QUANTITY : "+l4.get(i)+"||"+"BOOK TYPE : "+l3.get(i)+"||"+"BOOK PRICE : "+l11.get(i));
                }
                user1();
            }
        }
        else
        {
            System.out.println("PLEASE SIGNUP");
        }
        System.out.println();
        System.out.println("====PRESS ENTER TO CONTINUE====");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals(""))
        user();
    }
    public static void signupuser()
    {
        System.out.println("\t\tWELCOME TO SIGNUP PAGE");
        System.out.println();
        System.out.println("ENTER YOUR NAME");
        String p=sc.next();
        System.out.println();
        System.out.println("ENTER THE PIN");
        String p1=sc.next();
        System.out.println();
        System.out.println("RE-ENTER THE PIN");
        String p2=sc.next();
        if(p1.equals(p2))
        {
         l5.add(p);
         l6.add(p1);
         usid++;
         l7.add(usid);
         System.out.println("ACCOUNT CREATED");
         System.out.println("YOUR ID IS : "+usid);
         System.out.println();
         System.out.println("RS. 1500 IS KEPT AS HOLD FROM YOUR ACCOUNT");
         int pop=l7.indexOf(usid);
         l9.add(pop,"1500");
        }
        else
        {
            System.out.println("PIN DOESN'T MATCH");
        }
        System.out.println();
        System.out.println("====PRESS ENTER TO CONTINUE====");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals(""))
        user();
    }
    public static void user1()
    {
        System.out.println();
        System.out.println();
        System.out.println("\t\tWELCOME "+p);
        System.out.println();
        System.out.println("1.ADD TO CARD ");
        System.out.println("2.REMOVE FROM CART");
        System.out.println("3.VIEW CART");
        System.out.println("4.VIEW BALANCE");
        System.out.println("5.RETURN");
        System.out.println("6.LOST");
        System.out.println("7.EXIT");
        System.out.println();
        int y1=sc.nextInt();
        if(y1==1)
        {
            add();
        }
        else if(y1==2)
        {
            remove();
        }
        else if(y1==3)
        {
            viewcart();
        }
        else if(y1==4)
        {
            viewbalance();
        }
        else if(y1==5)
        {
            returnbook();
        }
        else if(y1==6)
        {
            lost();
        }
        else
        {
            user();
        }
    }
        public static void add()
        {
            System.out.println("ENTER THE BOOK ID");
            int y2=sc.nextInt();
            int y3=l8.indexOf(y2);
            if(b.contains(l2.get(y3))){
                System.out.println("CANNOT BORROW SAME BOOK");
            }else{
               b.add(l2.get(y3));
               poo=Integer.parseInt(l4.get(y3));
               poo--;
               l4.set(y3,Integer.toString(poo));
               System.out.println(poo);
            LocalDate borrow=LocalDate.now();
           // LocalDate due=LocalDate.plusDays(15);
            System.out.println();
            System.out.println("BOOK ADDED SUCCESSFULLY");
            System.out.println();
            System.out.println("BOOK BORROWED ON : "+borrow);
            l10.add(String.valueOf(borrow));
            LocalDate due=borrow.plusDays(15);
            l12.add(String.valueOf(due));
            }
            System.out.println("====PRESS ENTER TO CONTINUE====");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            user1();
           }
    public static void remove()
           {
             System.out.println("ENTER THE BOOK ID");
            int y2=sc.nextInt();
            int y3=l8.indexOf(y2);
            b.remove(l2.get(y3));
            poo++;
            l4.set(y3,Integer.toString(poo));
            System.out.println();
            System.out.println("BOOK REMOVED SUCCESSFULLY");
            System.out.println();
            System.out.println("====PRESS ENTER TO CONTINUE====");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            user1();
           }
           public static void viewcart()
           {
             System.out.println("\t\t YOUR CART");
             System.out.println();
             System.out.println(b);
             System.out.println();
             System.out.println("====PRESS ENTER TO CONTINUE====");
             sc.nextLine();
             String s=sc.nextLine();
             if(s.equals(""))
             user1();
           }
          
public static void viewbalance()
{
    System.out.print("\033[H\033[2J");
    System.out.flush();
    int pop=l9.indexOf(l9.get(l8.size()-1));
    System.out.println("YOUR BALANCE IS : "+l9.get(pop));
    System.out.println();
    System.out.println("DO YOU WANT TO ADD BALANCE");
    System.out.println();
    System.out.println("1.YES");
    System.out.println("2.NO");
    String oo=sc.next();
    if(oo.equals("1"))
    {
System.out.println("ENTER THE AMOUNT");
int amount=sc.nextInt();
int jk=l8.indexOf(id);
int sum3=Integer.parseInt(l9.get(jk));
int sum4=amount+sum3;
l9.set(jk,Integer.toString(sum4));
    }
    System.out.println("====PRESS ENTER TO CONTINUE====");
    sc.nextLine();
    String s=sc.nextLine();
    if(s.equals(""))
    user1();
}
public static void returnbook()  
       {
           if(b.size()>0){
           System.out.println("ENTER THE DATE OF RETURN : ");
           String date=sc.next();
           int l121=l7.indexOf(usid);
           //int rrr=l10.indexOf(l8.size()-1);
           LocalDate date1=LocalDate.parse(date);
           String date2=l10.get(l121);
           LocalDate date3=LocalDate.parse(date2);
           int jj=Integer.parseInt(l4.get(l8.size()-1));
           jj++;
           l4.set(l121,Integer.toString(jj));
           if(date1.compareTo(date3)>0)
           {
               int fine=date1.compareTo(date3);
              // int kop=fine-15;
               System.out.println();
               System.out.println("YOU HAVE BEEN FINED ");
               System.out.println("YOUR DUE DATE WAS ENDED "+l12.get(l121));
               System.out.println();
               System.out.println("AMOUNT WILL BE REDUCED FROM YOUR  DEPOSIT ACCOUNT");
               int fine1=Integer.parseInt(l9.get(l121));
               int sorry=fine1-(fine*2);
               l9.set(l121,Integer.toString(sorry));
           }
           else{
               System.out.println("THANKS FOR RETURNING THE BOOK");
           }
           b.remove(l121);
               l10.remove(l121);
               l12.remove(l121);
        }
        else
        {
            System.out.println("BOOKS ARE  NOT BORROWED");
        }
        
           System.out.println("====PRESS ENTER TO CONTINUE====");
           sc.nextLine();
           String s=sc.nextLine();
           if(s.equals(""))
           user1();

}
public static void lost()
{
    System.out.print("\033[H\033[2J");
    System.out.flush();
    if(b.size()>0)
    {
    System.out.println("ENTER THE BOOK ID ");
    int ssss=sc.nextInt();
    int lol=l8.indexOf(ssss);
    System.out.println(lol);
    System.out.println("REASON");
    String pp=sc.next();
    System.out.println("YOUR BALANCE WILL BE REDUCED IN DEPOSIT");
    int price=Integer.parseInt(l11.get(lol));
    int sum=(price*80)/100;
    int sub=Integer.parseInt(l9.get(lol));
    int returnme=sub-sum;
    l9.set(lol,Integer.toString(returnme));
    l2.remove(lol);
    l3.remove(lol);
    b.remove(lol);
    l10.remove(lol);
    l12.remove(lol);
    }
    else
    {
        System.out.println("NO BOOK TO LOSE");
    }


    System.out.println("====PRESS ENTER TO CONTINUE====");
    sc.nextLine();
    String s=sc.nextLine();
    if(s.equals(""))
    user1();
}
public static void soldout()
{
    if(b.size()>0){
    System.out.println("\t\t SOLD OUTS");
    for(int i=0;i<l2.size();i++)
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("BOOK ID : "+l8.get(i));
        System.out.println("BOOK NAME : "+l2.get(i));
        System.out.println("BOOK PRICE: "+l11.get(i));
        System.out.println("BORROWED ON : "+l10.get(i));
    }
}
else
{
    System.out.println("NO SOLDOUTS");
}
    System.out.println("====PRESS ENTER TO CONTINUE====");
    sc.nextLine();
    String s=sc.nextLine();
    if(s.equals(""))
    admin1();
}

      }
