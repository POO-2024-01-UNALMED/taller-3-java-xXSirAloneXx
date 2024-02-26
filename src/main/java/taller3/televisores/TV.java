package taller3.televisores;

public class TV 
{
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV = 0;

    public TV(String marca, boolean estado)
    {
        this.marca = marca;
        this.estado = estado;

        TV.numTV++;
    }

    public void setMarca(Marca marca)
    {
        this.marca = marca;
    }
    public void setCanal(int canal)
    {
        if(this.estado && canal >= 1 && canal <= 120)
        {
            this.canal = canal;
        }
    }
    public void setPrecio(int precio)
    {
        this.precio = precio;
    }
    public void setVolumen(int volumen)
    {
        if(this.estado && volumen >= 0 && volumen <= 7)
        {
            this.volumen = volumen;
        }
        
    }
    public void setControl(Control control)
    {
        this.control = control;
    }
    public Marca getMarca()
    {
        return marca;
    }
    public int getCanal()
    {
        return canal;
    }
    public int getPrecio()
    {
        return precio;
    }
    public int getVolumen()
    {
        return volumen;
    }
    public Control getControl()
    {
        return control;
    }

    public static void setNumTV(int numTV)
    {
        TV.numTV = numTV;
    }
    public static int getNumTV()
    {
        return TV.numTV;
    }

    public void turnOff()
    {
        this.estado = false;
    }
    public void turnOn()
    {
        this.estado = true;
    }

    public boolean getEstado()
    {
        return this.estado;
    }

    public void canalUp()
    {
        this.setCanal(this.canal + 1);
    }
    public void canalDown()
    {
        this.setCanal(this.canal - 1);
    }

    public void volumenUp()
    {
        this.setVolumen(this.volumen + 1);
    }
    public void volumenDown()
    {
        this.setVolumen(this.volumen - 1);
    }
}
