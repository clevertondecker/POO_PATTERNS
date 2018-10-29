package fabricaDinamica;

public class SalvaTxt implements InseriDados {

    @Override
    public void InseriDados() {
        System.out.print("Doing something else");
    }

    public SalvaTxt() {
        this.InseriDados();
    }

}
