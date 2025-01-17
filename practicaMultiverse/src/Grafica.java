public class Grafica {
    /*
    Decidí hacer 3 hilos, uno para cada spider y que la presentación quede
    como un videoclip. De otro modo bastaría agregar dentro del try de un solo
    hilo todos los objetos y sus métodos. Creo es más fácil modificar al
    personaje en su propio hilo
     */
    public static void main(String[] args) throws InterruptedException{
        HiloSpiderPork();
        Thread.sleep(20000);
        HiloSpiderGwen();
        Thread.sleep(20000);
        HiloSpiderPeni();
    }
    private static void HiloSpiderPeni()throws InterruptedException{
        Screen screen=new Screen();
        Peni spdr=new Peni(
                14512,"Peni Parker","Bio-Robot SP/DR","SP/DR",
                "Esta versión futurista y casi manga, convierte al totem " +
                        "arácnido en una niña pequeña parte de un gran aparato gubernamental.\n"
        );
        Runnable attackPeni=new Runnable() {
            @Override
            public void run() {
                try {
                    spdr.presenta(screen);
                    Thread.sleep(3000);
                    spdr.balance(screen);
                    Thread.sleep(5000);
                    spdr.ataqueArmaP(screen);
                    Thread.sleep(5000);
                    spdr.telarana(screen);
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread hiloAttackPeni=new Thread(attackPeni);
        hiloAttackPeni.start();
    }
    public static void HiloSpiderPork()throws InterruptedException{
        Screen screen=new Screen();
        Ham pork=new Ham(
                8311,"Peter Porker","tela rojiazul","mazo",
                "Soy una versión paródica y porcina de Peter Parker, vivo" +
                        "en el sótano de la cerda May Porker, científica creadora del primer secador atómico"
        );
        Runnable attackPork=new Runnable() {
            @Override
            public void run() {
                try {
                    pork.presenta(screen);
                    Thread.sleep(3000);
                    pork.balance(screen);
                    Thread.sleep(5000);
                    pork.ataqueArmaP(screen);
                    Thread.sleep(5000);
                    pork.telarana(screen);
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread hiloAttackPork=new Thread(attackPork);
        hiloAttackPork.start();
    }
    public static void HiloSpiderGwen() {
        Screen screen=new Screen();
        Gwen stacy=new Gwen(
                65,"Gwen Stacy","tela blanca, negra y rosa","telaraña",
                "Fui mordida por una araña radioactiva. Solo dedicó sus poderes para " +
                        "hacerse famosa en la televisión hasta que su compañero de clase " +
                        "Peter Parker se inyectó un suero que lo convirtió en el Lagarto"
        );
        Runnable attackGwen=new Runnable() {
            @Override
            public void run() {
                try {
                    stacy.presenta(screen);
                    Thread.sleep(3000);
                    stacy.balance(screen);
                    Thread.sleep(5000);
                    stacy.ataqueArmaP(screen);
                    Thread.sleep(5000);
                    stacy.telarana(screen);
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread hiloAttackGwen=new Thread(attackGwen);
        hiloAttackGwen.start();
    }
}
