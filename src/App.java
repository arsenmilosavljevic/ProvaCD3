public class App {
    public static void main(String[] args) throws Exception {
        CD cd1=new CD("Concerto 2016","Andrea",15,34);
        CD cd2=new CD("Concerto 2015","Andrea",14,29);
        CD cd3=new CD("Concerto 2015","Andrea",14,29);
        
        PortaCD portaCD = new PortaCD(10);
        portaCD.setCD(cd1,1);
        portaCD.setCD(cd2,7);
        portaCD.setCD(cd3,0);
        
        System.out.println(cd1.compareDurata(cd2));
        System.out.println(portaCD.getN());
        portaCD.killCD(0);
        System.out.println(portaCD.getN());
        System.out.println(portaCD.cercaCDPerTitolo("2015"));
        System.out.println(portaCD);
        PortaCD portaCD2 = new PortaCD(portaCD);
        System.out.println(portaCD.confrontaCollezione(portaCD2));
    }
}
