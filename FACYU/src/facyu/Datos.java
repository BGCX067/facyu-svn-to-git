/*------------------------------------------------------------------------------
 Nombre: Datos.java
 Descripción: Clase que contiene la funcionalidad la ejecución de los queries.

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
 04/04/2009        N.D.00001     El sistema permite introducir valores nulos en
                                 todo el registro excepto el id del cliente
                                 porque lo genera. (MAJU)
                                 Se modificó: GeneraUpdate
------------------------------------------------------------------------------*/
package facyu;

import java.awt.TrayIcon.MessageType;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Datos {
    private Connection con = null;
    private static Statement stmt = null;
    private String stmtUpdate = "UPDATE ";
    private String ValsUpdate = "";
    private int iMaxUpdate=0;
    private int iCount=0;
    public int faltancampos = 0;

/*------------------------------------------------------------------------------
 Nombre: Datos
 Descripción: Constructor de la clase

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
------------------------------------------------------------------------------*/
    public Datos(){
        
    }
//Fin Metodo

/*------------------------------------------------------------------------------
 Nombre: conectaBasedeDatos
 Descripción: Metodo que se encarga de la hacer la conexión de la BDD

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.

------------------------------------------------------------------------------*/
    public void conectaBasedeDatos()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facyu_db","root","univa");
            stmt = con.createStatement();
        }
        catch ( SQLException e ){
            //JOptionPane.showMessageDialog(null, "SQL Exception: " + e.toString(), "FACYU", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException cE) {
            //JOptionPane.showMessageDialog(null, "SQL Exception: " + cE.toString(), "FACYU", JOptionPane.ERROR_MESSAGE);
        }
    }
//Fin Metodo

/*------------------------------------------------------------------------------
 Nombre: ResultSet
 Descripción: Metodo que se encarga de traer los datos que resultan del Query

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.

------------------------------------------------------------------------------*/
    public ResultSet rs(String qry){
        ResultSet rstmp = null;
        try{
            rstmp = stmt.executeQuery(qry);
        }
        catch ( Exception e )
        {
            //JOptionPane.showMessageDialog(null, "SQL Exception: " + e.toString(), "FACYU", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            return rstmp;
        }
    }
//Fin Metodo

/*------------------------------------------------------------------------------
 Nombre: ejecuta
 Descripción: Metodo que ejecuta el Query

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.

------------------------------------------------------------------------------*/
    public int ejecuta(String qry){
        try{
            int rowsaffected = stmt.executeUpdate(qry);
            return 0;
        }
        catch ( SQLException e ){
            //JOptionPane.showMessageDialog(null, "SQL Exception: " + e.toString(), "FACYU", JOptionPane.ERROR_MESSAGE);
            return 1;
        }
    }
//Fin Metodo

/*------------------------------------------------------------------------------
 Nombre: ejecutaUpdate
 Descripción: Metodo que ejecuta un UPDATE

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
 
------------------------------------------------------------------------------*/
    public int ejecutaUpdate()
    {
        int ret = 0;
        
        try{
            int rowsaffected = stmt.executeUpdate(stmtUpdate);
        }
        catch ( SQLException e ){
            //JOptionPane.showMessageDialog(null, "SQL Exception: " + e.toString(), "FACYU", JOptionPane.ERROR_MESSAGE);
            ret = 1;
        }

        stmtUpdate = "UPDATE ";
        iMaxUpdate = 0;
        iCount = 0;

        return ret;
    }
//Fin Metodo

/*------------------------------------------------------------------------------
 Nombre: GeneraUpdate
 Descripción: Metodo que genera el query el query para guardar los datos

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
 04/04/2009        N.D.00001     Se valida si el campo es obligatorio, si es asi
                                 regresara un error mencionando el campo que se
                                 debe capturar. (MAJU)
------------------------------------------------------------------------------*/
    public void GeneraUpdate(String Campo, String Valor, int Tipo, boolean Obligatorio)
    {
        if (Valor.isEmpty() && Obligatorio)
        {
            JOptionPane.showMessageDialog( null, "Debe llenar el campo obligatorio " + Campo, "FACYU", JOptionPane.ERROR_MESSAGE);
            return;
        }

        stmtUpdate+=Campo + " = ";

        if (Tipo == 0)
            stmtUpdate+="'" + Valor + "'";
        else
            stmtUpdate+=Valor;

        iCount++;

        if (iCount < iMaxUpdate)
            stmtUpdate+=", ";
    }
//Fin Meodo

/*------------------------------------------------------------------------------
 Nombre: GeneraCondicion
 Descripción: Metodo que genera las condiciones con los valores capturados

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
------------------------------------------------------------------------------*/
    public void GeneraCondicion(String Campo, String Valor, int Tipo)
    {
        stmtUpdate+= Campo + " = ";

        if (Tipo == 0)
            stmtUpdate+="'" + Valor + "'";
        else
            stmtUpdate+=Valor;

        iCount++;

        if (iCount < iMaxUpdate)
            stmtUpdate+=" AND ";
    }
//Fin Metodo

/*------------------------------------------------------------------------------
 Nombre: TablaUpdate
 Descripción: Metodo que genera los Sets

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
------------------------------------------------------------------------------*/
    public void TablaUpdate(String tabla, int MaxCampos)
    {
        stmtUpdate+=tabla + " SET ";
        iMaxUpdate = MaxCampos;
    }
//Fin Metodo

/*------------------------------------------------------------------------------
 Nombre: AgregaWhere
 Descripción: Metodo que agrega WHERE al Query

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
------------------------------------------------------------------------------*/
    public void AgregaWhere(int MaxCampos)
    {
        stmtUpdate+= " WHERE ";
        iMaxUpdate = MaxCampos;
        iCount=0;
    }
//Fin Metodo

/*------------------------------------------------------------------------------
 Nombre: cierraConexiones
 Descripción: Metodo para terminar las conexiones del MySQL.

 Historia de Revisiones:
 Fecha             ID            Descripción
--------------------------------------------------------------------------------
 01/10/2008        000000000000  Implementación inicial.
------------------------------------------------------------------------------*/
    public void cierraConexiones()
    {
        try
        {
            stmt.close();
        }
        catch ( SQLException e ){
            //JOptionPane.showMessageDialog(null, "SQL Exception: " + e.toString(), "FACYU", JOptionPane.ERROR_MESSAGE);
        }
    }
//Fin Metodo
}