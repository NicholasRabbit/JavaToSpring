public class ArrayTest004 {

    public static void main(String[] args) {     

        Fruits f1 = new Fruits();
        Fruits f2 = new Fruits();
        Fruits f3 = new Fruits();
        Fruits[] frs1={f1,f2,f3};
        for (int i=0;i<frs1.length;i++){
            System.out.println(frs1[i]);
        }

        Fruits[] frs2=new Fruits[2];
        Fruits peaches = new Peach();
        Fruits pears = new Pear();
        frs2[0]=peaches;
        frs2[1]=pears;

        for(int i=0;i<frs2.length;i++){
            frs2[i].taste();
        }

    }

}

class Fruits {

    public void taste(){
        System.out.println("水果好吃");
    }

}

class Peach extends Fruits {

    public void taste() {
        System.out.println("桃子好吃");
    }
}

class Pear extends Fruits {


    public void taste() {
        System.out.println("梨子好吃");
    }
}
