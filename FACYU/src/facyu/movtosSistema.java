/*------------------------------------------------------------------------------
 Nombre: movtosSistema.java
 Descripción: Clase que contiene los estados de las pantallas.

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
------------------------------------------------------------------------------*/
package facyu;

public class movtosSistema {
    public static int statuspantallacliente = 0;
    public static int agregocliente = 0;
    public static String idclientetmp = "";
    public static int statuspantallaproductos = 0;
    public static int agregoproducto = 0;
    public static String idproductotmp = "";
    public static int statuspantallafactura = 0;
    private static String qry = "";
    private static Datos dts = new Datos();

 /*------------------------------------------------------------------------------
 Nombre: eliminatempcliente
 Descripción: Metodo que elimina el cliente seleccionado

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
------------------------------------------------------------------------------*/
    public static void eliminatempcliente()
    {
        if (statuspantallacliente == 1 && agregocliente == 1)
        {
            qry = "Delete From tbl_clientes where idCliente = " + idclientetmp;
            dts.ejecuta(qry);
        }
    }

/*------------------------------------------------------------------------------
 Nombre: eliminatmpproducto
 Descripción: Metodo que elimina el producto seleccionado

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
------------------------------------------------------------------------------*/
    public static void eliminatmpproducto()
    {
        if (statuspantallaproductos == 1 && agregoproducto == 1)
        {
            qry = "Delete From tbl_Productos where idProducto = " + idproductotmp;
            dts.ejecuta(qry);
        }
    }
}
