public class Adaptador implements AveDeBorracha
{
    private Ave ave;
    
    public Adaptador(Ave ave)
    {
        this.ave = ave;
    }

    @Override

    public void queckQueck()
    {
        ave.emitirSom();
    }
}
